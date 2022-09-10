package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctjj  reason: default package */
/* loaded from: classes5.dex */
public final class ctjj<T> extends ctjl<T> {
    private final ctxn a;

    public ctjj(ctxn ctxnVar) {
        this.a = ctxnVar;
    }

    @Override // defpackage.ctjl, defpackage.ctjz
    public final ctxn a() {
        return this.a;
    }

    @Override // defpackage.ctjz
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctjz) {
            ctjz ctjzVar = (ctjz) obj;
            if (ctjzVar.b() == 1 && this.a.equals(ctjzVar.a())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Either{error=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
