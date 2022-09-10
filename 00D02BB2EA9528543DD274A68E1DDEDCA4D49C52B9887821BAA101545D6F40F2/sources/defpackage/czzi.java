package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: czzi  reason: default package */
/* loaded from: classes5.dex */
public final class czzi extends Property<View, Float> {
    public czzi(Class cls) {
        super(cls, "paddingStart");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(View view) {
        return Float.valueOf(od.w(view));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, Float f) {
        View view2 = view;
        od.y(view2, f.intValue(), view2.getPaddingTop(), od.x(view2), view2.getPaddingBottom());
    }
}
