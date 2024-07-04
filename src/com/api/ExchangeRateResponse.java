package currency;

import java.util.Map;

public class ExchangeRateResponse {
    private Map<String, Double> conversion_rates;

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public double getTargetCurrency(String target_currency, float amount) {
        return conversion_rates.get(target_currency) * amount;
    }
}
