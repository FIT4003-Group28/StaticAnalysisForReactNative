package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dacm  reason: default package */
/* loaded from: classes5.dex */
final class dacm extends Property<dacn, Float> {
    public dacm(Class cls) {
        super(cls, "line2TailFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dacn dacnVar) {
        int i = dacn.g;
        return Float.valueOf(dacnVar.d);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dacn dacnVar, Float f) {
        dacnVar.m(f.floatValue());
    }
}
