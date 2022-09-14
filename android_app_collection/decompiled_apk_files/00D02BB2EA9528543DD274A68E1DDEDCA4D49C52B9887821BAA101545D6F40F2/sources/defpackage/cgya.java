package defpackage;
/* compiled from: PG */
/* renamed from: cgya  reason: default package */
/* loaded from: classes4.dex */
public final class cgya {
    public final dzsj<bbut> a;
    public final dzsj<bbtk> b;
    public final dzsj<cgum> c;

    public cgya(dzsj<bbut> dzsjVar, dzsj<bbtk> dzsjVar2, dzsj<cgum> dzsjVar3) {
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
