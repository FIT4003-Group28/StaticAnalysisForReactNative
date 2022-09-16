package defpackage;
/* compiled from: PG */
/* renamed from: behb  reason: default package */
/* loaded from: classes3.dex */
public class behb implements jbm {
    private final abfk a;
    private final dqfo b;
    private final cqtd c;
    private final cjtd d;

    public behb(abfl abflVar, dqfo dqfoVar, int i, cjtd cjtdVar) {
        this.a = abflVar.a(dqfoVar, null, null);
        this.b = dqfoVar;
        dqfn b = dqfn.b(dqfoVar.h);
        b = b == null ? dqfn.UNKNOWN : b;
        if (isw.b.containsKey(b)) {
            this.c = iup.c(isw.b.get(b).intValue(), ibm.p());
        } else {
            this.c = cqrt.g(isw.a.getOrDefault(b, 2131232414).intValue(), ibm.p());
        }
        cjta c = cjtd.c(cjtdVar);
        isw.c(c, dqfoVar, dtxy.hr, i, ddfn.PLACE_ASSISTIVE_SHORTCUTS);
        this.d = c.a();
    }

    @Override // defpackage.jbm
    @dzsi
    public cqtd a() {
        return this.c;
    }

    @Override // defpackage.jbm
    public String b() {
        return this.b.e;
    }

    @Override // defpackage.jbm
    public cjtd c() {
        return this.d;
    }

    @Override // defpackage.jbm
    public cqkl d(cjqm cjqmVar) {
        this.a.a(cjqmVar);
        return cqkl.a;
    }
}
