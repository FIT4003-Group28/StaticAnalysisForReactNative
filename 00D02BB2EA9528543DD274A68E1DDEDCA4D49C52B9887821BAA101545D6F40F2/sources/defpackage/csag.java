package defpackage;
/* compiled from: PG */
/* renamed from: csag  reason: default package */
/* loaded from: classes5.dex */
public final class csag implements dyey {
    public static volatile csag a;
    private static final csaf b = new csaf();
    private final csan c;

    public csag(csan csanVar) {
        dbsk.s(csanVar);
        this.c = csanVar;
    }

    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        return this.c.a(dyibVar, dykb.o(dyetVar, b), dyeuVar);
    }
}
