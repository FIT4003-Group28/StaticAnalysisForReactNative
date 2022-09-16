package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahro  reason: default package */
/* loaded from: classes.dex */
public abstract class ahro {
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public final float[] b = new float[3];
    public final ahrn c = new ahrn();
    public final ahrn d = new ahrn();
    public float[] e = new float[9];
    public final ahrn f = new ahrn();
    public final float[] g = new float[9];
    public final ahrn h = new ahrn();
    public float[] i = null;
    public long j = Long.MIN_VALUE;
    public long k = Long.MIN_VALUE;
    protected long l = Long.MIN_VALUE;
    public boolean m = false;
    protected boolean n = false;
    protected float o = 0.02f;
    public ahrq p = null;
    public ahrt q = null;
    public float r = Float.NaN;
    public long s = 0;
    public float t = Float.NaN;

    public final void a(float[] fArr, int i, long j) {
        ahrt ahrtVar = this.q;
        if (ahrtVar != null) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
            float f4 = i;
            if (!Float.isNaN(sqrt) && !Float.isNaN(f4)) {
                if (!Float.isNaN(ahrtVar.d)) {
                    ahrtVar.d = ahrr.a(0.8f, ahrtVar.d, f4);
                } else {
                    ahrtVar.d = f4;
                }
                if (!Float.isNaN(ahrtVar.e)) {
                    ahrtVar.e = ahrr.a(0.8f, ahrtVar.e, sqrt);
                } else {
                    ahrtVar.e = sqrt;
                }
                ahrtVar.f = j;
                ahrtVar.e(Long.valueOf(j));
            }
        }
        d(j);
    }

    public final boolean b(long j) {
        return this.n && TimeUnit.MILLISECONDS.toSeconds(j - this.j) <= 1;
    }

    public final void c() {
        this.c.j();
        this.f.j();
        this.m = false;
        this.n = false;
        this.l = Long.MIN_VALUE;
        this.o = 0.02f;
        this.p = null;
    }

    public final void d(long j) {
        if (!this.m || this.i == null) {
            return;
        }
        long j2 = this.l;
        if (j2 != Long.MIN_VALUE && j - j2 < 30) {
            return;
        }
        this.o = 0.02f;
        ahrt ahrtVar = this.q;
        if (ahrtVar != null && ahrtVar.c()) {
            float b = this.q.b();
            if (Float.isNaN(this.t)) {
                this.t = b;
            } else {
                this.t = ahrr.a(0.988f, this.t, b);
            }
            if (b >= 40.0f) {
                this.o = 0.0f;
            }
        }
        if (this.f.b(this.h) < 0.0f) {
            ahrn ahrnVar = this.h;
            ahrnVar.a = -ahrnVar.a;
            ahrnVar.b = -ahrnVar.b;
            ahrnVar.c = -ahrnVar.c;
            ahrnVar.d = -ahrnVar.d;
        }
        ahrn ahrnVar2 = this.f;
        ahrnVar2.n(ahrnVar2, this.h, this.o);
        ahrnVar2.i(ahrnVar2);
        this.n = true;
        this.l = j;
    }

    public abstract void e(float f, float f2, float f3, long j);

    public abstract float f(int i, float[] fArr);
}
