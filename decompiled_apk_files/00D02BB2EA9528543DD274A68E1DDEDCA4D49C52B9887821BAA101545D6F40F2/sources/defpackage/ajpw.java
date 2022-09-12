package defpackage;
/* compiled from: PG */
/* renamed from: ajpw  reason: default package */
/* loaded from: classes2.dex */
final class ajpw<T> extends ajpy<T> {
    private final Throwable a;

    public ajpw(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.ajpy, defpackage.ajqc
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.ajqc
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajqc) {
            ajqc ajqcVar = (ajqc) obj;
            if (ajqcVar.b() == 2 && this.a.equals(ajqcVar.a())) {
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
        sb.append("Result{error=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
