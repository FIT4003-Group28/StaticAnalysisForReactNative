package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
/* compiled from: PG */
/* renamed from: qez  reason: default package */
/* loaded from: classes4.dex */
public final class qez implements qgk, qgm, qgo {
    public qgs a;
    public qds b;
    private final qet c;

    public qez(qet qetVar) {
        this.c = qetVar;
    }

    @Override // defpackage.qgo
    public final void a(qgn qgnVar, qgs qgsVar) {
        qnm.g("#008 Must be called on the main UI thread.");
        this.a = qgsVar;
        if (!(qgnVar instanceof AdMobAdapter)) {
            new pzj().b(new qcf(null));
        }
        try {
            this.c.j();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgk
    public final void b() {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.a();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgo
    public final void c() {
        qnm.g("#008 Must be called on the main UI thread.");
        qgs qgsVar = this.a;
        if (this.b == null) {
            if (qgsVar == null) {
                qfl.g("#007 Could not call remote method.");
                return;
            } else if (!qgsVar.n) {
                return;
            }
        }
        try {
            this.c.a();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgk
    public final void d() {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.f();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgm
    public final void e() {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.f();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgo
    public final void f() {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.f();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgk
    public final void g(pyw pywVar) {
        qnm.g("#008 Must be called on the main UI thread.");
        String str = pywVar.a;
        String str2 = pywVar.b;
        String.valueOf(str).length();
        String.valueOf(str2).length();
        try {
            this.c.h(pywVar.a());
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgm
    public final void h(pyw pywVar) {
        qnm.g("#008 Must be called on the main UI thread.");
        String str = pywVar.a;
        String str2 = pywVar.b;
        String.valueOf(str).length();
        String.valueOf(str2).length();
        try {
            this.c.h(pywVar.a());
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgo
    public final void i(pyw pywVar) {
        qnm.g("#008 Must be called on the main UI thread.");
        String str = pywVar.a;
        String str2 = pywVar.b;
        String.valueOf(str).length();
        String.valueOf(str2).length();
        try {
            this.c.h(pywVar.a());
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgo
    public final void j() {
        qnm.g("#008 Must be called on the main UI thread.");
        qgs qgsVar = this.a;
        if (this.b == null) {
            if (qgsVar == null) {
                qfl.g("#007 Could not call remote method.");
                return;
            } else if (!qgsVar.m) {
                return;
            }
        }
        try {
            this.c.i();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgk
    public final void k() {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.j();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgm
    public final void l() {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.j();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgo
    public final void m(qds qdsVar) {
        String str;
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            qdr qdrVar = qdsVar.a;
            Parcel pw = qdrVar.pw(4, qdrVar.pv());
            str = pw.readString();
            pw.recycle();
        } catch (RemoteException e) {
            qfl.c(e);
            str = null;
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Adapter called onAdLoaded with template id ".concat(valueOf);
        }
        this.b = qdsVar;
        try {
            this.c.j();
        } catch (RemoteException e2) {
            qfl.h("#007 Could not call remote method.", e2);
        }
    }

    @Override // defpackage.qgk
    public final void n() {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.k();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgm
    public final void o() {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.k();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgo
    public final void p() {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.k();
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgk
    public final void q(String str, String str2) {
        qnm.g("#008 Must be called on the main UI thread.");
        try {
            this.c.l(str, str2);
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgo
    public final void r(qds qdsVar, String str) {
        try {
            this.c.m(qdsVar.a, str);
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }
}
