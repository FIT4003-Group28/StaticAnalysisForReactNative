package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: dacb  reason: default package */
/* loaded from: classes5.dex */
public final class dacb extends dabx {
    public final daby a;
    public dabz<AnimatorSet> b;

    public dacb(Context context, dabg dabgVar, daby dabyVar, dabz<AnimatorSet> dabzVar) {
        super(context, dabgVar);
        this.a = dabyVar;
        dabyVar.a = this;
        b(dabzVar);
    }

    @Override // defpackage.dabx
    public final boolean a(boolean z, boolean z2, boolean z3) {
        boolean a = super.a(z, z2, z3);
        if (!isRunning()) {
            this.b.c();
            this.b.e();
        }
        if (z && z3) {
            this.b.b();
        }
        return a;
    }

    public final void b(dabz<AnimatorSet> dabzVar) {
        this.b = dabzVar;
        dabzVar.a(this);
        this.g = new daca(this);
        g(1.0f);
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
        int i = 0;
        while (true) {
            dabz<AnimatorSet> dabzVar = this.b;
            int[] iArr = dabzVar.o;
            if (i < iArr.length) {
                daby dabyVar = this.a;
                Paint paint = this.h;
                float[] fArr = dabzVar.n;
                int i2 = i + i;
                dabyVar.d(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                i++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a();
    }
}
