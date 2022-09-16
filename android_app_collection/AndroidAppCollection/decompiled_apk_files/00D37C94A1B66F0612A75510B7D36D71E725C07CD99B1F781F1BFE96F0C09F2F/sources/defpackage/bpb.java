package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: bpb  reason: default package */
/* loaded from: classes2.dex */
public final class bpb extends bot {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public boz b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public bpb() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new boz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    public static bpb b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        bpb bpbVar = new bpb();
        bpbVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bpbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpb c(Resources resources, int i, Resources.Theme theme) {
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                int next = xml.next();
                if (next == 2) {
                    return b(resources, xml, asAttributeSet, theme);
                }
                if (next == 1) {
                    throw new XmlPullParserException("No start tag found");
                }
            }
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
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

    final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
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
        if (isAutoMirrored() && iy.k(this) == 1) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        boz bozVar = this.b;
        Bitmap bitmap = bozVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != bozVar.f.getHeight()) {
            bozVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            bozVar.k = true;
        }
        if (!this.c) {
            this.b.a(min, min2);
        } else {
            boz bozVar2 = this.b;
            if (bozVar2.k || bozVar2.g != bozVar2.c || bozVar2.h != bozVar2.d || bozVar2.j != bozVar2.e || bozVar2.i != bozVar2.b.getRootAlpha()) {
                this.b.a(min, min2);
                boz bozVar3 = this.b;
                bozVar3.g = bozVar3.c;
                bozVar3.h = bozVar3.d;
                bozVar3.i = bozVar3.b.getRootAlpha();
                bozVar3.j = bozVar3.e;
                bozVar3.k = false;
            }
        }
        boz bozVar4 = this.b;
        Rect rect = this.j;
        if (bozVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (bozVar4.l == null) {
                bozVar4.l = new Paint();
                bozVar4.l.setFilterBitmap(true);
            }
            bozVar4.l.setAlpha(bozVar4.b.getRootAlpha());
            bozVar4.l.setColorFilter(colorFilter);
            paint = bozVar4.l;
        }
        canvas.drawBitmap(bozVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
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
            boz bozVar = this.b;
            if (bozVar == null) {
                return false;
            }
            if (!bozVar.b() && ((colorStateList = this.b.c) == null || !colorStateList.isStateful())) {
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
            this.b = new boz(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.bot, android.graphics.drawable.Drawable
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
        boz bozVar = this.b;
        ColorStateList colorStateList = bozVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = bozVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (bozVar.b()) {
            boolean f = bozVar.b.d.f(iArr);
            bozVar.k |= f;
            if (f) {
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
        boz bozVar = this.b;
        if (bozVar.c == colorStateList) {
            return;
        }
        bozVar.c = colorStateList;
        this.d = d(colorStateList, bozVar.d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        boz bozVar = this.b;
        if (bozVar.d == mode) {
            return;
        }
        bozVar.d = mode;
        this.d = d(bozVar.c, mode);
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
        return new bpa(this.e.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        boz bozVar = this.b;
        bozVar.b = new boy();
        TypedArray g = ft.g(resources, theme, attributeSet, boj.a);
        boz bozVar2 = this.b;
        boy boyVar = bozVar2.b;
        int e = ft.e(g, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (e == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (e == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (e != 9) {
            switch (e) {
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        bozVar2.d = mode;
        int i2 = 1;
        if (ft.l(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            g.getValue(1, typedValue);
            if (typedValue.type == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (typedValue.type < 28 || typedValue.type > 31) {
                colorStateList = gj.c(g.getResources(), g.getResourceId(1, 0), theme);
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            bozVar2.c = colorStateList;
        }
        boolean z = bozVar2.e;
        if (ft.l(xmlPullParser, "autoMirrored")) {
            z = g.getBoolean(5, z);
        }
        bozVar2.e = z;
        boyVar.g = ft.c(g, xmlPullParser, "viewportWidth", 7, boyVar.g);
        float c = ft.c(g, xmlPullParser, "viewportHeight", 8, boyVar.h);
        boyVar.h = c;
        if (boyVar.g <= 0.0f) {
            throw new XmlPullParserException(g.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (c <= 0.0f) {
            throw new XmlPullParserException(g.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            boyVar.e = g.getDimension(3, boyVar.e);
            float dimension = g.getDimension(2, boyVar.f);
            boyVar.f = dimension;
            if (boyVar.e <= 0.0f) {
                throw new XmlPullParserException(g.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(g.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                boyVar.setAlpha(ft.c(g, xmlPullParser, "alpha", 4, boyVar.getAlpha()));
                String string = g.getString(0);
                if (string != null) {
                    boyVar.j = string;
                    boyVar.l.put(string, boyVar);
                }
                g.recycle();
                bozVar.a = getChangingConfigurations();
                bozVar.k = true;
                boz bozVar3 = this.b;
                boy boyVar2 = bozVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(boyVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                for (int i3 = 3; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != i3); i3 = 3) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        bow bowVar = (bow) arrayDeque.peek();
                        if ("path".equals(name)) {
                            bov bovVar = new bov();
                            TypedArray g2 = ft.g(resources, theme, attributeSet, boj.c);
                            bovVar.a = null;
                            if (!ft.l(xmlPullParser, "pathData")) {
                                i = depth;
                            } else {
                                String string2 = g2.getString(0);
                                if (string2 != null) {
                                    bovVar.n = string2;
                                }
                                String string3 = g2.getString(2);
                                if (string3 != null) {
                                    bovVar.m = iy.v(string3);
                                }
                                bovVar.d = ft.p(g2, xmlPullParser, theme, "fillColor", 1);
                                i = depth;
                                bovVar.f = ft.c(g2, xmlPullParser, "fillAlpha", 12, bovVar.f);
                                int e2 = ft.e(g2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = bovVar.j;
                                if (e2 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (e2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (e2 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                bovVar.j = cap;
                                int e3 = ft.e(g2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = bovVar.k;
                                if (e3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (e3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (e3 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                bovVar.k = join;
                                bovVar.l = ft.c(g2, xmlPullParser, "strokeMiterLimit", 10, bovVar.l);
                                bovVar.b = ft.p(g2, xmlPullParser, theme, "strokeColor", 3);
                                bovVar.e = ft.c(g2, xmlPullParser, "strokeAlpha", 11, bovVar.e);
                                bovVar.c = ft.c(g2, xmlPullParser, "strokeWidth", 4, bovVar.c);
                                bovVar.h = ft.c(g2, xmlPullParser, "trimPathEnd", 6, bovVar.h);
                                bovVar.i = ft.c(g2, xmlPullParser, "trimPathOffset", 7, bovVar.i);
                                bovVar.g = ft.c(g2, xmlPullParser, "trimPathStart", 5, bovVar.g);
                                bovVar.o = ft.e(g2, xmlPullParser, "fillType", 13, bovVar.o);
                            }
                            g2.recycle();
                            bowVar.b.add(bovVar);
                            if (bovVar.getPathName() != null) {
                                boyVar2.l.put(bovVar.getPathName(), bovVar);
                            }
                            int i4 = bozVar3.a;
                            z2 = false;
                        } else {
                            i = depth;
                            if ("clip-path".equals(name)) {
                                bou bouVar = new bou();
                                if (ft.l(xmlPullParser, "pathData")) {
                                    TypedArray g3 = ft.g(resources, theme, attributeSet, boj.d);
                                    String string4 = g3.getString(0);
                                    if (string4 != null) {
                                        bouVar.n = string4;
                                    }
                                    String string5 = g3.getString(1);
                                    if (string5 != null) {
                                        bouVar.m = iy.v(string5);
                                    }
                                    bouVar.o = ft.e(g3, xmlPullParser, "fillType", 2, 0);
                                    g3.recycle();
                                }
                                bowVar.b.add(bouVar);
                                if (bouVar.getPathName() != null) {
                                    boyVar2.l.put(bouVar.getPathName(), bouVar);
                                }
                                int i5 = bozVar3.a;
                            } else if ("group".equals(name)) {
                                bow bowVar2 = new bow();
                                TypedArray g4 = ft.g(resources, theme, attributeSet, boj.b);
                                bowVar2.l = null;
                                bowVar2.c = ft.c(g4, xmlPullParser, "rotation", 5, bowVar2.c);
                                bowVar2.d = g4.getFloat(1, bowVar2.d);
                                bowVar2.e = g4.getFloat(2, bowVar2.e);
                                bowVar2.f = ft.c(g4, xmlPullParser, "scaleX", 3, bowVar2.f);
                                bowVar2.g = ft.c(g4, xmlPullParser, "scaleY", 4, bowVar2.g);
                                bowVar2.h = ft.c(g4, xmlPullParser, "translateX", 6, bowVar2.h);
                                bowVar2.i = ft.c(g4, xmlPullParser, "translateY", 7, bowVar2.i);
                                String string6 = g4.getString(0);
                                if (string6 != null) {
                                    bowVar2.m = string6;
                                }
                                bowVar2.h();
                                g4.recycle();
                                bowVar.b.add(bowVar2);
                                arrayDeque.push(bowVar2);
                                if (bowVar2.getGroupName() != null) {
                                    boyVar2.l.put(bowVar2.getGroupName(), bowVar2);
                                }
                                int i6 = bozVar3.a;
                            }
                        }
                    } else {
                        i = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i;
                    i2 = 1;
                }
                if (!z2) {
                    this.d = d(bozVar.c, bozVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
        }
    }

    public bpb(boz bozVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = bozVar;
        this.d = d(bozVar.c, bozVar.d);
    }
}
