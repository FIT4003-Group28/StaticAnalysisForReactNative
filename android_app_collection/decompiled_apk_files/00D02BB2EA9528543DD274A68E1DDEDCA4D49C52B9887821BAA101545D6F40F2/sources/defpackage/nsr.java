package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: nsr  reason: default package */
/* loaded from: classes7.dex */
public final class nsr extends FrameLayout {
    public final List<Pair<View, View>> a;

    public nsr(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (i == 1) {
            for (Pair<View, View> pair : this.a) {
                View view = (View) pair.first;
                View view2 = (View) pair.second;
                if (view.hasFocus() && view2.hasFocusable()) {
                    view2.addFocusables(arrayList, 1, i2);
                    view.addFocusables(arrayList, 1, i2);
                    return;
                }
            }
            i = 1;
        }
        super.addFocusables(arrayList, i, i2);
    }

    public nsr(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nsr(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
    }
}
