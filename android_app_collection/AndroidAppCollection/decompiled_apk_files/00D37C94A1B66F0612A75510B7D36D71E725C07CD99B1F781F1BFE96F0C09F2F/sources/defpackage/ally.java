package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: ally  reason: default package */
/* loaded from: classes.dex */
public final class ally extends almc {
    public static final /* synthetic */ int c = 0;
    private static final and j = new allx();
    public final almd a;
    public float b;
    private final ang k;
    private final anf l;
    private boolean m;

    public ally(Context context, allr allrVar, almd almdVar) {
        super(context, allrVar);
        this.m = false;
        this.a = almdVar;
        almdVar.b = this;
        ang angVar = new ang();
        this.k = angVar;
        angVar.c();
        angVar.e(50.0f);
        anf anfVar = new anf(this, j);
        this.l = anfVar;
        anfVar.n = angVar;
        e(1.0f);
    }

    public final void a(float f) {
        this.b = f;
        invalidateSelf();
    }

    @Override // defpackage.almc
    public final boolean b(boolean z, boolean z2, boolean z3) {
        boolean b = super.b(z, z2, z3);
        float p = amyv.p(this.d.getContentResolver());
        if (p == 0.0f) {
            this.m = true;
        } else {
            this.m = false;
            this.k.e(50.0f / p);
        }
        return b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.a.b(canvas, c());
        this.a.d(canvas, this.h);
        this.a.c(canvas, this.h, 0.0f, this.b, amxp.x(this.e.c[0], this.i));
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a();
    }

    @Override // defpackage.almc, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.l.k();
        a(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.m) {
            this.l.k();
            a(i / 10000.0f);
            return true;
        }
        this.l.h(this.b * 10000.0f);
        this.l.i(i);
        return true;
    }
}
