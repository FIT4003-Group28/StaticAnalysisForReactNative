package defpackage;

import android.content.Context;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: jdj  reason: default package */
/* loaded from: classes7.dex */
public class jdj {
    public static final jdi a(Context context, jdo jdoVar, @dzsi PopupWindow.OnDismissListener onDismissListener) {
        b(context, 1);
        b(jdoVar, 2);
        return new jdi(context, jdoVar, onDismissListener);
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
