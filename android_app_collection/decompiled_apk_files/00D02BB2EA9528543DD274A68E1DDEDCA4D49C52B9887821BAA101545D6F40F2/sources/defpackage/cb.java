package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: cb  reason: default package */
/* loaded from: classes4.dex */
public final class cb {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    private final int g;

    public cb(String str, String str2, boolean z, int i, String str3, int i2) {
        this.a = str;
        this.b = str2;
        this.d = z;
        this.e = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i3 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.c = i3;
        this.f = str3;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        if (this.e != cbVar.e || !this.a.equals(cbVar.a) || this.d != cbVar.d) {
            return false;
        }
        if (this.g == 1 && cbVar.g == 2 && (str3 = this.f) != null && !str3.equals(cbVar.f)) {
            return false;
        }
        if (this.g == 2 && cbVar.g == 1 && (str2 = cbVar.f) != null && !str2.equals(this.f)) {
            return false;
        }
        return (this.g != cbVar.g || ((str = this.f) == null ? cbVar.f == null : str.equals(cbVar.f))) && this.c == cbVar.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.c) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e;
    }

    public final String toString() {
        return "Column{name='" + this.a + "', type='" + this.b + "', affinity='" + this.c + "', notNull=" + this.d + ", primaryKeyPosition=" + this.e + ", defaultValue='" + this.f + "'}";
    }
}
