package defpackage;
/* compiled from: PG */
/* renamed from: zne  reason: default package */
/* loaded from: classes7.dex */
public final class zne {
    public final dzsj<ff> a;
    public final dzsj<bvsl> b;
    public final dzsj<vtn> c;
    public final dzsj<afwr> d;
    public final dzsj<cjqy> e;
    public final dzsj<zrl> f;
    public final dzsj<bvly> g;
    public final dzsj<bvlo> h;
    public final dzsj<btvo> i;
    public final dzsj<gce> j;
    public final dzsj<zrt> k;

    public zne(dzsj<ff> dzsjVar, dzsj<bvsl> dzsjVar2, dzsj<vtn> dzsjVar3, dzsj<afwr> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<zrl> dzsjVar6, dzsj<bvly> dzsjVar7, dzsj<bvlo> dzsjVar8, dzsj<btvo> dzsjVar9, dzsj<gce> dzsjVar10, dzsj<zrt> dzsjVar11) {
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
