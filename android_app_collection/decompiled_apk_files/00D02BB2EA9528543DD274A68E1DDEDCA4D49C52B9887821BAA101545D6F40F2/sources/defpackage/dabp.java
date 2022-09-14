package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dabp  reason: default package */
/* loaded from: classes5.dex */
final class dabp extends Property<dabq, Float> {
    public dabp(Class cls) {
        super(cls, "indicatorTailChangeFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dabq dabqVar) {
        int i = dabq.l;
        return Float.valueOf(dabqVar.i);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dabq dabqVar, Float f) {
        dabqVar.n(f.floatValue());
    }
}
