package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: cwqb  reason: default package */
/* loaded from: classes5.dex */
final class cwqb extends Property<View, Float> {
    public cwqb(Class cls) {
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
