package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mgb  reason: default package */
/* loaded from: classes3.dex */
public final class mgb implements View.OnLayoutChangeListener {
    final /* synthetic */ mgk a;
    private final /* synthetic */ int b;

    public mgb(mgk mgkVar) {
        this.a = mgkVar;
    }

    public /* synthetic */ mgb(mgk mgkVar, int i) {
        this.b = i;
        this.a = mgkVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.b == 0) {
            this.a.s.removeOnLayoutChangeListener(this);
            mgk mgkVar = this.a;
            boolean z = true;
            if (lj.e(mgkVar.s) != 1) {
                z = false;
            }
            mgkVar.m(z);
            return;
        }
        this.a.h();
    }
}
