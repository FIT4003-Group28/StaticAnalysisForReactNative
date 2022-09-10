package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dabn  reason: default package */
/* loaded from: classes5.dex */
final class dabn extends Property<dabq, Float> {
    public dabn(Class cls) {
        super(cls, "indicatorInCycleOffset");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dabq dabqVar) {
        int i = dabq.l;
        return Float.valueOf(dabqVar.g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dabq dabqVar, Float f) {
        dabq dabqVar2 = dabqVar;
        dabqVar2.g = f.floatValue();
        dabqVar2.j();
        dabqVar2.m.invalidateSelf();
    }
}
