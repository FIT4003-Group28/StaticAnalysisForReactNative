package defpackage;
/* compiled from: PG */
/* renamed from: lsq  reason: default package */
/* loaded from: classes7.dex */
public final class lsq {
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