package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;
/* compiled from: PG */
/* renamed from: hbw  reason: default package */
/* loaded from: classes3.dex */
public abstract class hbw extends ViewGroup implements axoo {
    private axok a;
    private boolean b;

    hbw(Context context) {
        super(context);
        h();
    }

    @Override // defpackage.axoo
    /* renamed from: g */
    public final axok lH() {
        if (this.a == null) {
            this.a = new axok(this, true);
        }
        return this.a;
    }

    protected final void h() {
        if (!this.b) {
            this.b = true;
            ((hbs) lI()).a((AudioTrackView) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    hbw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }

    public hbw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h();
    }

    hbw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        h();
    }
}
