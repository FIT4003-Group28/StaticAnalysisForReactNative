package defpackage;
/* compiled from: PG */
/* renamed from: cbcz  reason: default package */
/* loaded from: classes4.dex */
public final class cbcz {
    public final dzsj<ixq> a;
    public final dzsj<gga> b;
    public final dzsj<btrm> c;
    public final dzsj<bwqv> d;

    public cbcz(dzsj<ixq> dzsjVar, dzsj<gga> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<bwqv> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
