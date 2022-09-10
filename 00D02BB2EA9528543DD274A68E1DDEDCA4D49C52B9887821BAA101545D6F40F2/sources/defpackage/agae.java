package defpackage;
/* compiled from: PG */
/* renamed from: agae  reason: default package */
/* loaded from: classes2.dex */
public final class agae {
    public final dzsj<cqhn> a;
    public final dzsj<cqhu> b;
    public final dzsj<btrm> c;
    public final dzsj<agzo> d;
    public final dzsj<cqkj> e;

    public agae(dzsj<cqhn> dzsjVar, dzsj<cqhu> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<agzo> dzsjVar4, dzsj<cqkj> dzsjVar5) {
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
