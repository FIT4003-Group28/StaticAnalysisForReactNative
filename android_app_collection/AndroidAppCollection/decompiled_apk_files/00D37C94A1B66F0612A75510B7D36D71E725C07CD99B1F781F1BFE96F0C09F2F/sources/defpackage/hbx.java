package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
/* compiled from: PG */
/* renamed from: hbx  reason: default package */
/* loaded from: classes3.dex */
public abstract class hbx extends ViewGroup implements axoo {
    private axok a;
    private boolean b;

    hbx(Context context) {
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
            ((hch) lI()).b((TextTrackView) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    public hbx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    hbx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    hbx(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
