package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.v4.j.s;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CircleImageView.java */
/* loaded from: classes.dex */
public class c extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    int f629a;

    /* renamed from: b  reason: collision with root package name */
    private Animation.AnimationListener f630b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (BitmapDescriptorFactory.HUE_RED * f);
        this.f629a = (int) (3.5f * f);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            s.a(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f629a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f629a, i3, i2, 503316480);
            int i4 = this.f629a;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        s.a(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f629a * 2), getMeasuredHeight() + (this.f629a * 2));
        }
    }

    public void a(Animation.AnimationListener animationListener) {
        this.f630b = animationListener;
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.f630b != null) {
            this.f630b.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f630b != null) {
            this.f630b.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* compiled from: CircleImageView.java */
    /* loaded from: classes.dex */
    private class a extends OvalShape {

        /* renamed from: b  reason: collision with root package name */
        private RadialGradient f632b;

        /* renamed from: c  reason: collision with root package name */
        private Paint f633c = new Paint();

        a(int i) {
            c.this.f629a = i;
            a((int) rect().width());
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            a((int) f);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = c.this.getWidth() / 2;
            float height = c.this.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f633c);
            canvas.drawCircle(width2, height, width - c.this.f629a, paint);
        }

        private void a(int i) {
            float f = i / 2;
            this.f632b = new RadialGradient(f, f, c.this.f629a, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f633c.setShader(this.f632b);
        }
    }
}
