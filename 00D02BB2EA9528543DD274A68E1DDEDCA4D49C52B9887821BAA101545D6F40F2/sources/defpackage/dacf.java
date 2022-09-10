package defpackage;

import android.util.Property;
/* compiled from: PG */
/* renamed from: dacf  reason: default package */
/* loaded from: classes5.dex */
final class dacf extends Property<dach, Float> {
    public dacf(Class cls) {
        super(cls, "lineConnectPoint1Fraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(dach dachVar) {
        int i = dach.c;
        return Float.valueOf(dachVar.a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(dach dachVar, Float f) {
        dachVar.j(f.floatValue());
    }
}
