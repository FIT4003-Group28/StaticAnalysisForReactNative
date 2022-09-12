package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: axh  reason: default package */
/* loaded from: classes3.dex */
final class axh extends Property<View, PointF> {
    public axh(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ PointF get(View view) {
        return null;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, PointF pointF) {
        View view2 = view;
        PointF pointF2 = pointF;
        azf.d(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
    }
}
