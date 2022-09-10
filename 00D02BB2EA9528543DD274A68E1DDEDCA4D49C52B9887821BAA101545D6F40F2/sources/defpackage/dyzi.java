package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyzi  reason: default package */
/* loaded from: classes6.dex */
public final class dyzi implements dyey {
    public final dyhw a;

    public dyzi(dyhw dyhwVar) {
        this.a = dyhwVar;
    }

    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        return new dyzh(this, dyeuVar.a(dyibVar, dyetVar));
    }
}
