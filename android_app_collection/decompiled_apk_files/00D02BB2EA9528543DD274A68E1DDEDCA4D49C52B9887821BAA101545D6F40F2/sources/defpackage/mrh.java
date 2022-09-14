package defpackage;
/* compiled from: PG */
/* renamed from: mrh  reason: default package */
/* loaded from: classes7.dex */
public final class mrh {
    public final dzsj<cqat> a;
    public final dzsj<cjqy> b;
    public final dzsj<cjqq> c;
    public final dzsj<mti> d;

    public mrh(dzsj<cqat> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<mti> dzsjVar4) {
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
