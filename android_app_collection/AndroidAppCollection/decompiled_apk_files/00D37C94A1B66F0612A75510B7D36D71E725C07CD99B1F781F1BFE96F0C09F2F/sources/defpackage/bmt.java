package defpackage;

import android.graphics.PointF;
import android.util.Property;
/* compiled from: PG */
/* renamed from: bmt  reason: default package */
/* loaded from: classes2.dex */
final class bmt extends Property {
    public bmt(Class cls) {
        super(cls, "topLeft");
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
        bnaVar.a = Math.round(pointF.x);
        bnaVar.b = Math.round(pointF.y);
        int i = bnaVar.e + 1;
        bnaVar.e = i;
        if (i == bnaVar.f) {
            bnaVar.a();
        }
    }
}
