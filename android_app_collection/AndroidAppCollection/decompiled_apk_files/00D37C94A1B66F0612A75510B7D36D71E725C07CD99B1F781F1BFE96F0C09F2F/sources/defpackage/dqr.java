package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dqr  reason: default package */
/* loaded from: classes3.dex */
public final class dqr implements dqz {
    public final Double a;

    public dqr(Double d) {
        if (d == null) {
            this.a = Double.valueOf(Double.NaN);
        } else {
            this.a = d;
        }
    }

    @Override // defpackage.dqz
    public final dqz d() {
        return new dqr(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqr) {
            return this.a.equals(((dqr) obj).a);
        }
        return false;
    }

    @Override // defpackage.dqz
    public final Boolean g() {
        boolean z = false;
        if (!Double.isNaN(this.a.doubleValue()) && this.a.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.dqz
    public final Double h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dqz
    public final String i() {
        int scale;
        if (Double.isNaN(this.a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.a.doubleValue())) {
            return this.a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return stripTrailingZeros.toPlainString();
    }

    @Override // defpackage.dqz
    public final dqz kr(String str, dpu dpuVar, List list) {
        if (!"toString".equals(str)) {
            throw new IllegalArgumentException(String.format("%s.%s is not a function.", i(), str));
        }
        return new drc(i());
    }

    @Override // defpackage.dqz
    public final Iterator l() {
        return null;
    }

    public final String toString() {
        return i();
    }
}
