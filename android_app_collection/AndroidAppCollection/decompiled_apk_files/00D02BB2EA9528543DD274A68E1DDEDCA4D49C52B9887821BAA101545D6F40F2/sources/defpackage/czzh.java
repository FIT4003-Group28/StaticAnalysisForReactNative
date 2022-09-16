package defpackage;

import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: czzh  reason: default package */
/* loaded from: classes5.dex */
public final class czzh extends Property<View, Float> {
    public czzh(Class cls) {
        super(cls, "height");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(View view) {
        return Float.valueOf(view.getLayoutParams().height);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(View view, Float f) {
        View view2 = view;
        view2.getLayoutParams().height = f.intValue();
        view2.requestLayout();
    }
}
