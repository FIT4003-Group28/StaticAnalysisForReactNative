package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelCoordinatorLayout;
/* compiled from: PG */
/* renamed from: kdt  reason: default package */
/* loaded from: classes3.dex */
public class kdt extends CoordinatorLayout implements axoo {
    private axok i;
    private boolean j;

    kdt(Context context) {
        super(context);
        q();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.axoo
    /* renamed from: p */
    public final axok lH() {
        if (this.i == null) {
            this.i = new axok(this, false);
        }
        return this.i;
    }

    protected final void q() {
        if (!this.j) {
            this.j = true;
            ((kdb) lI()).d((FullscreenEngagementPanelCoordinatorLayout) this);
        }
    }

    kdt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q();
    }

    public kdt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q();
    }
}
