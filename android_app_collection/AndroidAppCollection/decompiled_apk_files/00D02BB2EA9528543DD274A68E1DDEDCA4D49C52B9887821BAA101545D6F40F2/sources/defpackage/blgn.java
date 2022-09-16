package defpackage;
/* compiled from: PG */
/* renamed from: blgn  reason: default package */
/* loaded from: classes3.dex */
public final class blgn {
    public final dzsj<blly> a;
    public final dzsj<blnq> b;
    public final dzsj<cexu> c;
    public final dzsj<cqhn> d;
    public final dzsj<btrm> e;
    public final dzsj<cebr> f;
    public final dzsj<btvo> g;

    public blgn(dzsj<blly> dzsjVar, dzsj<blnq> dzsjVar2, dzsj<cexu> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<btrm> dzsjVar5, dzsj<cebr> dzsjVar6, dzsj<btvo> dzsjVar7) {
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
