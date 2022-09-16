package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* compiled from: PG */
/* renamed from: dabe  reason: default package */
/* loaded from: classes5.dex */
public class dabe extends ImageButton {
    public int d;

    public dabe(Context context) {
        this(context, null);
    }

    public final void f(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.d = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        f(i, true);
    }

    public dabe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public dabe(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = getVisibility();
    }
}
