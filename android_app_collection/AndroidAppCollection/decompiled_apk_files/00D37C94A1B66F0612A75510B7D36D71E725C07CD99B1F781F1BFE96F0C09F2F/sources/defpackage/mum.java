package defpackage;
/* compiled from: PG */
/* renamed from: mum  reason: default package */
/* loaded from: classes3.dex */
final class mum {
    public final muj a;
    public final arbc b;

    public mum(muj mujVar, arbc arbcVar) {
        this.a = mujVar;
        if (arbcVar != null) {
            this.b = arbcVar;
            return;
        }
        throw new NullPointerException("Null renderer");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mum) {
            mum mumVar = (mum) obj;
            if (this.a.equals(mumVar.a) && this.b.equals(mumVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42 + String.valueOf(valueOf2).length());
        sb.append("InputFieldContainer{presenter=");
        sb.append(valueOf);
        sb.append(", renderer=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public mum() {
    }
}
