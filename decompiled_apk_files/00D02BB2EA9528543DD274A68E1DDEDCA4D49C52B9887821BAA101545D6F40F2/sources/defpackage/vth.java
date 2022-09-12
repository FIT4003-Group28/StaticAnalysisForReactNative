package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: vth  reason: default package */
/* loaded from: classes7.dex */
final class vth implements dbrn<Rect, Double> {
    final /* synthetic */ double a;

    public vth(double d) {
        this.a = d;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Double a(Rect rect) {
        Rect rect2 = rect;
        double width = rect2.width();
        double height = rect2.height();
        Double.isNaN(width);
        Double.isNaN(height);
        double d = width / height;
        double d2 = this.a;
        return Double.valueOf(d2 < d ? d2 / d : d / d2);
    }
}
