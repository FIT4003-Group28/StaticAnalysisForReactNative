package defpackage;
/* compiled from: PG */
/* renamed from: kqj  reason: default package */
/* loaded from: classes7.dex */
public final class kqj {
    public final dzsj<cjqy> a;
    public final dzsj<ckcw> b;
    public final dzsj<cjqq> c;
    public final dzsj<cqat> d;

    public kqj(dzsj<cjqy> dzsjVar, dzsj<ckcw> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<cqat> dzsjVar4) {
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
