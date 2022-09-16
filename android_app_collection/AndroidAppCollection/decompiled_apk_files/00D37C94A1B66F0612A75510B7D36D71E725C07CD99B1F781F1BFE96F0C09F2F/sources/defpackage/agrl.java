package defpackage;

import android.app.Notification;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: agrl  reason: default package */
/* loaded from: classes.dex */
public abstract class agrl implements agrn {
    private final snc a;
    private final azqb b;
    private final agrm c;
    private final ahdf d;
    private long e = 0;

    public agrl(snc sncVar, azqb azqbVar, agrm agrmVar, ahdf ahdfVar) {
        sncVar.getClass();
        this.a = sncVar;
        azqbVar.getClass();
        this.b = azqbVar;
        agrmVar.getClass();
        this.c = agrmVar;
        this.d = ahdfVar;
    }

    @Override // defpackage.agrn
    public final void A(agqz agqzVar) {
        int f = agxg.f(agqzVar.f);
        if (f == 1 || f == 4 || f == 6 || f == 7) {
            String r = agxg.r(agqzVar.f);
            agxg.u(agqzVar.f);
            if (!TextUtils.isEmpty(r)) {
                boolean aa = agxg.aa(agqzVar.f);
                agqg d = ((agrf) this.b.get()).a().i().d(r);
                if (d == null || !d.e()) {
                    return;
                }
                if (aa) {
                    k(d);
                    return;
                } else {
                    i(d);
                    return;
                }
            }
            agqv e = ((agrf) this.b.get()).a().m().e(agxg.t(agqzVar.f));
            if (e == null || !e.b()) {
                return;
            }
            m(e);
        }
    }

    @Override // defpackage.agrn
    public final void B(agqz agqzVar) {
        int f = agxg.f(agqzVar.f);
        if (f == 1 || f == 4 || f == 6 || f == 7) {
            String r = agxg.r(agqzVar.f);
            agxg.u(agqzVar.f);
            if (!TextUtils.isEmpty(r)) {
                agqg d = ((agrf) this.b.get()).a().i().d(r);
                if (d == null || !d.e()) {
                    return;
                }
                i(d);
                return;
            }
            agqv e = ((agrf) this.b.get()).a().m().e(agxg.t(agqzVar.f));
            if (e == null || !e.u()) {
                return;
            }
            n(e);
        }
    }

    @Override // defpackage.agrn
    public final void C(agqz agqzVar, boolean z) {
        long c = this.a.c();
        if ((this.c.a || this.d.b()) && c - this.e < 250) {
            return;
        }
        this.e = c;
        int f = agxg.f(agqzVar.f);
        if (f != 1) {
            if (f == 2) {
                agqv e = ((agrf) this.b.get()).a().m().e(agxg.t(agqzVar.f));
                if (e == null) {
                    return;
                }
                q(e);
                return;
            } else if (f != 4 && f != 6 && f != 7) {
                return;
            }
        }
        String r = agxg.r(agqzVar.f);
        agxg.u(agqzVar.f);
        if (!TextUtils.isEmpty(r)) {
            boolean aa = agxg.aa(agqzVar.f);
            agqg d = ((agrf) this.b.get()).a().i().d(r);
            if (d == null) {
                return;
            }
            if (aa) {
                l(d);
                return;
            } else {
                j(d);
                return;
            }
        }
        agqv e2 = ((agrf) this.b.get()).a().m().e(agxg.t(agqzVar.f));
        if (e2 == null) {
            return;
        }
        boolean ab = agxg.ab(agqzVar.f);
        if (z) {
            o(e2);
        } else {
            p(e2, ab);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void D(Notification notification) {
        this.c.e("15", 15, notification, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void c(String str) {
        this.c.a(str, 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void d(String str) {
        this.c.a(str, 10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void e(String str) {
        this.c.a(str, 7);
    }

    protected abstract void i(agqg agqgVar);

    protected abstract void j(agqg agqgVar);

    protected abstract void k(agqg agqgVar);

    protected abstract void l(agqg agqgVar);

    protected abstract void m(agqv agqvVar);

    protected abstract void n(agqv agqvVar);

    protected abstract void o(agqv agqvVar);

    protected abstract void p(agqv agqvVar, boolean z);

    protected abstract void q(agqv agqvVar);

    @Override // defpackage.agrn
    public final synchronized void r() {
        this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void s(String str, Notification notification) {
        this.c.c(str, 8, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void t(String str, Notification notification) {
        this.c.d(str, 8, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void u(String str, Notification notification) {
        this.c.c(str, 10, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void v(String str, Notification notification) {
        this.c.d(str, 10, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void w(String str, Notification notification) {
        this.c.d(str, 14, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void x(String str, Notification notification) {
        this.c.c(str, 7, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void y(String str, Notification notification) {
        this.c.d(str, 7, notification);
    }

    @Override // defpackage.agrn
    public final void z(agqz agqzVar) {
        int f = agxg.f(agqzVar.f);
        if (f != 1 && f != 4) {
            if (f == 5) {
                agxg.t(agqzVar.f);
                return;
            } else if (f != 6 && f != 7) {
                return;
            }
        }
        String r = agxg.r(agqzVar.f);
        agxg.u(agqzVar.f);
        if (!TextUtils.isEmpty(r)) {
            if (!agxg.aa(agqzVar.f)) {
                c(r);
                return;
            } else {
                d(r);
                return;
            }
        }
        e(agxg.t(agqzVar.f));
    }
}
