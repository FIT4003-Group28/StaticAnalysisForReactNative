package c.e.a.b.g;
/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f4649b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ v f4650c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(v vVar, h hVar) {
        this.f4650c = vVar;
        this.f4649b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f4650c.f4647b;
        synchronized (obj) {
            eVar = this.f4650c.f4648c;
            if (eVar != null) {
                eVar2 = this.f4650c.f4648c;
                eVar2.a(this.f4649b.b());
            }
        }
    }
}
