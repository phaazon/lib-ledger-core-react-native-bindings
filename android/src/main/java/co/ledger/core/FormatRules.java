// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from amount.djinni

package co.ledger.core;

/**TODO */
public final class FormatRules {


    /*package*/ final RoundingMode roundingMode;

    /*package*/ final int maxNumberOfDecimals;

    public FormatRules(
            RoundingMode roundingMode,
            int maxNumberOfDecimals) {
        this.roundingMode = roundingMode;
        this.maxNumberOfDecimals = maxNumberOfDecimals;
    }

    public RoundingMode getRoundingMode() {
        return roundingMode;
    }

    public int getMaxNumberOfDecimals() {
        return maxNumberOfDecimals;
    }

    @Override
    public String toString() {
        return "FormatRules{" +
                "roundingMode=" + roundingMode +
                "," + "maxNumberOfDecimals=" + maxNumberOfDecimals +
        "}";
    }

}