package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dack  reason: default package */
/* loaded from: classes5.dex */
final class dack extends Property<dacn, Float> {
    public dack(Class cls) {
        super(cls, "line1TailFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dacn dacnVar) {
        int i = dacn.g;
        return Float.valueOf(dacnVar.b);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dacn dacnVar, Float f) {
        dacnVar.k(f.floatValue());
    }
}
