package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;
/* compiled from: PG */
/* renamed from: aek  reason: default package */
/* loaded from: classes2.dex */
public final class aek extends Property<SwitchCompat, Float> {
    public aek(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(SwitchCompat switchCompat) {
        return Float.valueOf(switchCompat.a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(SwitchCompat switchCompat, Float f) {
        switchCompat.a(f.floatValue());
    }
}
