package defpackage;
/* compiled from: PG */
/* renamed from: lma  reason: default package */
/* loaded from: classes7.dex */
public final class lma {
    public final dzsj<lmf> a;
    public final dzsj<cqat> b;
    public final dzsj<btrm> c;
    public final dzsj<cjqy> d;
    public final dzsj<cjqq> e;

    public lma(dzsj<lmf> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<cjqq> dzsjVar5) {
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
