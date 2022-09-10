package defpackage;

import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwps  reason: default package */
/* loaded from: classes5.dex */
final class cwps extends Property<ExpandableDialogView, Float> {
    public cwps(Class cls) {
        super(cls, "elevationProgress");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Float get(ExpandableDialogView expandableDialogView) {
        return Float.valueOf(expandableDialogView.g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(ExpandableDialogView expandableDialogView, Float f) {
        ExpandableDialogView expandableDialogView2 = expandableDialogView;
        float floatValue = f.floatValue();
        expandableDialogView2.g = floatValue;
        float f2 = floatValue * expandableDialogView2.f;
        expandableDialogView2.e.aa(f2);
        od.F(expandableDialogView2.d, f2);
        expandableDialogView2.invalidate();
    }
}
