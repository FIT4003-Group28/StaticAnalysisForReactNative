package defpackage;
/* compiled from: PG */
/* renamed from: ozr  reason: default package */
/* loaded from: classes7.dex */
public class ozr implements oxw {
    private final dtqe a;
    private final dtqd b;
    private final cjzt c;
    private final cqtd d;
    private final cjtd e;
    private final Boolean f;

    public ozr(cjzt cjztVar, dtqe dtqeVar, dtqd dtqdVar, boolean z) {
        this.a = dtqeVar;
        this.b = dtqdVar;
        this.c = cjztVar;
        dtkq dtkqVar = dtqdVar.b;
        this.d = oxa.g(dtkqVar == null ? dtkq.f : dtkqVar);
        this.e = oyf.b(cjztVar.b, dtqdVar.f, cjth.d(dtqdVar.g), cjztVar.e, (dtqdVar.a & 64) != 0 ? decs.a(dtqdVar.h) : null);
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.oxe
    public cjtd a() {
        return this.e;
    }

    @Override // defpackage.oxw
    public cqtd b() {
        return this.d;
    }

    @Override // defpackage.oxw
    public CharSequence c() {
        return this.b.c.isEmpty() ? "" : this.b.c.get(0);
    }

    @Override // defpackage.oxw
    public Boolean d() {
        return Boolean.valueOf((this.b.a & 4) != 0);
    }

    @Override // defpackage.oxw
    public cqkl e(cjqm cjqmVar) {
        if (d().booleanValue()) {
            cjyi cjyiVar = this.c.c;
            dthb dthbVar = this.b.e;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.c;
            cjyiVar.j(dthbVar, new nxc(cjztVar.a, this.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.oxw
    public Boolean f() {
        return this.f;
    }
}
