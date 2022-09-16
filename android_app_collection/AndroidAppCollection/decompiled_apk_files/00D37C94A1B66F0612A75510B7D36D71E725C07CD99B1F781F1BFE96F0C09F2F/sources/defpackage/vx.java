package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: vx  reason: default package */
/* loaded from: classes4.dex */
final class vx extends ne {
    final /* synthetic */ wa a;

    public vx(wa waVar) {
        this.a = waVar;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        wa waVar = this.a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = waVar.l.computeVerticalScrollRange();
        int i3 = waVar.k;
        waVar.m = computeVerticalScrollRange - i3 > 0 && i3 >= waVar.a;
        int computeHorizontalScrollRange = waVar.l.computeHorizontalScrollRange();
        int i4 = waVar.j;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= waVar.a;
        waVar.n = z;
        if (waVar.m) {
            float f = i3;
            waVar.e = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
            waVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z) {
            if (waVar.o == 0) {
                return;
            }
            waVar.i(0);
            return;
        }
        if (waVar.n) {
            float f2 = i4;
            waVar.h = (int) ((f2 * (computeHorizontalScrollOffset + (f2 / 2.0f))) / computeHorizontalScrollRange);
            waVar.g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = waVar.o;
        if (i5 == 0 || i5 == 1) {
            waVar.i(1);
        }
    }
}
