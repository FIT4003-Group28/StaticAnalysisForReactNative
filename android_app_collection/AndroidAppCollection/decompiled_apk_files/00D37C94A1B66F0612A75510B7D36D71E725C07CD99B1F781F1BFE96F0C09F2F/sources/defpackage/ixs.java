package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
/* compiled from: PG */
/* renamed from: ixs  reason: default package */
/* loaded from: classes3.dex */
public class ixs extends FrameLayout implements axoo {
    private axok a;
    private boolean b;

    ixs(Context context) {
        super(context);
        nl();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.axoo
    /* renamed from: nk */
    public final axok lH() {
        if (this.a == null) {
            this.a = new axok(this, false);
        }
        return this.a;
    }

    protected final void nl() {
        if (!this.b) {
            this.b = true;
            MdxWatchDrawerLayout mdxWatchDrawerLayout = (MdxWatchDrawerLayout) this;
            ((izi) lI()).m();
        }
    }

    ixs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        nl();
    }

    public ixs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nl();
    }

    ixs(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        nl();
    }
}
