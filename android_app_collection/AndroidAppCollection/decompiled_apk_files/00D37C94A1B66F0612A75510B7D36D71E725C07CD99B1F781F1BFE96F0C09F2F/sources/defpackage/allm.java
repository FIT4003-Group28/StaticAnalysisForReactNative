package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* compiled from: PG */
/* renamed from: allm  reason: default package */
/* loaded from: classes.dex */
public class allm extends ImageButton {
    public int d;

    public allm(Context context) {
        this(context, null);
    }

    public final void g(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.d = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        g(i, true);
    }

    public allm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public allm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = getVisibility();
    }
}
