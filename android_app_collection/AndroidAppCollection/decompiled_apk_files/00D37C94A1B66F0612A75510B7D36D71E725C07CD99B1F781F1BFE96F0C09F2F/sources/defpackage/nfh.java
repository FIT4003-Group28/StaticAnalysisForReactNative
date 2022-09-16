package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
/* compiled from: PG */
/* renamed from: nfh  reason: default package */
/* loaded from: classes3.dex */
public class nfh extends FrameLayout implements axoo {
    private axok a;
    private boolean b;

    public nfh(Context context) {
        super(context);
        b();
    }

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axok lH() {
        if (this.a == null) {
            this.a = new axok(this, false);
        }
        return this.a;
    }

    protected final void b() {
        if (!this.b) {
            this.b = true;
            ((nfu) lI()).k((SwipeToContainerFrameLayout) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    public nfh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public nfh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public nfh(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
