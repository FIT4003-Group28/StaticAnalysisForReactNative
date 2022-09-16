package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.metadataeditor.geo.EditLocation;
/* compiled from: PG */
/* renamed from: afqq  reason: default package */
/* loaded from: classes.dex */
public class afqq extends LinearLayout implements axoo {
    private axok a;
    private boolean b;

    afqq(Context context) {
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
            ((afqp) lI()).c((EditLocation) this);
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    public afqq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    afqq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }

    afqq(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        g();
    }
}
