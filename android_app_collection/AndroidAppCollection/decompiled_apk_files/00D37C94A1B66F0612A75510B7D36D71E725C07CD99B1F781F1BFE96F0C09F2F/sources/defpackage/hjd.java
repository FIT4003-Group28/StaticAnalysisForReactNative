package defpackage;
/* compiled from: PG */
/* renamed from: hjd  reason: default package */
/* loaded from: classes3.dex */
public final class hjd {
    final hhq a;
    public final hjh b;
    public final gyq c;

    public hjd(hhq hhqVar, hjh hjhVar, gyq gyqVar) {
        this.a = hhqVar;
        this.b = hjhVar;
        this.c = gyqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(vqr vqrVar, float f) {
        if (vqrVar.b.a() >= 0.5625f) {
            float j = 1.0f - (((vqrVar.b.j() / 16.0f) * 9.0f) / vqrVar.b.k());
            vqrVar.A(0.0d, 0.0d);
            vqrVar.z(j * f, j * (1.0f - f));
        } else {
            float k = 1.0f - (((vqrVar.b.k() / 9.0f) * 16.0f) / vqrVar.b.j());
            vqrVar.z(0.0d, 0.0d);
            vqrVar.A(k * f, k * (1.0f - f));
        }
        this.a.b = vqrVar;
    }
}
