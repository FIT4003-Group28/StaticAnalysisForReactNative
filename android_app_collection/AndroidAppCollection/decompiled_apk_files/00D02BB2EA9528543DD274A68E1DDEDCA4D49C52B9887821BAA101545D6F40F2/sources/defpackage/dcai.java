package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcai  reason: default package */
/* loaded from: classes5.dex */
public final class dcai extends dcak<Comparable<?>> {
    public static final dcai a = new dcai();
    private static final long serialVersionUID = 0;

    private dcai() {
        super(null);
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.dcak
    public final Comparable<?> a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.dcak
    public final boolean b(Comparable<?> comparable) {
        return true;
    }

    @Override // defpackage.dcak
    public final dcak<Comparable<?>> c(dbyz dbyzVar, dcau<Comparable<?>> dcauVar) {
        throw new IllegalStateException();
    }

    @Override // defpackage.dcak, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((dcak) obj);
    }

    @Override // defpackage.dcak
    public final dcak<Comparable<?>> d(dbyz dbyzVar, dcau<Comparable<?>> dcauVar) {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // defpackage.dcak
    public final void e(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // defpackage.dcak
    public final void f(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.dcak
    public final Comparable<?> g(dcau<Comparable<?>> dcauVar) {
        return dcauVar.b();
    }

    @Override // defpackage.dcak
    public final Comparable<?> h(dcau<Comparable<?>> dcauVar) {
        throw new AssertionError();
    }

    @Override // defpackage.dcak
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.dcak
    public final int i(dcak<Comparable<?>> dcakVar) {
        return dcakVar == this ? 0 : -1;
    }

    public final String toString() {
        return "-∞";
    }
}
