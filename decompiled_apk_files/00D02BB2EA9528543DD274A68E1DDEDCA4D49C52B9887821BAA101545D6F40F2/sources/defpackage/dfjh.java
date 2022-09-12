package defpackage;
/* compiled from: PG */
/* renamed from: dfjh  reason: default package */
/* loaded from: classes6.dex */
public final class dfjh {
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
