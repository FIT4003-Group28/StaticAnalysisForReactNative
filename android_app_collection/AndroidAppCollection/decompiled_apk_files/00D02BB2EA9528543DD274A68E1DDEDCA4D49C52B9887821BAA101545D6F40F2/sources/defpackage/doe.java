package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: doe  reason: default package */
/* loaded from: classes6.dex */
final class doe {
    public static boolean a(int i) {
        return i != 17170445;
    }

    public static void b(int i, View view) {
        if (!a(i)) {
            return;
        }
        view.setBackgroundColor(view.getResources().getColor(i));
    }

    public static void c(int i, View view, View view2) {
        b(i, view);
        int i2 = 0;
        view.setVisibility(true != a(i) ? 8 : 0);
        if (true == a(i)) {
            i2 = 4;
        }
        view2.setVisibility(i2);
        view.setAlpha(1.0f);
        view2.setTranslationY(0.0f);
    }
}
