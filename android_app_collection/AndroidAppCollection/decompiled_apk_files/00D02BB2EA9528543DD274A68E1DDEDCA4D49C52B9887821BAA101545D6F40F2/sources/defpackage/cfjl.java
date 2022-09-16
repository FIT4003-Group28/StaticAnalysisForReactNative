package defpackage;
/* compiled from: PG */
/* renamed from: cfjl  reason: default package */
/* loaded from: classes4.dex */
final class cfjl implements cfkj {
    final /* synthetic */ cfjn a;

    public cfjl(cfjn cfjnVar) {
        this.a = cfjnVar;
    }

    @Override // defpackage.cfkj
    public final void a() {
        this.a.a.g().e();
    }

    @Override // defpackage.cfkj
    public final void b() {
        cfhs cfhsVar = this.a.e;
        if (cfhsVar != null) {
            cfhsVar.x();
        }
        cfjn cfjnVar = this.a;
        cfgv cfgvVar = cfjnVar.b;
        dlnm dlnmVar = cfjnVar.d;
        dbsk.s(dlnmVar);
        dbsg<cfgd> e = cfgvVar.e(dlnmVar.g);
        if (e.a()) {
            cfjn cfjnVar2 = this.a;
            dlnm dlnmVar2 = cfjnVar2.d;
            dbsk.s(dlnmVar2);
            cfjnVar2.n(dlnmVar2, e.b());
        }
    }

    @Override // defpackage.cfkj
    public final void c() {
        cfhs cfhsVar = this.a.e;
        if (cfhsVar != null) {
            cfhsVar.x();
        }
        cfjn cfjnVar = this.a;
        dlnm dlnmVar = cfjnVar.d;
        dbsk.s(dlnmVar);
        cfga bZ = cfgd.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cfgd.d((cfgd) bZ.b);
        cfjnVar.n(dlnmVar, bZ.bK());
    }
}
