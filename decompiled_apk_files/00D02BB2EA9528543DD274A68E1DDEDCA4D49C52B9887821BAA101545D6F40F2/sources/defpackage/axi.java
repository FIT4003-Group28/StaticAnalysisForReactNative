package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: axi  reason: default package */
/* loaded from: classes3.dex */
final class axi extends Property<View, PointF> {
    public axi(Class cls) {
        super(cls, "position");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ PointF get(View view) {
        return null;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, PointF pointF) {
        View view2 = view;
        PointF pointF2 = pointF;
        int round = Math.round(pointF2.x);
        int round2 = Math.round(pointF2.y);
        azf.d(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
    }
}
