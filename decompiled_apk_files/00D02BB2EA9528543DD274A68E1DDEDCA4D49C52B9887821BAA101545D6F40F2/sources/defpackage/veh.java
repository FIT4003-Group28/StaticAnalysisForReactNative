package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
/* compiled from: PG */
/* renamed from: veh  reason: default package */
/* loaded from: classes7.dex */
public final class veh extends CardView {
    public veh(Context context) {
        super(context);
        h();
    }

    private final void h() {
        setOutlineProvider(new veg(this));
    }

    public veh(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }

    public veh(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h();
    }
}
