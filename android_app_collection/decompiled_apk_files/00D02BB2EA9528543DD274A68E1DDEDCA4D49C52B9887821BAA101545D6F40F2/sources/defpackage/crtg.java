package defpackage;
/* compiled from: PG */
/* renamed from: crtg  reason: default package */
/* loaded from: classes5.dex */
public final class crtg {
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
