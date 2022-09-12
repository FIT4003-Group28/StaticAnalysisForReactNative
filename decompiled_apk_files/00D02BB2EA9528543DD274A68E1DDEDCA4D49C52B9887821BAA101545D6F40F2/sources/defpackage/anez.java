package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: anez  reason: default package */
/* loaded from: classes2.dex */
public class anez implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((jdp) view).setCalloutPosition(view.getWidth() / 2);
    }
}
