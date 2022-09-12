package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: daeh  reason: default package */
/* loaded from: classes.dex */
public final class daeh {
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
    public final List<daef> f = new ArrayList();
    private final List<daeg> g = new ArrayList();

    public daeh() {
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
            daed daedVar = new daed(f4, f5, f4, f5);
            daedVar.e = this.d;
            daedVar.f = f3;
            this.g.add(new daeb(daedVar));
            this.d = f;
        }
    }

    public final void a(float f, float f2) {
        daee daeeVar = new daee();
        daeeVar.a = f;
        daeeVar.b = f2;
        this.f.add(daeeVar);
        daec daecVar = new daec(daeeVar, this.b, this.c);
        d(daecVar, daecVar.b() + 270.0f, daecVar.b() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void b(Matrix matrix, Path path) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final daeg c(Matrix matrix) {
        g(this.e);
        return new daea(new ArrayList(this.g), new Matrix(matrix));
    }

    public final void d(daeg daegVar, float f, float f2) {
        g(f);
        this.g.add(daegVar);
        this.d = f2;
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
