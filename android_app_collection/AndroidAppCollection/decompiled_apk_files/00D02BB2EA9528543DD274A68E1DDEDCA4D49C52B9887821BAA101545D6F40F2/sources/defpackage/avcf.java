package defpackage;
/* compiled from: PG */
/* renamed from: avcf  reason: default package */
/* loaded from: classes2.dex */
public final class avcf implements avbz {
    private final dzsj<cvin> a;
    private final dzsj<avpn> b;
    private final dzsj<akfa> c;
    private final dzsj<awfh> d;
    private final dzsj<crzm<avzg>> e;
    private final dzsj<dxio<avrw>> f;

    public avcf(dzsj<cvin> dzsjVar, dzsj<avpn> dzsjVar2, dzsj<akfa> dzsjVar3, dzsj<awfh> dzsjVar4, dzsj<crzm<avzg>> dzsjVar5, dzsj<dxio<avrw>> dzsjVar6) {
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
        cvin a = this.a.a();
        b(a, 1);
        avpn a2 = this.b.a();
        b(a2, 2);
        b(this.c.a(), 3);
        awfh a3 = this.d.a();
        b(a3, 4);
        crzm<avzg> a4 = this.e.a();
        b(a4, 5);
        dxio a5 = ((dxjh) this.f).a();
        b(a5, 6);
        b(avbyVar, 7);
        b(avzeVar, 8);
        return new avce(a, a2, a3, a4, a5, avbyVar, avzeVar);
    }
}
