package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acxv  reason: default package */
/* loaded from: classes.dex */
final class acxv implements aefe {
    final /* synthetic */ acyf c;
    private final Map<aegc, Boolean> d = new HashMap();
    ddmo a = ddmo.UNKNOWN_EXPANSION;
    boolean b = true;

    public acxv(acyf acyfVar) {
        this.c = acyfVar;
    }

    @Override // defpackage.aefe
    public final void a(aegc aegcVar, boolean z) {
        Integer num;
        ddmo d = aefy.d(aegcVar, this.c.aM());
        ddmo ddmoVar = this.a;
        this.a = d;
        aebb a = this.c.c.a();
        boolean z2 = false;
        if (aegcVar.c() > this.c.aS() && a != null && z && a.a() == dktk.EXPLORE) {
            acyf acyfVar = this.c;
            if (!acyfVar.bm) {
                awwb awwbVar = acyfVar.bg;
                this.c.aw.a().c(aeav.EXPLORE_TAB_BELOW_FOLD, awwbVar != null && awwh.b(awwbVar, a.h()));
                if (!a.j()) {
                    this.c.bq = true;
                } else {
                    this.c.q();
                }
                this.c.bm = true;
            }
        }
        if (z && ddmoVar != d) {
            ddmp bZ = ddmq.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmq ddmqVar = (ddmq) bZ.b;
            ddmqVar.c = ddmoVar.f;
            int i = ddmqVar.a | 2;
            ddmqVar.a = i;
            ddmqVar.b = d.f;
            ddmqVar.a = i | 1;
            ddmq bK = bZ.bK();
            aeet aeetVar = this.c.c;
            cjql cjqlVar = aeetVar.f;
            if (cjqlVar != null) {
                cjta b = cjtd.b();
                b.d = aeetVar.e.c();
                b.l(bK);
                aeetVar.c.n(cjqlVar, new cjte(deaf.SWIPE), b.a());
            }
            if (d == ddmo.FULL_EXPANSION) {
                this.c.aV(2);
            }
            if (d == ddmo.PARTIAL_EXPANSION && ddmoVar != ddmo.FULL_EXPANSION) {
                this.c.aV(1);
            }
        }
        if (z && aegcVar.c() <= this.c.aM() && this.b) {
            this.c.aU(1);
            this.b = false;
        }
        if (aegcVar.c() >= this.c.aS()) {
            this.b = true;
        }
        if (a != null && (!this.c.aJ() || z)) {
            boolean z3 = aegcVar.d() > ((!this.c.aT.a().v() || a.a() != dktk.EXPLORE || (num = this.c.bn) == null) ? this.c.aS() : num.intValue());
            if (a.j() != z3) {
                a.l(z3, z3 ? ckfe.USER_SCROLLED : null);
                if (z3) {
                    this.c.ai.a().j(awwm.GOLDFINGER_USER_SCROLL);
                }
            }
        }
        if (!this.d.containsKey(aegcVar)) {
            this.d.put(aegcVar, Boolean.valueOf(this.c.bp));
        }
        if (aegcVar.d() <= this.c.aM()) {
            z2 = true;
        }
        if (this.d.get(aegcVar).booleanValue() && !z2 && !this.c.g()) {
            this.c.d();
        }
        this.d.put(aegcVar, Boolean.valueOf(z2));
        ff J = this.c.J();
        if (J != null) {
            this.c.aN(btpf.c(J));
        }
        this.c.b.a().h(!aefy.a(aegcVar));
        this.c.an.a().d();
    }
}
