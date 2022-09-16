package defpackage;

import java.math.BigDecimal;
/* compiled from: PG */
/* renamed from: dgun  reason: default package */
/* loaded from: classes6.dex */
public final class dgun extends Number {
    private final String a;

    public dgun(String str) {
        this.a = str;
    }

    private Object writeReplace() {
        return new BigDecimal(this.a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgun)) {
            return false;
        }
        String str = this.a;
        String str2 = ((dgun) obj).a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.a).longValue();
        }
    }

    public final String toString() {
        return this.a;
    }
}
