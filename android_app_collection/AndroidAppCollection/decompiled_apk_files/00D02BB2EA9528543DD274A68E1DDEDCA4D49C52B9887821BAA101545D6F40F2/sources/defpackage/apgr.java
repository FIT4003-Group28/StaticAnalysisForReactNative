package defpackage;
/* compiled from: PG */
/* renamed from: apgr  reason: default package */
/* loaded from: classes2.dex */
public final class apgr {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<cqhu> c;
    public final dzsj<cjqy> d;
    public final dzsj<apjz> e;
    public final dzsj<apjv> f;
    public final dzsj<anhg> g;
    public final dzsj<aphc> h;
    public final dzsj<apgk> i;
    public final dzsj<aniz> j;
    public final dzsj<cpv> k;

    public apgr(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<apjz> dzsjVar5, dzsj<apjv> dzsjVar6, dzsj<anhg> dzsjVar7, dzsj<aphc> dzsjVar8, dzsj<apgk> dzsjVar9, dzsj<aniz> dzsjVar10, dzsj<cpv> dzsjVar11) {
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
