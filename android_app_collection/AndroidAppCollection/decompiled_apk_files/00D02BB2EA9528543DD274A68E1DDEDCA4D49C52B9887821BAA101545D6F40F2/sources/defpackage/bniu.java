package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bniu  reason: default package */
/* loaded from: classes3.dex */
public class bniu implements bnic {
    private static final dcdn<dqvj, Integer> a;
    private final cklq b;
    private final Resources c;
    private final btrm d;
    private final dzsj<qbt> e;
    @dzsi
    private final bnit f;
    private final boolean g;
    private final boolean h;
    @dzsi
    private String i;
    @dzsi
    private cqtd k;
    private bnib l;
    private cjtd m;
    private String n;
    private cqtd o;
    private boolean j = false;
    @dzsi
    private dqvj p = null;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dqvj.DRIVE, Integer.valueOf((int) R.string.ACCESSIBILITY_SWITCH_TO_DRIVING_WITH_TRAVEL_TIME));
        dcdgVar.f(dqvj.TRANSIT, Integer.valueOf((int) R.string.ACCESSIBILITY_SWITCH_TO_TRANSIT_WITH_TRAVEL_TIME));
        dcdgVar.f(dqvj.WALK, Integer.valueOf((int) R.string.ACCESSIBILITY_SWITCH_TO_WALKING_WITH_TRAVEL_TIME));
        dcdgVar.f(dqvj.BICYCLE, Integer.valueOf((int) R.string.ACCESSIBILITY_SWITCH_TO_BICYCLING_WITH_TRAVEL_TIME));
        dcdgVar.f(dqvj.TAXI, Integer.valueOf((int) R.string.ACCESSIBILITY_SWITCH_TO_TAXI_WITH_TRAVEL_TIME));
        dcdgVar.f(dqvj.TWO_WHEELER, Integer.valueOf((int) R.string.ACCESSIBILITY_SWITCH_TO_TWO_WHEELER_WITH_TRAVEL_TIME));
        a = dcdgVar.b();
    }

    public bniu(Activity activity, btrm btrmVar, dzsj<qbt> dzsjVar, cjqy cjqyVar, cklq cklqVar, @dzsi bnit bnitVar, @dzsi cjtd cjtdVar, boolean z, boolean z2) {
        this.n = "";
        this.b = cklqVar;
        Resources resources = activity.getResources();
        this.c = resources;
        this.d = btrmVar;
        this.e = dzsjVar;
        this.f = bnitVar;
        this.m = cjtdVar;
        this.g = z;
        this.h = z2;
        this.n = resources.getString(R.string.NAVIGATION);
        this.o = cqrt.i(vyt.i, ibm.x());
    }

    @Override // defpackage.bnhz
    public String a() {
        return this.i;
    }

    @Override // defpackage.bnhz
    public Boolean b() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.bnhz
    @dzsi
    public cqtd c() {
        if (this.j) {
            return this.k;
        }
        return null;
    }

    @Override // defpackage.bnhz
    public cqkl d(cjqm cjqmVar) {
        ilg ilgVar;
        qbn qbnVar;
        this.b.a(ckls.PLACESHEET_DIRECTIONS_BUTTON_CLICKED);
        this.e.a().e().k().b();
        this.d.b(bnis.a);
        bnib bnibVar = this.l;
        if (bnibVar != null) {
            aqyf aqyfVar = (aqyf) bnibVar;
            if (aqyfVar.k && (ilgVar = aqyfVar.f) != null) {
                Intent b = ilgVar.b();
                if (b != null) {
                    aqyfVar.e.a().f(aqyfVar.a, b, 4);
                } else {
                    amvh amvhVar = null;
                    if (aqyfVar.h()) {
                        qbnVar = aqyfVar.h;
                        qbnVar.b(yys.a(cjqmVar));
                    } else {
                        qbnVar = null;
                    }
                    qbi qbiVar = aqyfVar.l;
                    if (qbiVar == null) {
                        if (aqyfVar.m()) {
                            if (aqyfVar.g != null) {
                                aqyfVar.d.a().F(aqyfVar.g, qbnVar);
                            }
                        } else if (qbnVar == null || qbnVar.a().q() == dpaz.SUMMARY) {
                            qbt a2 = aqyfVar.c.a();
                            qcw x = qcx.x();
                            x.s(aqyfVar.i);
                            x.w(aqyfVar.b);
                            x.k(qbs.DEFAULT);
                            x.v(yys.a(cjqmVar));
                            if (!aqyfVar.f.e()) {
                                amvhVar = aqyfVar.g;
                            }
                            x.u(amvhVar);
                            a2.m(x.a());
                        } else {
                            qcr u = qct.u(qbnVar, qbs.DEFAULT);
                            u.c(aqyfVar.j);
                            aqyfVar.c.a().m(u.a());
                        }
                    } else {
                        qbiVar.bW(aqyfVar.g);
                    }
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bnhz
    public Boolean e() {
        bnib bnibVar = this.l;
        boolean z = false;
        if (bnibVar != null) {
            aqyf aqyfVar = (aqyf) bnibVar;
            if (aqyfVar.k && aqyfVar.f != null && !aqyfVar.n()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnhz
    public cqkl f(cjqm cjqmVar) {
        this.d.b(bnis.a);
        this.b.a(ckls.PLACESHEET_START_NAVIGATION_CLICKED);
        bnib bnibVar = this.l;
        if (bnibVar != null) {
            ((aqyf) bnibVar).g(cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.bnhz
    public String g() {
        dcdn<dqvj, Integer> dcdnVar = a;
        return !dcdnVar.containsKey(this.p) ? "" : this.c.getString(dcdnVar.get(this.p).intValue(), a());
    }

    @Override // defpackage.bnic
    public void h(bnib bnibVar) {
        this.l = bnibVar;
    }

    @Override // defpackage.bnic
    public void i(ilg ilgVar, @dzsi dqvj dqvjVar, @dzsi dgas dgasVar, @dzsi cjtd cjtdVar, boolean z) {
        this.p = dqvjVar;
        this.j = false;
        this.n = this.c.getString(R.string.NAVIGATION);
        this.o = cqrt.i(vyt.i, ibm.x());
        if (!this.g) {
            if (ilgVar != null && ilgVar.b() != null) {
                String string = this.c.getString(R.string.DIRECTIONS_INTENT_BUTTON_TEXT);
                this.i = string;
                this.n = string;
            } else if (dgasVar != null) {
                this.i = bvtb.c(this.c, dgasVar, bvsz.ABBREVIATED).toString();
                this.j = true;
            } else {
                this.i = z ? null : this.c.getString(R.string.DIRECTIONS_TRIGGER_BUTTON_TEXT);
            }
            if (ilgVar != null && ilgVar.c() != null && ilgVar.c().intValue() != 0) {
                cqtd f = cqrt.f(ilgVar.c().intValue());
                this.k = f;
                this.o = f;
            } else if (dgasVar != null || z) {
                this.k = vyv.c(dqvjVar);
            } else {
                this.k = vyv.c(dqvj.MIXED);
            }
        } else if (dgasVar != null) {
            this.i = bvtb.c(this.c, dgasVar, bvsz.ABBREVIATED).toString();
            this.k = vyv.c(dqvjVar);
            this.j = true;
        }
        bnit bnitVar = this.f;
        if (bnitVar != null) {
            bnitVar.PP(this);
        }
        cqkx.p(this);
    }

    public cqkl j(cjqm cjqmVar) {
        this.d.b(bnis.a);
        bnib bnibVar = this.l;
        if (bnibVar != null) {
            ((aqyf) bnibVar).g(cjqmVar);
        }
        return cqkl.a;
    }

    public Boolean k() {
        return Boolean.valueOf(this.l != null);
    }

    public cqtd l() {
        if (this.h) {
            return cqrt.f(R.drawable.ic_add_parking);
        }
        if (this.g) {
            return cqrt.f(2131231581);
        }
        cqtd cqtdVar = this.k;
        return cqtdVar == null ? vyt.i : cqtdVar;
    }

    public cjtd m() {
        return this.m;
    }

    public void n(cjtd cjtdVar) {
        this.m = cjtdVar;
    }

    public boolean o() {
        return !this.h && !this.g;
    }

    public cqtd p() {
        return this.o;
    }

    public cqsn q() {
        return cqsk.a(this.n);
    }
}
