package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: czxm  reason: default package */
/* loaded from: classes5.dex */
final class czxm extends abp {
    final /* synthetic */ czxs a;
    private final Calendar b = czyn.b();
    private final Calendar c = czyn.b();

    public czxm(czxs czxsVar) {
        this.a = czxsVar;
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int width;
        abg abgVar = recyclerView.k;
        if (abgVar instanceof czyq) {
            abs absVar = recyclerView.l;
            if (!(absVar instanceof zy)) {
                return;
            }
            czyq czyqVar = (czyq) abgVar;
            zy zyVar = (zy) absVar;
            for (mx<Long, Long> mxVar : this.a.a.d()) {
                Long l = mxVar.a;
                if (l != null && mxVar.b != null) {
                    this.b.setTimeInMillis(l.longValue());
                    this.c.setTimeInMillis(mxVar.b.longValue());
                    int a = czyqVar.a(this.b.get(1));
                    int a2 = czyqVar.a(this.c.get(1));
                    View I = zyVar.I(a);
                    View I2 = zyVar.I(a2);
                    int i = zyVar.b;
                    int i2 = a / i;
                    int i3 = a2 / i;
                    int i4 = i2;
                    while (i4 <= i3) {
                        View I3 = zyVar.I(zyVar.b * i4);
                        if (I3 != null) {
                            int top = I3.getTop() + this.a.d.d.c();
                            int bottom = I3.getBottom() - this.a.d.d.d();
                            int left = i4 == i2 ? I.getLeft() + (I.getWidth() / 2) : 0;
                            if (i4 == i3) {
                                width = I2.getLeft() + (I2.getWidth() / 2);
                            } else {
                                width = recyclerView.getWidth();
                            }
                            canvas.drawRect(left, top, width, bottom, this.a.d.h);
                        }
                        i4++;
                    }
                }
            }
        }
    }
}
