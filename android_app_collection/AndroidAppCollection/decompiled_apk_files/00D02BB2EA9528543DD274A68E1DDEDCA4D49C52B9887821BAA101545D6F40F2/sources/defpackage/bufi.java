package defpackage;
/* compiled from: PG */
/* renamed from: bufi  reason: default package */
/* loaded from: classes4.dex */
final class bufi extends buhg {
    private final Class<? extends dssj> a;
    private final btzu b;

    public bufi(Class<? extends dssj> cls, btzu btzuVar) {
        if (cls != null) {
            this.a = cls;
            this.b = btzuVar;
            return;
        }
        throw new NullPointerException("Null requestClass");
    }

    @Override // defpackage.buhg
    public final Class<? extends dssj> a() {
        return this.a;
    }

    @Override // defpackage.buhg
    public final btzu b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof buhg) {
            buhg buhgVar = (buhg) obj;
            if (this.a.equals(buhgVar.a()) && this.b.equals(buhgVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("RequestAnnotation{requestClass=");
        sb.append(valueOf);
        sb.append(", rpcAttemptBuilder=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
