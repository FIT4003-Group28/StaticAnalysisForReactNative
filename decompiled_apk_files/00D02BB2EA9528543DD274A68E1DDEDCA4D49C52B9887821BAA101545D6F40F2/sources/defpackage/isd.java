package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: isd  reason: default package */
/* loaded from: classes6.dex */
public class isd {
    private final dzsj<cjqy> a;
    private final dzsj<bvjj> b;

    public isd(dzsj<cjqy> dzsjVar, dzsj<bvjj> dzsjVar2) {
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

    public final isc a(View view) {
        b(view, 1);
        cjqy a = this.a.a();
        b(a, 2);
        b(this.b.a(), 3);
        return new isc(view, a);
    }
}
