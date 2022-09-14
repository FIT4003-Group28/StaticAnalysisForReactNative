package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class j3 extends f3 {

    /* renamed from: a  reason: collision with root package name */
    private final i3 f4228a = new i3();

    @Override // c.e.a.b.d.g.f3
    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            if (th2 == null) {
                throw new NullPointerException("The suppressed exception cannot be null.");
            }
            this.f4228a.a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
