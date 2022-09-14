package android.support.b.a;

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
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.v4.b.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public class i extends h {

    /* renamed from: a  reason: collision with root package name */
    static final PorterDuff.Mode f123a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private f f124c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuffColorFilter f125d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private Drawable.ConstantState h;
    private final float[] i;
    private final Matrix j;
    private final Rect k;

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    i() {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f124c = new f();
    }

    i(f fVar) {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f124c = fVar;
        this.f125d = a(this.f125d, fVar.f140c, fVar.f141d);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f122b != null) {
            this.f122b.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.f124c = new f(this.f124c);
            this.f = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object a(String str) {
        return this.f124c.f139b.h.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f122b != null && Build.VERSION.SDK_INT >= 24) {
            return new g(this.f122b.getConstantState());
        }
        this.f124c.f138a = getChangingConfigurations();
        return this.f124c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f122b != null) {
            this.f122b.draw(canvas);
            return;
        }
        copyBounds(this.k);
        if (this.k.width() <= 0 || this.k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e == null ? this.f125d : this.e;
        canvas.getMatrix(this.j);
        this.j.getValues(this.i);
        float abs = Math.abs(this.i[0]);
        float abs2 = Math.abs(this.i[4]);
        float abs3 = Math.abs(this.i[1]);
        float abs4 = Math.abs(this.i[3]);
        if (abs3 != BitmapDescriptorFactory.HUE_RED || abs4 != BitmapDescriptorFactory.HUE_RED) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.k.width() * abs));
        int min2 = Math.min(2048, (int) (this.k.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.k.left, this.k.top);
        if (a()) {
            canvas.translate(this.k.width(), BitmapDescriptorFactory.HUE_RED);
            canvas.scale(-1.0f, 1.0f);
        }
        this.k.offsetTo(0, 0);
        this.f124c.b(min, min2);
        if (!this.g) {
            this.f124c.a(min, min2);
        } else if (!this.f124c.b()) {
            this.f124c.a(min, min2);
            this.f124c.c();
        }
        this.f124c.a(canvas, colorFilter, this.k);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.f122b != null) {
            return android.support.v4.b.a.a.c(this.f122b);
        }
        return this.f124c.f139b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f122b != null) {
            this.f122b.setAlpha(i);
        } else if (this.f124c.f139b.getRootAlpha() == i) {
        } else {
            this.f124c.f139b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f122b != null) {
            this.f122b.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTint(int i) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, colorStateList);
            return;
        }
        f fVar = this.f124c;
        if (fVar.f140c == colorStateList) {
            return;
        }
        fVar.f140c = colorStateList;
        this.f125d = a(this.f125d, colorStateList, fVar.f141d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.b.a.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, mode);
            return;
        }
        f fVar = this.f124c;
        if (fVar.f141d == mode) {
            return;
        }
        fVar.f141d = mode;
        this.f125d = a(this.f125d, fVar.f140c, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.f122b != null) {
            return this.f122b.isStateful();
        }
        return super.isStateful() || !(this.f124c == null || this.f124c.f140c == null || !this.f124c.f140c.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f122b != null) {
            return this.f122b.setState(iArr);
        }
        f fVar = this.f124c;
        if (fVar.f140c == null || fVar.f141d == null) {
            return false;
        }
        this.f125d = a(this.f125d, fVar.f140c, fVar.f141d);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f122b != null) {
            return this.f122b.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f122b != null) {
            return this.f122b.getIntrinsicWidth();
        }
        return (int) this.f124c.f139b.f135b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f122b != null) {
            return this.f122b.getIntrinsicHeight();
        }
        return (int) this.f124c.f139b.f136c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f122b != null) {
            android.support.v4.b.a.a.d(this.f122b);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.f122b != null) {
            return android.support.v4.b.a.a.b(this.f122b);
        }
        return this.f124c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, z);
        } else {
            this.f124c.e = z;
        }
    }

    public static i a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f122b = android.support.v4.a.a.b.a(resources, i, theme);
            iVar.h = new g(iVar.f122b.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return a(resources, xml, asAttributeSet, theme);
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static i a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    static int a(int i, float f2) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f2)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f122b != null) {
            this.f122b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f122b != null) {
            android.support.v4.b.a.a.a(this.f122b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        f fVar = this.f124c;
        fVar.f139b = new e();
        TypedArray a2 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.f105a);
        a(a2, xmlPullParser);
        a2.recycle();
        fVar.f138a = getChangingConfigurations();
        fVar.k = true;
        b(resources, xmlPullParser, attributeSet, theme);
        this.f125d = a(this.f125d, fVar.f140c, fVar.f141d);
    }

    private static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        f fVar = this.f124c;
        e eVar = fVar.f139b;
        fVar.f141d = a(android.support.v4.a.a.c.a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.f140c = colorStateList;
        }
        fVar.e = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "autoMirrored", 5, fVar.e);
        eVar.f137d = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f137d);
        eVar.e = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "viewportHeight", 8, eVar.e);
        if (eVar.f137d <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (eVar.e <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            eVar.f135b = typedArray.getDimension(3, eVar.f135b);
            eVar.f136c = typedArray.getDimension(2, eVar.f136c);
            if (eVar.f135b <= BitmapDescriptorFactory.HUE_RED) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (eVar.f136c <= BitmapDescriptorFactory.HUE_RED) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                eVar.setAlpha(android.support.v4.a.a.c.a(typedArray, xmlPullParser, "alpha", 4, eVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string == null) {
                    return;
                }
                eVar.g = string;
                eVar.h.put(string, eVar);
            }
        }
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        f fVar = this.f124c;
        e eVar = fVar.f139b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(eVar.f134a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) arrayDeque.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    bVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f130a.add(bVar);
                    if (bVar.getPathName() != null) {
                        eVar.h.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    fVar.f138a = bVar.o | fVar.f138a;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    aVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f130a.add(aVar);
                    if (aVar.getPathName() != null) {
                        eVar.h.put(aVar.getPathName(), aVar);
                    }
                    fVar.f138a = aVar.o | fVar.f138a;
                } else if (Kind.GROUP.equals(name)) {
                    c cVar2 = new c();
                    cVar2.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f130a.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        eVar.h.put(cVar2.getGroupName(), cVar2);
                    }
                    fVar.f138a = cVar2.f132c | fVar.f138a;
                }
            } else if (eventType == 3 && Kind.GROUP.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.g = z;
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && android.support.v4.b.a.a.h(this) == 1;
    }

    @Override // android.support.b.a.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f122b != null) {
            this.f122b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.f122b != null) {
            return this.f122b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f124c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f122b != null) {
            this.f122b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f122b != null) {
            this.f122b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.f122b != null) {
            return this.f122b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.f122b != null) {
            this.f122b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    private static class g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f142a;

        public g(Drawable.ConstantState constantState) {
            this.f142a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f122b = (VectorDrawable) this.f142a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f122b = (VectorDrawable) this.f142a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f122b = (VectorDrawable) this.f142a.newDrawable(resources, theme);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f142a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f142a.getChangingConfigurations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class f extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f138a;

        /* renamed from: b  reason: collision with root package name */
        e f139b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f140c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f141d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public f(f fVar) {
            this.f140c = null;
            this.f141d = i.f123a;
            if (fVar != null) {
                this.f138a = fVar.f138a;
                this.f139b = new e(fVar.f139b);
                if (fVar.f139b.n != null) {
                    this.f139b.n = new Paint(fVar.f139b.n);
                }
                if (fVar.f139b.m != null) {
                    this.f139b.m = new Paint(fVar.f139b.m);
                }
                this.f140c = fVar.f140c;
                this.f141d = fVar.f141d;
                this.e = fVar.e;
            }
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return this.f139b.getRootAlpha() < 255;
        }

        public Paint a(ColorFilter colorFilter) {
            if (a() || colorFilter != null) {
                if (this.l == null) {
                    this.l = new Paint();
                    this.l.setFilterBitmap(true);
                }
                this.l.setAlpha(this.f139b.getRootAlpha());
                this.l.setColorFilter(colorFilter);
                return this.l;
            }
            return null;
        }

        public void a(int i, int i2) {
            this.f.eraseColor(0);
            this.f139b.a(new Canvas(this.f), i, i2, (ColorFilter) null);
        }

        public void b(int i, int i2) {
            if (this.f == null || !c(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean c(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.f140c && this.h == this.f141d && this.j == this.e && this.i == this.f139b.getRootAlpha();
        }

        public void c() {
            this.g = this.f140c;
            this.h = this.f141d;
            this.i = this.f139b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public f() {
            this.f140c = null;
            this.f141d = i.f123a;
            this.f139b = new e();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f138a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        private static final Matrix k = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        final c f134a;

        /* renamed from: b  reason: collision with root package name */
        float f135b;

        /* renamed from: c  reason: collision with root package name */
        float f136c;

        /* renamed from: d  reason: collision with root package name */
        float f137d;
        float e;
        int f;
        String g;
        final android.support.v4.i.a<String, Object> h;
        private final Path i;
        private final Path j;
        private final Matrix l;
        private Paint m;
        private Paint n;
        private PathMeasure o;
        private int p;

        private static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public e() {
            this.l = new Matrix();
            this.f135b = BitmapDescriptorFactory.HUE_RED;
            this.f136c = BitmapDescriptorFactory.HUE_RED;
            this.f137d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = 255;
            this.g = null;
            this.h = new android.support.v4.i.a<>();
            this.f134a = new c();
            this.i = new Path();
            this.j = new Path();
        }

        public void setRootAlpha(int i) {
            this.f = i;
        }

        public int getRootAlpha() {
            return this.f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public e(e eVar) {
            this.l = new Matrix();
            this.f135b = BitmapDescriptorFactory.HUE_RED;
            this.f136c = BitmapDescriptorFactory.HUE_RED;
            this.f137d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = 255;
            this.g = null;
            this.h = new android.support.v4.i.a<>();
            this.f134a = new c(eVar.f134a, this.h);
            this.i = new Path(eVar.i);
            this.j = new Path(eVar.j);
            this.f135b = eVar.f135b;
            this.f136c = eVar.f136c;
            this.f137d = eVar.f137d;
            this.e = eVar.e;
            this.p = eVar.p;
            this.f = eVar.f;
            this.g = eVar.g;
            if (eVar.g != null) {
                this.h.put(eVar.g, this);
            }
        }

        private void a(c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f133d.set(matrix);
            cVar.f133d.preConcat(cVar.k);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f130a.size(); i3++) {
                Object obj = cVar.f130a.get(i3);
                if (!(obj instanceof c)) {
                    if (obj instanceof d) {
                        a(cVar, (d) obj, canvas, i, i2, colorFilter);
                    }
                } else {
                    a((c) obj, cVar.f133d, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            a(this.f134a, k, canvas, i, i2, colorFilter);
        }

        private void a(c cVar, d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f137d;
            float f2 = i2 / this.e;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f133d;
            this.l.set(matrix);
            this.l.postScale(f, f2);
            float a2 = a(matrix);
            if (a2 == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            dVar.a(this.i);
            Path path = this.i;
            this.j.reset();
            if (dVar.a()) {
                this.j.addPath(path, this.l);
                canvas.clipPath(this.j);
                return;
            }
            b bVar = (b) dVar;
            if (bVar.g != BitmapDescriptorFactory.HUE_RED || bVar.h != 1.0f) {
                float f3 = (bVar.g + bVar.i) % 1.0f;
                float f4 = (bVar.h + bVar.i) % 1.0f;
                if (this.o == null) {
                    this.o = new PathMeasure();
                }
                this.o.setPath(this.i, false);
                float length = this.o.getLength();
                float f5 = f3 * length;
                float f6 = f4 * length;
                path.reset();
                if (f5 > f6) {
                    this.o.getSegment(f5, length, path, true);
                    this.o.getSegment(BitmapDescriptorFactory.HUE_RED, f6, path, true);
                } else {
                    this.o.getSegment(f5, f6, path, true);
                }
                path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            this.j.addPath(path, this.l);
            if (bVar.f128c != 0) {
                if (this.n == null) {
                    this.n = new Paint();
                    this.n.setStyle(Paint.Style.FILL);
                    this.n.setAntiAlias(true);
                }
                Paint paint = this.n;
                paint.setColor(i.a(bVar.f128c, bVar.f));
                paint.setColorFilter(colorFilter);
                this.j.setFillType(bVar.e == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.j, paint);
            }
            if (bVar.f126a == 0) {
                return;
            }
            if (this.m == null) {
                this.m = new Paint();
                this.m.setStyle(Paint.Style.STROKE);
                this.m.setAntiAlias(true);
            }
            Paint paint2 = this.m;
            if (bVar.k != null) {
                paint2.setStrokeJoin(bVar.k);
            }
            if (bVar.j != null) {
                paint2.setStrokeCap(bVar.j);
            }
            paint2.setStrokeMiter(bVar.l);
            paint2.setColor(i.a(bVar.f126a, bVar.f129d));
            paint2.setColorFilter(colorFilter);
            paint2.setStrokeWidth(bVar.f127b * min * a2);
            canvas.drawPath(this.j, paint2);
        }

        private float a(Matrix matrix) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            return max > BitmapDescriptorFactory.HUE_RED ? Math.abs(a2) / max : BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<Object> f130a;

        /* renamed from: b  reason: collision with root package name */
        float f131b;

        /* renamed from: c  reason: collision with root package name */
        int f132c;

        /* renamed from: d  reason: collision with root package name */
        private final Matrix f133d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        private float j;
        private final Matrix k;
        private int[] l;
        private String m;

        public c(c cVar, android.support.v4.i.a<String, Object> aVar) {
            d aVar2;
            this.f133d = new Matrix();
            this.f130a = new ArrayList<>();
            this.f131b = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = BitmapDescriptorFactory.HUE_RED;
            this.g = 1.0f;
            this.h = 1.0f;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.j = BitmapDescriptorFactory.HUE_RED;
            this.k = new Matrix();
            this.m = null;
            this.f131b = cVar.f131b;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            this.j = cVar.j;
            this.l = cVar.l;
            this.m = cVar.m;
            this.f132c = cVar.f132c;
            if (this.m != null) {
                aVar.put(this.m, this);
            }
            this.k.set(cVar.k);
            ArrayList<Object> arrayList = cVar.f130a;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof c) {
                    this.f130a.add(new c((c) obj, aVar));
                } else {
                    if (obj instanceof b) {
                        aVar2 = new b((b) obj);
                    } else if (obj instanceof a) {
                        aVar2 = new a((a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f130a.add(aVar2);
                    if (aVar2.n != null) {
                        aVar.put(aVar2.n, aVar2);
                    }
                }
            }
        }

        public c() {
            this.f133d = new Matrix();
            this.f130a = new ArrayList<>();
            this.f131b = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = BitmapDescriptorFactory.HUE_RED;
            this.g = 1.0f;
            this.h = 1.0f;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.j = BitmapDescriptorFactory.HUE_RED;
            this.k = new Matrix();
            this.m = null;
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.k;
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.f106b);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f131b = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "rotation", 5, this.f131b);
            this.e = typedArray.getFloat(1, this.e);
            this.f = typedArray.getFloat(2, this.f);
            this.g = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "scaleX", 3, this.g);
            this.h = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "scaleY", 4, this.h);
            this.i = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "translateX", 6, this.i);
            this.j = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "translateY", 7, this.j);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            a();
        }

        private void a() {
            this.k.reset();
            this.k.postTranslate(-this.e, -this.f);
            this.k.postScale(this.g, this.h);
            this.k.postRotate(this.f131b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.k.postTranslate(this.i + this.e, this.j + this.f);
        }

        public float getRotation() {
            return this.f131b;
        }

        public void setRotation(float f) {
            if (f != this.f131b) {
                this.f131b = f;
                a();
            }
        }

        public float getPivotX() {
            return this.e;
        }

        public void setPivotX(float f) {
            if (f != this.e) {
                this.e = f;
                a();
            }
        }

        public float getPivotY() {
            return this.f;
        }

        public void setPivotY(float f) {
            if (f != this.f) {
                this.f = f;
                a();
            }
        }

        public float getScaleX() {
            return this.g;
        }

        public void setScaleX(float f) {
            if (f != this.g) {
                this.g = f;
                a();
            }
        }

        public float getScaleY() {
            return this.h;
        }

        public void setScaleY(float f) {
            if (f != this.h) {
                this.h = f;
                a();
            }
        }

        public float getTranslateX() {
            return this.i;
        }

        public void setTranslateX(float f) {
            if (f != this.i) {
                this.i = f;
                a();
            }
        }

        public float getTranslateY() {
            return this.j;
        }

        public void setTranslateY(float f) {
            if (f != this.j) {
                this.j = f;
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        protected b.C0006b[] m;
        String n;
        int o;

        public boolean a() {
            return false;
        }

        public d() {
            this.m = null;
        }

        public d(d dVar) {
            this.m = null;
            this.n = dVar.n;
            this.o = dVar.o;
            this.m = android.support.v4.b.b.a(dVar.m);
        }

        public void a(Path path) {
            path.reset();
            if (this.m != null) {
                b.C0006b.a(this.m, path);
            }
        }

        public String getPathName() {
            return this.n;
        }

        public b.C0006b[] getPathData() {
            return this.m;
        }

        public void setPathData(b.C0006b[] c0006bArr) {
            if (!android.support.v4.b.b.a(this.m, c0006bArr)) {
                this.m = android.support.v4.b.b.a(c0006bArr);
            } else {
                android.support.v4.b.b.b(this.m, c0006bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // android.support.b.a.i.d
        public boolean a() {
            return true;
        }

        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!android.support.v4.a.a.c.a(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray a2 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.f108d);
            a(a2);
            a2.recycle();
        }

        private void a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.m = android.support.v4.b.b.b(string2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: a  reason: collision with root package name */
        int f126a;

        /* renamed from: b  reason: collision with root package name */
        float f127b;

        /* renamed from: c  reason: collision with root package name */
        int f128c;

        /* renamed from: d  reason: collision with root package name */
        float f129d;
        int e;
        float f;
        float g;
        float h;
        float i;
        Paint.Cap j;
        Paint.Join k;
        float l;
        private int[] p;

        public b() {
            this.f126a = 0;
            this.f127b = BitmapDescriptorFactory.HUE_RED;
            this.f128c = 0;
            this.f129d = 1.0f;
            this.e = 0;
            this.f = 1.0f;
            this.g = BitmapDescriptorFactory.HUE_RED;
            this.h = 1.0f;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.j = Paint.Cap.BUTT;
            this.k = Paint.Join.MITER;
            this.l = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f126a = 0;
            this.f127b = BitmapDescriptorFactory.HUE_RED;
            this.f128c = 0;
            this.f129d = 1.0f;
            this.e = 0;
            this.f = 1.0f;
            this.g = BitmapDescriptorFactory.HUE_RED;
            this.h = 1.0f;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.j = Paint.Cap.BUTT;
            this.k = Paint.Join.MITER;
            this.l = 4.0f;
            this.p = bVar.p;
            this.f126a = bVar.f126a;
            this.f127b = bVar.f127b;
            this.f129d = bVar.f129d;
            this.f128c = bVar.f128c;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
        }

        private Paint.Cap a(int i, Paint.Cap cap) {
            switch (i) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        private Paint.Join a(int i, Paint.Join join) {
            switch (i) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.f107c);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.p = null;
            if (!android.support.v4.a.a.c.a(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.m = android.support.v4.b.b.b(string2);
            }
            this.f128c = android.support.v4.a.a.c.b(typedArray, xmlPullParser, "fillColor", 1, this.f128c);
            this.f = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "fillAlpha", 12, this.f);
            this.j = a(android.support.v4.a.a.c.a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.j);
            this.k = a(android.support.v4.a.a.c.a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.k);
            this.l = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.l);
            this.f126a = android.support.v4.a.a.c.b(typedArray, xmlPullParser, "strokeColor", 3, this.f126a);
            this.f129d = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f129d);
            this.f127b = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "strokeWidth", 4, this.f127b);
            this.h = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.h);
            this.i = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.i);
            this.g = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "trimPathStart", 5, this.g);
            this.e = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "fillType", 13, this.e);
        }

        int getStrokeColor() {
            return this.f126a;
        }

        void setStrokeColor(int i) {
            this.f126a = i;
        }

        float getStrokeWidth() {
            return this.f127b;
        }

        void setStrokeWidth(float f) {
            this.f127b = f;
        }

        float getStrokeAlpha() {
            return this.f129d;
        }

        void setStrokeAlpha(float f) {
            this.f129d = f;
        }

        int getFillColor() {
            return this.f128c;
        }

        void setFillColor(int i) {
            this.f128c = i;
        }

        float getFillAlpha() {
            return this.f;
        }

        void setFillAlpha(float f) {
            this.f = f;
        }

        float getTrimPathStart() {
            return this.g;
        }

        void setTrimPathStart(float f) {
            this.g = f;
        }

        float getTrimPathEnd() {
            return this.h;
        }

        void setTrimPathEnd(float f) {
            this.h = f;
        }

        float getTrimPathOffset() {
            return this.i;
        }

        void setTrimPathOffset(float f) {
            this.i = f;
        }
    }
}
