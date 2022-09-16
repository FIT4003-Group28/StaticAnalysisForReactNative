package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class TextTrackView extends hbx {
    private long A;
    public gzf a;
    public hkl b;
    public gyq c;
    public hcn d;
    public final ImageView e;
    public final ImageView f;
    public final vfy g;
    public final int h;
    public boolean i;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private final TextView m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private HashMap s;
    private HashMap t;
    private float u;
    private float v;
    private int w;
    private hcg x;
    private float y;
    private float z;

    public TextTrackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.g = new vfy();
        this.A = TimeUnit.SECONDS.toMillis(15L);
        Resources resources = context.getResources();
        this.p = resources.getColor(R.color.timeline_track_default_color);
        int color = resources.getColor(R.color.text_color_white);
        this.q = color;
        this.r = resources.getColor(R.color.text_color_white_translucent_background);
        int color2 = resources.getColor(R.color.text_color_grey8);
        int color3 = resources.getColor(R.color.text_color_black);
        int color4 = resources.getColor(R.color.text_color_yellow);
        int color5 = resources.getColor(R.color.text_color_grey6);
        int color6 = resources.getColor(R.color.text_color_grey7);
        int color7 = resources.getColor(R.color.text_color_grey8);
        int color8 = resources.getColor(R.color.text_color_grey9);
        int color9 = resources.getColor(R.color.text_color_khaki);
        int color10 = resources.getColor(R.color.track_text_color_khaki);
        HashMap hashMap = new HashMap();
        this.s = hashMap;
        Integer valueOf = Integer.valueOf(color);
        Integer valueOf2 = Integer.valueOf(color3);
        hashMap.put(valueOf, valueOf2);
        this.s.put(Integer.valueOf(color4), valueOf2);
        this.s.put(Integer.valueOf(color5), valueOf2);
        this.s.put(Integer.valueOf(color6), valueOf2);
        this.s.put(Integer.valueOf(color7), valueOf2);
        HashMap hashMap2 = this.s;
        Integer valueOf3 = Integer.valueOf(color8);
        hashMap2.put(valueOf3, valueOf2);
        this.s.put(Integer.valueOf(color9), Integer.valueOf(color10));
        HashMap hashMap3 = new HashMap();
        this.t = hashMap3;
        Integer valueOf4 = Integer.valueOf(color);
        Integer valueOf5 = Integer.valueOf(color2);
        hashMap3.put(valueOf4, valueOf5);
        this.t.put(valueOf3, valueOf5);
        int intrinsicWidth = akf.a(context, R.drawable.ic_timeline_track_left_handle).getIntrinsicWidth();
        this.h = intrinsicWidth;
        this.n = intrinsicWidth / 2;
        this.o = resources.getDimensionPixelSize(R.dimen.trim_handle_touchable_width);
        TextView textView = new TextView(context);
        this.m = textView;
        addView(textView);
        ImageView n = n(context, R.drawable.ic_timeline_track_left_handle);
        this.e = n;
        ImageView n2 = n(context, R.drawable.ic_timeline_track_right_handle);
        this.f = n2;
        addView(n);
        addView(n2);
        textView.setImportantForAccessibility(2);
        n.setAccessibilityDelegate(new hcd(this, getContext()));
        n2.setAccessibilityDelegate(new hce(this, getContext()));
    }

    private final float k() {
        return this.e.getX() + this.n;
    }

    private final float l() {
        return this.f.getX() + this.n;
    }

    private static float m(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            return Float.NaN;
        }
        return motionEvent.getX(findPointerIndex);
    }

    private static ImageView n(Context context, int i) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(akf.a(context, i));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    private final void o(ImageView imageView, RectF rectF) {
        float f = this.o / 2.0f;
        float x = imageView.getX() + this.n;
        float f2 = x - f;
        float f3 = x + f;
        float f4 = 0.0f;
        if (f2 < 0.0f) {
            f4 = -f2;
        } else if (f3 > getWidth()) {
            f4 = getWidth() - f3;
        }
        rectF.left = f2 + f4;
        rectF.top = imageView.getTop();
        rectF.right = f3 + f4;
        rectF.bottom = imageView.getBottom();
    }

    private final void p() {
        long f;
        aqxo.y(this.i);
        q(false);
        this.b.o();
        gyq gyqVar = this.c;
        if (gyqVar != null) {
            gyqVar.a(actj.SHORTS_CREATION_EDITOR_TIMELINE_EDITOR_TEXT_TRACK).f();
        }
        if (this.x == hcg.BEGIN) {
            f = f(k() - this.n);
        } else {
            f = f(l() - (this.n * 3));
        }
        r(f, this.x, false);
        this.x = null;
        this.m.setText(this.d.a);
    }

    private final void q(boolean z) {
        this.i = z;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(long j, hcg hcgVar, boolean z) {
        hcg hcgVar2 = hcg.BEGIN;
        int ordinal = hcgVar.ordinal();
        if (ordinal == 0) {
            if (z) {
                this.a.h(j, new hcc(this, j, 1));
                return;
            }
            this.d.c(j);
            this.a.g(j);
        } else if (ordinal != 1) {
        } else {
            if (z) {
                this.a.h(j, new hcc(this, j));
                return;
            }
            this.d.b(j);
            this.a.g(j);
        }
    }

    private static final int s(int i) {
        return Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }

    public final int c(long j) {
        return (int) ((((float) j) * this.v) / ((float) g()));
    }

    public final long f(float f) {
        return Math.min((f / this.v) * ((float) g()), g());
    }

    public final long g() {
        long b = this.a.b();
        if (b > 0) {
            this.A = b;
        }
        return this.A;
    }

    public final void h(float f) {
        int i = (int) f;
        this.e.setLeft(i);
        this.e.setRight(this.h + i);
        this.m.setLeft(i + this.n);
    }

    public final void i(float f) {
        int i = (int) f;
        this.f.setLeft(this.h + i);
        ImageView imageView = this.f;
        int i2 = this.h;
        imageView.setRight(i2 + i2 + i);
        this.m.setRight(i + this.h);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        hcg hcgVar = null;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.x = null;
            }
        } else if (motionEvent.getPointerCount() == 1) {
            int pointerId = motionEvent.getPointerId(0);
            this.w = pointerId;
            float m = m(motionEvent, pointerId);
            RectF rectF = new RectF();
            o(this.e, rectF);
            float f = rectF.left;
            float f2 = rectF.right;
            o(this.f, rectF);
            float f3 = rectF.left;
            float f4 = rectF.right;
            if (f2 > f3) {
                float f5 = (f2 - f3) / 2.0f;
                f -= f5;
                f2 -= f5;
                f3 += f5;
                f4 += f5;
            }
            if (m >= f && m <= f2) {
                hcgVar = hcg.BEGIN;
            } else if (m >= f3 && m <= f4) {
                hcgVar = hcg.END;
            }
            this.x = hcgVar;
        }
        return this.x != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        this.j.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int i6 = this.n;
        this.y = paddingLeft + i6;
        this.z = width - i6;
        hcn hcnVar = this.d;
        int paddingTop = getPaddingTop();
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        hcnVar.e.left = paddingLeft;
        hcnVar.e.top = paddingTop;
        hcnVar.e.right = width;
        hcnVar.e.bottom = height - paddingBottom;
        float f = (this.z - this.y) - this.h;
        this.v = f;
        this.u = (f * 100.0f) / ((float) g());
        hcn hcnVar2 = this.d;
        Rect rect = hcnVar2.e;
        long j = hcnVar2.g;
        if (j == 0 || j > g()) {
            this.d.b(g());
        }
        this.l.left = c(this.d.f) + this.n;
        this.l.right = c(this.d.g) + (this.n * 3);
        int i7 = rect.top;
        int i8 = rect.bottom;
        int i9 = this.l.left;
        int i10 = this.n;
        int i11 = i9 - i10;
        this.e.layout(i11, i7, i10 + i10 + i11, i8);
        int i12 = this.l.right;
        int i13 = this.n;
        int i14 = i12 - i13;
        this.f.layout(i14, i7, i13 + i13 + i14, i8);
        this.m.setText(this.d.a);
        if (this.b.c()) {
            TextView textView = this.m;
            hcn hcnVar3 = this.d;
            int i15 = hcnVar3.b;
            int i16 = hcnVar3.c;
            if (s(i16) != this.r && i16 != 0) {
                i15 = i16;
            }
            int s = s(i15);
            HashMap hashMap = this.s;
            Integer valueOf = Integer.valueOf(s);
            if (hashMap.containsKey(valueOf)) {
                i5 = ((Integer) this.s.get(valueOf)).intValue();
            } else {
                i5 = this.q;
            }
            textView.setTextColor(i5);
            int i17 = this.q;
            if (i15 != i17) {
                i17 = s(i15);
            }
            HashMap hashMap2 = this.t;
            Integer valueOf2 = Integer.valueOf(i15);
            if (hashMap2.containsKey(valueOf2)) {
                i17 = ((Integer) this.t.get(valueOf2)).intValue();
            }
            textView.setBackgroundColor(i17);
        } else {
            this.m.setTextColor(-1);
            this.m.setBackgroundColor(this.p);
        }
        int height2 = getHeight();
        int paddingTop2 = getPaddingTop();
        int lineHeight = this.m.getLineHeight();
        this.m.setIncludeFontPadding(false);
        TextView textView2 = this.m;
        int i18 = this.n;
        int i19 = i18 + i18;
        textView2.setPadding(i19, ((height2 - (paddingTop2 + paddingTop2)) - lineHeight) / 2, i19, 0);
        this.m.setEllipsize(TextUtils.TruncateAt.END);
        this.m.setMaxLines(1);
        this.m.layout(this.l.left, i7, this.l.right, i8);
        this.e.setContentDescription(getResources().getString(R.string.accessibility_left_trim_handle, this.d.a));
        this.f.setContentDescription(getResources().getString(R.string.accessibility_right_trim_handle, this.d.a));
        getHitRect(this.k);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(amuk.r(this.k));
            this.f.setSystemGestureExclusionRects(amuk.r(this.k));
        }
        this.b.o();
        gyq gyqVar = this.c;
        if (gyqVar != null) {
            gyo a = gyqVar.a(actj.SHORTS_CREATION_EDITOR_TIMELINE_EDITOR_TEXT_TRACK);
            a.h(true);
            a.a();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.x == null) {
            return super.onTouchEvent(motionEvent);
        }
        float m = m(motionEvent, this.w);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                boolean z = false;
                if (this.i) {
                    if (this.x != null) {
                        z = true;
                    }
                    aqxo.y(z);
                    float k = k();
                    float l = l();
                    hcg hcgVar = hcg.BEGIN;
                    int ordinal = this.x.ordinal();
                    if (ordinal == 0) {
                        k = Math.max(this.y, Math.min(m, (l - this.h) - this.u));
                        int i = (int) k;
                        this.m.setLeft(i);
                        this.j.left = i;
                        r(f(k - this.n), this.x, true);
                    } else if (ordinal == 1) {
                        l = Math.min(this.z, Math.max(m, this.h + k + this.u));
                        int i2 = (int) l;
                        this.m.setRight(i2);
                        this.j.right = i2;
                        r(f(l - (this.n * 3)), this.x, true);
                    }
                    int i3 = (int) k;
                    this.e.setLeft(i3 - this.n);
                    this.e.setRight(i3 + this.n);
                    int i4 = (int) l;
                    this.f.setLeft(i4 - this.n);
                    this.f.setRight(i4 + this.n);
                } else {
                    if (this.x != null) {
                        z = true;
                    }
                    aqxo.y(z);
                    aqxo.y(!this.i);
                    this.a.e();
                    q(true);
                }
            } else if (actionMasked == 3 && this.i) {
                p();
            }
        } else if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.w) && this.i) {
            p();
        }
        return true;
    }
}
