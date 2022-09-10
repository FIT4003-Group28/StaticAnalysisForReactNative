package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubj  reason: default package */
/* loaded from: classes5.dex */
public final class cubj extends cubs {
    private final cuhk a;

    public cubj(cuhk cuhkVar) {
        this.a = cuhkVar;
    }

    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.HYPER_LINK;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.HYPER_LINK == cuhqVar.b() && this.a.equals(cuhqVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final cuhk f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("TextStyle{hyperLink=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
