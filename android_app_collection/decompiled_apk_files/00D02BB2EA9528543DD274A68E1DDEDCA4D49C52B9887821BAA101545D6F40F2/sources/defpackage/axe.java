package defpackage;

import android.graphics.PointF;
import android.util.Property;
/* compiled from: PG */
/* renamed from: axe  reason: default package */
/* loaded from: classes3.dex */
final class axe extends Property<axl, PointF> {
    public axe(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ PointF get(axl axlVar) {
        return null;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(axl axlVar, PointF pointF) {
        axl axlVar2 = axlVar;
        PointF pointF2 = pointF;
        axlVar2.a = Math.round(pointF2.x);
        axlVar2.b = Math.round(pointF2.y);
        int i = axlVar2.e + 1;
        axlVar2.e = i;
        if (i == axlVar2.f) {
            axlVar2.a();
        }
    }
}
