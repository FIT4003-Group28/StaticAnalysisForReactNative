package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: aafl  reason: default package */
/* loaded from: classes2.dex */
public class aafl implements aafe, aafo {
    public final aafk a;
    private final Activity b;
    private final aafq c;
    private final eapg d;
    private final eapy e;
    @dzsi
    private eapg f;
    @dzsi
    private eapg g;
    private final aafg h;
    private final aafg i;
    private aafg j;
    private dcdc<aaff> k;

    public aafl(Activity activity, cqhn cqhnVar, aafq aafqVar, aafh aafhVar, aafk aafkVar, eapg eapgVar, @dzsi eapg eapgVar2, @dzsi eapg eapgVar3) {
        this.b = activity;
        this.c = aafqVar;
        this.a = aafkVar;
        this.d = eapgVar;
        this.e = new eapy(eapgVar.r(), eapgVar.s());
        this.f = eapgVar2;
        this.g = eapgVar3;
        aafg a = aafhVar.a(activity.getString(aaai.EXPERIENCE_TIME_FRAME_DATE_PICKER_START_DATE));
        this.h = a;
        a.a = dbsg.j(eapgVar2);
        aafg a2 = aafhVar.a(activity.getString(aaai.EXPERIENCE_TIME_FRAME_DATE_PICKER_END_DATE));
        this.i = a2;
        a2.a = dbsg.j(eapgVar3);
        this.j = a;
        a.e(true);
    }

    private final void r() {
        this.h.a = dbsg.j(this.f);
        this.i.a = dbsg.j(this.g);
        aafg aafgVar = this.h;
        boolean z = true;
        aafgVar.e(Boolean.valueOf(aafgVar == this.j));
        aafg aafgVar2 = this.i;
        if (aafgVar2 != this.j) {
            z = false;
        }
        aafgVar2.e(Boolean.valueOf(z));
    }

    @Override // defpackage.aafe
    public Boolean a() {
        return Boolean.valueOf(this.f != null);
    }

    @Override // defpackage.aafe
    public jbk b() {
        return new jbk(this) { // from class: aafi
            private final aafl a;

            {
                this.a = this;
            }

            @Override // defpackage.jbk
            public jib NC() {
                return this.a.q();
            }
        };
    }

    @Override // defpackage.aafe
    public aafd d() {
        return this.h;
    }

    @Override // defpackage.aafe
    public aafd e() {
        return this.i;
    }

    @Override // defpackage.aafe
    public cqkl f(cjqm cjqmVar) {
        eapg eapgVar = this.f;
        if (eapgVar != null) {
            eapg eapgVar2 = this.g;
            if (eapgVar2 == null) {
                eapgVar2 = eapgVar;
            }
            aafk aafkVar = this.a;
            ((gen) aafkVar).aT();
            aaec aaecVar = (aaec) aafkVar;
            bsjm bsjmVar = aaecVar.c;
            if (bsjmVar != null) {
                djjw bZ = djjx.d.bZ();
                djju bZ2 = djjv.e.bZ();
                int r = eapgVar.r();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djjv djjvVar = (djjv) bZ2.b;
                djjvVar.a |= 1;
                djjvVar.b = r;
                int s = eapgVar.s();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djjv djjvVar2 = (djjv) bZ2.b;
                djjvVar2.a |= 2;
                djjvVar2.c = s;
                int t = eapgVar.t();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djjv djjvVar3 = (djjv) bZ2.b;
                djjvVar3.a |= 4;
                djjvVar3.d = t;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djjx djjxVar = (djjx) bZ.b;
                djjv bK = bZ2.bK();
                bK.getClass();
                djjxVar.b = bK;
                djjxVar.a |= 1;
                djju bZ3 = djjv.e.bZ();
                int r2 = eapgVar2.r();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djjv djjvVar4 = (djjv) bZ3.b;
                djjvVar4.a |= 1;
                djjvVar4.b = r2;
                int s2 = eapgVar2.s();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djjv djjvVar5 = (djjv) bZ3.b;
                djjvVar5.a |= 2;
                djjvVar5.c = s2;
                int t2 = eapgVar2.t();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djjv djjvVar6 = (djjv) bZ3.b;
                djjvVar6.a |= 4;
                djjvVar6.d = t2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djjx djjxVar2 = (djjx) bZ.b;
                djjv bK2 = bZ3.bK();
                bK2.getClass();
                djjxVar2.c = bK2;
                djjxVar2.a |= 2;
                djjx bK3 = bZ.bK();
                djmu bZ4 = djmv.c.bZ();
                djkl bZ5 = djkn.c.bZ();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                djkn djknVar = (djkn) bZ5.b;
                bK3.getClass();
                djknVar.b = bK3;
                djknVar.a = 4;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                djmv djmvVar = (djmv) bZ4.b;
                djkn bK4 = bZ5.bK();
                bK4.getClass();
                djmvVar.b = bK4;
                djmvVar.a = 13;
                bsjmVar.u(23, bZ4.bK().bR(), 2);
                ((ges) aafkVar).Nw(bsjn.e(aaecVar.c, dtxo.bo, cjqmVar));
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.aafe
    public cqkl g() {
        this.f = null;
        this.g = null;
        this.j = this.h;
        r();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.aafe
    public cqkl h() {
        this.j = this.h;
        r();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.aafe
    public cqkl i() {
        if (this.f != null) {
            this.j = this.i;
            r();
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.aafo
    @dzsi
    public eapg k() {
        return this.f;
    }

    @Override // defpackage.aafo
    @dzsi
    public eapg l() {
        return this.g;
    }

    @Override // defpackage.aafo
    public eapg m() {
        eapg eapgVar;
        return (this.j != this.i || (eapgVar = this.f) == null) ? this.d : eapgVar;
    }

    @Override // defpackage.aafo
    @dzsi
    public eapg n() {
        eapg eapgVar;
        if (this.j != this.i || (eapgVar = this.f) == null) {
            return null;
        }
        return eapgVar.p(30);
    }

    public int o() {
        eapg eapgVar = this.f;
        if (eapgVar == null) {
            return 0;
        }
        return eapk.c(this.e, new eapy(eapgVar.r(), this.f.s())).p;
    }

    @Override // defpackage.aafe
    /* renamed from: p */
    public dcdc<aaff> c() {
        if (this.k == null) {
            dccx F = dcdc.F();
            int i = 0;
            while (i < 12) {
                eapy c = this.e.c(i);
                Boolean valueOf = Boolean.valueOf(i != 11);
                aafq aafqVar = this.c;
                eapg eapgVar = this.d;
                Activity activity = (Activity) ((dxjd) aafqVar.a).a;
                aafq.a(activity, 1);
                cqhn a = aafqVar.b.a();
                aafq.a(a, 2);
                aafq.a(eapgVar, 3);
                aafq.a(c, 4);
                aafq.a(valueOf, 5);
                aafq.a(this, 6);
                F.g(new aafp(activity, a, eapgVar, c, valueOf, this));
                i++;
            }
            this.k = F.f();
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ jib q() {
        jhz jhzVar = new jhz();
        jhzVar.a = this.b.getString(aaai.EXPERIENCE_TIME_FRAME_DATE_PICKER_TITLE);
        jhzVar.u = ibm.c();
        jhzVar.q = ibm.b();
        jhzVar.i = cqrt.g(2131232205, ibm.c());
        jhzVar.f(new View.OnClickListener(this) { // from class: aafj
            private final aafl a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((gen) this.a.a).aT();
            }
        });
        jhzVar.x = false;
        return jhzVar.b();
    }

    @Override // defpackage.aafo
    public void j(eapg eapgVar) {
        aafg aafgVar = this.j;
        aafg aafgVar2 = this.h;
        if (aafgVar == aafgVar2) {
            this.f = eapgVar;
            this.j = this.i;
            this.g = null;
        } else if (aafgVar == this.i) {
            this.g = eapgVar;
            this.j = aafgVar2;
        }
        r();
        cqkx.p(this);
    }
}
