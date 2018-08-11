package pl.xperios.ui.utils.converters;

import com.vaadin.flow.templatemodel.ModelEncoder;
import pl.xperios.ui.dataproviders.DataProviderUtil;
import pl.xperios.ui.utils.FormattingUtils;

public class CurrencyFormatter implements ModelEncoder<Integer, String> {

	@Override
	public String encode(Integer modelValue) {
		return DataProviderUtil.convertIfNotNull(modelValue, FormattingUtils::formatAsCurrency);
	}

	@Override
	public Integer decode(String presentationValue) {
		throw new UnsupportedOperationException();
	}
}
