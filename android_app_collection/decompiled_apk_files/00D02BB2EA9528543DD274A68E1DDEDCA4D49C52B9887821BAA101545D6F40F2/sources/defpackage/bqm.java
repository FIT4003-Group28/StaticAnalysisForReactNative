package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: bqm  reason: default package */
/* loaded from: classes4.dex */
final class bqm extends Property<bqn, Float> {
    public bqm(Class cls) {
        super(cls, "animationRadiusMultiplier");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(bqn bqnVar) {
        int i = bqn.b;
        return Float.valueOf(bqnVar.a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(bqn bqnVar, Float f) {
        float floatValue = f.floatValue();
        int i = bqn.b;
        bqnVar.a = floatValue;
    }
}
