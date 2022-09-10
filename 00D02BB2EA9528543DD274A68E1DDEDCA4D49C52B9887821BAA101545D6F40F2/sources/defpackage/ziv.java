package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ziv  reason: default package */
/* loaded from: classes7.dex */
public class ziv implements jkh, zbx {
    private final vyo A;
    private final dxio<? extends uio> B;
    @dzsi
    private final izl C;
    private final xkl D;
    private boolean E = false;
    private dcdc<zqj> F = dcdc.e();
    private dcdc<ziu> G = dcdc.e();
    private int H = -1;
    private final zce I;
    private final bbb J;
    private int K;
    public final Activity b;
    public final bbb c;
    public dcdc<zit> d;
    public int e;
    public float f;
    public final vmw g;
    private final vno h;
    private final vmh i;
    private final cjqy j;
    private final bvjj k;
    private vnu l;
    private dcdc<vnu> m;
    @dzsi
    private bwob n;
    private final bwob o;
    private zfn p;
    private final zfl q;
    private final zbs r;
    private final zie s;
    private final zqi t;
    private final zju u;
    private final zny v;
    private final zlb w;
    private final zky x;
    private final cqat y;
    private final zuz z;

    public ziv(Activity activity, vnp vnpVar, vmh vmhVar, cjqy cjqyVar, bvjj bvjjVar, zka zkaVar, zqi zqiVar, zny znyVar, zlb zlbVar, zky zkyVar, cqat cqatVar, zuz zuzVar, vmz vmzVar, jjn jjnVar, zfl zflVar, bbb bbbVar, zbs zbsVar, zie zieVar, bwob bwobVar, vyo vyoVar, dxio<? extends uio> dxioVar, @dzsi izl izlVar, xkl xklVar) {
        zke a = zkd.a();
        this.I = a;
        this.J = new zir(this);
        this.g = new vmw();
        this.b = activity;
        this.h = vnpVar.a(zbx.a);
        this.j = cjqyVar;
        this.k = bvjjVar;
        cjqy a2 = zkaVar.a.a();
        zka.a(a2, 1);
        cjqq a3 = zkaVar.b.a();
        zka.a(a3, 2);
        gga a4 = zkaVar.c.a();
        zka.a(a4, 3);
        zmz a5 = zkaVar.d.a();
        zka.a(a5, 4);
        zka.a(zkaVar.e.a(), 5);
        zka.a(zkaVar.f.a(), 6);
        zqm a6 = zkaVar.g.a();
        zka.a(a6, 7);
        avij a7 = zkaVar.h.a();
        zka.a(a7, 8);
        yys a8 = zkaVar.i.a();
        zka.a(a8, 9);
        bvjj a9 = zkaVar.j.a();
        zka.a(a9, 10);
        dxio a10 = ((dxjh) zkaVar.k).a();
        zka.a(a10, 11);
        btvo a11 = zkaVar.l.a();
        zka.a(a11, 12);
        xfc a12 = zkaVar.m.a();
        zka.a(a12, 13);
        xfd a13 = zkaVar.n.a();
        zka.a(a13, 14);
        Executor a14 = zkaVar.o.a();
        zka.a(a14, 15);
        cqhn a15 = zkaVar.p.a();
        zka.a(a15, 16);
        qbv a16 = zkaVar.q.a();
        zka.a(a16, 17);
        xhk a17 = zkaVar.r.a();
        zka.a(a17, 18);
        dxio a18 = ((dxjh) zkaVar.s).a();
        zka.a(a18, 19);
        zaz a19 = zkaVar.t.a();
        zka.a(a19, 20);
        zpj a20 = zkaVar.u.a();
        zka.a(a20, 21);
        ckcw a21 = zkaVar.v.a();
        zka.a(a21, 22);
        zka.a(xklVar, 23);
        zka.a(a, 24);
        this.u = new zju(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, xklVar, a);
        this.t = zqiVar;
        this.v = znyVar;
        this.w = zlbVar;
        this.x = zkyVar;
        this.y = cqatVar;
        this.z = zuzVar;
        this.l = vmzVar.a().get(0);
        this.m = vmzVar.a();
        this.K = 1;
        this.n = null;
        this.d = dcdc.e();
        this.q = zflVar;
        this.p = u(jjnVar);
        this.c = bbbVar;
        this.i = vmhVar;
        this.r = zbsVar;
        this.s = zieVar;
        this.o = bwobVar;
        this.A = vyoVar;
        this.B = dxioVar;
        this.C = izlVar;
        this.D = xklVar;
    }

    private final void A(dcdc<zqj> dcdcVar) {
        ziu ziuVar;
        this.F = dcdcVar;
        dccx F = dcdc.F();
        for (int i = 0; i < this.F.size(); i++) {
            if (i < this.G.size()) {
                ziuVar = this.G.get(i);
                ziuVar.a = this.F.get(i);
            } else {
                ziuVar = new ziu(this.I, this.F.get(i));
            }
            F.g(ziuVar);
        }
        this.G = F.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0360  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.zqj B(@defpackage.dzsi defpackage.amsy r36, @defpackage.dzsi defpackage.amub r37, @defpackage.dzsi java.lang.String r38, long r39, boolean r41, @defpackage.dzsi defpackage.izl r42, defpackage.vwh r43) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ziv.B(amsy, amub, java.lang.String, long, boolean, izl, vwh):zqj");
    }

    @dzsi
    private static amub C(vwn vwnVar, Context context) {
        amte p;
        if (vwnVar.t() && (p = vwnVar.p()) != null) {
            return p.b(vwnVar.e(), context);
        }
        return null;
    }

    @dzsi
    private final znw D() {
        if (!this.d.isEmpty()) {
            return this.d.get(this.e).b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zfn u(jjn jjnVar) {
        jjn jjnVar2 = jjn.HIDDEN;
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = jjnVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return zfn.INFO_SHEET_HEADER_COLLAPSED;
        }
        if (ordinal == 2) {
            return zfn.INFO_SHEET_HEADER_EXPANDED;
        }
        if (ordinal == 3) {
            return zfn.INFO_SHEET_HEADER_FULLY_EXPANDED;
        }
        return zfn.INFO_SHEET_HEADER_EXPANDED;
    }

    @dzsi
    private static amsy w(vwn vwnVar) {
        amte p;
        if (vwnVar.t() && (p = vwnVar.p()) != null) {
            amsy amsyVar = p.a;
            amsyVar.t();
            return amsyVar;
        }
        return null;
    }

    private static long x(vnk vnkVar, cqat cqatVar) {
        Long l;
        vun ae = vnkVar.ae();
        return (ae == null || (l = ae.r) == null) ? cqatVar.b() : l.longValue();
    }

    private static void y(vwn vwnVar, zce zceVar, boolean z, String str, vnj vnjVar) {
        if ((vwnVar.a() && !vwnVar.t()) || vnjVar == vnj.SEARCHING) {
            zceVar.r(str);
            zceVar.d(90000L);
        } else if (z) {
            zceVar.i();
        } else {
            zceVar.h();
        }
    }

    private static vwh z(vwi vwiVar, int i) {
        for (vwh vwhVar : vwiVar.a) {
            if (vwhVar.b == i) {
                return vwhVar;
            }
        }
        return vwh.n;
    }

    @Override // defpackage.jkh
    public void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        View j;
        if (b().booleanValue()) {
            this.i.a(jjnVar, jjnVar2, jkgVar, o());
            dcdc<zqj> dcdcVar = this.F;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                dcdcVar.get(i).n(u(jjnVar2), true);
            }
            if (jjnVar2 != jjn.FULLY_EXPANDED && (j = jkjVar.j()) != null) {
                vjc.f(j);
            }
        }
        this.p = u(jjnVar2);
    }

    @Override // defpackage.jkh
    public void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void O() {
    }

    @Override // defpackage.jkh
    public void P(jkj jkjVar, jjn jjnVar, float f) {
        this.h.a(jkjVar, jjnVar, f);
    }

    @Override // defpackage.zbx
    public Boolean a() {
        boolean z = false;
        if (!this.d.isEmpty() && !b().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbx
    public Boolean b() {
        return Boolean.valueOf(!this.G.isEmpty());
    }

    @Override // defpackage.zbx
    public CharSequence c() {
        jjn jjnVar = jjn.HIDDEN;
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = this.l.a().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.b.getString(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_DIRECTION_BICYCLE);
            }
            if (ordinal == 2) {
                return this.b.getString(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_DIRECTION_WALK);
            }
            if (ordinal == 3) {
                return this.b.getString(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_DIRECTION_TRANSIT);
            }
            if (ordinal == 5) {
                return this.b.getString(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_DIRECTION_TWO_WHEELER);
            }
            return ordinal != 7 ? "" : this.b.getString(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_DIRECTION_TAXI);
        }
        return this.b.getString(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_DIRECTION_DRIVE);
    }

    @Override // defpackage.zbx
    public List<? extends zbu> d() {
        return this.d;
    }

    @Override // defpackage.zbx
    @dzsi
    public zbv e() {
        return D();
    }

    @Override // defpackage.zbx
    public Integer f() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.zbx
    public bbb g() {
        return this.J;
    }

    @Override // defpackage.zbx
    public List<? extends zbw> h() {
        return this.G;
    }

    @Override // defpackage.zbx
    public Integer i() {
        return Integer.valueOf(this.H);
    }

    @Override // defpackage.zbx
    public Boolean j() {
        znw D = D();
        boolean z = false;
        if ((D != null ? D.k() : null) == null && (D == null || !D.f().booleanValue())) {
            if (b().booleanValue()) {
                return false;
            }
            if (this.K != 3) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    public void k(@dzsi vmv vmvVar) {
        this.g.a = vmvVar;
    }

    public void l(bwob bwobVar) {
        this.n = bwobVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0305, code lost:
        if (r0.intValue() == r6.e()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0676, code lost:
        if (r1 == null) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0770 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:390:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1 A[LOOP:0: B:68:0x01af->B:69:0x01b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.vnk r49) {
        /*
            Method dump skipped, instructions count: 2334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ziv.m(vnk):void");
    }

    public final void n(boolean z) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            double d = i;
            boolean z2 = true;
            if (d != Math.floor(this.f) && d != Math.ceil(this.f) && i != this.e) {
                z2 = false;
            }
            zit zitVar = this.d.get(i);
            if (zitVar.c().booleanValue() != z2) {
                zitVar.l(z2);
                if (z) {
                    cqkx.p(zitVar);
                }
            }
        }
    }

    @dzsi
    public amub o() {
        if (b().booleanValue()) {
            return C(this.l.d(), this.b);
        }
        znw D = D();
        if (D == null) {
            return null;
        }
        return D.n();
    }

    public boolean p() {
        zbv e = e();
        amub o = o();
        if (e != null) {
            if (e.e().booleanValue()) {
                return true;
            }
            if (e.f().booleanValue()) {
                zcn l = e.l();
                dbsk.s(l);
                return l.d().booleanValue();
            }
        }
        return o != null && o.h == dqvj.TAXI;
    }

    public List<? extends zfm> q() {
        return this.F;
    }

    public void r() {
        dcdc<zqj> dcdcVar = this.F;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).p(this.b);
        }
        dcdc<zit> dcdcVar2 = this.d;
        int size2 = dcdcVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            znw znwVar = dcdcVar2.get(i2).b;
            zqj zqjVar = znwVar.h;
            if (zqjVar != null) {
                zqjVar.p(this.b);
            }
            zjz zjzVar = znwVar.g;
            if (zjzVar != null) {
                zjzVar.r(this.b);
            }
        }
    }

    public boolean s() {
        dcdc<zqj> dcdcVar = this.F;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dcdcVar.get(i).q()) {
                return true;
            }
            i = i2;
        }
        dcdc<zit> dcdcVar2 = this.d;
        int size2 = dcdcVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            znw znwVar = dcdcVar2.get(i3).b;
            zqj zqjVar = znwVar.h;
            if (zqjVar != null && zqjVar.q()) {
                return true;
            }
            zjz zjzVar = znwVar.g;
            if (zjzVar != null && zjzVar.q()) {
                return true;
            }
        }
        return false;
    }

    public void t(dcdc<aldt> dcdcVar) {
        zqj zqjVar;
        zfw zfwVar;
        znw D = D();
        if (D == null) {
            return;
        }
        if (D.g().booleanValue()) {
            zkz m = D.m();
            dbsk.s(m);
            zqjVar = m.d();
        } else {
            zqjVar = D.h;
        }
        if (zqjVar == null || (zfwVar = zqjVar.a) == null) {
            return;
        }
        zfwVar.c(dcdcVar);
    }

    public jkh v() {
        return this;
    }
}
