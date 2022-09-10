package defpackage;
/* compiled from: PG */
/* renamed from: dfaa  reason: default package */
/* loaded from: classes6.dex */
public final class dfaa implements dyey {
    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        final dezl dezlVar = (dezl) dyetVar.e(dezk.a);
        if (dezlVar != null) {
            dezlVar.getClass();
            return dyfa.a(dyeuVar, dfbg.a(new dzsj(dezlVar) { // from class: dezz
                private final dezl a;

                {
                    this.a = dezlVar;
                }

                @Override // defpackage.dzsj
                public final Object a() {
                    return dcdc.f(this.a.a());
                }
            })).a(dyibVar, dyetVar);
        }
        return dyeuVar.a(dyibVar, dyetVar);
    }
}
