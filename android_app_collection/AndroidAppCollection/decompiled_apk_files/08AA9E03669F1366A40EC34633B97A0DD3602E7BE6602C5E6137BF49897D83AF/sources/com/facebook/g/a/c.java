package com.facebook.g.a;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.i.g;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: TextLayoutBuilder.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    static final g<Integer, Layout> f2493a = new g<>(100);

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.g.a.a f2496d;

    /* renamed from: b  reason: collision with root package name */
    final b f2494b = new b();

    /* renamed from: c  reason: collision with root package name */
    private Layout f2495c = null;
    private boolean e = true;
    private boolean f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextLayoutBuilder.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: b  reason: collision with root package name */
        int f2502b;

        /* renamed from: c  reason: collision with root package name */
        int f2503c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f2504d;

        /* renamed from: a  reason: collision with root package name */
        TextPaint f2501a = new a(1);
        float e = 1.0f;
        float f = BitmapDescriptorFactory.HUE_RED;
        boolean g = true;
        TextUtils.TruncateAt h = null;
        boolean i = false;
        int j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        Layout.Alignment k = Layout.Alignment.ALIGN_NORMAL;
        android.support.v4.h.b l = android.support.v4.h.c.f429c;
        boolean m = false;

        b() {
        }

        void a() {
            if (this.m) {
                this.f2501a = new a(this.f2501a);
                this.m = false;
            }
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((((((((((((((((((((this.f2501a != null ? this.f2501a.hashCode() : 0) + 31) * 31) + this.f2502b) * 31) + this.f2503c) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h != null ? this.h.hashCode() : 0)) * 31) + (this.i ? 1 : 0)) * 31) + this.j) * 31) + (this.k != null ? this.k.hashCode() : 0)) * 31) + (this.l != null ? this.l.hashCode() : 0)) * 31;
            if (this.f2504d != null) {
                i = this.f2504d.hashCode();
            }
            return hashCode + i;
        }
    }

    public c a(int i, int i2) {
        if (this.f2494b.f2502b != i || this.f2494b.f2503c != i2) {
            this.f2494b.f2502b = i;
            this.f2494b.f2503c = i2;
            this.f2495c = null;
        }
        return this;
    }

    public c a(CharSequence charSequence) {
        if (charSequence == this.f2494b.f2504d || !(charSequence == null || this.f2494b.f2504d == null || !charSequence.equals(this.f2494b.f2504d))) {
            return this;
        }
        this.f2494b.f2504d = charSequence;
        this.f2495c = null;
        return this;
    }

    public c a(int i) {
        float f = i;
        if (this.f2494b.f2501a.getTextSize() != f) {
            this.f2494b.a();
            this.f2494b.f2501a.setTextSize(f);
            this.f2495c = null;
        }
        return this;
    }

    public c a(float f) {
        if (this.f2494b.f != f) {
            this.f2494b.f = f;
            this.f2495c = null;
        }
        return this;
    }

    public c b(float f) {
        if (this.f2494b.e != f) {
            this.f2494b.e = f;
            this.f2495c = null;
        }
        return this;
    }

    public c a(boolean z) {
        if (this.f2494b.g != z) {
            this.f2494b.g = z;
            this.f2495c = null;
        }
        return this;
    }

    public c a(Layout.Alignment alignment) {
        if (this.f2494b.k != alignment) {
            this.f2494b.k = alignment;
            this.f2495c = null;
        }
        return this;
    }

    public c a(android.support.v4.h.b bVar) {
        if (this.f2494b.l != bVar) {
            this.f2494b.l = bVar;
            this.f2495c = null;
        }
        return this;
    }

    public c b(int i) {
        return a(Typeface.defaultFromStyle(i));
    }

    public c a(Typeface typeface) {
        if (this.f2494b.f2501a.getTypeface() != typeface) {
            this.f2494b.a();
            this.f2494b.f2501a.setTypeface(typeface);
            this.f2495c = null;
        }
        return this;
    }

    public c a(TextUtils.TruncateAt truncateAt) {
        if (this.f2494b.h != truncateAt) {
            this.f2494b.h = truncateAt;
            this.f2495c = null;
        }
        return this;
    }

    public c b(boolean z) {
        if (this.f2494b.i != z) {
            this.f2494b.i = z;
            this.f2495c = null;
        }
        return this;
    }

    public c c(int i) {
        if (this.f2494b.j != i) {
            this.f2494b.j = i;
            this.f2495c = null;
        }
        return this;
    }

    public c c(boolean z) {
        this.e = z;
        return this;
    }

    public c d(boolean z) {
        this.f = z;
        return this;
    }

    public c a(com.facebook.g.a.a aVar) {
        this.f2496d = aVar;
        return this;
    }

    public Layout a() {
        int ceil;
        IndexOutOfBoundsException indexOutOfBoundsException;
        Layout a2;
        if (this.e && this.f2495c != null) {
            return this.f2495c;
        }
        BoringLayout.Metrics metrics = null;
        if (TextUtils.isEmpty(this.f2494b.f2504d)) {
            return null;
        }
        int i = -1;
        boolean z = false;
        if (this.e && (this.f2494b.f2504d instanceof Spannable) && ((ClickableSpan[]) ((Spannable) this.f2494b.f2504d).getSpans(0, this.f2494b.f2504d.length() - 1, ClickableSpan.class)).length > 0) {
            z = true;
        }
        if (this.e && !z) {
            i = this.f2494b.hashCode();
            Layout layout = f2493a.get(Integer.valueOf(i));
            if (layout != null) {
                return layout;
            }
        }
        int i2 = this.f2494b.i ? 1 : this.f2494b.j;
        if (i2 == 1) {
            metrics = BoringLayout.isBoring(this.f2494b.f2504d, this.f2494b.f2501a);
        }
        BoringLayout.Metrics metrics2 = metrics;
        switch (this.f2494b.f2503c) {
            case 0:
                ceil = (int) Math.ceil(Layout.getDesiredWidth(this.f2494b.f2504d, this.f2494b.f2501a));
                break;
            case 1:
                ceil = this.f2494b.f2502b;
                break;
            case 2:
                ceil = Math.min((int) Math.ceil(Layout.getDesiredWidth(this.f2494b.f2504d, this.f2494b.f2501a)), this.f2494b.f2502b);
                break;
            default:
                throw new IllegalStateException("Unexpected measure mode " + this.f2494b.f2503c);
        }
        if (metrics2 != null) {
            a2 = BoringLayout.make(this.f2494b.f2504d, this.f2494b.f2501a, ceil, this.f2494b.k, this.f2494b.e, this.f2494b.f, metrics2, this.f2494b.g, this.f2494b.h, ceil);
        } else {
            while (true) {
                try {
                    try {
                        a2 = com.facebook.g.a.b.a(this.f2494b.f2504d, 0, this.f2494b.f2504d.length(), this.f2494b.f2501a, ceil, this.f2494b.k, this.f2494b.e, this.f2494b.f, this.f2494b.g, this.f2494b.h, ceil, i2, this.f2494b.l);
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        indexOutOfBoundsException = e;
                        if (!(this.f2494b.f2504d instanceof String)) {
                            Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", indexOutOfBoundsException);
                            this.f2494b.f2504d = this.f2494b.f2504d.toString();
                        } else {
                            throw indexOutOfBoundsException;
                        }
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
                Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", indexOutOfBoundsException);
                this.f2494b.f2504d = this.f2494b.f2504d.toString();
            }
        }
        if (this.e && !z) {
            this.f2495c = a2;
            f2493a.put(Integer.valueOf(i), a2);
        }
        this.f2494b.m = true;
        if (this.f && this.f2496d != null) {
            this.f2496d.a(a2);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextLayoutBuilder.java */
    /* loaded from: classes.dex */
    public static class a extends TextPaint {

        /* renamed from: a  reason: collision with root package name */
        private float f2497a;

        /* renamed from: b  reason: collision with root package name */
        private float f2498b;

        /* renamed from: c  reason: collision with root package name */
        private float f2499c;

        /* renamed from: d  reason: collision with root package name */
        private int f2500d;

        public a() {
        }

        public a(int i) {
            super(i);
        }

        public a(Paint paint) {
            super(paint);
        }

        @Override // android.graphics.Paint
        public void setShadowLayer(float f, float f2, float f3, int i) {
            this.f2499c = f;
            this.f2497a = f2;
            this.f2498b = f3;
            this.f2500d = i;
            super.setShadowLayer(f, f2, f3, i);
        }

        public int hashCode() {
            Typeface typeface = getTypeface();
            int color = ((((((((((((((getColor() + 31) * 31) + Float.floatToIntBits(getTextSize())) * 31) + (typeface != null ? typeface.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f2497a)) * 31) + Float.floatToIntBits(this.f2498b)) * 31) + Float.floatToIntBits(this.f2499c)) * 31) + this.f2500d) * 31) + this.linkColor;
            if (this.drawableState == null) {
                return (color * 31) + 0;
            }
            for (int i = 0; i < this.drawableState.length; i++) {
                color = (color * 31) + this.drawableState[i];
            }
            return color;
        }
    }
}
