package defpackage;
/* compiled from: PG */
/* renamed from: brvr  reason: default package */
/* loaded from: classes4.dex */
public final class brvr {
    public final dzsj<btvo> a;
    public final dzsj<dxio<akfa>> b;
    public final dzsj<dxio<apyz>> c;
    public final dzsj<becb> d;
    public final dzsj<brvs> e;
    public final dzsj<bebr> f;
    public final dzsj<beam> g;
    public final dzsj<bebo> h;
    public final dzsj<bkgz> i;
    public final dzsj<bkgy> j;

    public brvr(dzsj<btvo> dzsjVar, dzsj<dxio<akfa>> dzsjVar2, dzsj<dxio<apyz>> dzsjVar3, dzsj<becb> dzsjVar4, dzsj<brvs> dzsjVar5, dzsj<bebr> dzsjVar6, dzsj<beam> dzsjVar7, dzsj<bebo> dzsjVar8, dzsj<bkgz> dzsjVar9, dzsj<bkgy> dzsjVar10) {
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
