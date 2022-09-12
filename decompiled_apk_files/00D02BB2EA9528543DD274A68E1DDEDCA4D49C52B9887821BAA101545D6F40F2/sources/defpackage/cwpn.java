package defpackage;

import android.graphics.RectF;
import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwpn  reason: default package */
/* loaded from: classes5.dex */
public final class cwpn extends Property<ExpandableDialogView, RectF> {
    public cwpn(Class cls) {
        super(cls, "animatedBackgroundRect");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ RectF get(ExpandableDialogView expandableDialogView) {
        int i = ExpandableDialogView.j;
        return expandableDialogView.c;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(ExpandableDialogView expandableDialogView, RectF rectF) {
        int i = ExpandableDialogView.j;
        expandableDialogView.h(rectF);
    }
}
