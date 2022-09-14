package defpackage;

import android.os.Build;
import android.view.View;
/* compiled from: PG */
/* renamed from: azj  reason: default package */
/* loaded from: classes3.dex */
class azj extends azi {
    private static boolean a = true;

    @Override // defpackage.azl
    public void h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i);
        } else if (!a) {
        } else {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
