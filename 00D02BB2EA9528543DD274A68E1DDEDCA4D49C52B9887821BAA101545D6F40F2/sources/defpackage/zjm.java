package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: zjm  reason: default package */
/* loaded from: classes7.dex */
public class zjm implements Serializable, zby, fzh {
    private transient View.OnClickListener A;
    private transient zde B;
    private transient zdd C;
    private transient zde D;
    private transient zdd E;
    private transient zdb F;
    @dzsi
    private transient cqfc G;
    private boolean H;
    private boolean I;
    private boolean J;
    private String K = "";
    private String L = "";
    private boolean M;
    @dzsi
    public transient qbr a;
    public transient vnk b;
    public transient List<zmy> c;
    @dzsi
    public transient zio d;
    @dzsi
    public transient dxio<afwr> e;
    transient btvo f;
    transient bvsl g;
    transient dxio<ahwf> h;
    transient bwft i;
    transient afwp j;
    transient isd k;
    transient zpq l;
    transient yzi m;
    transient vwv n;
    transient gga o;
    transient btpc p;
    transient zad q;
    transient cpv r;
    public transient Context s;
    @dzsi
    public transient isc t;
    public boolean u;
    private transient zmw v;
    @dzsi
    private transient zpp w;
    @dzsi
    private transient zio x;
    @dzsi
    private transient Runnable y;
    private transient zie z;

    public static boolean G(vnk vnkVar) {
        return vxx.e(vnkVar.g()) && vnkVar.aw().size() >= 2 && !vnkVar.aw().get(0).a() && !vnkVar.aw().get(1).a() && !vyr.c(vnkVar.aw()) && !vnkVar.bo();
    }

    @dzsi
    private final amvh P() {
        amte p = this.b.l().d().p();
        if (p == null || p.a.n() <= 0 || this.b.aw().isEmpty()) {
            return null;
        }
        return this.b.c();
    }

    @dzsi
    private static Long Q(vnk vnkVar) {
        vun ae = vnkVar.ae();
        if (ae != null) {
            return ae.r;
        }
        return null;
    }

    @dzsi
    private static cqvf R(vnk vnkVar, int i) {
        int i2 = -1;
        int size = vnkVar.aw().size() - 1;
        int i3 = 0;
        if (vnkVar.aY()) {
            int i4 = 0;
            while (true) {
                if (i4 >= vnkVar.aw().size()) {
                    break;
                } else if (vnkVar.aw().get(i4).a()) {
                    i2 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 == size) {
                size--;
            }
        }
        if (i == i2) {
            return null;
        }
        if (i == i3) {
            return cqrt.l(R.string.DIRECTIONS_APPBAR_FROM);
        }
        if (i == size) {
            return cqrt.l(R.string.DIRECTIONS_APPBAR_TO);
        }
        return cqrt.l(R.string.DIRECTIONS_APPBAR_VIA);
    }

    private static cqvf S(vnk vnkVar, int i) {
        if (vnkVar.aY()) {
            return cqrt.l(R.string.DIRECTIONS_CHOOSE_DESTINATION);
        }
        boolean z = false;
        if (vnkVar.aO().equals(vni.TRAIN) && vnkVar.g().equals(dqvj.TRANSIT)) {
            z = true;
        }
        if (i == 0) {
            if (z) {
                return cqrt.l(R.string.DIRECTIONS_TRAIN_PROMO_CHOOSE_START_POINT);
            }
            return cqrt.l(R.string.DIRECTIONS_CHOOSE_START_POINT);
        } else if (i != vnkVar.aw().size() - 1) {
            return cqrt.l(R.string.DIRECTIONS_CHOOSE_VIA_POINT);
        } else {
            if (z) {
                return cqrt.l(R.string.DIRECTIONS_TRAIN_PROMO_CHOOSE_END_POINT);
            }
            return cqrt.l(R.string.DIRECTIONS_CHOOSE_END_POINT);
        }
    }

    private static boolean T(vnk vnkVar, amvh amvhVar) {
        int bu = vnkVar.bu();
        if (bu == 0) {
            throw null;
        }
        boolean z = bu == 3 && amvhVar.y;
        int bu2 = vnkVar.bu();
        if (bu2 == 0) {
            throw null;
        }
        return z || (bu2 == 2 && !amvhVar.a());
    }

    private final boolean U(vnk vnkVar) {
        return vnkVar.aY() ? !this.J : !i().booleanValue();
    }

    private final boolean V(vnk vnkVar) {
        int bu = vnkVar.bu();
        if (bu != 0) {
            return bu == 2 && !this.J;
        }
        throw null;
    }

    private final boolean W(dqvj dqvjVar) {
        if (this.b.bw() != 2 || vlu.UNKNOWN.equals(this.b.aA())) {
            return false;
        }
        if ((dqvjVar == dqvj.TRANSIT && this.b.c().D()) || dqvjVar == dqvj.TAXI) {
            return false;
        }
        if (this.b.bn()) {
            return true;
        }
        if (dqvjVar == dqvj.TRANSIT && this.b.bp()) {
            return false;
        }
        if (!H() && dqvjVar != dqvj.TRANSIT) {
            btpf c = btpf.c(this.s);
            if (!c.e && c.f) {
                return false;
            }
            dwao h = this.b.h();
            amsy aS = this.b.aS();
            if (!zri.n(dqvjVar, h, aS == null ? null : aS.e())) {
                return false;
            }
        }
        return true;
    }

    private final boolean X() {
        return !H() && W(dqvj.TRANSIT);
    }

    public void A(Runnable runnable) {
        this.y = runnable;
    }

    public void B(Runnable runnable) {
        zio zioVar = this.d;
        if (zioVar != null) {
            zioVar.A(runnable);
        }
    }

    public void C(boolean z) {
        this.H = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: all -> 0x020a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:11:0x0027, B:15:0x004f, B:21:0x006a, B:23:0x0074, B:27:0x007e, B:29:0x0084, B:30:0x008f, B:32:0x0093, B:33:0x00be, B:35:0x00c2, B:36:0x00e9, B:37:0x00ff, B:39:0x0105, B:41:0x010d, B:42:0x0113, B:43:0x0128, B:45:0x012a, B:49:0x0140, B:51:0x0144, B:57:0x0156, B:59:0x015e, B:61:0x0172, B:64:0x0179, B:66:0x017e, B:75:0x0200, B:65:0x017c, B:62:0x0175, B:67:0x01b2, B:69:0x01c1, B:72:0x01c8, B:74:0x01cd, B:73:0x01cb, B:70:0x01c4, B:56:0x0151, B:18:0x005c, B:14:0x0038), top: B:81:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x020a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:11:0x0027, B:15:0x004f, B:21:0x006a, B:23:0x0074, B:27:0x007e, B:29:0x0084, B:30:0x008f, B:32:0x0093, B:33:0x00be, B:35:0x00c2, B:36:0x00e9, B:37:0x00ff, B:39:0x0105, B:41:0x010d, B:42:0x0113, B:43:0x0128, B:45:0x012a, B:49:0x0140, B:51:0x0144, B:57:0x0156, B:59:0x015e, B:61:0x0172, B:64:0x0179, B:66:0x017e, B:75:0x0200, B:65:0x017c, B:62:0x0175, B:67:0x01b2, B:69:0x01c1, B:72:0x01c8, B:74:0x01cd, B:73:0x01cb, B:70:0x01c4, B:56:0x0151, B:18:0x005c, B:14:0x0038), top: B:81:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x020a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:11:0x0027, B:15:0x004f, B:21:0x006a, B:23:0x0074, B:27:0x007e, B:29:0x0084, B:30:0x008f, B:32:0x0093, B:33:0x00be, B:35:0x00c2, B:36:0x00e9, B:37:0x00ff, B:39:0x0105, B:41:0x010d, B:42:0x0113, B:43:0x0128, B:45:0x012a, B:49:0x0140, B:51:0x0144, B:57:0x0156, B:59:0x015e, B:61:0x0172, B:64:0x0179, B:66:0x017e, B:75:0x0200, B:65:0x017c, B:62:0x0175, B:67:0x01b2, B:69:0x01c1, B:72:0x01c8, B:74:0x01cd, B:73:0x01cb, B:70:0x01c4, B:56:0x0151, B:18:0x005c, B:14:0x0038), top: B:81:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x020a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:11:0x0027, B:15:0x004f, B:21:0x006a, B:23:0x0074, B:27:0x007e, B:29:0x0084, B:30:0x008f, B:32:0x0093, B:33:0x00be, B:35:0x00c2, B:36:0x00e9, B:37:0x00ff, B:39:0x0105, B:41:0x010d, B:42:0x0113, B:43:0x0128, B:45:0x012a, B:49:0x0140, B:51:0x0144, B:57:0x0156, B:59:0x015e, B:61:0x0172, B:64:0x0179, B:66:0x017e, B:75:0x0200, B:65:0x017c, B:62:0x0175, B:67:0x01b2, B:69:0x01c1, B:72:0x01c8, B:74:0x01cd, B:73:0x01cb, B:70:0x01c4, B:56:0x0151, B:18:0x005c, B:14:0x0038), top: B:81:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[Catch: all -> 0x020a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:11:0x0027, B:15:0x004f, B:21:0x006a, B:23:0x0074, B:27:0x007e, B:29:0x0084, B:30:0x008f, B:32:0x0093, B:33:0x00be, B:35:0x00c2, B:36:0x00e9, B:37:0x00ff, B:39:0x0105, B:41:0x010d, B:42:0x0113, B:43:0x0128, B:45:0x012a, B:49:0x0140, B:51:0x0144, B:57:0x0156, B:59:0x015e, B:61:0x0172, B:64:0x0179, B:66:0x017e, B:75:0x0200, B:65:0x017c, B:62:0x0175, B:67:0x01b2, B:69:0x01c1, B:72:0x01c8, B:74:0x01cd, B:73:0x01cb, B:70:0x01c4, B:56:0x0151, B:18:0x005c, B:14:0x0038), top: B:81:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d A[Catch: all -> 0x020a, LOOP:1: B:39:0x0105->B:41:0x010d, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:11:0x0027, B:15:0x004f, B:21:0x006a, B:23:0x0074, B:27:0x007e, B:29:0x0084, B:30:0x008f, B:32:0x0093, B:33:0x00be, B:35:0x00c2, B:36:0x00e9, B:37:0x00ff, B:39:0x0105, B:41:0x010d, B:42:0x0113, B:43:0x0128, B:45:0x012a, B:49:0x0140, B:51:0x0144, B:57:0x0156, B:59:0x015e, B:61:0x0172, B:64:0x0179, B:66:0x017e, B:75:0x0200, B:65:0x017c, B:62:0x0175, B:67:0x01b2, B:69:0x01c1, B:72:0x01c8, B:74:0x01cd, B:73:0x01cb, B:70:0x01c4, B:56:0x0151, B:18:0x005c, B:14:0x0038), top: B:81:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a A[Catch: all -> 0x020a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:11:0x0027, B:15:0x004f, B:21:0x006a, B:23:0x0074, B:27:0x007e, B:29:0x0084, B:30:0x008f, B:32:0x0093, B:33:0x00be, B:35:0x00c2, B:36:0x00e9, B:37:0x00ff, B:39:0x0105, B:41:0x010d, B:42:0x0113, B:43:0x0128, B:45:0x012a, B:49:0x0140, B:51:0x0144, B:57:0x0156, B:59:0x015e, B:61:0x0172, B:64:0x0179, B:66:0x017e, B:75:0x0200, B:65:0x017c, B:62:0x0175, B:67:0x01b2, B:69:0x01c1, B:72:0x01c8, B:74:0x01cd, B:73:0x01cb, B:70:0x01c4, B:56:0x0151, B:18:0x005c, B:14:0x0038), top: B:81:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e A[Catch: all -> 0x020a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:11:0x0027, B:15:0x004f, B:21:0x006a, B:23:0x0074, B:27:0x007e, B:29:0x0084, B:30:0x008f, B:32:0x0093, B:33:0x00be, B:35:0x00c2, B:36:0x00e9, B:37:0x00ff, B:39:0x0105, B:41:0x010d, B:42:0x0113, B:43:0x0128, B:45:0x012a, B:49:0x0140, B:51:0x0144, B:57:0x0156, B:59:0x015e, B:61:0x0172, B:64:0x0179, B:66:0x017e, B:75:0x0200, B:65:0x017c, B:62:0x0175, B:67:0x01b2, B:69:0x01c1, B:72:0x01c8, B:74:0x01cd, B:73:0x01cb, B:70:0x01c4, B:56:0x0151, B:18:0x005c, B:14:0x0038), top: B:81:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2 A[Catch: all -> 0x020a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:11:0x0027, B:15:0x004f, B:21:0x006a, B:23:0x0074, B:27:0x007e, B:29:0x0084, B:30:0x008f, B:32:0x0093, B:33:0x00be, B:35:0x00c2, B:36:0x00e9, B:37:0x00ff, B:39:0x0105, B:41:0x010d, B:42:0x0113, B:43:0x0128, B:45:0x012a, B:49:0x0140, B:51:0x0144, B:57:0x0156, B:59:0x015e, B:61:0x0172, B:64:0x0179, B:66:0x017e, B:75:0x0200, B:65:0x017c, B:62:0x0175, B:67:0x01b2, B:69:0x01c1, B:72:0x01c8, B:74:0x01cd, B:73:0x01cb, B:70:0x01c4, B:56:0x0151, B:18:0x005c, B:14:0x0038), top: B:81:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D() {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjm.D():void");
    }

    public void E() {
        cqkx.p(this);
        zio zioVar = this.x;
        if (zioVar != null) {
            cqkx.p(zioVar);
        }
    }

    final douz F(vnk vnkVar) {
        if (this.n.a()) {
            return vnkVar.br();
        }
        amte p = vnkVar.l().d().p();
        if (p != null) {
            return p.a.g();
        }
        return douz.g;
    }

    public final boolean H() {
        btpf c = btpf.c(this.s);
        return c.e && c.f;
    }

    public final boolean I() {
        return G(this.b) && this.f.getDirectionsPageParameters().v;
    }

    public void J() {
        y(null);
        z(null);
        this.q.b();
    }

    public void K(cqfc cqfcVar) {
        this.G = cqfcVar;
    }

    @Override // defpackage.zby
    /* renamed from: L */
    public zio n() {
        zio zioVar = this.d;
        dbsk.t(zioVar, "optionsBarViewModel accessed before the view model was properly initialized");
        return zioVar;
    }

    @dzsi
    public zio M() {
        return this.x;
    }

    public bbb N() {
        zpp zppVar = this.w;
        dbsk.s(zppVar);
        return zppVar.E();
    }

    public void O() {
        zio zioVar = this.d;
        dbsk.s(zioVar);
        zioVar.H();
        zio zioVar2 = this.x;
        dbsk.s(zioVar2);
        zioVar2.H();
        isc iscVar = this.t;
        if (iscVar != null) {
            iscVar.dismiss();
            this.t = null;
        }
    }

    @Override // defpackage.zby
    public Boolean a() {
        return Boolean.valueOf(this.H);
    }

    @Override // defpackage.fzh
    public void b(int i) {
        for (zmy zmyVar : this.c) {
            zmyVar.A(true);
        }
        cqkx.p(this);
    }

    @Override // defpackage.fzh
    public boolean c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return false;
        }
        this.c.add(i2, this.c.remove(i));
        cqkx.p(this);
        return true;
    }

    @Override // defpackage.fzh
    public void d(View view, int i, int i2, @dzsi cjqm cjqmVar) {
        String string;
        for (zmy zmyVar : this.c) {
            zmyVar.A(false);
        }
        if (i < 0 || i2 < 0 || i == i2) {
            cqkx.p(this);
            return;
        }
        if (i > i2) {
            string = this.s.getString(R.string.ACCESSIBILITY_WAYPOINT_MOVED_BEFORE, this.c.get(i2).y(), this.c.get(i2 + 1).y());
        } else {
            string = this.s.getString(R.string.ACCESSIBILITY_WAYPOINT_MOVED_AFTER, this.c.get(i2).y(), this.c.get(i2 - 1).y());
        }
        this.r.f(view, string);
        qbr qbrVar = this.a;
        if (qbrVar == null) {
            return;
        }
        dnqh b = cjqmVar == null ? null : yys.b(cjqmVar);
        psf psfVar = (psf) qbrVar;
        psfVar.d.z(i, i2);
        psfVar.b.bO(12, b);
    }

    @Override // defpackage.zby
    public Boolean e() {
        return true;
    }

    @Override // defpackage.zby
    public Boolean f() {
        boolean z = true;
        if (!a().booleanValue() && o().size() <= 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zby
    public cqkl g() {
        Runnable runnable = this.y;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.zby
    public Boolean i() {
        return Boolean.valueOf(this.M);
    }

    @Override // defpackage.zby
    public Boolean j() {
        return Boolean.valueOf(!this.M);
    }

    @Override // defpackage.zby
    public View.OnClickListener k() {
        return this.A;
    }

    @Override // defpackage.zby
    @dzsi
    public cqfc l() {
        return this.G;
    }

    @Override // defpackage.zby
    @dzsi
    public zfa m() {
        return this.w;
    }

    @Override // defpackage.zby
    public dcdc<zdg> o() {
        return dcdc.r(this.c);
    }

    @Override // defpackage.zby
    public zdf p(zdg zdgVar, @dzsi zdg zdgVar2) {
        return new zmx(zdgVar, zdgVar2, this.v);
    }

    @Override // defpackage.zby
    public zdc q() {
        return this.v;
    }

    @Override // defpackage.zby
    public Boolean r() {
        return Boolean.valueOf(this.I);
    }

    @Override // defpackage.zby
    public Boolean s() {
        return Boolean.valueOf(this.J);
    }

    @Override // defpackage.zby
    public String t() {
        return this.K;
    }

    @Override // defpackage.zby
    public String u() {
        return this.L;
    }

    @Override // defpackage.zby
    @dzsi
    public zbq v() {
        return this.z.e;
    }

    @Override // defpackage.zby
    public fzh w() {
        return this;
    }

    public void x(dxip<zjm> dxipVar, dxip<zio> dxipVar2, Context context, vnk vnkVar, zie zieVar, prc prcVar) {
        vnk vnkVar2;
        int i;
        zdd zddVar;
        dxipVar.b(this);
        this.s = context;
        this.b = vnkVar;
        this.B = new zjl(this);
        this.C = new zjj(this);
        this.F = new zjk(this);
        this.D = new zjh(this);
        this.E = new zji(this);
        zpq zpqVar = this.l;
        dcdc<vnu> r = vnkVar.r();
        dqvj g = vnkVar.g();
        vtn a = zpqVar.a.a();
        zpq.a(a, 1);
        bvrb a2 = zpqVar.b.a();
        zpq.a(a2, 2);
        cjqy a3 = zpqVar.c.a();
        zpq.a(a3, 3);
        yys a4 = zpqVar.d.a();
        zpq.a(a4, 4);
        btvo a5 = zpqVar.e.a();
        zpq.a(a5, 5);
        vwv a6 = zpqVar.f.a();
        zpq.a(a6, 6);
        qbv a7 = zpqVar.g.a();
        zpq.a(a7, 7);
        zpq.a(context, 8);
        zpq.a(r, 9);
        zpq.a(g, 10);
        this.w = new zpp(a, a2, a3, a4, a5, a6, a7, context, r, g);
        ArrayList arrayList = new ArrayList();
        boolean e = vyr.e(this.b.aw());
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.b.aw().size()) {
            amvh amvhVar = this.b.aw().get(i2);
            int i4 = i2 - i3;
            boolean z = i2 == this.b.aw().size() + (-1);
            if (amvhVar.y || (amvhVar.a() && !z)) {
                i3++;
                i = -1;
            } else {
                i = i4;
            }
            Context applicationContext = this.s.getApplicationContext();
            boolean z2 = amvhVar.y;
            zde zdeVar = z2 ? this.D : this.B;
            if (z2) {
                zddVar = this.E;
            } else {
                zddVar = this.C;
            }
            arrayList.add(new zmy(applicationContext, zdeVar, zddVar, S(this.b, i2), R(this.b, i2), amvhVar, i2, i, z, e, T(this.b, amvhVar), U(this.b), V(this.b), a().booleanValue()));
            i2++;
        }
        this.c = arrayList;
        zio zioVar = this.d;
        if (zioVar == null) {
            vnkVar2 = vnkVar;
            this.d = zio.v(dxipVar2, W(vnkVar.g()), vnkVar.g(), vnkVar.h(), F(vnkVar), vnkVar.j(), Q(vnkVar), P(), vnkVar.bn(), vnkVar.bp());
        } else {
            vnkVar2 = vnkVar;
            zioVar.y(dxipVar2);
        }
        zio zioVar2 = this.x;
        if (zioVar2 == null) {
            this.x = zio.v(dxipVar2, X(), dqvj.TRANSIT, vnkVar.h(), F(vnkVar2), vnkVar.j(), Q(vnkVar), P(), vnkVar.bn(), vnkVar.bp());
        } else {
            zioVar2.y(dxipVar2);
        }
        y(this.a);
        this.A = new View.OnClickListener(this) { // from class: ziz
            private final zjm a;

            {
                this.a = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:76:0x02eb, code lost:
                if (r0.b.g() != defpackage.dqvj.TAXI) goto L72;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r20) {
                /*
                    Method dump skipped, instructions count: 815
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ziz.onClick(android.view.View):void");
            }
        };
        this.v = new zmw(this.F, a().booleanValue(), f().booleanValue());
        this.z = zieVar;
    }

    public void y(@dzsi qbr qbrVar) {
        this.a = qbrVar;
        zpp zppVar = this.w;
        if (zppVar != null) {
            zppVar.c(qbrVar);
        }
        zio zioVar = this.d;
        if (zioVar != null) {
            zioVar.z(qbrVar);
        }
        zio zioVar2 = this.x;
        if (zioVar2 != null) {
            zioVar2.z(null);
        }
    }

    public void z(@dzsi dxio<afwr> dxioVar) {
        this.e = dxioVar;
    }

    @Override // defpackage.zby
    public cqkl h() {
        if (this.u) {
            qbr qbrVar = this.a;
            if (qbrVar != null) {
                psf psfVar = (psf) qbrVar;
                synchronized (psfVar.d) {
                    ((psf) qbrVar).d.bt(3);
                }
                psfVar.b.bO(14, null);
            }
        } else {
            qbr qbrVar2 = this.a;
            if (qbrVar2 != null) {
                qbrVar2.e();
            }
        }
        return cqkl.a;
    }
}
