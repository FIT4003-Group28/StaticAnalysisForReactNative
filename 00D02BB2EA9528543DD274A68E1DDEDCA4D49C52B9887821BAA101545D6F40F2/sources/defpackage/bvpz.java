package defpackage;
/* compiled from: PG */
/* renamed from: bvpz  reason: default package */
/* loaded from: classes.dex */
public final class bvpz {
    public final dzsj<cqat> a;

    public bvpz(dzsj<cqat> dzsjVar) {
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

    public final bvpy a(dehq dehqVar, Runnable runnable) {
        cqat a = this.a.a();
        b(a, 1);
        b(dehqVar, 2);
        b(runnable, 3);
        return new bvpy(a, dehqVar, runnable, 0L);
    }
}
