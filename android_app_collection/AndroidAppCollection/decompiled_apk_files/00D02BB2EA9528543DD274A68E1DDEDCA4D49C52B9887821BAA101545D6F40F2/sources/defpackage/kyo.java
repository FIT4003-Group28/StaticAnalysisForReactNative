package defpackage;
/* compiled from: PG */
/* renamed from: kyo  reason: default package */
/* loaded from: classes7.dex */
public final class kyo {
    public final dzsj<bvnx> a;
    public final dzsj<bvjj> b;
    public final dzsj<bnwn> c;
    public final dzsj<btrm> d;
    public final dzsj<jzp> e;

    public kyo(dzsj<bvnx> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<bnwn> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<jzp> dzsjVar5) {
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
