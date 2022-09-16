package defpackage;
/* compiled from: PG */
/* renamed from: bvvm  reason: default package */
/* loaded from: classes4.dex */
public final class bvvm {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<bvus> c;
    public final dzsj<bvxz> d;
    public final dzsj<bvjj> e;
    public final dzsj<bwde> f;
    public final dzsj<btvo> g;
    public final dzsj<gce> h;
    public final dzsj<bwdc> i;

    public bvvm(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bvus> dzsjVar3, dzsj<bvxz> dzsjVar4, dzsj<bvjj> dzsjVar5, dzsj<bwde> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<gce> dzsjVar8, dzsj<bwdc> dzsjVar9) {
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
