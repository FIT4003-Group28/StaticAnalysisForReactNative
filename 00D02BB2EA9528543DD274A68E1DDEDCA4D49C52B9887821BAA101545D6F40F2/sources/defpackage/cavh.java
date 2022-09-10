package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cavh  reason: default package */
/* loaded from: classes4.dex */
final class cavh implements View.OnLayoutChangeListener {
    final /* synthetic */ cavi a;

    public cavh(cavi caviVar) {
        this.a = caviVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.a.c;
        int i9 = 0;
        int width = view2 != null ? view2.getWidth() : 0;
        View view3 = this.a.d;
        if (view3 != null) {
            i9 = view3.getWidth();
        }
        cavt cavtVar = this.a.b;
        if (cavtVar != null) {
            bzyx g = cavtVar.g();
            if (!g.a(width, i9).booleanValue()) {
                return;
            }
            cqkx.p(g);
        }
    }
}
