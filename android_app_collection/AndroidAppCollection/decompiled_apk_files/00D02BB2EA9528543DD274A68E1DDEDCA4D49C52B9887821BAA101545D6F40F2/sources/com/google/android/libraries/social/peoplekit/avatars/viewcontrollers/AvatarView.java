package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AvatarView extends AppCompatImageView {
    boolean a;
    private final RectF b;
    private final RectF c;
    private final Matrix d;
    private final Paint e;
    private BitmapShader f;
    private Bitmap g;
    private Bitmap h;
    private int i;
    private boolean j;

    public AvatarView(Context context) {
        super(context);
        this.j = true;
        this.a = false;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Matrix();
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        c();
    }

    private final void a() {
        Bitmap bitmap = this.g;
        if (bitmap == null) {
            return;
        }
        this.f = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    private final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        this.d.reset();
        this.b.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        this.c.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.d.setRectToRect(this.b, this.c, Matrix.ScaleToFit.FILL);
        this.f.setLocalMatrix(this.d);
        paint.setShader(this.f);
        canvas.drawCircle(this.c.centerX(), this.c.centerY(), this.c.width() / 2.0f, paint);
    }

    private final void c() {
        Drawable b = sl.b(getContext(), R.drawable.peoplekit_default_avatar);
        this.h = d(b);
        Canvas canvas = new Canvas(this.h);
        b.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        b.draw(canvas);
        this.f = new BitmapShader(this.h, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    private final Bitmap d(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable) || this.a) {
            try {
                return Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception unused) {
                return null;
            }
        }
        return ((BitmapDrawable) drawable).getBitmap();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.clipRect(0, 0, getHeight(), getWidth());
        if (!this.a) {
            Bitmap bitmap = this.g;
            if (bitmap == null) {
                return;
            }
            b(canvas, bitmap, this.e);
            return;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.i);
        paint.setAlpha(255);
        int height = getHeight();
        int width = getWidth();
        canvas.drawCircle(width / 2, height / 2, Math.min(height, width) / 2, paint);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
        paint2.setColor(akm.c(getContext(), R.color.quantum_white_100));
        if (this.j) {
            paint2.setAlpha(138);
        }
        if (this.h == null) {
            c();
        }
        b(canvas, this.h, paint2);
    }

    public void setDefaultAvatar(Bitmap bitmap) {
        this.h = bitmap;
    }

    public void setDrawDefaultSilhouette(boolean z, int i, boolean z2) {
        this.a = z;
        this.i = i;
        this.j = z2;
        if (!z || this.h != null) {
            return;
        }
        c();
        invalidate();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.g = bitmap;
        a();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.g = d(drawable);
        a();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.g = d(getDrawable());
        a();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.g = uri != null ? d(getDrawable()) : null;
        a();
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = true;
        this.a = false;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Matrix();
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        c();
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = true;
        this.a = false;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Matrix();
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        c();
    }
}
