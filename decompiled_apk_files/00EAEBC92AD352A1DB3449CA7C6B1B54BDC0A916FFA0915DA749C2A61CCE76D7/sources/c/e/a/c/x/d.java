package c.e.a.c.x;

import a.g.e.f.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import c.e.a.c.k;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final float f4787a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f4788b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4789c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4790d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4791e;

    /* renamed from: f  reason: collision with root package name */
    public final ColorStateList f4792f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4793g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4794h;
    public final float i;
    private final int j;
    private boolean k = false;
    private Typeface l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f4795a;

        a(f fVar) {
            this.f4795a = fVar;
        }

        @Override // a.g.e.f.f.a
        public void a(int i) {
            d.this.k = true;
            this.f4795a.a(i);
        }

        @Override // a.g.e.f.f.a
        public void a(Typeface typeface) {
            d dVar = d.this;
            dVar.l = Typeface.create(typeface, dVar.f4789c);
            d.this.k = true;
            this.f4795a.a(d.this.l, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextPaint f4797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f4798b;

        b(TextPaint textPaint, f fVar) {
            this.f4797a = textPaint;
            this.f4798b = fVar;
        }

        @Override // c.e.a.c.x.f
        public void a(int i) {
            this.f4798b.a(i);
        }

        @Override // c.e.a.c.x.f
        public void a(Typeface typeface, boolean z) {
            d.this.a(this.f4797a, typeface);
            this.f4798b.a(typeface, z);
        }
    }

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, k.TextAppearance);
        this.f4787a = obtainStyledAttributes.getDimension(k.TextAppearance_android_textSize, 0.0f);
        this.f4788b = c.a(context, obtainStyledAttributes, k.TextAppearance_android_textColor);
        c.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorHint);
        c.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorLink);
        this.f4789c = obtainStyledAttributes.getInt(k.TextAppearance_android_textStyle, 0);
        this.f4790d = obtainStyledAttributes.getInt(k.TextAppearance_android_typeface, 1);
        int a2 = c.a(obtainStyledAttributes, k.TextAppearance_fontFamily, k.TextAppearance_android_fontFamily);
        this.j = obtainStyledAttributes.getResourceId(a2, 0);
        this.f4791e = obtainStyledAttributes.getString(a2);
        obtainStyledAttributes.getBoolean(k.TextAppearance_textAllCaps, false);
        this.f4792f = c.a(context, obtainStyledAttributes, k.TextAppearance_android_shadowColor);
        this.f4793g = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDx, 0.0f);
        this.f4794h = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDy, 0.0f);
        this.i = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void b() {
        String str;
        if (this.l == null && (str = this.f4791e) != null) {
            this.l = Typeface.create(str, this.f4789c);
        }
        if (this.l == null) {
            int i = this.f4790d;
            this.l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.l = Typeface.create(this.l, this.f4789c);
        }
    }

    public Typeface a() {
        b();
        return this.l;
    }

    public Typeface a(Context context) {
        if (this.k) {
            return this.l;
        }
        if (!context.isRestricted()) {
            try {
                this.l = a.g.e.f.f.a(context, this.j);
                if (this.l != null) {
                    this.l = Typeface.create(this.l, this.f4789c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f4791e, e2);
            }
        }
        b();
        this.k = true;
        return this.l;
    }

    public void a(Context context, TextPaint textPaint, f fVar) {
        a(textPaint, a());
        a(context, new b(textPaint, fVar));
    }

    public void a(Context context, f fVar) {
        if (e.a()) {
            a(context);
        } else {
            b();
        }
        if (this.j == 0) {
            this.k = true;
        }
        if (this.k) {
            fVar.a(this.l, true);
            return;
        }
        try {
            a.g.e.f.f.a(context, this.j, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            fVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f4791e, e2);
            this.k = true;
            fVar.a(-3);
        }
    }

    public void a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f4789c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f4787a);
    }

    public void b(Context context, TextPaint textPaint, f fVar) {
        c(context, textPaint, fVar);
        ColorStateList colorStateList = this.f4788b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.i;
        float f3 = this.f4793g;
        float f4 = this.f4794h;
        ColorStateList colorStateList2 = this.f4792f;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void c(Context context, TextPaint textPaint, f fVar) {
        if (e.a()) {
            a(textPaint, a(context));
        } else {
            a(context, textPaint, fVar);
        }
    }
}
