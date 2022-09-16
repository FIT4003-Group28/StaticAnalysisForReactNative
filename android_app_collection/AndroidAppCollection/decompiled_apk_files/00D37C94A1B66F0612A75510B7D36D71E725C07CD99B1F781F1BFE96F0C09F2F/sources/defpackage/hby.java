package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;
/* compiled from: PG */
/* renamed from: hby  reason: default package */
/* loaded from: classes3.dex */
public class hby extends FrameLayout implements axoo {
    private axok a;
    private boolean b;

    hby(Context context) {
        super(context);
        b();
    }

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axok lH() {
        if (this.a == null) {
            this.a = new axok(this, true);
        }
        return this.a;
    }

    protected final void b() {
        if (!this.b) {
            this.b = true;
            ((hcm) lI()).c((TimelineSeekBar) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    hby(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public hby(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    hby(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
