package defpackage;
/* compiled from: PG */
/* renamed from: bdrt  reason: default package */
/* loaded from: classes3.dex */
public final class bdrt {
    private final dzsj<bvrb> a;

    public bdrt(dzsj<bvrb> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bdrs a(int i, Runnable runnable) {
        b(runnable, 2);
        bvrb a = this.a.a();
        b(a, 3);
        return new bdrs(i, runnable, a);
    }
}
