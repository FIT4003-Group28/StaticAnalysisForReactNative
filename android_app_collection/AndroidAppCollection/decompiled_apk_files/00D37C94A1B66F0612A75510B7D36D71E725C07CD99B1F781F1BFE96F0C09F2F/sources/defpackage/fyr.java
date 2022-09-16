package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;
/* compiled from: PG */
/* renamed from: fyr  reason: default package */
/* loaded from: classes3.dex */
public abstract class fyr extends ViewGroup implements axoo {
    private axok a;
    private boolean b;

    public fyr(Context context) {
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
            ((fzi) lI()).e((InlinePlayerOverlayLayout) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    public fyr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public fyr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    fyr(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
