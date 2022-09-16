package defpackage;
/* compiled from: PG */
/* renamed from: azlt  reason: default package */
/* loaded from: classes2.dex */
final class azlt implements ayot {
    final /* synthetic */ azlu a;
    private final ayot b;

    public azlt(azlu azluVar, ayot ayotVar) {
        this.a = azluVar;
        this.b = ayotVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        Object a;
        azlu azluVar = this.a;
        ayqe ayqeVar = azluVar.b;
        if (ayqeVar != null) {
            try {
                a = ayqeVar.a(th);
            } catch (Throwable th2) {
                bapv.j(th2);
                this.b.b(new aypo(th, th2));
                return;
            }
        } else {
            a = azluVar.c;
        }
        if (a == null) {
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            this.b.b(nullPointerException);
            return;
        }
        this.b.sh(a);
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
