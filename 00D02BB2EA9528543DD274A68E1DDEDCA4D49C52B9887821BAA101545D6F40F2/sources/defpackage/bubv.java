package defpackage;
/* compiled from: PG */
/* renamed from: bubv  reason: default package */
/* loaded from: classes4.dex */
public final class bubv implements buis {
    private final dbsg<btvg> a;
    private final dxio<btto> b;
    private final btus c;
    private final dxio<bucq> d;
    private final dxio<bubp> e;
    private final bvjj f;
    private final bucb g;
    private final dzsj<dixz> h;
    private final dzsj<djzi> i;
    private final dzsj<dkiy> j;
    private final dzsj<duul> k;
    private final ckcw l;
    private final buxc m;
    private final btyy n;
    private final dxio<bszw> o;
    private final gcg p;
    private final dxio<gce> q;
    private final dzsj<dbsg<dhmr>> r;

    public bubv(dbsg<btvg> dbsgVar, dxio<bucq> dxioVar, btus btusVar, dxio<btto> dxioVar2, dxio<bubp> dxioVar3, bvjj bvjjVar, bucb bucbVar, dzsj<dixz> dzsjVar, dzsj<djzi> dzsjVar2, dzsj<dkiy> dzsjVar3, dzsj<duul> dzsjVar4, ckcw ckcwVar, buxc buxcVar, btyy btyyVar, dxio<bszw> dxioVar4, gcg gcgVar, dxio<gce> dxioVar5, dzsj<dbsg<dhmr>> dzsjVar5) {
        this.a = dbsgVar;
        this.b = dxioVar2;
        this.c = btusVar;
        this.d = dxioVar;
        this.e = dxioVar3;
        this.f = bvjjVar;
        this.g = bucbVar;
        this.h = dzsjVar;
        this.i = dzsjVar2;
        this.j = dzsjVar3;
        this.k = dzsjVar4;
        this.l = ckcwVar;
        this.m = buxcVar;
        this.n = btyyVar;
        this.o = dxioVar4;
        this.p = gcgVar;
        this.q = dxioVar5;
        this.r = dzsjVar5;
    }

    @Override // defpackage.buis
    public final <S extends dssj> buir<S> a(dssj dssjVar, buid buidVar, buad buadVar) {
        dbsk.m(true, "Trying to use gRPC without the expected server channel");
        return new bubt(dssjVar, buidVar, this.b, this.c, this.e, this.f, this.g, new bufa(dssjVar, this.d.a(), (btvg) ((dbsu) this.a).a, this.j, this.l), this.h, this.i, this.m, this.n, this.o, this.j, this.k, this.p, this.q, this.r);
    }
}
