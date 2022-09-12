package defpackage;

import java.math.BigDecimal;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: bij  reason: default package */
/* loaded from: classes3.dex */
public final class bij {
    public static final BigDecimal a = new BigDecimal(20);
    public static final BigDecimal b = new BigDecimal(90);
    public static final BigDecimal c = new BigDecimal(180);
    public static final BigDecimal d = new BigDecimal(4);
    public static final BigDecimal e = new BigDecimal(5);
    public final String f;

    public bij(double d2, double d3) {
        BigDecimal bigDecimal;
        double pow;
        int min = Math.min(10, 15);
        if (min >= 4 && (min >= 10 || (min & 1) != 1)) {
            BigDecimal bigDecimal2 = b;
            double min2 = Math.min(Math.max(d2, -bigDecimal2.intValue()), bigDecimal2.intValue());
            double d4 = d3;
            while (true) {
                BigDecimal bigDecimal3 = c;
                if (d4 >= (-bigDecimal3.intValue())) {
                    break;
                }
                int intValue = bigDecimal3.intValue();
                double d5 = intValue + intValue;
                Double.isNaN(d5);
                d4 += d5;
            }
            while (true) {
                bigDecimal = c;
                if (d4 < bigDecimal.intValue()) {
                    break;
                }
                int intValue2 = bigDecimal.intValue();
                double d6 = intValue2 + intValue2;
                Double.isNaN(d6);
                d4 -= d6;
            }
            BigDecimal bigDecimal4 = b;
            if (min2 == bigDecimal4.doubleValue()) {
                if (min <= 10) {
                    pow = Math.pow(a.intValue(), Math.floor((min / (-2)) + 2));
                } else {
                    pow = Math.pow(a.intValue(), -3.0d) / Math.pow(e.intValue(), min - 10);
                }
                min2 -= pow * 0.9d;
            }
            BigDecimal bigDecimal5 = new BigDecimal(min2 + bigDecimal4.doubleValue());
            BigDecimal bigDecimal6 = new BigDecimal(d4 + bigDecimal.doubleValue());
            StringBuilder sb = new StringBuilder();
            BigDecimal bigDecimal7 = a;
            BigDecimal multiply = bigDecimal7.multiply(bigDecimal7);
            BigDecimal multiply2 = bigDecimal7.multiply(bigDecimal7);
            int i = 0;
            while (i < min) {
                if (i < 10) {
                    BigDecimal bigDecimal8 = a;
                    multiply = multiply.divide(bigDecimal8);
                    multiply2 = multiply2.divide(bigDecimal8);
                    BigDecimal divide = bigDecimal5.divide(multiply, 0, 3);
                    BigDecimal divide2 = bigDecimal6.divide(multiply2, 0, 3);
                    bigDecimal5 = bigDecimal5.subtract(multiply.multiply(divide));
                    bigDecimal6 = bigDecimal6.subtract(multiply2.multiply(divide2));
                    sb.append("23456789CFGHJMPQRVWX".charAt(divide.intValue()));
                    sb.append("23456789CFGHJMPQRVWX".charAt(divide2.intValue()));
                    i += 2;
                } else {
                    multiply = multiply.divide(e);
                    BigDecimal bigDecimal9 = d;
                    multiply2 = multiply2.divide(bigDecimal9);
                    BigDecimal divide3 = bigDecimal5.divide(multiply, 0, 3);
                    BigDecimal divide4 = bigDecimal6.divide(multiply2, 0, 3);
                    bigDecimal5 = bigDecimal5.subtract(multiply.multiply(divide3));
                    bigDecimal6 = bigDecimal6.subtract(multiply2.multiply(divide4));
                    sb.append("23456789CFGHJMPQRVWX".charAt((divide3.intValue() * bigDecimal9.intValue()) + divide4.intValue()));
                    i++;
                }
                if (i == 8) {
                    sb.append('+');
                }
            }
            if (i < 8) {
                while (i < 8) {
                    sb.append('0');
                    i++;
                }
                sb.append('+');
            }
            this.f = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Illegal code length ");
        sb2.append(min);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static String a(double d2, double d3) {
        return new bij(d2, d3).f;
    }

    public static boolean c(String str) {
        String upperCase;
        int indexOf;
        if (str == null || str.length() < 2 || (indexOf = (upperCase = str.toUpperCase()).indexOf(43)) == -1 || indexOf != upperCase.lastIndexOf(43) || indexOf % 2 != 0) {
            return false;
        }
        if (indexOf == 8 && (Integer.valueOf("23456789CFGHJMPQRVWX".indexOf(upperCase.charAt(0))).intValue() > 8 || Integer.valueOf("23456789CFGHJMPQRVWX".indexOf(upperCase.charAt(1))).intValue() > 17)) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < indexOf; i++) {
            char charAt = upperCase.charAt(i);
            if (z) {
                if (charAt != '0') {
                    return false;
                }
            } else if ("23456789CFGHJMPQRVWX".indexOf(charAt) != -1) {
                continue;
            } else if (upperCase.charAt(i) != '0') {
                return false;
            } else {
                if (i != 2 && i != 4 && i != 6) {
                    return false;
                }
                z = true;
            }
        }
        int i2 = indexOf + 1;
        if (upperCase.length() > i2) {
            if (z || upperCase.length() == indexOf + 2) {
                return false;
            }
            while (i2 < upperCase.length()) {
                if ("23456789CFGHJMPQRVWX".indexOf(upperCase.charAt(i2)) == -1) {
                    return false;
                }
                i2++;
            }
        }
        return true;
    }

    public final boolean b() {
        return this.f.indexOf(43) == 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(this.f, ((bij) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f;
    }

    public bij(String str) {
        if (c(str.toUpperCase())) {
            this.f = str.toUpperCase();
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append("The provided code '");
        sb.append(str);
        sb.append("' is not a valid Open Location Code.");
        throw new IllegalArgumentException(sb.toString());
    }
}
