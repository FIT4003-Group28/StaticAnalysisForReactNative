package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: btjr  reason: default package */
/* loaded from: classes4.dex */
public final class btjr {
    private final dzsj<Context> a;
    private final dzsj<btrm> b;

    public btjr(dzsj<Context> dzsjVar, dzsj<btrm> dzsjVar2) {
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

    public final btjq a(int i, dcdc<btjs> dcdcVar) {
        Context a = this.a.a();
        b(a, 1);
        btrm a2 = this.b.a();
        b(a2, 2);
        b(dcdcVar, 4);
        return new btjq(a, a2, i, dcdcVar);
    }
}
