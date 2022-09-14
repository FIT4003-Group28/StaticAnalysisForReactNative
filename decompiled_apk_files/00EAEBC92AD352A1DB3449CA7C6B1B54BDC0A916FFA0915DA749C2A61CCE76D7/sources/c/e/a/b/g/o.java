package c.e.a.b.g;
/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f4630b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n f4631c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(n nVar, h hVar) {
        this.f4631c = nVar;
        this.f4630b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        a aVar;
        try {
            aVar = this.f4631c.f4628b;
            h hVar = (h) aVar.a(this.f4630b);
            if (hVar == null) {
                this.f4631c.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            hVar.a(j.f4611b, (e) this.f4631c);
            hVar.a(j.f4611b, (d) this.f4631c);
            hVar.a(j.f4611b, (b) this.f4631c);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                c0Var3 = this.f4631c.f4629c;
                c0Var3.a((Exception) e2.getCause());
                return;
            }
            c0Var2 = this.f4631c.f4629c;
            c0Var2.a((Exception) e2);
        } catch (Exception e3) {
            c0Var = this.f4631c.f4629c;
            c0Var.a(e3);
        }
    }
}
