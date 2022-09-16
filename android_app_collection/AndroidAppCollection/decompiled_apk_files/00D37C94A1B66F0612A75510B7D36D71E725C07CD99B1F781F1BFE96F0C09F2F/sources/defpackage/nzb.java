package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
/* compiled from: PG */
/* renamed from: nzb  reason: default package */
/* loaded from: classes3.dex */
public abstract class nzb extends ViewGroup implements axoo {
    private axok a;
    private boolean b;

    nzb(Context context) {
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
            ((nzf) lI()).h((NextGenWatchContainerLayout) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    nzb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    nzb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public nzb(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
