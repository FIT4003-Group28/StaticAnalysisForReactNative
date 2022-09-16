package defpackage;
/* compiled from: PG */
/* renamed from: ajpx  reason: default package */
/* loaded from: classes2.dex */
final class ajpx<T> extends ajpy<T> {
    private final T a;

    public ajpx(T t) {
        this.a = t;
    }

    @Override // defpackage.ajqc
    public final int b() {
        return 1;
    }

    @Override // defpackage.ajpy, defpackage.ajqc
    public final T c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajqc) {
            ajqc ajqcVar = (ajqc) obj;
            if (ajqcVar.b() == 1 && this.a.equals(ajqcVar.c())) {
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
        sb.append("Result{value=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
