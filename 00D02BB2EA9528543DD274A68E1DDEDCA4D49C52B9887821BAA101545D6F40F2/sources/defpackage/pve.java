package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pve  reason: default package */
/* loaded from: classes7.dex */
public final class pve implements egq {
    static final long a = TimeUnit.SECONDS.toMillis(1);
    public static final /* synthetic */ int z = 0;
    private final bzgl A;
    private final dxio<afwp> B;
    private final efg C;
    private final dwwr D;
    private final qeg E;
    private final tmy F;
    private final FrameLayout G;
    private final zmu H;
    private final jkh I;
    private final vox J;
    private final pyt K;
    @dzsi
    private final cqkf<jar> L;
    @dzsi
    private final cqkf<zew> M;
    private final bvjj N;
    private final cklq O;
    private final ckml P;
    @dzsi
    private View Q;
    public final Activity b;
    public final dxio<bzmm> c;
    public final cqhu d;
    public final pxl e;
    public final pys f;
    public final psw g;
    public final pyi h;
    public final arlp i;
    public final wzz j;
    public final puy k;
    public final pvk l;
    public final vnk m;
    public final pyn n;
    public final pyo o;
    public final wgg p;
    public final cqkf<zby> q;
    public final cqkf<zei> r;
    public final dehq s;
    @dzsi
    public dehn<?> t;
    boolean u = true;
    boolean v = true;
    boolean w = false;
    boolean x = false;
    @dzsi
    public View y;

    public pve(Activity activity, dxio<afwp> dxioVar, dxio<bzmm> dxioVar2, efg efgVar, qeg qegVar, dwwr dwwrVar, bvjj bvjjVar, dehq dehqVar, bzgl bzglVar, pyn pynVar, pyo pyoVar, wgg wggVar, cklq cklqVar, ckml ckmlVar, cqhu cqhuVar, tmy tmyVar, FrameLayout frameLayout, puy puyVar, pvk pvkVar, vnk vnkVar, pxl pxlVar, pys pysVar, psw pswVar, pyi pyiVar, arlp arlpVar, wzz wzzVar, zmu zmuVar, jkh jkhVar, vox voxVar, pyt pytVar, cqkf<zby> cqkfVar, @dzsi cqkf<jar> cqkfVar2, @dzsi cqkf<zew> cqkfVar3, cqkf<zei> cqkfVar4) {
        this.b = activity;
        this.A = bzglVar;
        this.B = dxioVar;
        this.c = dxioVar2;
        this.d = cqhuVar;
        this.e = pxlVar;
        this.f = pysVar;
        this.g = pswVar;
        this.h = pyiVar;
        this.i = arlpVar;
        this.j = wzzVar;
        this.C = efgVar;
        this.D = dwwrVar;
        this.E = qegVar;
        this.N = bvjjVar;
        this.F = tmyVar;
        this.G = frameLayout;
        this.k = puyVar;
        this.l = pvkVar;
        this.m = vnkVar;
        this.H = zmuVar;
        this.I = jkhVar;
        this.J = voxVar;
        this.K = pytVar;
        this.q = cqkfVar;
        this.L = cqkfVar2;
        this.M = cqkfVar3;
        this.r = cqkfVar4;
        this.n = pynVar;
        this.o = pyoVar;
        this.p = wggVar;
        this.O = cklqVar;
        this.P = ckmlVar;
        this.s = dehqVar;
        if (qegVar.a()) {
            bvjjVar.S(bvjk.cI, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // defpackage.egq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qs(defpackage.egu r6) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pve.Qs(egu):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        cklt ckltVar;
        if (this.u) {
            amsy aS = this.m.aS();
            if (this.m.l().d().t() && aS != null) {
                if (!aS.t()) {
                    this.k.bV().a.c(ckmk.DIRECTIONS_SEARCH, ckmo.UNKNOWN);
                } else {
                    puy puyVar = this.k;
                    if (puyVar.cE == 3) {
                        puyVar.bV().c(aS.d());
                        cklq cklqVar = this.O;
                        if (aS.d()) {
                            ckltVar = cklt.OFFLINE_DIRECTIONS;
                        } else {
                            ckltVar = cklt.ONLINE_DIRECTIONS;
                        }
                        cklqVar.c(ckltVar);
                        if (!this.x) {
                            this.P.f(ckoi.DIRECTIONS, bvjz.c(afid.DIRECTIONS_ACTION, durz.EIT_DIRECTIONS));
                            this.P.f(ckoi.DIRECTIONS, bvjz.c(afid.EXTERNAL_INVOCATION, null));
                            this.x = true;
                        }
                    }
                }
            }
            this.u = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (r5.d().booleanValue() != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.cjqp r9, defpackage.ptj r10, defpackage.jjn r11, int r12) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pve.c(cjqp, ptj, jjn, int):void");
    }
}
