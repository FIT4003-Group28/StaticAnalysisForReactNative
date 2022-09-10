package defpackage;
/* compiled from: PG */
/* renamed from: bfhf  reason: default package */
/* loaded from: classes3.dex */
public class bfhf {
    public final dzsj<cqhn> a;
    public final dzsj<cqhu> b;
    public final dzsj<iqs> c;
    public final dzsj<bwqv> d;
    public final dzsj<bfhx> e;
    public final dzsj<bfha> f;
    public final dzsj<bmef> g;
    public final dzsj<bego> h;
    public final dzsj<btvo> i;
    public final dzsj<bfgq> j;

    public bfhf(dzsj<cqhn> dzsjVar, dzsj<cqhu> dzsjVar2, dzsj<iqs> dzsjVar3, dzsj<bwqv> dzsjVar4, dzsj<bfhx> dzsjVar5, dzsj<bfha> dzsjVar6, dzsj<bmef> dzsjVar7, dzsj<bego> dzsjVar8, dzsj<btvo> dzsjVar9, dzsj<bfgq> dzsjVar10) {
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
