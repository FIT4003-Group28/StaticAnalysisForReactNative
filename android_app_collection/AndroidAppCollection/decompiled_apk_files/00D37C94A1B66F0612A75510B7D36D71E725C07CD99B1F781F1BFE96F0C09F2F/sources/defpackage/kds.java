package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.player.overlay.ControlsRelativeLayout;
/* compiled from: PG */
/* renamed from: kds  reason: default package */
/* loaded from: classes3.dex */
public class kds extends RelativeLayout implements axoo {
    private axok a;
    private boolean b;

    public kds(Context context) {
        super(context);
        c();
    }

    @Override // defpackage.axoo
    /* renamed from: b */
    public final axok lH() {
        if (this.a == null) {
            this.a = new axok(this, false);
        }
        return this.a;
    }

    protected final void c() {
        if (!this.b) {
            this.b = true;
            ((kbi) lI()).b((ControlsRelativeLayout) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    public kds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    kds(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    kds(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c();
    }
}
