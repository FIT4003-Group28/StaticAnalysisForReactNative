package defpackage;
/* compiled from: PG */
/* renamed from: oyn  reason: default package */
/* loaded from: classes7.dex */
public class oyn implements oxm {
    private final cjzt a;
    private final dtnb b;
    private final wjj c;
    private final cjtd d;

    public oyn(cjzt cjztVar, dtnb dtnbVar, wjj wjjVar) {
        this.a = cjztVar;
        this.b = dtnbVar;
        this.c = wjjVar;
        this.d = oyf.b(cjztVar.b, dtnbVar.d, dtxl.b, cjztVar.e, (dtnbVar.a & 32) != 0 ? decs.a(dtnbVar.e) : null);
    }

    @Override // defpackage.oxe
    public cjtd a() {
        return this.d;
    }

    @Override // defpackage.oxm
    public wjj b() {
        return this.c;
    }

    @Override // defpackage.oxm
    public Boolean c() {
        return Boolean.valueOf((this.b.a & 2) != 0);
    }

    @Override // defpackage.oxm
    public cqkl d(cjqm cjqmVar) {
        if (c().booleanValue()) {
            cjyi cjyiVar = this.a.c;
            dthb dthbVar = this.b.c;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.a;
            cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }
}
