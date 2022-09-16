package defpackage;
/* compiled from: PG */
/* renamed from: bir  reason: default package */
/* loaded from: classes2.dex */
public final class bir {
    public static final bir a;
    public static final bir b;
    public static final bir c;
    public static final bir d;
    public static final bir e;
    public static final bir f;
    final float[] g;
    final float[] h;
    final float[] i;
    final boolean j = true;

    static {
        bir birVar = new bir();
        a = birVar;
        e(birVar);
        h(birVar);
        bir birVar2 = new bir();
        b = birVar2;
        g(birVar2);
        h(birVar2);
        bir birVar3 = new bir();
        c = birVar3;
        d(birVar3);
        h(birVar3);
        bir birVar4 = new bir();
        d = birVar4;
        e(birVar4);
        f(birVar4);
        bir birVar5 = new bir();
        e = birVar5;
        g(birVar5);
        f(birVar5);
        bir birVar6 = new bir();
        f = birVar6;
        d(birVar6);
        f(birVar6);
    }

    public bir() {
        float[] fArr = new float[3];
        this.g = fArr;
        float[] fArr2 = new float[3];
        this.h = fArr2;
        this.i = r0;
        i(fArr);
        i(fArr2);
        float[] fArr3 = {0.24f, 0.52f, 0.24f};
    }

    private static void d(bir birVar) {
        float[] fArr = birVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void e(bir birVar) {
        float[] fArr = birVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void f(bir birVar) {
        float[] fArr = birVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void g(bir birVar) {
        float[] fArr = birVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void h(bir birVar) {
        float[] fArr = birVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void i(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public final float a() {
        return this.i[1];
    }

    public final float b() {
        return this.i[2];
    }

    public final float c() {
        return this.i[0];
    }
}
