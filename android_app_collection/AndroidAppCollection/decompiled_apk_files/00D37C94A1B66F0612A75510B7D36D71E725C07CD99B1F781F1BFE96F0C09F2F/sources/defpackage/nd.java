package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.StrictMode;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.PopupWindow;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: nd  reason: default package */
/* loaded from: classes3.dex */
public class nd {
    public static String f(Locale locale, String str, Object... objArr) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return aw.a(locale, str, objArr);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static void jB(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }

    public static String jC(Context context, int i, Object... objArr) {
        return f(Locale.getDefault(), context.getResources().getString(i), objArr);
    }

    public void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        ((xx) view.getLayoutParams()).qa();
        rect.set(0, 0, 0, 0);
    }

    public void c(Canvas canvas, RecyclerView recyclerView) {
    }

    public void d(Canvas canvas, RecyclerView recyclerView) {
    }
}
