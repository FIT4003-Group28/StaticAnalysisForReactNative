package defpackage;

import java.util.Arrays;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dudl  reason: default package */
/* loaded from: classes6.dex */
public final class dudl {
    public static final dudl a = new dudl("", 0, 1, null);
    public static final dclu<dudl> b = new dudk();
    public final String c;
    public final int d;
    public final BitSet e;
    public final int f;

    public dudl(String str, int i, int i2, @dzsi BitSet bitSet) {
        dbsk.t(str, "Token value cannot be null");
        this.c = str;
        this.d = i;
        this.f = i2;
        this.e = bitSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dudl)) {
            return false;
        }
        dudl dudlVar = (dudl) obj;
        return this.d == dudlVar.d && this.c.equals(dudlVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.c});
    }

    public final String toString() {
        String str = this.c;
        int i = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("{Value:");
        sb.append(str);
        sb.append(",StartIndex:");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
