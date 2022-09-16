package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dacg  reason: default package */
/* loaded from: classes5.dex */
final class dacg extends Property<dach, Float> {
    public dacg(Class cls) {
        super(cls, "lineConnectPoint2Fraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dach dachVar) {
        int i = dach.c;
        return Float.valueOf(dachVar.b);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dach dachVar, Float f) {
        dachVar.k(f.floatValue());
    }
}
