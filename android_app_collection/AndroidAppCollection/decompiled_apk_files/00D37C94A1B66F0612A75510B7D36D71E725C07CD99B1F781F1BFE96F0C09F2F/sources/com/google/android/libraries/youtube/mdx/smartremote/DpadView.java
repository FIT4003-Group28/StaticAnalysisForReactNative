package com.google.android.libraries.youtube.mdx.smartremote;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class DpadView extends View {
    private static final int f = Color.argb((int) PrivateKeyType.INVALID, 144, 144, 144);
    private static final int g = Color.argb((int) PrivateKeyType.INVALID, 26, 26, 26);
    private static final int h = Color.argb((int) PrivateKeyType.INVALID, 144, 144, 144);
    private float A;
    public adrt a;
    public final Map b;
    public final Handler c;
    public final adru d;
    public adry e;
    private final adrs i;
    private Drawable j;
    private Path k;
    private final Map l;
    private final ArrayList m;
    private final Paint n;
    private float o;
    private float p;
    private float q;
    private final RectF r;
    private float s;
    private float t;
    private float u;
    private final RectF v;
    private float w;
    private float x;
    private float y;
    private float z;

    public DpadView(Context context) {
        super(context);
        this.i = new adrs(this, this);
        this.k = new Path();
        this.l = new HashMap(5);
        this.b = new HashMap(5);
        this.m = new ArrayList(4);
        this.d = new adru(this);
        this.n = new Paint();
        this.r = new RectF();
        this.v = new RectF();
        this.c = new Handler(Looper.getMainLooper());
        c(context);
    }

    private final float b(float f2, float f3) {
        return (float) Math.toDegrees(Math.atan2(f3 - this.p, f2 - this.o));
    }

    private final void c(Context context) {
        this.j = context.getResources().getDrawable(R.drawable.mdx_dpad_ripple_drawable);
        lj.M(this, this.i);
    }

    private final void d() {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setState(new int[]{16842910});
        }
        this.k = null;
        invalidate();
    }

    public final adrt a(float f2, float f3) {
        float hypot = (float) Math.hypot(this.o - f2, this.p - f3);
        float b = b(f2, f3);
        if (hypot > this.u) {
            return null;
        }
        if (hypot < this.q) {
            return adrt.ENTER;
        }
        if (b >= 45.0f && b < 135.0f) {
            return adrt.DOWN;
        }
        if (b >= 135.0f || b < -135.0f) {
            return adrt.LEFT;
        }
        if (b < -135.0f || b >= -45.0f) {
            return adrt.RIGHT;
        }
        return adrt.UP;
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.i.t(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (adrt adrtVar : this.l.keySet()) {
            this.n.setColor(adrtVar == adrt.ENTER ? f : g);
            canvas.drawPath((Path) this.l.get(adrtVar), this.n);
        }
        this.n.setColor(h);
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            canvas.drawPath((Path) this.m.get(i), this.n);
        }
        if (this.k != null) {
            if (this.j != null) {
                canvas.save();
                canvas.clipPath(this.k);
                this.j.draw(canvas);
                canvas.restore();
                return;
            }
            this.n.setColor(0);
            canvas.drawPath(this.k, this.n);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int min;
        float b;
        super.onSizeChanged(i, i2, i3, i4);
        this.o = i >> 1;
        this.p = i2 >> 1;
        float min2 = Math.min(i2, i);
        this.q = 0.15f * min2;
        float f2 = 0.17f * min2;
        RectF rectF = this.r;
        float f3 = this.o;
        float f4 = this.p;
        rectF.set(f3 - f2, f4 - f2, f3 + f2, f4 + f2);
        this.s = 0.11247f * min2;
        this.t = 0.12747f * min2;
        this.u = min >> 1;
        this.v.set(0.0f, 0.0f, min2, min2);
        this.w = 0.34597f * min2;
        this.x = 0.36097f * min2;
        this.y = 0.34f * min2;
        this.z = 0.0375f * min2;
        this.A = min2 * 0.07f;
        this.l.clear();
        this.b.clear();
        Path path = new Path();
        path.addCircle(this.o, this.p, this.q, Path.Direction.CW);
        this.l.put(adrt.ENTER, path);
        Map map = this.b;
        adrt adrtVar = adrt.ENTER;
        float f5 = this.o;
        float f6 = this.q;
        float f7 = this.p;
        map.put(adrtVar, new Rect((int) (f5 - f6), (int) (f7 - f6), (int) (f5 + f6), (int) (f7 + f6)));
        Path path2 = new Path();
        float f8 = this.o;
        float f9 = f8 - this.t;
        float f10 = this.p;
        float f11 = this.s;
        float f12 = f10 - f11;
        float f13 = f8 - this.x;
        float f14 = this.w;
        float f15 = f10 - f14;
        float f16 = f14 + f10;
        float f17 = f10 + f11;
        path2.moveTo(f9, f12);
        path2.arcTo(this.v, b(f13, f15), (b(f13, f16) - b) - 360.0f, false);
        float b2 = b(f9, f17);
        path2.arcTo(this.r, b2, (b(f9, f12) - b2) + 360.0f, false);
        this.l.put(adrt.LEFT, path2);
        this.b.put(adrt.LEFT, new Rect(0, (int) f15, (int) f9, (int) f16));
        Path path3 = new Path();
        float f18 = this.o;
        float f19 = this.s;
        float f20 = f18 - f19;
        float f21 = this.p;
        float f22 = this.t + f21;
        float f23 = this.w;
        float f24 = f18 - f23;
        float f25 = f21 + this.x;
        float f26 = f23 + f18;
        path3.moveTo(f20, f22);
        float b3 = b(f24, f25);
        path3.arcTo(this.v, b3, b(f26, f25) - b3, false);
        float b4 = b(f18 + f19, f22);
        path3.arcTo(this.r, b4, b(f20, f22) - b4, false);
        this.l.put(adrt.DOWN, path3);
        Map map2 = this.b;
        adrt adrtVar2 = adrt.DOWN;
        float f27 = this.o;
        map2.put(adrtVar2, new Rect((int) f24, (int) f22, (int) f26, (int) (f27 + f27)));
        Path path4 = new Path();
        float f28 = this.o;
        float f29 = this.t + f28;
        float f30 = this.p;
        float f31 = this.s;
        float f32 = f30 + f31;
        float f33 = f28 + this.x;
        float f34 = this.w;
        float f35 = f30 + f34;
        float f36 = f30 - f34;
        path4.moveTo(f29, f32);
        float b5 = b(f33, f35);
        path4.arcTo(this.v, b5, b(f33, f36) - b5, false);
        float b6 = b(f29, f30 - f31);
        path4.arcTo(this.r, b6, b(f29, f32) - b6, false);
        this.l.put(adrt.RIGHT, path4);
        Map map3 = this.b;
        adrt adrtVar3 = adrt.RIGHT;
        float f37 = this.o;
        map3.put(adrtVar3, new Rect((int) f29, (int) f36, (int) (f37 + f37), (int) f35));
        Path path5 = new Path();
        float f38 = this.o;
        float f39 = this.s;
        float f40 = f38 + f39;
        float f41 = this.p;
        float f42 = f41 - this.t;
        float f43 = this.w;
        float f44 = f38 + f43;
        float f45 = f41 - this.x;
        float f46 = f38 - f43;
        path5.moveTo(f40, f42);
        float b7 = b(f44, f45);
        path5.arcTo(this.v, b7, b(f46, f45) - b7, false);
        float b8 = b(f38 - f39, f42);
        path5.arcTo(this.r, b8, b(f40, f42) - b8, false);
        this.l.put(adrt.UP, path5);
        this.b.put(adrt.UP, new Rect((int) f46, 0, (int) f44, (int) f42));
        this.m.clear();
        Path path6 = new Path();
        path6.moveTo(this.o - this.y, this.p - this.z);
        path6.lineTo((this.o - this.y) - this.A, this.p);
        path6.lineTo(this.o - this.y, this.p + this.z);
        this.m.add(path6);
        Path path7 = new Path();
        path7.moveTo(this.o - this.z, this.p + this.y);
        path7.lineTo(this.o, this.p + this.y + this.A);
        path7.lineTo(this.o + this.z, this.p + this.y);
        this.m.add(path7);
        Path path8 = new Path();
        path8.moveTo(this.o + this.y, this.p - this.z);
        path8.lineTo(this.o + this.y + this.A, this.p);
        path8.lineTo(this.o + this.y, this.p + this.z);
        this.m.add(path8);
        Path path9 = new Path();
        path9.moveTo(this.o - this.z, this.p - this.y);
        path9.lineTo(this.o, (this.p - this.y) - this.A);
        path9.lineTo(this.o + this.z, this.p - this.y);
        this.m.add(path9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        adrt a = a(x, y);
        int action = motionEvent.getAction();
        if (action == 0) {
            if (a != null) {
                Drawable drawable = this.j;
                if (drawable != null) {
                    drawable.setBounds((Rect) this.b.get(a));
                    this.j.setHotspot(x, y);
                    this.j.setState(new int[]{16842910, 16842919});
                }
                this.k = (Path) this.l.get(a);
                invalidate();
            }
            this.a = a;
            if (a != adrt.ENTER) {
                performClick();
                this.c.postDelayed(this.d, 500L);
            }
        } else if (action == 1) {
            d();
            if (this.a == adrt.ENTER) {
                performClick();
            } else {
                this.c.removeCallbacks(this.d);
            }
        } else if (action == 2) {
            if (a != this.a) {
                d();
                this.a = null;
                this.c.removeCallbacks(this.d);
            }
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        adrt adrtVar;
        acup b;
        super.performClick();
        adry adryVar = this.e;
        if (adryVar == null || (adrtVar = this.a) == null) {
            return false;
        }
        adsg adsgVar = adryVar.a;
        if (adsgVar.c != null) {
            int ordinal = adrtVar.ordinal();
            adnr adnrVar = null;
            if (ordinal == 0) {
                b = acuo.b(61410);
            } else if (ordinal == 1) {
                b = acuo.b(61404);
            } else if (ordinal == 2) {
                b = acuo.b(61406);
            } else if (ordinal != 3) {
                b = ordinal != 4 ? null : acuo.b(61405);
            } else {
                b = acuo.b(61409);
            }
            if (b != null) {
                int i = true != adsgVar.B ? 3 : 2;
                aopa createBuilder = asjj.a.createBuilder();
                aopa createBuilder2 = asja.a.createBuilder();
                createBuilder2.copyOnWrite();
                asja asjaVar = (asja) createBuilder2.instance;
                asjaVar.c = i - 1;
                asjaVar.b |= 1;
                asja asjaVar2 = (asja) createBuilder2.mo39build();
                createBuilder.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder.instance;
                asjaVar2.getClass();
                asjjVar.m = asjaVar2;
                asjjVar.b |= 32768;
                adsgVar.h.H(3, new acte(b), (asjj) createBuilder.mo39build());
            }
            adnt adntVar = adsgVar.c;
            int ordinal2 = adrtVar.ordinal();
            if (ordinal2 == 0) {
                adnrVar = adnr.KEY_UP;
            } else if (ordinal2 == 1) {
                adnrVar = adnr.KEY_DOWN;
            } else if (ordinal2 == 2) {
                adnrVar = adnr.KEY_LEFT;
            } else if (ordinal2 == 3) {
                adnrVar = adnr.KEY_RIGHT;
            } else if (ordinal2 == 4) {
                adnrVar = adnr.KEY_ENTER;
            }
            adntVar.ag(adnrVar);
        }
        return true;
    }

    public DpadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new adrs(this, this);
        this.k = new Path();
        this.l = new HashMap(5);
        this.b = new HashMap(5);
        this.m = new ArrayList(4);
        this.d = new adru(this);
        this.n = new Paint();
        this.r = new RectF();
        this.v = new RectF();
        this.c = new Handler(Looper.getMainLooper());
        c(context);
    }

    public DpadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new adrs(this, this);
        this.k = new Path();
        this.l = new HashMap(5);
        this.b = new HashMap(5);
        this.m = new ArrayList(4);
        this.d = new adru(this);
        this.n = new Paint();
        this.r = new RectF();
        this.v = new RectF();
        this.c = new Handler(Looper.getMainLooper());
        c(context);
    }
}
