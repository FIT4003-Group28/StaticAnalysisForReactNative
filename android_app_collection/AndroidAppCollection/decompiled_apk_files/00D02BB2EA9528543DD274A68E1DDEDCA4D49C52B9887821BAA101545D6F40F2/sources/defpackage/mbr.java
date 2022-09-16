package defpackage;
/* compiled from: PG */
/* renamed from: mbr  reason: default package */
/* loaded from: classes7.dex */
public final class mbr implements mcm {
    private final cjqy a;
    private final mcn b;
    private final cjqq c;

    public mbr(cjqy cjqyVar, mcn mcnVar, cjqq cjqqVar) {
        dbsk.s(cjqyVar);
        this.a = cjqyVar;
        this.b = mcnVar;
        dbsk.s(cjqqVar);
        this.c = cjqqVar;
    }

    @Override // defpackage.mcm
    public final void a(String str, String str2, @dzsi String str3, @dzsi dpvf dpvfVar, @dzsi dhjx dhjxVar, ddho ddhoVar, deaf deafVar, boolean z, @dzsi dwir dwirVar, @dzsi drph drphVar, mnz mnzVar, dbsg<Long> dbsgVar, boolean z2) {
        bvrj.UI_THREAD.c();
        cjtd a = cjtd.a(ddhoVar);
        cjqm n = this.a.n(this.c.g().d(a), new cjte(deafVar), a);
        astd s = aste.s();
        assw asswVar = (assw) s;
        asswVar.a = n.a().f();
        String str4 = str;
        asswVar.b = str4;
        if (true != dbsj.d(str3)) {
            str4 = str3;
        }
        s.d(str4);
        asswVar.c = dpvfVar;
        asswVar.f = bvrt.a(dhjxVar);
        asswVar.d = str2;
        s.f(ddhoVar);
        s.h(z);
        s.j(dwirVar);
        s.i(drphVar);
        s.b(dbsgVar);
        s.c(z2);
        this.b.NY(s.a(), mnzVar);
    }
}
