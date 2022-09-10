package defpackage;
/* compiled from: PG */
/* renamed from: swh  reason: default package */
/* loaded from: classes7.dex */
public final class swh {
    public final dzsj<tmi> a;
    public final dzsj<swp> b;
    public final dzsj<cqhn> c;
    public final dzsj<cqhu> d;
    public final dzsj<suq> e;

    public swh(dzsj<tmi> dzsjVar, dzsj<swp> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<cqhu> dzsjVar4, dzsj<suq> dzsjVar5) {
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
