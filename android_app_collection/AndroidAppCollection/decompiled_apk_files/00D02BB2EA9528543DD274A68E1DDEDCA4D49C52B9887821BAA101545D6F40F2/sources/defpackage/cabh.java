package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: cabh  reason: default package */
/* loaded from: classes4.dex */
public class cabh implements cafe, bzyv, caex {
    private final bvjj a;
    private final cafi b;
    private final dxio<akfa> c;
    private final dzsj<cagk> d;
    private final dzsj<caez> e;
    private final gga f;
    private final dkcp g;
    private final cafb h;
    private final cqqw i;
    private final boolean j;
    private final cabc k;
    @dzsi
    private final cjtd l;
    @dzsi
    private final cafd p;
    @dzsi
    private final cavf<?> q;
    @dzsi
    private bzyw r;
    @dzsi
    private bzyw s;
    @dzsi
    private cbro t;
    private boolean o = false;
    private cjyo n = new cjyp();
    private cqtv m = cqrp.d(dcyn.a);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cabh(defpackage.bvjj r12, defpackage.cafi r13, defpackage.dxio<defpackage.akfa> r14, defpackage.dzsj<defpackage.cagk> r15, defpackage.cavc r16, defpackage.cave r17, defpackage.dzsj<defpackage.caez> r18, defpackage.dxio<defpackage.caym> r19, defpackage.btvo r20, defpackage.cbqg r21, defpackage.gga r22, defpackage.cbea r23, defpackage.dkcp r24, defpackage.cafb r25, defpackage.cqqw r26, @defpackage.dzsi defpackage.cavf<?> r27, boolean r28, defpackage.cabc r29) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cabh.<init>(bvjj, cafi, dxio, dzsj, cavc, cave, dzsj, dxio, btvo, cbqg, gga, cbea, dkcp, cafb, cqqw, cavf, boolean, cabc):void");
    }

    private final boolean v() {
        return this.g == dkcp.EDIT;
    }

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        cagi<? extends dssj, ? extends dssj> cagiVar;
        duld duldVar;
        if (cqiwVar instanceof oag) {
            cafb cafbVar = this.h;
            dkcp dkcpVar = this.g;
            caau caauVar = (caau) cafbVar;
            if (!caauVar.a.b.containsKey(dkcpVar) || (duldVar = (cagiVar = caauVar.a.b.get(dkcpVar)).c) == null) {
                return;
            }
            cagiVar.d(duldVar);
        }
    }

    @Override // defpackage.bzyv
    public void a() {
        if (v()) {
            this.a.T(bvjk.gO, this.c.a().j(), true);
            cqkx.p(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r0.a.b.get(r1).c != null) goto L5;
     */
    @Override // defpackage.cafe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean b() {
        /*
            r5 = this;
            cafb r0 = r5.h
            dkcp r1 = r5.g
            caau r0 = (defpackage.caau) r0
            caaw r2 = r0.a
            java.util.Map<dkcp, cagi<? extends dssj, ? extends dssj>> r2 = r2.b
            boolean r2 = r2.containsKey(r1)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L21
            caaw r0 = r0.a
            java.util.Map<dkcp, cagi<? extends dssj, ? extends dssj>> r0 = r0.b
            java.lang.Object r0 = r0.get(r1)
            cagi r0 = (defpackage.cagi) r0
            Q extends dssj r0 = r0.d
            if (r0 == 0) goto L21
            goto L47
        L21:
            dkcp r0 = r5.g
            dkcp r1 = defpackage.dkcp.CONTRIBUTE
            if (r0 == r1) goto L46
            cafb r0 = r5.h
            dkcp r1 = r5.g
            caau r0 = (defpackage.caau) r0
            caaw r2 = r0.a
            java.util.Map<dkcp, cagi<? extends dssj, ? extends dssj>> r2 = r2.b
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L46
            caaw r0 = r0.a
            java.util.Map<dkcp, cagi<? extends dssj, ? extends dssj>> r0 = r0.b
            java.lang.Object r0 = r0.get(r1)
            cagi r0 = (defpackage.cagi) r0
            duld r0 = r0.c
            if (r0 == 0) goto L46
            goto L47
        L46:
            r3 = 0
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cabh.b():java.lang.Boolean");
    }

    @Override // defpackage.cafe
    public cjyo c() {
        return this.n;
    }

    public void d(cjyo cjyoVar) {
        this.n = cjyoVar;
    }

    @Override // defpackage.cafe
    public dkcp e() {
        return this.g;
    }

    public Boolean g() {
        List<cjyw> a = this.n.a();
        boolean z = true;
        if (a.size() != 1 || a.get(0).c() != dtic.VERTICAL_LIST) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafe
    public cqqw h() {
        return this.i;
    }

    public void i(cqtv cqtvVar) {
        this.m = cqtvVar;
        cqkx.p(this);
    }

    @Override // defpackage.cafe
    public cqtv j() {
        return this.m;
    }

    @Override // defpackage.cafe
    public Boolean k() {
        boolean z = false;
        if (v() && !this.a.o(bvjk.gO, this.c.a().j(), false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void l() {
        this.o = true;
    }

    @Override // defpackage.cafe
    public Boolean m() {
        if (this.p == null || this.q == null) {
            return false;
        }
        if (this.n.b().booleanValue()) {
            return Boolean.valueOf(this.o);
        }
        if (this.o) {
            this.o = false;
            String c = this.p.c();
            if (!c.isEmpty()) {
                this.q.b(c);
            }
        }
        return Boolean.valueOf(!g().booleanValue());
    }

    @Override // defpackage.cafe
    @dzsi
    public cafd n() {
        return this.p;
    }

    @Override // defpackage.cafe
    @dzsi
    public bzyw o() {
        if (v()) {
            if (this.r == null) {
                cagk a = this.d.a();
                boolean z = this.j;
                amfi a2 = a.a.a();
                cagk.a(a2, 1);
                Activity activity = (Activity) ((dxjd) a.b).a;
                cagk.a(activity, 2);
                cklf a3 = a.c.a();
                cagk.a(a3, 3);
                cagk.a(this, 5);
                this.r = new cagj(a2, activity, a3, z, this);
            }
            return this.r;
        }
        return null;
    }

    @Override // defpackage.cafe
    public Boolean p() {
        boolean z = false;
        if (this.b.q() && this.k.equals(cabc.AS_PUBLIC)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafe
    @dzsi
    public bzyw q() {
        if (p().booleanValue()) {
            if (this.s == null) {
                this.s = this.e.a().a(this);
            }
            return this.s;
        }
        return null;
    }

    @Override // defpackage.caex
    public void r() {
        this.f.g().e();
    }

    @Override // defpackage.cafe
    public Boolean s() {
        return Boolean.valueOf(this.g == dkcp.EVENTS);
    }

    @Override // defpackage.cafe
    @dzsi
    public cjtd t() {
        return this.l;
    }

    @Override // defpackage.cafe
    @dzsi
    public cbro u() {
        return this.t;
    }
}
