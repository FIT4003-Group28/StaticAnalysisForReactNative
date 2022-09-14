package defpackage;
/* compiled from: PG */
/* renamed from: lml  reason: default package */
/* loaded from: classes7.dex */
public final class lml {
    public final dzsj<cjqy> a;
    public final dzsj<cjqq> b;
    public final dzsj<lmr> c;

    public lml(dzsj<cjqy> dzsjVar, dzsj<cjqq> dzsjVar2, dzsj<lmr> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
