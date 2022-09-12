package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: nol  reason: default package */
/* loaded from: classes7.dex */
public final class nol {
    public static boolean a(View view, int i, Rect rect) {
        bvrj.UI_THREAD.c();
        boolean requestFocus = view.requestFocus(i, rect);
        view.getId();
        return requestFocus;
    }

    public static void b(View view) {
        bvrj.UI_THREAD.c();
        view.requestFocus();
        view.getId();
    }
}
