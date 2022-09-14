package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuao  reason: default package */
/* loaded from: classes5.dex */
public final class cuao extends cuar {
    private final cuhv a;

    public cuao(cuhv cuhvVar) {
        this.a = cuhvVar;
    }

    @Override // defpackage.cugm
    public final int a() {
        return 4;
    }

    @Override // defpackage.cuar, defpackage.cugm
    public final cuhv c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cugm) {
            cugm cugmVar = (cugm) obj;
            if (cugmVar.a() == 4 && this.a.equals(cugmVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("MessageContent{richText=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
