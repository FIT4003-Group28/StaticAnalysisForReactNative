package defpackage;

import android.view.View;
/* compiled from: PG */
@Deprecated
/* renamed from: fkr  reason: default package */
/* loaded from: classes3.dex */
public final class fkr {
    private static final View.AccessibilityDelegate a = new fkq();

    public static void a(fkp fkpVar, View view, Object obj) {
        boolean z;
        view.getClass();
        obj.getClass();
        int i = 0;
        if (fkpVar.c.getCount() > 0) {
            view.setOnClickListener(fkpVar);
            view.setTag(obj);
            z = true;
        } else {
            z = false;
        }
        view.setAccessibilityDelegate(a);
        view.setClickable(z);
        view.setEnabled(z);
        view.setFocusable(z);
        if (true != z) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
