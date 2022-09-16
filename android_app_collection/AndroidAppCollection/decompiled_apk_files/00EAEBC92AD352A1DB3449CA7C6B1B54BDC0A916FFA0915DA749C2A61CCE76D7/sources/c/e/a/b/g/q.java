package c.e.a.b.g;
/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p f4635b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(p pVar) {
        this.f4635b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        b bVar;
        b bVar2;
        obj = this.f4635b.f4633b;
        synchronized (obj) {
            bVar = this.f4635b.f4634c;
            if (bVar != null) {
                bVar2 = this.f4635b.f4634c;
                bVar2.a();
            }
        }
    }
}
