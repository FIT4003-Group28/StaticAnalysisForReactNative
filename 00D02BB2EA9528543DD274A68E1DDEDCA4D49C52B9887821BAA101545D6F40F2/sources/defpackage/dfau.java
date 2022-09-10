package defpackage;
/* compiled from: PG */
/* renamed from: dfau  reason: default package */
/* loaded from: classes6.dex */
public final class dfau implements dyey {
    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        dbsk.m(dyetVar.e(dexa.a) == null, "AuthContext was set, but no AuthContextManager was bound");
        return dyeuVar.a(dyibVar, dyetVar);
    }
}
