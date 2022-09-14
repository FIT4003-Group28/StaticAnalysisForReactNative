package defpackage;
/* compiled from: PG */
/* renamed from: cirk  reason: default package */
/* loaded from: classes4.dex */
public final class cirk {
    public static final cirj a(chrx chrxVar, int i, boolean z, Runnable runnable) {
        b(chrxVar, 1);
        b(runnable, 4);
        return new cirj(chrxVar, i, z, runnable);
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
}
