package defpackage;

import android.os.Build;
import android.view.View;
/* compiled from: PG */
/* renamed from: boc  reason: default package */
/* loaded from: classes2.dex */
class boc extends bob {
    private static boolean a = true;

    @Override // defpackage.adj
    public void f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i);
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
