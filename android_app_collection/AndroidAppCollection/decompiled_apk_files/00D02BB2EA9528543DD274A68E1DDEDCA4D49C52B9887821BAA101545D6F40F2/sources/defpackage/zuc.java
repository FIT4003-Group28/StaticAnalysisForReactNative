package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zuc  reason: default package */
/* loaded from: classes7.dex */
public class zuc extends zsy {
    protected final float l;
    protected final float m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;

    public zuc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = this.f.getDimension(R.dimen.directions_transitnode_radius);
        this.m = this.f.getDimension(R.dimen.directions_transitnode_innerradius);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable;
        q(canvas, this.l + getPaddingTop());
        int i = this.i / 2;
        Float f = this.g;
        if (f != null) {
            float f2 = i;
            float floatValue = (f.floatValue() * getHeight()) + f2;
            int i2 = (int) (floatValue + f2);
            if (i2 < 0 || i2 >= getHeight()) {
                return;
            }
            o(canvas, 3.0f + floatValue, f2, zsy.a);
            o(canvas, floatValue, f2, -1);
            ztf ztfVar = this.h;
            if (ztfVar == null || (drawable = ztfVar.b) == null) {
                o(canvas, floatValue, i - this.k, zsy.b);
                return;
            }
            float f3 = this.j;
            p(canvas, floatValue, f3, f3, drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(Canvas canvas, float f) {
        int i = this.o;
        int i2 = this.n;
        if (i2 != 0) {
            h(canvas, 0.0f, f, i2);
        }
        if (this.o != 0) {
            h(canvas, f, getHeight(), this.o);
        }
        if (i == 0) {
            if (i2 != 0) {
                n(canvas, f, this.l, this.m, this.p, this.q);
            } else {
                k(canvas, f, this.l, this.m, this.p, this.q);
            }
        } else if (i2 == 0 || this.n != this.o) {
            m(canvas, f, this.l, this.m, this.p, this.q);
        } else {
            float f2 = this.m;
            k(canvas, f, f2, f2, this.p, this.q);
        }
    }

    public void setCircleColor(@dzsi Integer num) {
        this.p = num == null ? 0 : num.intValue();
        invalidate();
    }

    public void setInnerCircleColor(@dzsi Integer num) {
        this.q = num == null ? 0 : num.intValue();
        invalidate();
    }

    public void setSchematicBottomColor(@dzsi Integer num) {
        this.o = num == null ? 0 : num.intValue();
        invalidate();
    }

    public void setSchematicTopColor(@dzsi Integer num) {
        this.n = num == null ? 0 : num.intValue();
        invalidate();
    }
}
