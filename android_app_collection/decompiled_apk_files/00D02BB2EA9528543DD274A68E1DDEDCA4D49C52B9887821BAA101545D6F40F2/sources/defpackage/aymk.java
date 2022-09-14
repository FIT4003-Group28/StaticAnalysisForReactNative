package defpackage;
/* compiled from: PG */
/* renamed from: aymk  reason: default package */
/* loaded from: classes3.dex */
public final class aymk {
    public final dzsj<gcg> a;

    public aymk(dzsj<gcg> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final aymj a(String str, drcs drcsVar, int i) {
        b(str, 1);
        b(drcsVar, 2);
        gcg a = this.a.a();
        b(a, 4);
        return new aymj(str, drcsVar, i, a);
    }
}
