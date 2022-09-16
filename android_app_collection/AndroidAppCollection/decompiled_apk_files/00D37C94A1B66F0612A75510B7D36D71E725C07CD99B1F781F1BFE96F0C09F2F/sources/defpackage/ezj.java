package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
/* compiled from: PG */
/* renamed from: ezj  reason: default package */
/* loaded from: classes3.dex */
public class ezj extends FrameLayout implements axoo {
    private axok a;
    private boolean b;

    public ezj(Context context) {
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
            ((ezp) lI()).j((SpecificNetworkErrorViewLoadingFrameLayout) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    ezj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ezj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    ezj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
