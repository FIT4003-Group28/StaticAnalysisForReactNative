package defpackage;
/* compiled from: PG */
/* renamed from: brck  reason: default package */
/* loaded from: classes4.dex */
public final class brck {
    public final dzsj<ff> a;
    public final dzsj<dxio<akzh>> b;
    public final dzsj<vox> c;
    public final dzsj<crzb> d;
    public final dzsj<akpm> e;
    public final dzsj<gll> f;
    public final dzsj<brbx> g;
    public final dzsj<brcf> h;
    public final dzsj<brba> i;
    public final dzsj<cjqy> j;
    public final dzsj<brlk> k;

    public brck(dzsj<ff> dzsjVar, dzsj<dxio<akzh>> dzsjVar2, dzsj<vox> dzsjVar3, dzsj<crzb> dzsjVar4, dzsj<akpm> dzsjVar5, dzsj<gll> dzsjVar6, dzsj<brbx> dzsjVar7, dzsj<brcf> dzsjVar8, dzsj<brba> dzsjVar9, dzsj<cjqy> dzsjVar10, dzsj<brlk> dzsjVar11) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
