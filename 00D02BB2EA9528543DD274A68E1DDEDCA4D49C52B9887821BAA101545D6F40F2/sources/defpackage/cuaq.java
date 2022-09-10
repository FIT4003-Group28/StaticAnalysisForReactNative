package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuaq  reason: default package */
/* loaded from: classes5.dex */
public final class cuaq extends cuar {
    private final dspd a;

    public cuaq(dspd dspdVar) {
        this.a = dspdVar;
    }

    @Override // defpackage.cugm
    public final int a() {
        return 1;
    }

    @Override // defpackage.cuar, defpackage.cugm
    public final dspd e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cugm) {
            cugm cugmVar = (cugm) obj;
            if (cugmVar.a() == 1 && this.a.equals(cugmVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("MessageContent{unsupported=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
