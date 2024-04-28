package Service.Strategy.billCalculation;

import Exceptions.NoSuchBillCalculationType;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStrategy(BillCalculationType billCalculationType)
    {
        switch (billCalculationType) {
            case NORMAL -> new NormalRateBillCalculationStrategy();
            case EXCLUSIVE_EVENT -> new ExclusiveEventRateBillCalculationStrategy();
            case SURGE -> new SurgeRateBillCalculationStrategy();
            //default -> null;
        }
        throw new NoSuchBillCalculationType("Not a valid type of Bill Calculation Type");
    }
}
