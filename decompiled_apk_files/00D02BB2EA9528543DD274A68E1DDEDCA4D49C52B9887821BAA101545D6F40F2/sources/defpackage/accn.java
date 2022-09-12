package defpackage;
/* compiled from: PG */
/* renamed from: accn  reason: default package */
/* loaded from: classes2.dex */
public final class accn {
    public final dzsj<cqhn> a;
    public final dzsj<abwq> b;
    public final dzsj<cqhu> c;

    public accn(dzsj<cqhn> dzsjVar, dzsj<abwq> dzsjVar2, dzsj<cqhu> dzsjVar3) {
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
