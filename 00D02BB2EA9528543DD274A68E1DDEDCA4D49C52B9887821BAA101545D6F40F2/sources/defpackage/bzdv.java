package defpackage;
/* compiled from: PG */
/* renamed from: bzdv  reason: default package */
/* loaded from: classes4.dex */
public final class bzdv {
    public final dzsj<bzfw> a;
    public final dzsj<bzfm> b;
    public final dzsj<bzej> c;
    public final dzsj<bzdn> d;
    public final dzsj<byzk> e;
    public final dzsj<bzfj> f;
    public final dzsj<cqat> g;
    public final dzsj<bvjj> h;
    public final dzsj<btvo> i;

    public bzdv(dzsj<bzfw> dzsjVar, dzsj<bzfm> dzsjVar2, dzsj<bzej> dzsjVar3, dzsj<bzdn> dzsjVar4, dzsj<byzk> dzsjVar5, dzsj<bzfj> dzsjVar6, dzsj<cqat> dzsjVar7, dzsj<bvjj> dzsjVar8, dzsj<btvo> dzsjVar9) {
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
