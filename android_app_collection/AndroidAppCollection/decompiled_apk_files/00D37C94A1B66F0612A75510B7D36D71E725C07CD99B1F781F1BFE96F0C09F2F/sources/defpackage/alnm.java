package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alnm  reason: default package */
/* loaded from: classes.dex */
public final class alnm {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public alnm() {
        e();
    }

    private final void g(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.b;
            float f5 = this.c;
            alni alniVar = new alni(f4, f5, f4, f5);
            alniVar.e = this.d;
            alniVar.f = f3;
            this.g.add(new alng(alniVar));
            this.d = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alnl a(Matrix matrix) {
        g(this.e);
        return new alnf(new ArrayList(this.g), new Matrix(matrix));
    }

    public final void b(alnl alnlVar, float f, float f2) {
        g(f);
        this.g.add(alnlVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((alnk) this.f.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        alnj alnjVar = new alnj();
        alnjVar.a = f;
        alnjVar.b = f2;
        this.f.add(alnjVar);
        alnh alnhVar = new alnh(alnjVar, this.b, this.c);
        b(alnhVar, alnhVar.b() + 270.0f, alnhVar.b() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e() {
        f(0.0f, 270.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
