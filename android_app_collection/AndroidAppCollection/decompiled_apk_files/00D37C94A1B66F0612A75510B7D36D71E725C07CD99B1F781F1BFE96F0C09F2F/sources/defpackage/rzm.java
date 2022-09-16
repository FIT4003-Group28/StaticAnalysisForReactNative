package defpackage;
/* compiled from: PG */
/* renamed from: rzm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rzm implements rzn {
    public final /* synthetic */ aopa a;
    private final /* synthetic */ int b;

    public /* synthetic */ rzm(aopa aopaVar) {
        this.a = aopaVar;
    }

    public /* synthetic */ rzm(aopa aopaVar, int i) {
        this.b = i;
        this.a = aopaVar;
    }

    @Override // defpackage.rzn
    public final ankt a(aymy aymyVar) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                aofa aofaVar = (aofa) this.a.mo39build();
                axye axyeVar = aymyVar.a;
                ayax ayaxVar = aoex.a;
                if (ayaxVar == null) {
                    synchronized (aoex.class) {
                        ayaxVar = aoex.a;
                        if (ayaxVar == null) {
                            ayau a = ayax.a();
                            a.c = ayaw.UNARY;
                            a.d = ayax.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "CreateLink");
                            a.b();
                            a.a = aymw.b(aofa.a);
                            a.b = aymw.b(aofi.a);
                            ayaxVar = a.a();
                            aoex.a = ayaxVar;
                        }
                    }
                }
                return aynh.a(axyeVar.a(ayaxVar, aymyVar.b), aofaVar);
            }
            return aymyVar.b((aofy) this.a.mo39build());
        }
        return aymyVar.b((aofy) this.a.mo39build());
    }
}
