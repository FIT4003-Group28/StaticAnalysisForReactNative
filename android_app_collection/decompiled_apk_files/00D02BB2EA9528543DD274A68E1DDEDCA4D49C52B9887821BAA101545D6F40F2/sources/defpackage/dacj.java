package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dacj  reason: default package */
/* loaded from: classes5.dex */
final class dacj extends Property<dacn, Float> {
    public dacj(Class cls) {
        super(cls, "line1HeadFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dacn dacnVar) {
        int i = dacn.g;
        return Float.valueOf(dacnVar.a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dacn dacnVar, Float f) {
        dacnVar.j(f.floatValue());
    }
}
