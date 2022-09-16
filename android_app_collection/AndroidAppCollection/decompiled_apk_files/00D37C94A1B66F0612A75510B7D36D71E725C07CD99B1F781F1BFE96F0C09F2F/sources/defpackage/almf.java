package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
/* compiled from: PG */
/* renamed from: almf  reason: default package */
/* loaded from: classes.dex */
public final class almf extends almc {
    public final almd a;
    public final alme b;

    public almf(Context context, allr allrVar, almd almdVar, alme almeVar) {
        super(context, allrVar);
        this.a = almdVar;
        almdVar.b = this;
        this.b = almeVar;
        almeVar.k = this;
    }

    @Override // defpackage.almc
    public final boolean b(boolean z, boolean z2, boolean z3) {
        boolean b = super.b(z, z2, z3);
        if (!isRunning()) {
            this.b.a();
        }
        float p = amyv.p(this.d.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && p > 0.0f))) {
            this.b.b();
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
        char c = 0;
        while (true) {
            alme almeVar = this.b;
            int[] iArr = almeVar.m;
            if (c <= 0) {
                almd almdVar = this.a;
                Paint paint = this.h;
                float[] fArr = almeVar.l;
                almdVar.c(canvas, paint, fArr[0], fArr[1], iArr[0]);
                c = 1;
            } else {
                canvas.restore();
                return;
            }
        }
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
}
