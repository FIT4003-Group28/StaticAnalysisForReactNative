package defpackage;
/* compiled from: PG */
/* renamed from: wzl  reason: default package */
/* loaded from: classes7.dex */
public class wzl implements wyo {
    private final vtn a;
    private final gce b;
    private final wzh c;
    private final djwq d;
    private final wzk e;
    private boolean f;

    public wzl(cqhn cqhnVar, vtn vtnVar, gce gceVar, wzh wzhVar, djwq djwqVar, wzk wzkVar) {
        this.a = vtnVar;
        this.b = gceVar;
        this.c = wzhVar;
        this.d = djwqVar;
        this.e = wzkVar;
    }

    private final cqtd i(String str) {
        cqtd e = this.a.e(str, bvlw.a);
        if (e != null) {
            return iut.a(e);
        }
        return null;
    }

    @Override // defpackage.wyo
    public String a() {
        drhh drhhVar = this.d.b;
        if (drhhVar == null) {
            drhhVar = drhh.k;
        }
        return drhhVar.c;
    }

    @Override // defpackage.wyo
    public String b() {
        drhh drhhVar = this.d.b;
        if (drhhVar == null) {
            drhhVar = drhh.k;
        }
        return drhhVar.d;
    }

    @Override // defpackage.wyo
    public cqkl c() {
        g(!this.f);
        ((wzn) this.c).a.e(this.f ? this.d : null);
        return cqkl.a;
    }

    @Override // defpackage.wyo
    public cjtd d() {
        return cjtd.c;
    }

    @Override // defpackage.wyo
    public cqtd e() {
        if (this.e != wzk.SHOW_ICON) {
            return null;
        }
        if (this.b.h() && f().booleanValue()) {
            drhh drhhVar = this.d.b;
            if (drhhVar == null) {
                drhhVar = drhh.k;
            }
            if ((drhhVar.a & 512) != 0) {
                drhh drhhVar2 = this.d.b;
                if (drhhVar2 == null) {
                    drhhVar2 = drhh.k;
                }
                return i(drhhVar2.j);
            }
        }
        if (this.b.h()) {
            drhh drhhVar3 = this.d.b;
            if (drhhVar3 == null) {
                drhhVar3 = drhh.k;
            }
            if ((drhhVar3.a & 32) != 0) {
                drhh drhhVar4 = this.d.b;
                if (drhhVar4 == null) {
                    drhhVar4 = drhh.k;
                }
                return i(drhhVar4.f);
            }
        }
        if (f().booleanValue()) {
            drhh drhhVar5 = this.d.b;
            if (drhhVar5 == null) {
                drhhVar5 = drhh.k;
            }
            if ((drhhVar5.a & 256) != 0) {
                drhh drhhVar6 = this.d.b;
                if (drhhVar6 == null) {
                    drhhVar6 = drhh.k;
                }
                return i(drhhVar6.i);
            }
        }
        drhh drhhVar7 = this.d.b;
        if (drhhVar7 == null) {
            drhhVar7 = drhh.k;
        }
        if ((drhhVar7.a & 16) == 0) {
            return null;
        }
        drhh drhhVar8 = this.d.b;
        if (drhhVar8 == null) {
            drhhVar8 = drhh.k;
        }
        return i(drhhVar8.e);
    }

    @Override // defpackage.wyo
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }

    public void g(boolean z) {
        boolean z2 = this.f;
        this.f = z;
        if (z2 != z) {
            cqkx.p(this);
        }
    }

    public String h() {
        return this.d.a;
    }
}
