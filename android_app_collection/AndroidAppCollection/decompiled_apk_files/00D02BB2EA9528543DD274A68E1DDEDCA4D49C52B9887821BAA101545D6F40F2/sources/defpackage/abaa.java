package defpackage;
/* compiled from: PG */
/* renamed from: abaa  reason: default package */
/* loaded from: classes2.dex */
public final class abaa {
    public final dzsj<cqhn> a;
    public final dzsj<akoi> b;
    public final dzsj<bwsh> c;
    public final dzsj<bfib> d;
    public final dzsj<aaku> e;
    public final dzsj<aazw> f;
    public final dzsj<aazr> g;
    public final dzsj<aklj> h;
    public final dzsj<abac> i;

    public abaa(dzsj<cqhn> dzsjVar, dzsj<akoi> dzsjVar2, dzsj<bwsh> dzsjVar3, dzsj<bfib> dzsjVar4, dzsj<aaku> dzsjVar5, dzsj<aazw> dzsjVar6, dzsj<aazr> dzsjVar7, dzsj<aklj> dzsjVar8, dzsj<abac> dzsjVar9) {
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
