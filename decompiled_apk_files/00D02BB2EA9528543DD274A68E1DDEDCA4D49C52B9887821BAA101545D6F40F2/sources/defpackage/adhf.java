package defpackage;
/* compiled from: PG */
/* renamed from: adhf  reason: default package */
/* loaded from: classes.dex */
public final class adhf {
    public final dzsj<cqhn> a;
    public final dzsj<abud> b;
    public final dzsj<acwt> c;
    public final dzsj<abfc> d;

    public adhf(dzsj<cqhn> dzsjVar, dzsj<abud> dzsjVar2, dzsj<acwt> dzsjVar3, dzsj<abfc> dzsjVar4) {
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
