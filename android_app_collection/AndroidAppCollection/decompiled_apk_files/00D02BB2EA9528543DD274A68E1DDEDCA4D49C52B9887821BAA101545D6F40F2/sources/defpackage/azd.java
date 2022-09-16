package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: azd  reason: default package */
/* loaded from: classes3.dex */
final class azd extends Property<View, Float> {
    public azd(Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(View view) {
        return Float.valueOf(azf.b(view));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, Float f) {
        azf.a(view, f.floatValue());
    }
}
