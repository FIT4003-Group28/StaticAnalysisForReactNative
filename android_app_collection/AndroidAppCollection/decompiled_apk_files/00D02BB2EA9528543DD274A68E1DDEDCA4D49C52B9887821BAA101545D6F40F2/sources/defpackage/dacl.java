package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dacl  reason: default package */
/* loaded from: classes5.dex */
final class dacl extends Property<dacn, Float> {
    public dacl(Class cls) {
        super(cls, "line2HeadFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dacn dacnVar) {
        int i = dacn.g;
        return Float.valueOf(dacnVar.c);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dacn dacnVar, Float f) {
        dacnVar.l(f.floatValue());
    }
}
