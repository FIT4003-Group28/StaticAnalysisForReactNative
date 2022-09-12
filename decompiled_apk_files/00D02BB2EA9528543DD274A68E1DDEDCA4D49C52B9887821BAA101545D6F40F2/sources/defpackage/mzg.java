package defpackage;
/* compiled from: PG */
/* renamed from: mzg  reason: default package */
/* loaded from: classes7.dex */
final class mzg extends mzl {
    public final mzn a;

    public mzg(@dzsi mzn mznVar) {
        this.a = mznVar;
    }

    @Override // defpackage.mzl
    @dzsi
    public final mzn a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mzl)) {
            return false;
        }
        mzl mzlVar = (mzl) obj;
        mzn mznVar = this.a;
        return mznVar == null ? mzlVar.a() == null : mznVar.equals(mzlVar.a());
    }

    public final int hashCode() {
        mzn mznVar = this.a;
        return (mznVar == null ? 0 : mznVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("TopItem{trafficInformation=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
