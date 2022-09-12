package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ges  reason: default package */
/* loaded from: classes.dex */
public abstract class ges extends fd implements ecs, cjsf, achd, gfw, gfv, ggg, gft, gfo, btsv, ggc {
    private static final dcqe IP = dcqe.c("ges");
    @dzsi
    private alad IR;
    @dzsi
    private btta IS;
    public gga aE;
    @dzsi
    public View aF;
    @dzsi
    public cjqp aG;
    public cjqq aH;
    public cjqy aI;
    public dbsg<akpm> aJ;
    public Executor aK;
    public cpv aL;
    public dxio<gce> aM;
    public dxio<gcg> aN;
    public boolean aD = false;
    private final dbty<cjsz> IQ = dbud.a(new dbty(this) { // from class: geo
        private final ges a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            return new cjsz(this.a.p());
        }
    });
    private final dbty<crzp<Boolean>> e = dbud.a(new dbty(this) { // from class: gep
        private final ges a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            final ges gesVar = this.a;
            return new crzp(gesVar) { // from class: geq
                private final ges a;

                {
                    this.a = gesVar;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    this.a.bi();
                }
            };
        }
    });

    private final void g(ger gerVar) {
        dbsb c = dbsc.c(getClass());
        c.b("state", gerVar);
        bvpm.a("FragmentLifecycle", c.toString());
    }

    protected void Nv() {
        dxix.a(this);
    }

    public void Nw(@dzsi Object obj) {
        gfw ba = ba();
        if (ba != null) {
            ba.Qn(obj);
        }
    }

    public gfu Nx() {
        return gfu.ACTIVITY_FRAGMENT;
    }

    public fd Ny() {
        return this;
    }

    public void Nz(@dzsi gfw gfwVar) {
        if (gfwVar == null) {
            F(null, 0);
        } else if (gfwVar instanceof fd) {
            F((fd) gfwVar, 0);
        } else {
            bvoo.h("%s must extend Fragment. It's the only way to preserve the listener if the activity is recreated.", gfwVar.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Oo(View view) {
        this.aL.a(view);
    }

    @Override // defpackage.fd
    public void Qd() {
        super.Qd();
        this.IS = null;
    }

    @Override // defpackage.fd
    public void Qe() {
        View view = this.P;
        if (view != null) {
            this.aH.h(view);
        }
        g(ger.ON_DESTROY_VIEW);
        super.Qe();
    }

    @Override // defpackage.ecs
    public final void Qf() {
        View view = this.aF;
        if (view == null) {
            view = this.P;
        }
        if (view == null || !this.aD) {
            return;
        }
        Oo(view);
    }

    public void Qn(@dzsi Object obj) {
    }

    public List aO() {
        return dcdc.e();
    }

    @Override // defpackage.cjsf
    public final cjtg aP() {
        return this.IQ.a();
    }

    protected void aQ() {
        if (p() == null) {
            this.aG = null;
        } else {
            this.aG = this.aH.j(aP());
        }
    }

    protected void aW() {
        cjqp cjqpVar = this.aG;
        if (cjqpVar != null) {
            this.aH.l(cjqpVar);
        }
    }

    @dzsi
    public final gga aY() {
        return this.aE;
    }

    @Override // defpackage.gfw
    public final void aZ(gfv gfvVar) {
        gfvVar.Nz(this);
        if (this.D == null) {
            gga ggaVar = this.aE;
            if (ggaVar == null) {
                bvoo.h("pushFragmentForResult is called before the fragment is attached.", new Object[0]);
                return;
            } else {
                ggaVar.D(gfvVar);
                return;
            }
        }
        gfvVar.Ny();
        gfu Nx = gfvVar.Nx();
        String b = gfu.b(gfvVar.getClass(), Nx, new gfs[0]);
        gn Q = Q();
        gz b2 = Q.b();
        b2.z(b);
        b2.y((fd) gfvVar, Nx.c);
        b2.f();
        Q.aq();
    }

    @Override // defpackage.fd
    public void ae(Activity activity) {
        super.ae(activity);
        Nv();
        this.aE = (gga) activity;
    }

    @Override // defpackage.fd
    public void aj(@dzsi Bundle bundle) {
        cjqp cjqpVar;
        super.aj(bundle);
        View view = this.P;
        if (view == null || (cjqpVar = this.aG) == null) {
            return;
        }
        this.aH.i(cjqpVar, view);
    }

    @Override // defpackage.fd
    public void ak() {
        super.ak();
        g(ger.ON_RESUME);
    }

    @Override // defpackage.fd
    public void al() {
        super.al();
        g(ger.ON_PAUSE);
    }

    @Override // defpackage.fd
    public void am() {
        super.am();
        g(ger.ON_DESTROY);
        aW();
    }

    @dzsi
    public gfw ba() {
        fd G = G();
        if (G != null) {
            if (G instanceof gfw) {
                return (gfw) G;
            }
            bvoo.h("dispatchResult: Expected GmmActivityFragmentResultListener but instead found %s", G.getClass());
            return null;
        }
        return null;
    }

    @Override // defpackage.gft
    public final boolean bb() {
        return this.aD;
    }

    public final String bc() {
        return gfu.b(getClass(), Nx(), new gfs[0]);
    }

    @Override // defpackage.ggc
    public final dbsg<cjqp> bd() {
        return dbsg.j(this.aG);
    }

    @Override // defpackage.btsv
    public final btta be() {
        dbsk.m(true, "This Fragment does not have a FragmentComponent due to startup reasons.");
        if (this.IS == null) {
            this.IS = btsx.a(btta.class, this);
        }
        return this.IS;
    }

    @Override // defpackage.btsv
    public final boolean bf() {
        dbsk.m(true, "This Fragment does not have a FragmentComponent due to startup reasons.");
        return this.IS != null;
    }

    public boolean bg() {
        fd K;
        gga ggaVar = this.aE;
        return ggaVar != null && (K = ggaVar.K()) != null && this.aD && equals(K);
    }

    protected boolean bh() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bi() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean bj() {
        return this.aN.a().a() && this.aM.a().h();
    }

    public achc bk() {
        return achc.MAP;
    }

    public achc bl(@dzsi achc achcVar) {
        return achcVar == null ? bk() : achcVar;
    }

    public boolean bm(boolean z, achc achcVar) {
        return false;
    }

    public boolean e() {
        return false;
    }

    @Override // defpackage.fd
    public void l(@dzsi Bundle bundle) {
        int i;
        this.aI.h();
        super.l(bundle);
        if (bundle != null && bundle.containsKey("ue3ActivationId") && (i = bundle.getInt("ue3ActivationId")) != 0) {
            aP().b(i);
        }
        Bundle bundle2 = this.o;
        if (bundle2 != null && bundle2.getBoolean("restoreCameraPositionOnResume", false)) {
            if (bundle != null) {
                this.IR = (alad) bundle.getSerializable("savedCameraPosition");
            } else {
                this.IR = ((akpm) ((dbsu) this.aJ).a).n();
            }
        }
        g(ger.ON_CREATE);
        aQ();
    }

    @dzsi
    public ddho p() {
        return dtxy.a;
    }

    @Override // defpackage.fd
    public void s() {
        super.s();
        this.aD = true;
        g(ger.ON_START);
        bvpm.a("GmmActivityFragment##onStart", bc());
        alad aladVar = this.IR;
        if (aladVar != null) {
            akyc e = akyt.e(aladVar);
            e.b = 0;
            ((akpm) ((dbsu) this.aJ).a).p(e);
        }
        if (bh() && this.aN.a().a()) {
            this.aM.a().g().d(this.e.a(), this.aK);
        }
        cjqg.p(this.P, this, p());
    }

    @Override // defpackage.fd
    public void t(Bundle bundle) {
        Integer c = aP().c();
        if (c != null) {
            bundle.putInt("ue3ActivationId", c.intValue());
        }
        alad aladVar = this.IR;
        if (aladVar != null) {
            bundle.putSerializable("savedCameraPosition", aladVar);
        }
        bundle.putInt("dummy", 1);
    }

    @Override // defpackage.fd
    public void u() {
        super.u();
        this.aD = false;
        cjqp cjqpVar = this.aG;
        if (cjqpVar != null) {
            cjqpVar.f();
        }
        if (bh() && this.aN.a().a()) {
            this.aM.a().g().c(this.e.a());
        }
        this.aI.h();
        g(ger.ON_STOP);
    }
}
