package Controller;

/**
 * Created by User on 7/21/2017.
 */

public class LifeManager
{
    public float[]  foodPurchase(float foodCost, float foodEnergy , float playerMoneyBalance , float playerEnergyBalance)
    {
        float newMoneyBalance = playerMoneyBalance - foodCost;
        float newEnergyBalance = playerEnergyBalance + foodEnergy;

        float [] moneyEnergyArray = {newMoneyBalance , newEnergyBalance};

        return moneyEnergyArray;

    }

    public float[] travelUpdate(float travelMoneyCost, float travelEnergyCost, float playerMoneyBalance, float playerEnergyBalance)
    {
        float newMoneyBalance = playerMoneyBalance - travelMoneyCost;
        float newEnergyBalance = playerEnergyBalance - travelEnergyCost;

        float [] moneyEnergyArray = {newMoneyBalance, newEnergyBalance};

        return moneyEnergyArray;
    }
}
