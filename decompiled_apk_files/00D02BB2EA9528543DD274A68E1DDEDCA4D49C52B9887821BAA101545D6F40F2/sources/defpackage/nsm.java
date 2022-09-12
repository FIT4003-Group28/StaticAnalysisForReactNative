package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: nsm  reason: default package */
/* loaded from: classes7.dex */
public final class nsm extends FrameLayout {
    @dzsi
    public View a;
    private final Runnable b;
    private final View.OnLayoutChangeListener c;

    public nsm(Context context) {
        super(context);
        this.b = new nsk(this);
        nsl nslVar = new nsl(this);
        this.c = nslVar;
        super.addOnLayoutChangeListener(nslVar);
    }

    public void setFocusCenter(@dzsi View view) {
        this.a = view;
        if (view == null) {
            removeCallbacks(this.b);
            post(this.b);
            return;
        }
        removeCallbacks(this.b);
        view.removeCallbacks(this.b);
        view.post(this.b);
    }

    public nsm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new nsk(this);
        nsl nslVar = new nsl(this);
        this.c = nslVar;
        super.addOnLayoutChangeListener(nslVar);
    }

    public nsm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new nsk(this);
        nsl nslVar = new nsl(this);
        this.c = nslVar;
        super.addOnLayoutChangeListener(nslVar);
    }
}
