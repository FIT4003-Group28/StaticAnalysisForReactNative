package c.e.a.b.g;
/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f4639b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ r f4640c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(r rVar, h hVar) {
        this.f4640c = rVar;
        this.f4639b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f4640c.f4637b;
        synchronized (obj) {
            cVar = this.f4640c.f4638c;
            if (cVar != null) {
                cVar2 = this.f4640c.f4638c;
                cVar2.a(this.f4639b);
            }
        }
    }
}
