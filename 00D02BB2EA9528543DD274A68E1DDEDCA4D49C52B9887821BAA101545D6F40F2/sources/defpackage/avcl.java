package defpackage;
/* compiled from: PG */
/* renamed from: avcl  reason: default package */
/* loaded from: classes2.dex */
public final class avcl implements avbz {
    private final dzsj<clks> a;
    private final dzsj<dehp> b;
    private final dzsj<avpn> c;
    private final dzsj<akfa> d;
    private final dzsj<awfh> e;
    private final dzsj<crzm<avzg>> f;
    private final dzsj<dxio<avrw>> g;

    public avcl(dzsj<clks> dzsjVar, dzsj<dehp> dzsjVar2, dzsj<avpn> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<awfh> dzsjVar5, dzsj<crzm<avzg>> dzsjVar6, dzsj<dxio<avrw>> dzsjVar7) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.avbz
    public final /* bridge */ /* synthetic */ avca a(avby avbyVar, avze avzeVar) {
        clks a = this.a.a();
        b(a, 1);
        dehp a2 = this.b.a();
        b(a2, 2);
        avpn a3 = this.c.a();
        b(a3, 3);
        b(this.d.a(), 4);
        awfh a4 = this.e.a();
        b(a4, 5);
        crzm<avzg> a5 = this.f.a();
        b(a5, 6);
        dxio a6 = ((dxjh) this.g).a();
        b(a6, 7);
        b(avbyVar, 8);
        b(avzeVar, 9);
        return new avck(a, a2, a3, a4, a5, a6, avbyVar, avzeVar);
    }
}
