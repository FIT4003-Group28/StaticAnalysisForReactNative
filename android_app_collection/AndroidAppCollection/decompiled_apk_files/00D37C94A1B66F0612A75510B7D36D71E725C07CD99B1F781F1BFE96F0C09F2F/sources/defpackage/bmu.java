package defpackage;

import android.graphics.PointF;
import android.util.Property;
/* compiled from: PG */
/* renamed from: bmu  reason: default package */
/* loaded from: classes2.dex */
final class bmu extends Property {
    public bmu(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        bna bnaVar = (bna) obj;
        return null;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        bna bnaVar = (bna) obj;
        PointF pointF = (PointF) obj2;
        bnaVar.c = Math.round(pointF.x);
        bnaVar.d = Math.round(pointF.y);
        int i = bnaVar.f + 1;
        bnaVar.f = i;
        if (bnaVar.e == i) {
            bnaVar.a();
        }
    }
}
