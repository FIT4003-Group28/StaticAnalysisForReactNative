package a.q.a;

import a.g.m.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends ImageView {

    /* renamed from: b  reason: collision with root package name */
    private Animation.AnimationListener f512b;

    /* renamed from: c  reason: collision with root package name */
    int f513c;

    /* renamed from: a.q.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0030a extends OvalShape {

        /* renamed from: b  reason: collision with root package name */
        private RadialGradient f514b;

        /* renamed from: c  reason: collision with root package name */
        private Paint f515c = new Paint();

        C0030a(int i) {
            a.this.f513c = i;
            a((int) rect().width());
        }

        private void a(int i) {
            float f2 = i / 2;
            this.f514b = new RadialGradient(f2, f2, a.this.f513c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f515c.setShader(this.f514b);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = a.this.getWidth() / 2;
            float height = a.this.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f515c);
            canvas.drawCircle(width2, height, width - a.this.f513c, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f2, float f3) {
            super.onResize(f2, f3);
            a((int) f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f2);
        int i3 = (int) (0.0f * f2);
        this.f513c = (int) (3.5f * f2);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            v.a(this, f2 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0030a(this.f513c));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f513c, i3, i2, 503316480);
            int i4 = this.f513c;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        v.a(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void a(Animation.AnimationListener animationListener) {
        this.f512b = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f512b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f512b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f513c * 2), getMeasuredHeight() + (this.f513c * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
