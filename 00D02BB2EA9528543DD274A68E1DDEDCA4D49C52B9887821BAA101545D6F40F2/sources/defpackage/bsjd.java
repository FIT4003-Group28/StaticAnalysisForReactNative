package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bsjd  reason: default package */
/* loaded from: classes4.dex */
public final class bsjd {
    public final dzsj<Resources> a;
    public final dzsj<cqhn> b;

    public bsjd(dzsj<Resources> dzsjVar, dzsj<cqhn> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bsjc a() {
        Resources a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        return new bsjc(a, a2);
    }
}
