package defpackage;
/* compiled from: PG */
/* renamed from: ixq  reason: default package */
/* loaded from: classes3.dex */
final class ixq implements ayom {
    final /* synthetic */ ixr a;
    private aypg b;
    private final /* synthetic */ int c;

    public ixq(ixr ixrVar) {
        this.a = ixrVar;
    }

    public ixq(ixr ixrVar, int i) {
        this.c = i;
        this.a = ixrVar;
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (this.c != 0) {
            this.b = aypgVar;
        } else {
            this.b = aypgVar;
        }
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            zep.f("MDX.tvsignin.MdxTvFoundForSignInListener", "Error while observing isSeamlessSignInEnabled", th);
        } else if (i == 1) {
            zep.f("MDX.tvsignin.MdxTvFoundForSignInListener", "Error while observing isPassiveSignInEnabled", th);
        } else {
            zep.f("MDX.tvsignin.MdxTvFoundForSignInListener", "Error while observing isAssistedSignInEnabled", th);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        int i = this.c;
        if (i == 0) {
            this.b.qr();
        } else if (i == 1) {
            this.b.qr();
        } else {
            this.b.qr();
        }
    }

    @Override // defpackage.ayom
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.a.h = ((Boolean) obj).booleanValue();
        } else if (i == 1) {
            this.a.g = ((Boolean) obj).booleanValue();
        } else {
            this.a.i = ((Boolean) obj).booleanValue();
        }
    }
}
