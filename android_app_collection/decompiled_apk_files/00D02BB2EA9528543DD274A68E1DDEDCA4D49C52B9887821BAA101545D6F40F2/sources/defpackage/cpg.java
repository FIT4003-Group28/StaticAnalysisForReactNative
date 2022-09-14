package defpackage;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
/* compiled from: PG */
/* renamed from: cpg  reason: default package */
/* loaded from: classes5.dex */
public final class cpg {
    private static final BigDecimal a = BigDecimal.ONE.movePointRight(9);

    public static duhg a(BigDecimal bigDecimal, Currency currency) {
        BigDecimal remainder = bigDecimal.remainder(BigDecimal.ONE);
        BigDecimal subtract = bigDecimal.subtract(remainder);
        int intValue = remainder.multiply(a).intValue();
        long longValue = subtract.longValue();
        duhf bZ = duhg.d.bZ();
        String currencyCode = currency.getCurrencyCode();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duhg duhgVar = (duhg) bZ.b;
        currencyCode.getClass();
        duhgVar.a = currencyCode;
        duhgVar.b = longValue;
        duhgVar.c = intValue;
        return bZ.bK();
    }

    public static String b(duhg duhgVar, cpf cpfVar) {
        Currency currency = Currency.getInstance(duhgVar.a);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(cpfVar.c());
        currencyInstance.setCurrency(currency);
        if (!cpfVar.a()) {
            DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol("");
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        }
        if (cpfVar.b()) {
            currencyInstance.setMaximumFractionDigits(2);
        } else if (duhgVar.c == 0) {
            currencyInstance.setMaximumFractionDigits(0);
        } else {
            currencyInstance.setMaximumFractionDigits(2);
            currencyInstance.setMinimumFractionDigits(currency.getDefaultFractionDigits());
        }
        return currencyInstance.format(BigDecimal.valueOf(duhgVar.b).add(BigDecimal.valueOf(duhgVar.c).divide(a)));
    }
}
