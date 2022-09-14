package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: advx  reason: default package */
/* loaded from: classes2.dex */
public final class advx {
    private final dzsj<adyo> a;

    public advx(dzsj<adyo> dzsjVar) {
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

    public final advw a(int i, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        adyo a = this.a.a();
        b(a, 1);
        b(onAttachStateChangeListener, 3);
        return new advw(a, i, onAttachStateChangeListener);
    }
}
