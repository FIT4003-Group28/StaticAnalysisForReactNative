package defpackage;
/* compiled from: PG */
/* renamed from: azkx  reason: default package */
/* loaded from: classes2.dex */
final class azkx implements ayot {
    final /* synthetic */ azky a;
    private final ayot b;

    public azkx(azky azkyVar, ayot ayotVar) {
        this.a = azkyVar;
        this.b = ayotVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        try {
            this.a.b.a(th);
        } catch (Throwable th2) {
            bapv.j(th2);
            th = new aypo(th, th2);
        }
        this.b.b(th);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        this.b.sh(obj);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        this.b.sj(aypgVar);
    }
}
