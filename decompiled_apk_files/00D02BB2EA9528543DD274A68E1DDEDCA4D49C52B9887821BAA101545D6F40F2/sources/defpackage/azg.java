package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: azg  reason: default package */
/* loaded from: classes3.dex */
class azg extends azl {
    private static boolean a = true;

    @Override // defpackage.azl
    public void a(View view, float f) {
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

    @Override // defpackage.azl
    public float b(View view) {
        if (a) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    @Override // defpackage.azl
    public final void c() {
    }

    @Override // defpackage.azl
    public final void d() {
    }
}
