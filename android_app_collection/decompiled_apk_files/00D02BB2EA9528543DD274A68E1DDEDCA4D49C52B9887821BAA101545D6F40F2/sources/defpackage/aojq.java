package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aojq  reason: default package */
/* loaded from: classes2.dex */
public final class aojq implements Serializable {
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
