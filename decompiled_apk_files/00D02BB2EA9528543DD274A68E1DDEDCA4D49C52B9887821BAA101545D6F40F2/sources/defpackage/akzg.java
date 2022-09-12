package defpackage;

import android.animation.TypeEvaluator;
/* compiled from: PG */
/* renamed from: akzg  reason: default package */
/* loaded from: classes.dex */
public final class akzg implements TypeEvaluator<Float> {
    public final akzh a;
    public final akzp b = new akzp();
    final akzq c;
    public float d;
    public int e;
    @dzsi
    public alad f;
    @dzsi
    public alad g;
    public long h;
    float i;
    float j;

    public akzg(akzq akzqVar, akzh akzhVar) {
        dbsk.s(akzqVar);
        this.c = akzqVar;
        dbsk.s(akzhVar);
        this.a = akzhVar;
        this.d = akzhVar.C();
        this.e = akzhVar.z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float a(float f) {
        int i = this.e;
        float B = this.a.B();
        alad aladVar = this.f;
        dbsk.s(aladVar);
        return (float) akqo.m(f, aladVar.i.a, this.d, (int) (i / B));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
        float n;
        alad aladVar;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            aladVar = this.f;
        } else if (f < 1.0f) {
            akzq akzqVar = this.c;
            if (akzqVar.c != 0.0f) {
                float f5 = akzqVar.a;
                double pow = Math.pow(f5 + ((akzqVar.b - f5) * f), 2.0d);
                double d = akzqVar.c;
                Double.isNaN(d);
                f4 = (float) (1.0d - (pow / d));
            }
            float f6 = this.j;
            float f7 = this.i;
            int i = this.e;
            float B = this.a.B();
            alad aladVar2 = this.f;
            dbsk.s(aladVar2);
            n = (float) akqo.n(f6 + (f7 * f4), aladVar2.i.a, this.d, (int) (i / B));
            return Float.valueOf(n);
        } else {
            aladVar = this.g;
        }
        dbsk.s(aladVar);
        n = aladVar.k;
        return Float.valueOf(n);
    }
}
