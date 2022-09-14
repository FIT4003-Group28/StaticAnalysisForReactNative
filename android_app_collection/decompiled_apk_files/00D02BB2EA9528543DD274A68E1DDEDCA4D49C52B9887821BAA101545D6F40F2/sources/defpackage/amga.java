package defpackage;
/* compiled from: PG */
/* renamed from: amga  reason: default package */
/* loaded from: classes.dex */
final class amga implements amgh {
    final float[] a;
    final int b;
    final float c;
    final float d;

    public amga(float[] fArr, int i, float f, float f2) {
        this.a = fArr;
        this.b = i;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.amgh
    public final int a() {
        return this.b;
    }

    @Override // defpackage.amgh
    public final void b(int i, akse akseVar) {
        float[] fArr = this.a;
        akseVar.r(fArr[i] - this.c, fArr[i + 1] - this.d);
    }

    @Override // defpackage.amgh
    public final boolean c(int i, int i2) {
        float[] fArr = this.a;
        return fArr[i] == fArr[i2];
    }

    @Override // defpackage.amgh
    @dzsi
    public final akse d() {
        return null;
    }

    @Override // defpackage.amgh
    @dzsi
    public final akse e() {
        return null;
    }
}
