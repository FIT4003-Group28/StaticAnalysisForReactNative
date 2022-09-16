package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
/* compiled from: PG */
/* renamed from: nzc  reason: default package */
/* loaded from: classes3.dex */
public abstract class nzc extends ViewGroup implements axoo {
    private axok a;
    private boolean b;

    nzc(Context context) {
        super(context);
        g();
    }

    @Override // defpackage.axoo
    /* renamed from: f */
    public final axok lH() {
        if (this.a == null) {
            this.a = new axok(this, false);
        }
        return this.a;
    }

    protected final void g() {
        if (!this.b) {
            this.b = true;
            ((nzz) lI()).i((NextGenWatchLayout) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    nzc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public nzc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }

    nzc(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        g();
    }
}
