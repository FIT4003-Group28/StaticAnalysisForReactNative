package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: akqn  reason: default package */
/* loaded from: classes.dex */
public abstract class akqn {
    public static final akrk[] a = new akrk[0];

    public abstract int b(dspd dspdVar);

    protected int c(dspd dspdVar, int i) {
        int b = b(dspdVar);
        if (i <= b) {
            return i == 0 ? b : i;
        }
        throw new IOException("Buffer too small for the given number of vertices");
    }

    public int[] d(dspd dspdVar, int i) {
        int c = c(dspdVar, i);
        int[] iArr = new int[c + c];
        e(dspdVar, c, 0, iArr);
        return iArr;
    }

    public abstract void e(dspd dspdVar, int i, int i2, int[] iArr);

    public final float[] f(dspd dspdVar, int i) {
        int c = c(dspdVar, i);
        float[] fArr = new float[c + c];
        g(dspdVar, c, 0, fArr);
        return fArr;
    }

    public abstract void g(dspd dspdVar, int i, int i2, float[] fArr);

    public final akra h(dspd dspdVar) {
        akra akraVar = new akra();
        i(dspdVar, akraVar);
        return akraVar;
    }

    public final void i(dspd dspdVar, akra akraVar) {
        int[] d = d(dspdVar, 1);
        if (d.length < 2) {
            throw new IOException("Too few vertices for getPoint");
        }
        akraVar.t(d[0], d[1]);
    }

    public final akrk j(dspd dspdVar, int i) {
        return akrk.c(d(dspdVar, i));
    }
}
