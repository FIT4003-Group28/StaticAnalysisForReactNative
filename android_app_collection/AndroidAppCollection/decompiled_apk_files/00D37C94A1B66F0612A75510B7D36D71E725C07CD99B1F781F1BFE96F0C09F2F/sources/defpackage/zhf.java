package defpackage;
/* compiled from: PG */
/* renamed from: zhf  reason: default package */
/* loaded from: classes4.dex */
public final class zhf {
    public final int a;

    public zhf() {
    }

    public zhf(int i) {
        this.a = i;
    }

    public static zhf a(int i) {
        aqxo.q(true, "Invalid resource identifier: 0");
        return new zhf(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zhf) && this.a == ((zhf) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(29);
        sb.append("StyleResource{id=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
