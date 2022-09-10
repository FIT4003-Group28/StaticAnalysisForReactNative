package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akcr  reason: default package */
/* loaded from: classes2.dex */
public final class akcr extends awnw implements akft {
    public akfu a;
    public Executor ad;
    private final crzp<btlu> ah = new akcp(this);
    public bvjj b;
    public cjqy c;
    public dxio<akfa> d;
    public akfc e;
    public cqkj f;
    public akfv g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((akcs) btsx.b(akcs.class, this)).bV(this);
    }

    @Override // defpackage.awnw, defpackage.ges, defpackage.gfo
    public final boolean e() {
        g();
        return super.e();
    }

    public final void g() {
        this.b.S(bvjk.bw, true);
    }

    @Override // defpackage.awnw
    protected final View i() {
        cqkf c = this.f.c(new gqc(), (ViewGroup) this.P);
        akfv akfvVar = this.g;
        cjtd a = cjtd.a(dtxp.af);
        cjtd a2 = cjtd.a(dtxp.ae);
        gga a3 = akfvVar.a.a();
        akfv.a(a3, 1);
        cqhn a4 = akfvVar.b.a();
        akfv.a(a4, 2);
        akfv.a(this, 3);
        akfu akfuVar = new akfu(a3, a4, this, true, R.string.LOGIN_PROMPT_PANEL_OOB_TITLE, R.string.SAVE_PLACE_PROMOTION_MESSAGE, a, a2);
        this.a = akfuVar;
        akfuVar.e(true);
        c.e(this.a);
        return c.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyb.dI;
    }

    @Override // defpackage.akft
    public final void q() {
        if (!this.aD) {
            return;
        }
        g();
        aS();
    }

    @Override // defpackage.awnw, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.d.a().C().d(this.ah, this.ad);
    }

    @Override // defpackage.awnw, defpackage.ges, defpackage.fd
    public final void u() {
        this.d.a().C().c(this.ah);
        super.u();
    }

    @Override // defpackage.akft
    public final void w() {
        if (!this.aD) {
            return;
        }
        this.e.k(new akcq(this), null);
    }
}
