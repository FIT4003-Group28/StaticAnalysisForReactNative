package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuan  reason: default package */
/* loaded from: classes5.dex */
public final class cuan extends cuar {
    private final cugl a;

    public cuan(cugl cuglVar) {
        this.a = cuglVar;
    }

    @Override // defpackage.cugm
    public final int a() {
        return 3;
    }

    @Override // defpackage.cuar, defpackage.cugm
    public final cugl b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cugm) {
            cugm cugmVar = (cugm) obj;
            if (cugmVar.a() == 3 && this.a.equals(cugmVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("MessageContent{custom=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
