package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bnz  reason: default package */
/* loaded from: classes2.dex */
class bnz extends adj {
    private static boolean a = true;

    @Override // defpackage.adj
    public float c(View view) {
        if (a) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    @Override // defpackage.adj
    public void e(View view, float f) {
        if (a) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }
}
