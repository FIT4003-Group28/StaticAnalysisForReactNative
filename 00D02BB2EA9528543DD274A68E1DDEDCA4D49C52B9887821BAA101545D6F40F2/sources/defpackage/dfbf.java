package defpackage;
/* compiled from: PG */
/* renamed from: dfbf  reason: default package */
/* loaded from: classes6.dex */
final class dfbf implements dyey {
    private final dzsj<dcdc<dcdc<dfbd>>> a;

    public dfbf(dzsj<dcdc<dcdc<dfbd>>> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        return new dfcd(new dfbv(dyeuVar, dyibVar, dyetVar, this.a.a()));
    }
}
