package defpackage;
/* compiled from: PG */
/* renamed from: ctjk  reason: default package */
/* loaded from: classes5.dex */
final class ctjk<T> extends ctjl<T> {
    private final T a;

    public ctjk(T t) {
        this.a = t;
    }

    @Override // defpackage.ctjz
    public final int b() {
        return 2;
    }

    @Override // defpackage.ctjl, defpackage.ctjz
    public final T c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctjz) {
            ctjz ctjzVar = (ctjz) obj;
            if (ctjzVar.b() == 2 && this.a.equals(ctjzVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Either{result=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
