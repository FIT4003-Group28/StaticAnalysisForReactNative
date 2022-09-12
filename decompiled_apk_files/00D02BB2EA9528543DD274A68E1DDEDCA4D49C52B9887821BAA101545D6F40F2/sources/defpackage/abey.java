package defpackage;
/* compiled from: PG */
/* renamed from: abey  reason: default package */
/* loaded from: classes2.dex */
public final class abey {
    public final dzsj<abvu> a;

    public abey(dzsj<abvu> dzsjVar) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
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
