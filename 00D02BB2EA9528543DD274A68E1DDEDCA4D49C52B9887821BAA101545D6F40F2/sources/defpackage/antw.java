package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: antw  reason: default package */
/* loaded from: classes2.dex */
public class antw implements antv {
    private final anpa a;
    private final cqtd b;
    private final cqsn c;
    private final izw d;
    private final String e;

    public antw(dvay dvayVar, dpop dpopVar, aoge aogeVar, boolean z, anri anriVar, anpb anpbVar, anpc anpcVar, bvsl bvslVar) {
        dvak dvakVar;
        String c;
        dvak dvakVar2;
        String str;
        dvak dvakVar3;
        if (dvayVar.b == 9) {
            dvakVar = (dvak) dvayVar.c;
        } else {
            dvakVar = dvak.e;
        }
        dqjl b = dqjl.b(dvakVar.b);
        b = b == null ? dqjl.UNKNOWN_ACTIVITY_TYPE : b;
        final anpa a = anpbVar.a(dvayVar, dpopVar, aogeVar, false);
        this.a = a;
        aofn aofnVar = aogeVar.d;
        aofnVar.b(e().booleanValue() ? dqjl.UNKNOWN_ACTIVITY_TYPE : b);
        if (e().booleanValue()) {
            c = a.c.getString(R.string.MAPS_ACTIVITY_MISSING_ACTIVITY).toString();
        } else {
            c = aofnVar.c(b);
        }
        this.c = cqsk.a(c);
        this.b = anpc.a(e().booleanValue() ? dqjl.UNKNOWN_ACTIVITY_TYPE : b);
        if (dvayVar.b == 9) {
            dvakVar2 = (dvak) dvayVar.c;
        } else {
            dvakVar2 = dvak.e;
        }
        if (dvakVar2.c != 0) {
            if (dvayVar.b == 9) {
                dvakVar3 = (dvak) dvayVar.c;
            } else {
                dvakVar3 = dvak.e;
            }
            str = bvslVar.c(dvakVar3.c, null, true, true);
        } else {
            str = "";
        }
        this.e = str;
        dccx F = dcdc.F();
        if (a.e()) {
            F.g(new ivd(cqrt.h(2131231586, anriVar.a), cqrt.l(R.string.MAPS_ACTIVITY_ADD_ACTIVITY), anriVar.b, new ivc(a) { // from class: anrc
                private final anrr a;

                {
                    this.a = a;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    this.a.y();
                }
            }, a.R(dtyc.av)));
        }
        this.d = new ivb(F.f(), null);
    }

    @Override // defpackage.antv
    public cqtd a() {
        return this.b;
    }

    @Override // defpackage.antv
    public cqsn b() {
        return this.c;
    }

    @Override // defpackage.antv
    public String c() {
        return this.a.z();
    }

    @Override // defpackage.antv
    public String d() {
        return this.e;
    }

    @Override // defpackage.antv
    public Boolean e() {
        return Boolean.valueOf(this.a.e());
    }

    @Override // defpackage.antv
    public izw f() {
        return this.d;
    }

    @Override // defpackage.antv
    public aoij g() {
        return this.a.D();
    }

    @Override // defpackage.antv
    public Boolean h() {
        return Boolean.valueOf(this.a.C());
    }

    @Override // defpackage.antv
    public aoiu i() {
        return this.a.E();
    }

    @Override // defpackage.antv
    public cqkl j() {
        this.a.x();
        return cqkl.a;
    }

    @Override // defpackage.antv
    public cjtd k() {
        return this.a.R(dtyi.P);
    }

    @Override // defpackage.antv
    public cqkl l() {
        anpa anpaVar = this.a;
        anpaVar.r(dbsg.i(anpaVar.g), dbpy.a);
        return cqkl.a;
    }
}
