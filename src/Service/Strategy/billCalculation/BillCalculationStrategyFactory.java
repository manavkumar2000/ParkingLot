package Service.Strategy.billCalculation;

import Exceptions.NoSuchBillCalculationType;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStrategy(BillCalculationType billCalculationType)
    {
        switch (billCalculationType) {
            case NORMAL : return new NormalRateBillCalculationStrategy();
            case EXCLUSIVE_EVENT : return new ExclusiveEventRateBillCalculationStrategy();
            case SURGE : return new SurgeRateBillCalculationStrategy();
        }
        throw new NoSuchBillCalculationType("Not a valid type of Bill Calculation Type");
    }
}
