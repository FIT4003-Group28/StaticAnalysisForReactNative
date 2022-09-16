package defpackage;
/* compiled from: PG */
/* renamed from: ahnl  reason: default package */
/* loaded from: classes.dex */
public final class ahnl implements ahji {
    public float[] a;
    private final ahmf b;
    private final ahjh c;
    private final float[] d;

    public ahnl(ahmf ahmfVar, float[] fArr, float[] fArr2) {
        ahmfVar.getClass();
        this.b = ahmfVar;
        this.d = fArr;
        this.a = fArr2;
        this.c = new ahjh();
    }

    @Override // defpackage.ahji
    public final void a(boolean z, long j) {
        float a = this.c.a();
        this.c.b(z, j);
        float a2 = this.c.a() - a;
        ahmf ahmfVar = this.b;
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = 1.0f - a2;
        float[] fArr2 = this.d;
        ahmfVar.n((f * a2) + (fArr2[0] * f2), (fArr[1] * a2) + (fArr2[1] * f2), (a2 * fArr[2]) + (f2 * fArr2[2]));
    }
}
