package defpackage;
/* compiled from: PG */
/* renamed from: ahqo  reason: default package */
/* loaded from: classes2.dex */
public final class ahqo extends ahqe {
    private final float[] b;
    private final float[] c;

    public ahqo(long j, float[] fArr, float[] fArr2) {
        super(j);
        this.b = fArr;
        this.c = fArr2;
    }

    @Override // defpackage.ahqe
    public final void c(ahqb ahqbVar) {
        float[] fArr = new float[this.b.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.b;
            if (i < fArr2.length) {
                fArr[i] = -fArr2[i];
                i++;
            } else {
                ahqbVar.o(this.a, fArr, this.c);
                return;
            }
        }
    }

    @Override // defpackage.ahqe
    public final void d(ddrh ddrhVar) {
    }
}
