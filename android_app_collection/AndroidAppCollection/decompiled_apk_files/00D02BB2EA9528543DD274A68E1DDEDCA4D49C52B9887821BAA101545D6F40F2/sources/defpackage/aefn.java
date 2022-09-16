package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aefn  reason: default package */
/* loaded from: classes2.dex */
public final class aefn {
    public static final aefm a(Context context, float f, aefl aeflVar) {
        b(context, 1);
        b(aeflVar, 3);
        return new aefm(context, f, aeflVar);
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
