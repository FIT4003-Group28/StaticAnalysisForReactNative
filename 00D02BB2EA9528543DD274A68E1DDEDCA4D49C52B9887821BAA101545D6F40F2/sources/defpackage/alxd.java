package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alxd  reason: default package */
/* loaded from: classes2.dex */
public final class alxd implements Comparable<alxd> {
    final akra a = new akra();
    double b = Double.MAX_VALUE;
    int c = -1;

    public final akrn a(akrk akrkVar, int i, akra akraVar, akra akraVar2) {
        double d;
        float e;
        int min = Math.min(i, akrkVar.l() - 1);
        int i2 = this.c;
        if (i2 < min) {
            akrkVar.n(i2, akraVar);
            akrkVar.n(this.c + 1, akraVar2);
            e = akrb.e(akraVar, akraVar2);
        } else if (min > 0) {
            akrkVar.n(i2 - 1, akraVar);
            akrkVar.n(this.c, akraVar2);
            e = akrb.e(akraVar, akraVar2);
        } else {
            d = dcyn.a;
            return new akrn(this.a, d, this.b, this.c);
        }
        d = e;
        return new akrn(this.a, d, this.b, this.c);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(alxd alxdVar) {
        return Double.compare(this.b, alxdVar.b);
    }
}
