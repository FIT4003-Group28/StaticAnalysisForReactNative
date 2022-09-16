package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.youtube.app.ui.MainRtlAwareViewPager;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
/* compiled from: PG */
/* renamed from: lol  reason: default package */
/* loaded from: classes3.dex */
public class lol extends RtlAwareViewPager implements axoo {
    private axok i;
    private boolean l;

    public lol(Context context) {
        super(context);
        x();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.axoo
    /* renamed from: w */
    public final axok lH() {
        if (this.i == null) {
            this.i = new axok(this, false);
        }
        return this.i;
    }

    protected final void x() {
        if (!this.l) {
            this.l = true;
            ((lpo) lI()).g((MainRtlAwareViewPager) this);
        }
    }

    public lol(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x();
    }
}
