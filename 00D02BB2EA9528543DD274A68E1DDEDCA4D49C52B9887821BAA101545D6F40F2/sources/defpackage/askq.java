package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: askq  reason: default package */
/* loaded from: classes2.dex */
public abstract class askq implements asmo {
    static final AccelerateDecelerateInterpolator a = new AccelerateDecelerateInterpolator();
    static final LinearInterpolator b = new LinearInterpolator();
    static final Float c = Float.valueOf(15.5f);
    protected final akox d;
    protected final gll e;
    protected final Resources f;
    public final arbu g;
    protected final asmp h;
    aslm i;
    public asld j;
    public boolean k;
    final askv l;
    @dzsi
    protected dqvj m;
    protected GmmLocation n;
    @dzsi
    public Float o;
    private final btvo q;
    @dzsi
    private asli s;
    @dzsi
    private final asky t;
    private boolean v;
    private boolean w;
    private final dvej x;
    private final asvx z;
    private dcdc<aslo> r = dcdc.e();
    private final aswa u = new askp(this);
    public boolean p = false;
    private boolean y = true;

    public askq(Resources resources, akox akoxVar, gll gllVar, arbu arbuVar, asvx asvxVar, asmp asmpVar, asky askyVar, btvo btvoVar, cjqq cjqqVar, arym arymVar) {
        this.q = btvoVar;
        this.d = akoxVar;
        dbsk.t(gllVar, "mapVisibleRectProvider");
        this.e = gllVar;
        dbsk.t(arbuVar, "myLocationController");
        this.g = arbuVar;
        dbsk.t(asvxVar, "compassMode");
        this.z = asvxVar;
        dbsk.t(asmpVar, "stateController");
        this.h = asmpVar;
        dbsk.t(resources, "resources");
        this.f = resources;
        this.t = askyVar;
        this.j = asld.FREE_MOVEMENT;
        this.l = new askv(btvoVar, cjqqVar, arymVar, akoxVar.k().c);
        this.x = btvoVar.getNavigationParameters().N();
    }

    private final void g(@dzsi alad aladVar, int i, @dzsi TimeInterpolator timeInterpolator) {
        if (aladVar != null && !aladVar.equals(this.d.n())) {
            akyc e = akyt.e(aladVar);
            e.b = i;
            e.c = timeInterpolator;
            x(e);
        }
    }

    public final boolean A() {
        return this.z.a() || this.k || (this.q.getNavigationParameters().X() != 5 && !this.g.f().h()) || (this.w && this.x == dvej.NORTH_UP_ZOOMED_OUT);
    }

    @Override // defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        asky askyVar = this.t;
        if (askyVar != null) {
            if (bundle == null || !bundle.containsKey("navigationMapViewport")) {
                askyVar.c = alao.a(askyVar.a);
                askyVar.d = askyVar.b.e();
                askyVar.a.f();
                askyVar.a.w = false;
                return;
            }
            dgrt dgrtVar = (dgrt) bvrs.f(bundle, "navigationMapViewport", (dssr) dgrt.d.cu(7));
            if (dgrtVar != null) {
                askyVar.c = akqs.d(dgrtVar);
            } else {
                askyVar.c = null;
            }
            askyVar.d = bundle.getLong("navigationMapViewportTimestamp");
        }
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
        o(true);
    }

    @Override // defpackage.asmo
    public final void Qp() {
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
        asky askyVar = this.t;
        if (askyVar != null) {
            akqs akqsVar = askyVar.c;
            if (akqsVar != null) {
                bvrs.k(bundle, "navigationMapViewport", akqsVar.e());
            }
            bundle.putLong("navigationMapViewportTimestamp", askyVar.d);
            askyVar.a.f();
            askyVar.a.w = false;
        }
    }

    @Override // defpackage.asmo
    public void b() {
        this.z.b(this.u);
    }

    @Override // defpackage.asmo
    public void c() {
        this.z.f(this.u);
    }

    public final void h(boolean z) {
        this.y = z;
        this.g.f().B(!z);
    }

    public final void i(float f) {
        this.g.f().C(f);
    }

    public final void j(dbsg<Float> dbsgVar) {
        for (aslg aslgVar : this.l.a.values()) {
            aslgVar.l(dbsgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(astc astcVar, dqvj dqvjVar, GmmLocation gmmLocation) {
        this.m = dqvjVar;
        this.n = gmmLocation;
        this.g.f().i(arbs.a(dqvjVar));
        this.g.f().D();
        if (this.w != astcVar.c()) {
            this.w = astcVar.c();
            this.g.k(astcVar.c());
        }
        aslf aslfVar = astcVar.c;
        if (aslfVar instanceof aslm) {
            this.i = (aslm) aslfVar;
        } else if (aslfVar instanceof asli) {
            this.s = (asli) aslfVar;
        }
        if (!(aslfVar instanceof aslp)) {
            this.r = dcdc.e();
        } else {
            this.r = ((aslp) aslfVar).f;
        }
        boolean b2 = aslfVar.a.b();
        boolean z = true;
        boolean z2 = !dbsd.a(aslfVar.a(), this.o);
        asld asldVar = this.j;
        asld asldVar2 = aslfVar.a;
        if (asldVar != asldVar2 || ((b2 && z2) || this.v != astcVar.k)) {
            this.j = asldVar2;
            this.k = aslfVar.d;
            this.v = astcVar.k;
            asld asldVar3 = this.j;
            asld asldVar4 = asld.FOLLOWING;
            if (this.v) {
                this.o = c;
            } else if (b2) {
                this.o = aslfVar.a();
            }
            if (asldVar3 != asldVar4) {
                l();
            }
            arbx f = this.g.f();
            if (!this.v && this.j == asld.FOLLOWING && this.y) {
                z = false;
            }
            f.B(z);
            if (this.v) {
                this.g.f().C(0.65f);
            }
        }
        o(aslfVar.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        this.g.h(amwd.OFF);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        asky askyVar = this.t;
        if (askyVar != null) {
            askyVar.a();
        }
    }

    public final synchronized void n() {
        o(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[Catch: all -> 0x00ee, TRY_LEAVE, TryCatch #1 {all -> 0x00ee, blocks: (B:3:0x0001, B:6:0x0010, B:8:0x0015, B:11:0x001d, B:13:0x0041, B:16:0x0048, B:36:0x00b6, B:39:0x00bd, B:19:0x0052, B:21:0x0066, B:29:0x009b, B:30:0x009e, B:24:0x0072, B:26:0x0088, B:27:0x0094, B:31:0x00a1, B:34:0x00a8, B:42:0x00c2, B:45:0x00c7, B:47:0x00cb, B:50:0x00d0, B:52:0x00d6, B:57:0x00df, B:60:0x00e4, B:63:0x00e9), top: B:75:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: all -> 0x00ee, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00ee, blocks: (B:3:0x0001, B:6:0x0010, B:8:0x0015, B:11:0x001d, B:13:0x0041, B:16:0x0048, B:36:0x00b6, B:39:0x00bd, B:19:0x0052, B:21:0x0066, B:29:0x009b, B:30:0x009e, B:24:0x0072, B:26:0x0088, B:27:0x0094, B:31:0x00a1, B:34:0x00a8, B:42:0x00c2, B:45:0x00c7, B:47:0x00cb, B:50:0x00d0, B:52:0x00d6, B:57:0x00df, B:60:0x00e4, B:63:0x00e9), top: B:75:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void o(boolean r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.askq.o(boolean):void");
    }

    protected void p(boolean z) {
        throw null;
    }

    protected void q(boolean z) {
        throw null;
    }

    protected void r(boolean z) {
    }

    protected void s(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final alad t(boolean z, akru... akruVarArr) {
        GmmLocation gmmLocation = null;
        if (akruVarArr.length == 0) {
            return null;
        }
        Point i = this.e.i();
        aslg z2 = z();
        if (z) {
            gmmLocation = this.n;
        }
        return z2.n(gmmLocation, akruVarArr, this.e.b(), i.x, i.y, this.f.getDisplayMetrics().density);
    }

    @dzsi
    protected abstract alad u();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(boolean z, alai alaiVar) {
        this.g.j(alaiVar, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(boolean z, @dzsi alad aladVar) {
        g(aladVar, true != z ? -1 : 0, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(akyc akycVar) {
        this.d.q(akycVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(boolean z, @dzsi alad aladVar, @dzsi TimeInterpolator timeInterpolator) {
        if (aladVar == null) {
            return;
        }
        if (z) {
            g(aladVar, 0, null);
            return;
        }
        alad n = this.d.n();
        int i = -1;
        if (dbsd.a(aladVar, n) || (n != null && Math.abs(aladVar.k - n.k) <= 0.3f && aladVar.j.A(n.j) <= 1000000.0f && Math.abs(aladVar.l - n.l) <= 5.0f && Math.abs(bvop.c(aladVar.m - n.m)) <= 5.0f && Math.abs(aladVar.n.b - n.n.b) <= 0.01f && Math.abs(aladVar.n.c - n.n.c) <= 0.01f)) {
            timeInterpolator = b;
            i = 1600;
        }
        g(aladVar, i, timeInterpolator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final aslg z() {
        dvdm dvdmVar;
        askv askvVar = this.l;
        boolean z = true;
        if (this.v) {
            dvdmVar = dvdm.CAMERA_2D_HEADING_UP;
        } else if (A()) {
            dvdmVar = dvdm.CAMERA_2D_NORTH_UP;
        } else {
            if (this.w) {
                alje aljeVar = alje.FIRST_FINGER_DOWN;
                dvej dvejVar = dvej.UNKNOWN_TRAFFIC_RADAR_CAMERA_VARIANT;
                asld asldVar = asld.FOLLOWING;
                int ordinal = this.x.ordinal();
                if (ordinal == 0) {
                    dvdmVar = dvdm.CAMERA_3D;
                } else if (ordinal == 1) {
                    dvdmVar = dvdm.CAMERA_2D_NORTH_UP;
                } else if (ordinal == 2) {
                    dvdmVar = dvdm.CAMERA_2D_HEADING_UP;
                }
            }
            dvdmVar = dvdm.CAMERA_3D;
        }
        if (this.m != dqvj.WALK) {
            z = false;
        }
        return askvVar.a(dvdmVar, false, z);
    }
}
