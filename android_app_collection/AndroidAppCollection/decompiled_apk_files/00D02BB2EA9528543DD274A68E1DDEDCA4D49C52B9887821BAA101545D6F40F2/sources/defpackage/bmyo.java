package defpackage;
/* compiled from: PG */
/* renamed from: bmyo  reason: default package */
/* loaded from: classes3.dex */
public class bmyo {
    public final dzsj<cqhn> a;
    public final dzsj<gga> b;
    public final dzsj<brba> c;
    public final dzsj<bhtr> d;
    public final dzsj<bmyp> e;
    public final dzsj<bmzc> f;
    public final dzsj<btvo> g;
    public final dzsj<betx> h;
    public final dzsj<bect> i;
    public final dzsj<dxio<abfa>> j;
    public final dzsj<bmza> k;
    public final dzsj<bhat> l;

    public bmyo(dzsj<cqhn> dzsjVar, dzsj<gga> dzsjVar2, dzsj<brba> dzsjVar3, dzsj<bhtr> dzsjVar4, dzsj<bmyp> dzsjVar5, dzsj<bmzc> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<betx> dzsjVar8, dzsj<bect> dzsjVar9, dzsj<dxio<abfa>> dzsjVar10, dzsj<bmza> dzsjVar11, dzsj<bhat> dzsjVar12) {
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
