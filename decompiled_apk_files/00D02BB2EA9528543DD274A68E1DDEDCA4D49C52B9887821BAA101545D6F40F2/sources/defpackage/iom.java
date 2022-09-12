package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: iom  reason: default package */
/* loaded from: classes6.dex */
final class iom implements View.OnLayoutChangeListener {
    final /* synthetic */ Runnable a;

    public iom(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.a.run();
    }
}
