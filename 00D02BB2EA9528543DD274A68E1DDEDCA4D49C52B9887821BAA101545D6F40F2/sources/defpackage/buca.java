package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: buca  reason: default package */
/* loaded from: classes4.dex */
public final class buca implements dyey {
    public final dzsj<bvjj> a;
    public final dxio<btto> b;
    public final dxio<ckcw> c;
    public final dyhw d;
    public final Class<? extends dssj> e;

    public buca(dzsj<bvjj> dzsjVar, dxio<btto> dxioVar, dxio<ckcw> dxioVar2, dyhw dyhwVar, Class<? extends dssj> cls) {
        this.a = dzsjVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dyhwVar;
        this.e = cls;
    }

    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        return new bubz(this, dyeuVar.a(dyibVar, dyetVar));
    }
}
