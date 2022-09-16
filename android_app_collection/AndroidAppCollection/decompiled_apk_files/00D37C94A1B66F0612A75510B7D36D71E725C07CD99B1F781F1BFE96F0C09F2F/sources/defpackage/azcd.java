package defpackage;
/* compiled from: PG */
/* renamed from: azcd  reason: default package */
/* loaded from: classes2.dex */
final class azcd implements ayod, aypg {
    final ayod a;
    final ayqe b;
    aypg c;
    private final /* synthetic */ int d;

    public azcd(ayod ayodVar, ayqe ayqeVar) {
        this.a = ayodVar;
        this.b = ayqeVar;
    }

    public azcd(ayod ayodVar, ayqe ayqeVar, int i) {
        this.d = i;
        this.a = ayodVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        if (this.d != 0) {
            try {
                Object a = this.b.a(obj);
                ayrd.b(a, "The mapper returned a null item");
                this.a.sh(a);
                return;
            } catch (Throwable th) {
                bapv.j(th);
                this.a.b(th);
                return;
            }
        }
        this.a.sh(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        if (this.d == 0) {
            return this.c.e();
        }
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.d == 0) {
            this.c.qr();
            return;
        }
        aypg aypgVar = this.c;
        this.c = ayqi.a;
        aypgVar.qr();
    }

    @Override // defpackage.ayod
    public final void sm() {
        if (this.d == 0) {
            this.a.sm();
        } else {
            this.a.sm();
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (this.d == 0) {
            if (!ayqi.h(this.c, aypgVar)) {
                return;
            }
            this.c = aypgVar;
            this.a.sj(this);
        } else if (!ayqi.h(this.c, aypgVar)) {
        } else {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        if (this.d == 0) {
            try {
                Object a = this.b.a(th);
                ayrd.b(a, "The valueSupplier returned a null value");
                this.a.sh(a);
                return;
            } catch (Throwable th2) {
                bapv.j(th2);
                this.a.b(new aypo(th, th2));
                return;
            }
        }
        this.a.b(th);
    }
}
