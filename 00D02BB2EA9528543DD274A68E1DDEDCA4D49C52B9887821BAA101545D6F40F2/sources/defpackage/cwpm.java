package defpackage;

import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwpm  reason: default package */
/* loaded from: classes5.dex */
public final class cwpm extends Property<ExpandableDialogView, Integer> {
    public cwpm(Class cls) {
        super(cls, "scrollOffset");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Integer get(ExpandableDialogView expandableDialogView) {
        int i = ExpandableDialogView.j;
        return Integer.valueOf(expandableDialogView.h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(ExpandableDialogView expandableDialogView, Integer num) {
        int intValue = num.intValue();
        int i = ExpandableDialogView.j;
        expandableDialogView.g(intValue);
    }
}
