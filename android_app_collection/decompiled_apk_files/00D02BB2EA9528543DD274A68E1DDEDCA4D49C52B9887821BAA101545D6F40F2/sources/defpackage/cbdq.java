package defpackage;
/* compiled from: PG */
/* renamed from: cbdq  reason: default package */
/* loaded from: classes4.dex */
public final class cbdq {
    public final dzsj<bwqv> a;
    public final dzsj<gga> b;
    public final dzsj<cqhn> c;
    public final dzsj<dxio<bbut>> d;
    public final dzsj<dxio<bdhl>> e;
    public final dzsj<bbtk> f;
    public final dzsj<akfa> g;
    public final dzsj<dxio<bbul>> h;
    public final dzsj<aajk> i;
    public final dzsj<cayn> j;

    public cbdq(dzsj<bwqv> dzsjVar, dzsj<gga> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<dxio<bbut>> dzsjVar4, dzsj<dxio<bdhl>> dzsjVar5, dzsj<bbtk> dzsjVar6, dzsj<akfa> dzsjVar7, dzsj<dxio<bbul>> dzsjVar8, dzsj<aajk> dzsjVar9, dzsj<cayn> dzsjVar10) {
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
