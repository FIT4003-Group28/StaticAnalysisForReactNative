package c.e.a.b.g;
/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f4625b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ l f4626c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(l lVar, h hVar) {
        this.f4626c = lVar;
        this.f4625b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        a aVar;
        c0 c0Var4;
        c0 c0Var5;
        if (this.f4625b.c()) {
            c0Var5 = this.f4626c.f4624c;
            c0Var5.f();
            return;
        }
        try {
            aVar = this.f4626c.f4623b;
            Object a2 = aVar.a(this.f4625b);
            c0Var4 = this.f4626c.f4624c;
            c0Var4.a((c0) a2);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                c0Var3 = this.f4626c.f4624c;
                c0Var3.a((Exception) e2.getCause());
                return;
            }
            c0Var2 = this.f4626c.f4624c;
            c0Var2.a((Exception) e2);
        } catch (Exception e3) {
            c0Var = this.f4626c.f4624c;
            c0Var.a(e3);
        }
    }
}
