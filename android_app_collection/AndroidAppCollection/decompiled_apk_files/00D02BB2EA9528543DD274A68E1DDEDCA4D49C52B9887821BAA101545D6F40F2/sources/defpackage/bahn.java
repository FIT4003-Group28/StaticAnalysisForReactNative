package defpackage;
/* compiled from: PG */
/* renamed from: bahn  reason: default package */
/* loaded from: classes3.dex */
public final class bahn {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<bvjj> c;
    public final dzsj<akfa> d;
    public final dzsj<axwq> e;
    public final dzsj<baho> f;
    public final dzsj<barv> g;
    public final dzsj<bbbd> h;
    public final dzsj<bbbb> i;
    public final dzsj<ania> j;

    public bahn(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<axwq> dzsjVar5, dzsj<baho> dzsjVar6, dzsj<barv> dzsjVar7, dzsj<bbbd> dzsjVar8, dzsj<bbbb> dzsjVar9, dzsj<ania> dzsjVar10) {
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
