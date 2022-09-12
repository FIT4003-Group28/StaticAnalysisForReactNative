package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxvu  reason: default package */
/* loaded from: classes5.dex */
public final class cxvu implements View.OnLayoutChangeListener {
    final /* synthetic */ cxwe a;

    public cxvu(cxwe cxweVar) {
        this.a = cxweVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i8 - i6;
        if (view.getHeight() == i9 || i9 == 0) {
            return;
        }
        this.a.g.c.scrollBy(0, view.getHeight() - i9);
    }
}
