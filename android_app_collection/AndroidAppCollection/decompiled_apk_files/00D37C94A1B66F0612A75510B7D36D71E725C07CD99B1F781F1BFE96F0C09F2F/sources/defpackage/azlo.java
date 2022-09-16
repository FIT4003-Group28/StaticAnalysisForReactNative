package defpackage;
/* compiled from: PG */
/* renamed from: azlo  reason: default package */
/* loaded from: classes2.dex */
final class azlo implements ayot {
    final ayot a;
    final ayqe b;

    public azlo(ayot ayotVar, ayqe ayqeVar) {
        this.a = ayotVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        try {
            Object a = this.b.a(obj);
            ayrd.b(a, "The mapper function returned a null value.");
            this.a.sh(a);
        } catch (Throwable th) {
            bapv.j(th);
            b(th);
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        this.a.sj(aypgVar);
    }
}
