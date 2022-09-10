package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.google.android.filament.R;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cfg  reason: default package */
/* loaded from: classes.dex */
public final class cfg extends Drawable implements Animatable, cfl {
    public final cff a;
    public boolean b;
    private boolean c;
    private boolean d;
    private int f;
    private boolean h;
    private Paint i;
    private Rect j;
    private boolean e = true;
    private final int g = -1;

    public cfg(cff cffVar) {
        cjn.b(cffVar);
        this.a = cffVar;
    }

    private final void d() {
        cjn.a(!this.b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.b() == 1) {
            invalidateSelf();
        } else if (this.c) {
        } else {
            this.c = true;
            cfn cfnVar = this.a.a;
            if (cfnVar.f) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            if (cfnVar.b.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            boolean isEmpty = cfnVar.b.isEmpty();
            cfnVar.b.add(this);
            if (isEmpty && !cfnVar.d) {
                cfnVar.d = true;
                cfnVar.f = false;
                cfnVar.d();
            }
            invalidateSelf();
        }
    }

    private final void e() {
        this.c = false;
        cfn cfnVar = this.a.a;
        cfnVar.b.remove(this);
        if (cfnVar.b.isEmpty()) {
            cfnVar.c();
        }
    }

    private final Rect f() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private final Paint g() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    public final Bitmap a() {
        return this.a.a.h;
    }

    public final ByteBuffer b() {
        return ((bsp) this.a.a.a).a.asReadOnlyBuffer();
    }

    @Override // defpackage.cfl
    public final void c() {
        cfn cfnVar;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        cfk cfkVar = this.a.a.e;
        if ((cfkVar != null ? cfkVar.a : -1) == cfnVar.b() - 1) {
            this.f++;
        }
        if (this.g == -1 || this.f < 0) {
            return;
        }
        stop();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            return;
        }
        if (this.h) {
            Gravity.apply(R.styleable.AppCompatTheme_windowActionModeOverlay, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
            this.h = false;
        }
        cfn cfnVar = this.a.a;
        cfk cfkVar = cfnVar.e;
        canvas.drawBitmap(cfkVar != null ? cfkVar.b : cfnVar.h, (Rect) null, f(), g());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        g().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        g().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        cjn.a(!this.b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            e();
        } else if (this.d) {
            d();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d = true;
        this.f = 0;
        if (this.e) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d = false;
        e();
    }
}
