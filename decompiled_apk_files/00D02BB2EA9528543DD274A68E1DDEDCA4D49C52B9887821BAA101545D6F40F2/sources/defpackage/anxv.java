package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anxv  reason: default package */
/* loaded from: classes2.dex */
public class anxv implements anxu {
    private final anry a;
    private boolean b = false;

    public anxv(anry anryVar) {
        this.a = anryVar;
    }

    @Override // defpackage.anxu
    public String a() {
        return this.a.f();
    }

    @Override // defpackage.anxu
    public String b() {
        return this.a.f();
    }

    @Override // defpackage.anxu
    public CharSequence c() {
        return this.a.c.getString(R.string.MAPS_ACTIVITY_MISSING_VISIT_IN);
    }

    @Override // defpackage.anxu
    public String d() {
        return this.a.g();
    }

    @Override // defpackage.anxu
    public CharSequence e() {
        String o;
        anry anryVar = this.a;
        if (anryVar.m == null) {
            int V = anryVar.V() - 1;
            if (V == 0) {
                gga ggaVar = anryVar.c;
                dwyn dwynVar = anryVar.g.f;
                if (dwynVar == null) {
                    dwynVar = dwyn.d;
                }
                dwyn dwynVar2 = anryVar.g.g;
                if (dwynVar2 == null) {
                    dwynVar2 = dwyn.d;
                }
                o = bvtb.o(ggaVar, dwynVar.b, aogc.a(dwynVar).v().s(), dwynVar2.b, aogc.a(dwynVar2).v().s());
            } else if (V == 1) {
                gga ggaVar2 = anryVar.c;
                dwyn dwynVar3 = anryVar.g.g;
                if (dwynVar3 == null) {
                    dwynVar3 = dwyn.d;
                }
                o = apka.a(ggaVar2, dwynVar3);
            } else if (V == 2) {
                gga ggaVar3 = anryVar.c;
                dwyn dwynVar4 = anryVar.g.f;
                if (dwynVar4 == null) {
                    dwynVar4 = dwyn.d;
                }
                o = apka.a(ggaVar3, dwynVar4);
            } else if (V == 4) {
                gga ggaVar4 = anryVar.c;
                dwyn dwynVar5 = anryVar.g.f;
                if (dwynVar5 == null) {
                    dwynVar5 = dwyn.d;
                }
                o = String.format("%s – %s", apka.a(ggaVar4, dwynVar5), ggaVar4.getString(R.string.MAPS_ACTIVITY_EDIT_SEGMENT_NOW));
            } else if (V != 5) {
                o = anryVar.c.getString(R.string.MAPS_ACTIVITY_ALL_DAY);
            } else {
                o = anryVar.c.getString(R.string.MAPS_ACTIVITY_EDIT_SEGMENT_NOW);
            }
            anryVar.m = o;
        }
        return anryVar.m;
    }

    @Override // defpackage.anxu
    public CharSequence f() {
        return this.a.z();
    }

    @Override // defpackage.anxu
    public cqsn g() {
        return this.a.h();
    }

    @Override // defpackage.anxu
    public jic h() {
        return this.a.J();
    }

    @Override // defpackage.anxu
    public Boolean i() {
        return Boolean.valueOf(this.a.c());
    }

    @Override // defpackage.anxu
    public Boolean j() {
        return Boolean.valueOf(this.a.d());
    }

    @Override // defpackage.anxu
    public Boolean k() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.anxu
    public Boolean l() {
        return Boolean.valueOf(this.a.ac());
    }

    @Override // defpackage.anxu
    public cqss m() {
        if (p().booleanValue()) {
            return ibm.b();
        }
        if (i().booleanValue() || j().booleanValue()) {
            return this.a.M().b();
        }
        return ibm.p();
    }

    @Override // defpackage.anxu
    public cqss n() {
        if (p().booleanValue()) {
            return ibm.b();
        }
        if (i().booleanValue() || j().booleanValue()) {
            return this.a.M().c();
        }
        return ibm.n();
    }

    @Override // defpackage.anxu
    public Boolean o() {
        boolean z = false;
        if (this.a.H() && !this.a.Q()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.anxu
    public Boolean p() {
        return Boolean.valueOf(this.a.e());
    }

    @Override // defpackage.anxu
    public Boolean q() {
        return Boolean.valueOf(this.a.N());
    }

    public void r(boolean z) {
        if (this.b != z) {
            this.b = z;
            cqkx.p(this);
        }
    }
}
