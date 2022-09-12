package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dabw  reason: default package */
/* loaded from: classes5.dex */
final class dabw extends Property<dabx, Float> {
    public dabw(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dabx dabxVar) {
        return Float.valueOf(dabxVar.f());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dabx dabxVar, Float f) {
        dabxVar.g(f.floatValue());
    }
}
