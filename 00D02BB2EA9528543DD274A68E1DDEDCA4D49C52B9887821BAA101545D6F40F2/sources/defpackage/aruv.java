package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
/* compiled from: PG */
/* renamed from: aruv  reason: default package */
/* loaded from: classes2.dex */
public class aruv {
    private final dzsj<Context> a;
    private final dzsj<ckcw> b;

    public aruv(dzsj<Context> dzsjVar, dzsj<ckcw> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final aruu a(ResolveInfo resolveInfo) {
        Context a = this.a.a();
        b(a, 1);
        ckcw a2 = this.b.a();
        b(a2, 2);
        b(resolveInfo, 3);
        return new aruu(a, a2, resolveInfo);
    }
}
