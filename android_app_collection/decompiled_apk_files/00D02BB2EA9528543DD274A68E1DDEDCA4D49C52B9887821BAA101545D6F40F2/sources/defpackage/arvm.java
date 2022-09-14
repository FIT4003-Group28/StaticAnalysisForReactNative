package defpackage;

import android.content.pm.ResolveInfo;
/* compiled from: PG */
/* renamed from: arvm  reason: default package */
/* loaded from: classes2.dex */
public final class arvm {
    private final dzsj<aruq> a;
    private final dzsj<arvi> b;

    public arvm(dzsj<aruq> dzsjVar, dzsj<arvi> dzsjVar2) {
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

    public final aruw a(arun arunVar, cqkn<aryd> cqknVar, ResolveInfo resolveInfo) {
        aruq a = this.a.a();
        b(a, 1);
        arvi a2 = this.b.a();
        b(a2, 2);
        b(arunVar, 3);
        b(cqknVar, 4);
        b(resolveInfo, 5);
        return new aruw(a, a2, arunVar, cqknVar, resolveInfo);
    }
}
