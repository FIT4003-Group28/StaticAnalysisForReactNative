package defpackage;
/* compiled from: PG */
/* renamed from: azbp  reason: default package */
/* loaded from: classes2.dex */
final class azbp implements ayod, aypg {
    final ayod a;
    aypg b;
    private final /* synthetic */ int c;

    public azbp(ayod ayodVar) {
        this.a = ayodVar;
    }

    public azbp(ayod ayodVar, int i) {
        this.c = i;
        this.a = ayodVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        if (this.c == 0) {
            this.a.b(th);
            return;
        }
        this.b = ayqi.a;
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        if (this.c == 0) {
            return this.b.e();
        }
        return this.b.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.c == 0) {
            this.b.qr();
            return;
        }
        this.b.qr();
        this.b = ayqi.a;
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        if (this.c == 0) {
            this.a.sh(false);
            return;
        }
        this.b = ayqi.a;
        this.a.sm();
    }

    @Override // defpackage.ayod
    public final void sm() {
        if (this.c == 0) {
            this.a.sh(true);
            return;
        }
        this.b = ayqi.a;
        this.a.sm();
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (this.c == 0) {
            if (!ayqi.h(this.b, aypgVar)) {
                return;
            }
            this.b = aypgVar;
            this.a.sj(this);
        } else if (!ayqi.h(this.b, aypgVar)) {
        } else {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }
}
