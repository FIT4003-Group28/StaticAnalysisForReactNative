package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubp  reason: default package */
/* loaded from: classes5.dex */
public final class cubp extends cubs {
    private final dcdc<cuhu> a;

    public cubp(dcdc<cuhu> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.TYPEFACE_LIST;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.TYPEFACE_LIST == cuhqVar.b() && dchl.m(this.a, cuhqVar.l())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final dcdc<cuhu> l() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("TextStyle{typefaceList=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
