package defpackage;
/* compiled from: PG */
/* renamed from: htv  reason: default package */
/* loaded from: classes.dex */
public final class htv implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ htw c;

    public htv(htw htwVar, boolean z, boolean z2) {
        this.c = htwVar;
        this.a = z;
        this.b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ddkk ddkkVar;
        if (this.a && !this.b) {
            try {
                ddkkVar = this.c.b();
            } catch (Exception e) {
                bvoo.j(e);
                ddkkVar = null;
            }
            if (ddkkVar != null || this.c.e.getLoggingParameters().g) {
                htw.d(this.c, dukj.RUNNING, ddkkVar, this.c.c(dukj.RUNNING));
            }
        }
        try {
            ddkk a = this.c.i.a().a();
            if (this.b) {
                htw.d(this.c, dukj.RUNNING, a, this.c.c(dukj.RUNNING));
            } else {
                this.c.h.s(bwrj.USER_PREFERENCES, a);
            }
        } catch (Exception e2) {
            if (this.b) {
                bvoo.j(e2);
            } else {
                bvoo.j(e2);
            }
        }
    }
}
