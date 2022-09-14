package c.e.a.b.d.f;
/* loaded from: classes.dex */
final class o extends n {

    /* renamed from: a  reason: collision with root package name */
    private final m f4034a = new m();

    @Override // c.e.a.b.d.f.n
    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            if (th2 == null) {
                throw new NullPointerException("The suppressed exception cannot be null.");
            }
            this.f4034a.a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
