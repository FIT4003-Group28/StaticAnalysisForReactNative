package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bgpx  reason: default package */
/* loaded from: classes3.dex */
public final class bgpx {
    private final dzsj<cqhu> a;

    public bgpx(dzsj<cqhu> dzsjVar) {
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

    public final bgpw a(fd fdVar, @dzsi View view, View view2, cqjg cqjgVar) {
        b(this.a.a(), 1);
        b(fdVar, 2);
        b(view2, 4);
        b(cqjgVar, 5);
        return new bgpw(fdVar, view, view2, cqjgVar);
    }
}
