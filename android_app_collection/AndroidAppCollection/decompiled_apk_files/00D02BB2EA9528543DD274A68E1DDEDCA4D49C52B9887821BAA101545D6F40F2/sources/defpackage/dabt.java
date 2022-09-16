package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AndroidRuntimeException;
/* compiled from: PG */
/* renamed from: dabt  reason: default package */
/* loaded from: classes5.dex */
public final class dabt extends dabx {
    private static final aoc<dabt> n = new dabs();
    public final daby a;
    public float b;
    private final dabi j;
    private final aoe k;
    private final aod l;
    private boolean m;

    public dabt(Context context, dabi dabiVar, dabg dabgVar, daby dabyVar) {
        super(context, dabgVar);
        this.m = false;
        this.j = dabiVar;
        this.a = dabyVar;
        dabyVar.a = this;
        aoe aoeVar = new aoe();
        this.k = aoeVar;
        aoeVar.b = 1.0d;
        aoeVar.c = false;
        aoeVar.d(50.0f);
        aod aodVar = new aod(this, n);
        this.l = aodVar;
        aodVar.n = aoeVar;
        g(1.0f);
    }

    @Override // defpackage.dabx
    public final boolean a(boolean z, boolean z2, boolean z3) {
        boolean a = super.a(z, z2, z3);
        float a2 = dabh.a(this.c.getContentResolver());
        if (a2 == 0.0f) {
            this.m = true;
        } else {
            this.m = false;
            this.k.d(50.0f / a2);
        }
        return a;
    }

    public final void b(float f) {
        this.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.a.c(canvas, f());
        this.a.e(canvas, this.h);
        this.a.d(canvas, this.h, 0.0f, this.b, czxb.c(this.j.c[0], this.i));
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.l.e();
        b(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.m) {
            this.l.e();
            b(i / 10000.0f);
        } else {
            aod aodVar = this.l;
            aodVar.h = this.b * 10000.0f;
            aodVar.i = true;
            float f = i;
            if (aodVar.l) {
                aodVar.o = f;
            } else {
                if (aodVar.n == null) {
                    aodVar.n = new aoe(f);
                }
                aodVar.n.c(f);
                aoe aoeVar = aodVar.n;
                if (aoeVar != null) {
                    double a = aoeVar.a();
                    if (a > 3.4028234663852886E38d) {
                        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                    }
                    if (a >= -3.4028234663852886E38d) {
                        aoe aoeVar2 = aodVar.n;
                        double abs = Math.abs(aodVar.m * 0.75f);
                        aoeVar2.d = abs;
                        aoeVar2.e = abs * 62.5d;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            if (!aodVar.l) {
                                aodVar.l = true;
                                if (!aodVar.i) {
                                    aodVar.h = ((dabt) aodVar.j).b * 10000.0f;
                                }
                                float f2 = aodVar.h;
                                if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
                                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                                }
                                anq a2 = anq.a();
                                if (a2.b.size() == 0) {
                                    a2.g.a(a2.d);
                                }
                                if (!a2.b.contains(aodVar)) {
                                    a2.b.add(aodVar);
                                }
                            }
                        } else {
                            throw new AndroidRuntimeException("Animations may only be started on the main thread");
                        }
                    } else {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                } else {
                    throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
                }
            }
        }
        return true;
    }
}
