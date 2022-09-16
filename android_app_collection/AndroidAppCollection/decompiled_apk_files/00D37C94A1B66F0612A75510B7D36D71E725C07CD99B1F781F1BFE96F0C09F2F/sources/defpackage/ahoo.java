package defpackage;

import android.opengl.Matrix;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahoo  reason: default package */
/* loaded from: classes.dex */
public final class ahoo {
    public float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    private float[] f;
    private float[] g;
    private ahoo h;
    private boolean j = true;
    private final List i = new LinkedList();
    private final float[] e = new float[16];

    private ahoo() {
    }

    public static ahoo b() {
        ahoo ahooVar = new ahoo();
        ahooVar.a = new float[16];
        ahooVar.f = new float[16];
        float[] fArr = new float[16];
        ahooVar.b = fArr;
        ahooVar.c = new float[16];
        ahooVar.d = new float[16];
        ahooVar.g = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(ahooVar.a, 0);
        Matrix.setIdentityM(ahooVar.f, 0);
        Matrix.setIdentityM(ahooVar.c, 0);
        Matrix.setIdentityM(ahooVar.d, 0);
        Matrix.setIdentityM(ahooVar.g, 0);
        return ahooVar;
    }

    /* renamed from: a */
    public final ahoo clone() {
        ahoo ahooVar = new ahoo();
        ahooVar.a = (float[]) this.a.clone();
        ahooVar.f = (float[]) this.f.clone();
        ahooVar.b = (float[]) this.b.clone();
        ahooVar.c = (float[]) this.c.clone();
        ahooVar.d = (float[]) this.d.clone();
        ahooVar.g = (float[]) this.g.clone();
        ahooVar.d(this.h);
        ahooVar.j = this.j;
        return ahooVar;
    }

    public final void c() {
        Matrix.setIdentityM(this.f, 0);
        g();
    }

    public final void d(ahoo ahooVar) {
        if (ahooVar == null) {
            return;
        }
        this.h = ahooVar;
        ahooVar.i.add(this);
        g();
    }

    public final void e(boolean z) {
        this.j = z;
        g();
    }

    public final void f(float f, float f2, float f3) {
        Matrix.translateM(this.b, 0, f, f2, f3);
        h();
        g();
    }

    public final void g() {
        Matrix.multiplyMM(this.e, 0, this.f, 0, this.g, 0);
        Matrix.multiplyMM(this.a, 0, this.e, 0, this.d, 0);
        ahoo ahooVar = this.h;
        if (ahooVar != null && this.j) {
            Matrix.multiplyMM(this.e, 0, ahooVar.a, 0, this.a, 0);
            System.arraycopy(this.e, 0, this.a, 0, 16);
        }
        for (ahoo ahooVar2 : this.i) {
            ahooVar2.g();
        }
    }

    public final void h() {
        Matrix.multiplyMM(this.g, 0, this.b, 0, this.c, 0);
        g();
    }

    public final void i(float f, float f2, float f3) {
        Matrix.rotateM(this.f, 0, f, f2, f3, 0.0f);
        g();
    }

    public final void j(float f) {
        Matrix.setIdentityM(this.f, 0);
        Matrix.rotateM(this.f, 0, f, 0.0f, 1.0f, 0.0f);
        g();
    }
}
