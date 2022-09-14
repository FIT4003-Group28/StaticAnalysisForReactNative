package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: bqo  reason: default package */
/* loaded from: classes4.dex */
final class bqo extends Property<bqp, Float> {
    public bqo(Class cls) {
        super(cls, "animationRadiusMultiplier");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(bqp bqpVar) {
        int i = bqp.c;
        return Float.valueOf(bqpVar.b);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(bqp bqpVar, Float f) {
        bqp bqpVar2 = bqpVar;
        float floatValue = f.floatValue();
        int i = bqp.c;
        bqpVar2.b = floatValue;
        bqpVar2.a = true;
    }
}
