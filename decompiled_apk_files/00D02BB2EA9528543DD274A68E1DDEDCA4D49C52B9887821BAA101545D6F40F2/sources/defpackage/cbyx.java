package defpackage;
/* compiled from: PG */
/* renamed from: cbyx  reason: default package */
/* loaded from: classes4.dex */
public class cbyx {
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
