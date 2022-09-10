package defpackage;
/* compiled from: PG */
/* renamed from: ahix  reason: default package */
/* loaded from: classes2.dex */
public final class ahix {
    public final dzsj<ahbd> a;
    public final dzsj<ahas> b;
    public final dzsj<ahht> c;

    public ahix(dzsj<ahbd> dzsjVar, dzsj<ahas> dzsjVar2, dzsj<ahht> dzsjVar3) {
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
