package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amsv  reason: default package */
/* loaded from: classes.dex */
public final class amsv extends amsz {
    public static final amsv a = new amsv();
    private static final long serialVersionUID = 0;

    private amsv() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.amsz
    public final int a(amsz amszVar) {
        return amszVar == this ? 0 : 1;
    }

    @Override // defpackage.amsz
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.amsz
    public final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.amsz, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((amsz) obj);
    }

    @Override // defpackage.amsz
    public final void d(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // defpackage.amsz
    public final boolean e(Comparable comparable) {
        return false;
    }

    @Override // defpackage.amsz
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
