package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfja  reason: default package */
/* loaded from: classes6.dex */
public final class dfja {
    public static final dfiz a(long j, Executor executor, dfkg dfkgVar) {
        b(executor, 2);
        b(dfkgVar, 3);
        return new dfiz(j, executor, dfkgVar);
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
