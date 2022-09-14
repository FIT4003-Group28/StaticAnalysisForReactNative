package c.e.a.b.g;
/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f4644b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ t f4645c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(t tVar, h hVar) {
        this.f4645c = tVar;
        this.f4644b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        d dVar;
        d dVar2;
        obj = this.f4645c.f4642b;
        synchronized (obj) {
            dVar = this.f4645c.f4643c;
            if (dVar != null) {
                dVar2 = this.f4645c.f4643c;
                dVar2.a(this.f4644b.a());
            }
        }
    }
}
