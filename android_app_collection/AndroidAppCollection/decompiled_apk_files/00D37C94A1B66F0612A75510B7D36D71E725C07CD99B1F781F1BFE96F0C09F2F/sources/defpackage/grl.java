package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* compiled from: PG */
/* renamed from: grl  reason: default package */
/* loaded from: classes3.dex */
public final class grl extends View {
    public Paint a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public boolean g;

    public grl(Context context) {
        super(context);
        this.e = -1.0f;
        this.g = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        float f = this.e;
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        if (this.g) {
            int width2 = getWidth();
            width = ((int) ((width2 - (i + i)) * this.e)) + this.f;
        } else {
            width = (int) (getWidth() * this.e);
        }
        int i2 = this.b / 2;
        int i3 = this.c;
        int height = getHeight();
        int i4 = this.c;
        float f2 = this.d;
        canvas.drawRoundRect(width - i2, i3, width + i2, height - i4, f2, f2, this.a);
    }
}
