package defpackage;
/* compiled from: PG */
/* renamed from: cqm  reason: default package */
/* loaded from: classes5.dex */
public final class cqm {
    public final dzsj<akpm> a;
    public final dzsj<afwr> b;
    public final dzsj<cqat> c;
    public final dzsj<btrm> d;
    public final dzsj<bxer> e;
    public final dzsj<bnyo> f;
    public final dzsj<btpc> g;
    public final dzsj<btvo> h;

    public cqm(dzsj<akpm> dzsjVar, dzsj<afwr> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<bxer> dzsjVar5, dzsj<bnyo> dzsjVar6, dzsj<btpc> dzsjVar7, dzsj<btvo> dzsjVar8) {
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
