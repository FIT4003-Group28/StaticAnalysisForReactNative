package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.Window;
/* compiled from: PG */
/* renamed from: cdvo  reason: default package */
/* loaded from: classes4.dex */
public final class cdvo {
    public static final int a(Activity activity) {
        Rect rect = new Rect();
        Window window = activity.getWindow();
        dzvx.b(window, "activity.window");
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.bottom;
    }
}
