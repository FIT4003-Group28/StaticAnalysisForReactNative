package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: zj  reason: default package */
/* loaded from: classes7.dex */
final class zj extends abx {
    final /* synthetic */ zm a;

    public zj(zm zmVar) {
        this.a = zmVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        zm zmVar = this.a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = zmVar.l.computeVerticalScrollRange();
        int i3 = zmVar.k;
        zmVar.m = computeVerticalScrollRange - i3 > 0 && i3 >= zmVar.a;
        int computeHorizontalScrollRange = zmVar.l.computeHorizontalScrollRange();
        int i4 = zmVar.j;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= zmVar.a;
        zmVar.n = z;
        if (zmVar.m) {
            float f = i3;
            zmVar.e = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
            zmVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z) {
            if (zmVar.o == 0) {
                return;
            }
            zmVar.d(0);
            return;
        }
        if (zmVar.n) {
            float f2 = i4;
            zmVar.h = (int) ((f2 * (computeHorizontalScrollOffset + (f2 / 2.0f))) / computeHorizontalScrollRange);
            zmVar.g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = zmVar.o;
        if (i5 == 0 || i5 == 1) {
            zmVar.d(1);
        }
    }
}
