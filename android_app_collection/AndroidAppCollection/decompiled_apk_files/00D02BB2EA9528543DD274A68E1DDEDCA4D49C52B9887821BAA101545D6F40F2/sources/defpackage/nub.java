package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: nub  reason: default package */
/* loaded from: classes7.dex */
final class nub extends Property<View, Float> {
    public nub(Class cls) {
        super(cls, "alpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(View view) {
        return Float.valueOf(view.getAlpha());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, Float f) {
        view.setAlpha(f.floatValue());
    }
}
