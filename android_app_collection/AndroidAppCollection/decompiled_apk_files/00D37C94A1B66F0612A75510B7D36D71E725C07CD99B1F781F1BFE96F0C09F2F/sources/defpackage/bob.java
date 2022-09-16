package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bob  reason: default package */
/* loaded from: classes2.dex */
class bob extends boa {
    private static boolean a = true;

    @Override // defpackage.adj
    public void d(View view, int i, int i2, int i3, int i4) {
        if (a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
