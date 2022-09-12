package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: bam  reason: default package */
/* loaded from: classes.dex */
public final class bam extends bad {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public bak b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public bam() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new bak();
    }

    public static bam a(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 24) {
            bam bamVar = new bam();
            bamVar.e = resources.getDrawable(i, theme);
            return bamVar;
        }
        return b(resources, i, theme);
    }

    static bam b(Resources resources, int i, Resources.Theme theme) {
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                int next = xml.next();
                if (next == 2) {
                    return c(resources, xml, asAttributeSet, theme);
                }
                if (next == 1) {
                    throw new XmlPullParserException("No start tag found");
                }
            }
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static bam c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        bam bamVar = new bam();
        bamVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bamVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float abs = Math.abs(this.h[0]);
        float abs2 = Math.abs(this.h[4]);
        float abs3 = Math.abs(this.h[1]);
        float abs4 = Math.abs(this.h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = this.j.width();
        int height = this.j.height();
        int min = Math.min(2048, (int) (width * abs));
        int min2 = Math.min(2048, (int) (height * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.j.left, this.j.top);
        if (isAutoMirrored() && ks.e(this) == 1) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        bak bakVar = this.b;
        Bitmap bitmap = bakVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != bakVar.f.getHeight()) {
            bakVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            bakVar.k = true;
        }
        if (!this.c) {
            this.b.a(min, min2);
        } else {
            bak bakVar2 = this.b;
            if (bakVar2.k || bakVar2.g != bakVar2.c || bakVar2.h != bakVar2.d || bakVar2.j != bakVar2.e || bakVar2.i != bakVar2.b.getRootAlpha()) {
                this.b.a(min, min2);
                bak bakVar3 = this.b;
                bakVar3.g = bakVar3.c;
                bakVar3.h = bakVar3.d;
                bakVar3.i = bakVar3.b.getRootAlpha();
                bakVar3.j = bakVar3.e;
                bakVar3.k = false;
            }
        }
        bak bakVar4 = this.b;
        Rect rect = this.j;
        if (bakVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (bakVar4.l == null) {
                bakVar4.l = new Paint();
                bakVar4.l.setFilterBitmap(true);
            }
            bakVar4.l.setAlpha(bakVar4.b.getRootAlpha());
            bakVar4.l.setColorFilter(colorFilter);
            paint = bakVar4.l;
        }
        canvas.drawBitmap(bakVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    final PorterDuffColorFilter e(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            bak bakVar = this.b;
            if (bakVar == null) {
                return false;
            }
            if (!bakVar.b() && ((colorStateList = this.b.c) == null || !colorStateList.isStateful())) {
                return false;
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new bak(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.bad, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        bak bakVar = this.b;
        ColorStateList colorStateList = bakVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = bakVar.d) != null) {
            this.d = e(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (bakVar.b()) {
            boolean c = bakVar.b.d.c(iArr);
            bakVar.k |= c;
            if (c) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() == i) {
        } else {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        bak bakVar = this.b;
        if (bakVar.c == colorStateList) {
            return;
        }
        bakVar.c = colorStateList;
        this.d = e(colorStateList, bakVar.d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        bak bakVar = this.b;
        if (bakVar.d == mode) {
            return;
        }
        bakVar.d = mode;
        this.d = e(bakVar.c, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.e == null || Build.VERSION.SDK_INT < 24) {
            this.b.a = getChangingConfigurations();
            return this.b;
        }
        return new bal(this.e.getConstantState());
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bam.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public bam(bak bakVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = bakVar;
        this.d = e(bakVar.c, bakVar.d);
    }
}
