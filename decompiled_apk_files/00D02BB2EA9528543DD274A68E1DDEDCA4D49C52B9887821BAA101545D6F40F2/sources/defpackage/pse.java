package defpackage;
/* compiled from: PG */
/* renamed from: pse  reason: default package */
/* loaded from: classes7.dex */
public final class pse {
    public final dzsj<ptc> a;
    public final dzsj<vwv> b;
    public final dzsj<vwo> c;

    public pse(dzsj<ptc> dzsjVar, dzsj<vwv> dzsjVar2, dzsj<vwo> dzsjVar3) {
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
