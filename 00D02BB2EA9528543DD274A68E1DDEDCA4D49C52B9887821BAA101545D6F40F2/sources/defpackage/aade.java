package defpackage;
/* compiled from: PG */
/* renamed from: aade  reason: default package */
/* loaded from: classes2.dex */
public final class aade {
    public final dzsj<cqhn> a;
    public final dzsj<aabz> b;
    public final dzsj<brze> c;
    public final dzsj<aadk> d;

    public aade(dzsj<cqhn> dzsjVar, dzsj<aabz> dzsjVar2, dzsj<brze> dzsjVar3, dzsj<aadk> dzsjVar4) {
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
