package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dabo  reason: default package */
/* loaded from: classes5.dex */
final class dabo extends Property<dabq, Float> {
    public dabo(Class cls) {
        super(cls, "indicatorHeadChangeFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dabq dabqVar) {
        int i = dabq.l;
        return Float.valueOf(dabqVar.h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dabq dabqVar, Float f) {
        dabqVar.m(f.floatValue());
    }
}
