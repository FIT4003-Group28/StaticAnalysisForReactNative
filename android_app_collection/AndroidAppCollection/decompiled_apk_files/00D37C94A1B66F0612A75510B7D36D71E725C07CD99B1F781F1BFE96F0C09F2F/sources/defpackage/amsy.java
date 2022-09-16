package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amsy  reason: default package */
/* loaded from: classes.dex */
public final class amsy extends amsz {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amsy(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // defpackage.amsz
    public final void c(StringBuilder sb) {
        sb.append('[');
        sb.append(this.b);
    }

    @Override // defpackage.amsz
    public final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(')');
    }

    @Override // defpackage.amsz
    public final boolean e(Comparable comparable) {
        return amxt.b(this.b, comparable) <= 0;
    }

    @Override // defpackage.amsz
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("\\");
        sb.append(valueOf);
        sb.append("/");
        return sb.toString();
    }
}
