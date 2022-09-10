package defpackage;
/* compiled from: PG */
/* renamed from: qae  reason: default package */
/* loaded from: classes7.dex */
public final class qae extends qca {
    public final dspd a;

    public qae(dspd dspdVar) {
        this.a = dspdVar;
    }

    @Override // defpackage.qca
    public final dspd a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qca)) {
            return false;
        }
        return this.a.equals(((qca) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Request{routeToken=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
