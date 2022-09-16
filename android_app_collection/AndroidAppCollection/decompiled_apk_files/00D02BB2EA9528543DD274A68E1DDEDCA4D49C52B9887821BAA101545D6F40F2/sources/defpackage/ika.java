package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ika  reason: default package */
/* loaded from: classes6.dex */
public final class ika {
    public final ijy a;
    public final ikq b;
    public final iks c;
    private final Context j;
    private final ikp k;
    public final Path d = new Path();
    private final Path l = new Path();
    private final Path m = new Path();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final RectF h = new RectF();
    public final RectF i = new RectF();

    public ika(Context context, ijy ijyVar, ikp ikpVar, ikq ikqVar, iks iksVar) {
        this.j = context;
        this.a = ijyVar;
        this.k = ikpVar;
        this.b = ikqVar;
        this.c = iksVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Canvas canvas, int i, int i2, int i3) {
        this.m.addCircle(i, i2, i3, Path.Direction.CW);
        canvas.drawPath(this.m, ((ijv) this.k).c);
        this.m.rewind();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Canvas canvas, int i, int i2, int i3) {
        this.l.addCircle(i, i2, i3, Path.Direction.CW);
        c(canvas, this.l);
        canvas.drawPath(this.l, ((ijw) this.b).d);
        this.l.rewind();
    }

    public final void c(Canvas canvas, Path path) {
        canvas.drawPath(path, ((iju) this.a).i);
        canvas.drawPath(path, ((iju) this.a).j);
    }

    public final void d(Path path, float f, float f2, float f3, float f4, float f5, float f6) {
        path.rCubicTo(jmj.b(this.j, f), jmj.b(this.j, f2), jmj.b(this.j, f3), jmj.b(this.j, f4), jmj.b(this.j, f5), jmj.b(this.j, f6));
    }
}
