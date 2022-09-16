package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: la  reason: default package */
/* loaded from: classes3.dex */
public class la {
    public static mb a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        mb q = mb.q(rootWindowInsets);
        q.v(q);
        q.t(view.getRootView());
        return q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }
}
