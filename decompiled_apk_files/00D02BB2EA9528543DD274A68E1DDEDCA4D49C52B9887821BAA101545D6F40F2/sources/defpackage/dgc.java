package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: dgc  reason: default package */
/* loaded from: classes6.dex */
public final class dgc {
    private final dzsj<dehq> a;

    public dgc(dzsj<dehq> dzsjVar) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final dgb a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        dehq a = this.a.a();
        c(a, 1);
        c(viewGroup, 2);
        c(viewGroup2, 3);
        return new dgb(a, viewGroup, viewGroup2, dfy.e);
    }

    public final dgb b(ViewGroup viewGroup, ViewGroup viewGroup2, dfy dfyVar) {
        dehq a = this.a.a();
        c(a, 1);
        c(viewGroup, 2);
        c(viewGroup2, 3);
        c(dfyVar, 4);
        return new dgb(a, viewGroup, viewGroup2, dfyVar);
    }
}
