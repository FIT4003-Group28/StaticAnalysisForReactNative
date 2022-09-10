package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: czzj  reason: default package */
/* loaded from: classes5.dex */
public final class czzj extends Property<View, Float> {
    public czzj(Class cls) {
        super(cls, "paddingEnd");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(View view) {
        return Float.valueOf(od.x(view));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, Float f) {
        View view2 = view;
        od.y(view2, od.w(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
    }
}
