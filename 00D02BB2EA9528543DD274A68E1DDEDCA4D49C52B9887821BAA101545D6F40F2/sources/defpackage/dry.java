package defpackage;
/* compiled from: PG */
/* renamed from: dry  reason: default package */
/* loaded from: classes6.dex */
public final class dry {
    public final dzsj<gga> a;
    public final dzsj<btrm> b;
    public final dzsj<akox> c;
    public final dzsj<ahjq> d;
    public final dzsj<araj> e;
    public final dzsj<gll> f;
    public final dzsj<cqkj> g;
    public final dzsj<btvo> h;
    public final dzsj<dss> i;
    public final dzsj<cpv> j;

    public dry(dzsj<gga> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<akox> dzsjVar3, dzsj<ahjq> dzsjVar4, dzsj<araj> dzsjVar5, dzsj<gll> dzsjVar6, dzsj<cqkj> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<dss> dzsjVar9, dzsj<cpv> dzsjVar10) {
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
