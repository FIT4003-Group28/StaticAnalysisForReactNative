package defpackage;
/* compiled from: PG */
/* renamed from: azkz  reason: default package */
/* loaded from: classes2.dex */
final class azkz implements ayot {
    final ayot a;
    final /* synthetic */ azla b;

    public azkz(azla azlaVar, ayot ayotVar) {
        this.b = azlaVar;
        this.a = ayotVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        try {
            this.b.b.a(obj);
            this.a.sh(obj);
        } catch (Throwable th) {
            bapv.j(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        this.a.sj(aypgVar);
    }
}
