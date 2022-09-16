package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: czzg  reason: default package */
/* loaded from: classes5.dex */
public final class czzg extends Property<View, Float> {
    public czzg(Class cls) {
        super(cls, "width");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(View view) {
        return Float.valueOf(view.getLayoutParams().width);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, Float f) {
        View view2 = view;
        view2.getLayoutParams().width = f.intValue();
        view2.requestLayout();
    }
}
