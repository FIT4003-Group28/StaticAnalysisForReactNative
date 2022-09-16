package defpackage;

import android.graphics.PointF;
import android.util.Property;
/* compiled from: PG */
/* renamed from: axf  reason: default package */
/* loaded from: classes3.dex */
final class axf extends Property<axl, PointF> {
    public axf(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ PointF get(axl axlVar) {
        return null;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(axl axlVar, PointF pointF) {
        axl axlVar2 = axlVar;
        PointF pointF2 = pointF;
        axlVar2.c = Math.round(pointF2.x);
        axlVar2.d = Math.round(pointF2.y);
        int i = axlVar2.f + 1;
        axlVar2.f = i;
        if (axlVar2.e == i) {
            axlVar2.a();
        }
    }
}
