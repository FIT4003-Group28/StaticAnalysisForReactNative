package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cduh  reason: default package */
/* loaded from: classes4.dex */
public final class cduh extends cdui {
    private final cdwp a;

    public cduh(cdwp cdwpVar) {
        this.a = cdwpVar;
    }

    @Override // defpackage.cdwq
    public final int a() {
        return 5;
    }

    @Override // defpackage.cdui, defpackage.cdwq
    public final cdwp c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cdwq) {
            cdwq cdwqVar = (cdwq) obj;
            if (cdwqVar.a() == 5 && this.a.equals(cdwqVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("MediaAction{select=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
