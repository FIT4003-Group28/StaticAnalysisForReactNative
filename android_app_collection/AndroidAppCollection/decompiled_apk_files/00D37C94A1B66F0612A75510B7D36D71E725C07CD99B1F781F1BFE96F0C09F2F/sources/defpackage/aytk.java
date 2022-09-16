package defpackage;
/* compiled from: PG */
/* renamed from: aytk  reason: default package */
/* loaded from: classes2.dex */
final class aytk implements ayns {
    final /* synthetic */ aytl a;
    private final ayns b;

    public aytk(aytl aytlVar, ayns aynsVar) {
        this.a = aytlVar;
        this.b = aynsVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        try {
            if (this.a.b.a(th)) {
                this.b.sm();
            } else {
                this.b.b(th);
            }
        } catch (Throwable th2) {
            bapv.j(th2);
            this.b.b(new aypo(th, th2));
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        this.b.sj(aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.b.sm();
    }
}
