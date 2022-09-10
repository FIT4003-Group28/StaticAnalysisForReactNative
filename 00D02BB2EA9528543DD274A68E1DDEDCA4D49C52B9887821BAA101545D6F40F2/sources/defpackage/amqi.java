package defpackage;
/* compiled from: PG */
/* renamed from: amqi  reason: default package */
/* loaded from: classes.dex */
public final class amqi {
    final amyi a;
    final amyi b;

    public amqi(alyh alyhVar) {
        this.a = new amyi(alyhVar);
        amyi amyiVar = new amyi(alyhVar);
        int h = alyhVar.h();
        int i = alyhVar.g;
        int i2 = i <= 0 ? h : h >> i;
        float[] fArr = amyiVar.a;
        float f = i2;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = h;
        this.b = amyiVar;
        amyi.b(alyhVar, 1.0f);
        amyi.b(alyhVar, (float) Math.pow(2.0d, 18 - alyhVar.a));
    }
}
