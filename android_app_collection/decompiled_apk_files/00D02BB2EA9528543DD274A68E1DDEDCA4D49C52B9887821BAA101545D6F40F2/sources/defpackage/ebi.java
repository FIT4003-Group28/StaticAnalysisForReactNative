package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: ebi  reason: default package */
/* loaded from: classes6.dex */
public final class ebi extends View {
    private final LayerDrawable a;
    private final ShapeDrawable b;
    private final ShapeDrawable c;
    private final ShapeDrawable d;

    public ebi(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.b = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        this.c = shapeDrawable2;
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
        this.d = shapeDrawable3;
        this.a = new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2, shapeDrawable3});
        setArcWidth(12);
        setArcColor(-16776961);
        setArcBackgroundColor(-3355444);
        setCenterColor(-1);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        this.a.draw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.setBounds(i, i2, i3, i4);
    }

    public void setArcBackgroundColor(int i) {
        this.b.getPaint().setColor(i);
    }

    public void setArcColor(int i) {
        this.c.getPaint().setColor(i);
    }

    public void setArcWidth(int i) {
        this.a.setLayerInset(2, i, i, i, i);
    }

    public void setCenterColor(int i) {
        this.d.getPaint().setColor(i);
    }

    public void setProgressRatio(float f) {
        this.c.setShape(new ArcShape(270.0f, akn.a(f, 0.0f, 1.0f) * 360.0f));
    }
}
