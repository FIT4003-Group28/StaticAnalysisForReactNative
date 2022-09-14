package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eamt  reason: default package */
/* loaded from: classes6.dex */
public final class eamt implements Serializable {
    private static final long serialVersionUID = 1;
    final long a;
    final int b;
    final int c;
    final Object d;

    static {
        new eamt("N/A", -1L, -1, -1, null);
    }

    public eamt(Object obj, long j, int i, int i2) {
        this(obj, j, i, i2, null);
    }

    public eamt(Object obj, long j, int i, int i2, byte[] bArr) {
        this.d = obj;
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof eamt)) {
            return false;
        }
        eamt eamtVar = (eamt) obj;
        Object obj2 = this.d;
        if (obj2 == null) {
            if (eamtVar.d != null) {
                return false;
            }
        } else if (!obj2.equals(eamtVar.d)) {
            return false;
        }
        return this.b == eamtVar.b && this.c == eamtVar.c && this.a == eamtVar.a;
    }

    public final int hashCode() {
        Object obj = this.d;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.b) + this.c) ^ ((int) this.a)) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        Object obj = this.d;
        if (obj == null) {
            sb.append("UNKNOWN");
        } else {
            sb.append(obj.toString());
        }
        sb.append("; line: ");
        sb.append(this.b);
        sb.append(", column: ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
