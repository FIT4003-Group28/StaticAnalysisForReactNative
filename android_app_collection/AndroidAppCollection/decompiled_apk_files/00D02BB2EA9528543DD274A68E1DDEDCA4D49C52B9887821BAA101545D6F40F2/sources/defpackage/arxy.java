package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: arxy  reason: default package */
/* loaded from: classes2.dex */
public final class arxy {
    private final dzsj<Context> a;

    public arxy(dzsj<Context> dzsjVar) {
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

    public final arxx a(cqkn<aryj> cqknVar, String str, @dzsi CharSequence charSequence, boolean z, aryb arybVar) {
        Context a = this.a.a();
        b(a, 1);
        b(cqknVar, 2);
        b(str, 3);
        b(arybVar, 6);
        return new arxx(a, cqknVar, str, charSequence, z, arybVar);
    }
}
