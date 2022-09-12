package defpackage;
/* compiled from: PG */
/* renamed from: mrm  reason: default package */
/* loaded from: classes7.dex */
public final class mrm {
    public final dzsj<cqhn> a;
    public final dzsj<mtq> b;
    public final dzsj<cjqy> c;
    public final dzsj<cjqq> d;
    public final dzsj<mtd> e;

    public mrm(dzsj<cqhn> dzsjVar, dzsj<mtq> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<cjqq> dzsjVar4, dzsj<mtd> dzsjVar5) {
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
