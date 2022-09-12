package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ztz  reason: default package */
/* loaded from: classes7.dex */
public class ztz extends zsy {
    public static final /* synthetic */ int K = 0;
    protected final float C;
    protected final float D;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected boolean I;
    protected boolean J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float dimension = context.getResources().getDimension(R.dimen.directions_transitnode_radius);
        float dimension2 = context.getResources().getDimension(R.dimen.directions_transitnode_innerradius);
        this.C = dimension;
        this.D = dimension2;
    }

    public static <T extends cqkp> cqnf<T> F(Boolean bool) {
        return cqjv.i(ztg.SHOW_FINAL_STOP, bool, zth.a);
    }

    public static <T extends cqkp> cqnf<T> G(@dzsi cqss cqssVar) {
        return cqjv.i(ztg.SCHEMATIC_BOTTOM_COLOR, cqssVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> H(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(ztg.SCHEMATIC_BOTTOM_COLOR, cqlcVar, zth.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float D() {
        if (this.I) {
            return 0.0f;
        }
        return this.C + getPaddingTop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float E() {
        if (this.J) {
            return (getHeight() - this.C) - getPaddingBottom();
        }
        return getHeight();
    }

    protected void I(Canvas canvas) {
        float D = D();
        float E = E();
        if (this.I) {
            j(canvas, D, D, E, this.E, this.F);
        } else {
            h(canvas, D, E, this.F);
        }
    }

    protected void J(Canvas canvas) {
        if (this.H != 0) {
            if (!this.I) {
                m(canvas, D(), this.C, this.D, this.G, this.H);
            }
            if (!this.J) {
                return;
            }
            n(canvas, E(), this.C, this.D, this.G, this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        I(canvas);
        J(canvas);
    }

    public void setCircleColor(@dzsi Integer num) {
        this.G = num == null ? 0 : num.intValue();
        invalidate();
    }

    public void setInnerCircleColor(@dzsi Integer num) {
        this.H = num == null ? 0 : num.intValue();
        invalidate();
    }

    public void setSchematicBottomColor(@dzsi Integer num) {
        this.F = num == null ? 0 : num.intValue();
        invalidate();
    }

    public void setSchematicTopColor(@dzsi Integer num) {
        this.E = num == null ? 0 : num.intValue();
        invalidate();
    }

    public void setShowAsBlockTransfer(Boolean bool) {
        if (this.I != bool.booleanValue()) {
            this.I = bool.booleanValue();
            invalidate();
        }
    }

    public void setShowFinalStop(Boolean bool) {
        if (this.J != bool.booleanValue()) {
            this.J = bool.booleanValue();
            invalidate();
        }
    }
}
