package defpackage;
/* compiled from: PG */
/* renamed from: zhe  reason: default package */
/* loaded from: classes4.dex */
public final class zhe {
    public final int a;

    public zhe() {
    }

    public zhe(int i) {
        this.a = i;
    }

    public static zhe a(int i) {
        aqxo.q(true, "Invalid resource identifier: 0");
        return new zhe(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zhe) && this.a == ((zhe) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(28);
        sb.append("AttrResource{id=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
