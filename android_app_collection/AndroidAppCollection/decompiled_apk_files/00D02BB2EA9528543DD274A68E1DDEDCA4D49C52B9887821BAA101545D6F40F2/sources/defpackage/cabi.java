package defpackage;
/* compiled from: PG */
/* renamed from: cabi  reason: default package */
/* loaded from: classes4.dex */
public class cabi {
    public final dzsj<bvjj> a;
    public final dzsj<cafi> b;
    public final dzsj<dxio<akfa>> c;
    public final dzsj<cagk> d;
    public final dzsj<cavc> e;
    public final dzsj<cave> f;
    public final dzsj<caez> g;
    public final dzsj<dxio<caym>> h;
    public final dzsj<btvo> i;
    public final dzsj<cbqg> j;
    public final dzsj<gga> k;
    public final dzsj<cbea> l;

    public cabi(dzsj<bvjj> dzsjVar, dzsj<cafi> dzsjVar2, dzsj<dxio<akfa>> dzsjVar3, dzsj<cagk> dzsjVar4, dzsj<cavc> dzsjVar5, dzsj<cave> dzsjVar6, dzsj<caez> dzsjVar7, dzsj<dxio<caym>> dzsjVar8, dzsj<btvo> dzsjVar9, dzsj<cbqg> dzsjVar10, dzsj<gga> dzsjVar11, dzsj<cbea> dzsjVar12) {
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
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
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
