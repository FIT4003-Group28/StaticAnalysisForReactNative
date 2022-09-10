package defpackage;
/* compiled from: PG */
/* renamed from: bual  reason: default package */
/* loaded from: classes4.dex */
public final class bual implements buis {
    private final dxio<buaf> a;
    private final dxio<btvg> b;
    private final dzsj<dkiy> c;
    private final ckcw d;

    public bual(dxio<buaf> dxioVar, dxio<btvg> dxioVar2, dzsj<dkiy> dzsjVar, ckcw ckcwVar) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dzsjVar;
        this.d = ckcwVar;
    }

    @Override // defpackage.buis
    public final <S extends dssj> buir<S> a(dssj dssjVar, buid buidVar, buad buadVar) {
        return new buah(dssjVar, buidVar, new bufa(dssjVar, this.a.a(), this.b.a(), this.c, this.d));
    }
}
