package defpackage;

import android.text.Layout;
import android.view.View;
/* compiled from: PG */
/* renamed from: mpi  reason: default package */
/* loaded from: classes3.dex */
final class mpi implements View.OnLayoutChangeListener {
    final /* synthetic */ mpk a;

    public mpi(mpk mpkVar) {
        this.a = mpkVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Layout layout;
        if (((View) view.getParent()) != null && this.a.a.getVisibility() == 0 && (layout = this.a.a.getLayout()) != null && layout.getLineCount() > 0 && layout.getEllipsisCount(0) > 0) {
            this.a.a.setVisibility(8);
        }
    }
}
