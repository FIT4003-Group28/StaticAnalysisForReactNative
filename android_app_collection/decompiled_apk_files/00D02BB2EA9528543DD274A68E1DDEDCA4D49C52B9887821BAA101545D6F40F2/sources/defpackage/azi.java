package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: azi  reason: default package */
/* loaded from: classes3.dex */
class azi extends azh {
    private static boolean a = true;

    @Override // defpackage.azl
    public void g(View view, int i, int i2, int i3, int i4) {
        if (a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
