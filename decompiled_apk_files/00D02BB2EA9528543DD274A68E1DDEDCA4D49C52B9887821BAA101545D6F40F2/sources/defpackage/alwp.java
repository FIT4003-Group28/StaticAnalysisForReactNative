package defpackage;
/* compiled from: PG */
/* renamed from: alwp  reason: default package */
/* loaded from: classes2.dex */
public final class alwp implements alyi {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final akra e;
    private final int f;
    private final int g;
    private final double h;
    private final double i;
    private alyh j;
    private alyh k;
    private int l;

    public alwp(akra akraVar, akra akraVar2, int i, int i2) {
        this(akraVar, akraVar2, i, i2, true);
    }

    public static alwp a(akra akraVar, int i, int i2) {
        int i3 = i2 / 2;
        return new alwp(new akra(akraVar.a - i3, akraVar.b), new akra(akraVar.a + i3, akraVar.b), i, i2, false);
    }

    @Override // defpackage.alyi
    @dzsi
    public final alyh b() {
        alyh alyhVar;
        int i;
        alyh alyhVar2 = this.k;
        if (alyhVar2 == null || (alyhVar = this.j) == null || ((i = alyhVar.b) >= alyhVar2.b && alyhVar.c >= alyhVar2.c)) {
            int i2 = this.l;
            if (i2 > this.b) {
                return null;
            }
            akra akraVar = this.e;
            double d = i2;
            double d2 = akraVar.a;
            double d3 = this.h;
            Double.isNaN(d);
            Double.isNaN(d2);
            int i3 = (int) (d2 + (d3 * d));
            double d4 = akraVar.b;
            double d5 = this.i;
            Double.isNaN(d);
            Double.isNaN(d4);
            int i4 = (int) (d4 + (d * d5));
            this.j = alyh.b(this.a, i3 - (this.f >> 1), (this.g >> 1) + i4);
            this.k = alyh.b(this.a, (i3 + (this.f >> 1)) - this.c, (i4 - (this.g >> 1)) + this.d);
            this.l++;
        } else {
            this.j = new alyh(this.a, i + this.c, alyhVar.c + this.d);
        }
        return this.j;
    }

    private alwp(akra akraVar, akra akraVar2, int i, int i2, boolean z) {
        int i3;
        int i4;
        this.j = null;
        this.e = akraVar;
        this.a = i;
        i2 = i2 < 2 ? 2 : i2;
        if (z) {
            akra E = akraVar2.E(akraVar);
            float x = E.x();
            if (x > 0.0f) {
                E.Z((i2 / (x + x)) + 1.0f);
                akraVar2 = akraVar.C(E);
            }
        }
        alyh b = alyh.b(i, akraVar.a, akraVar.b);
        alyh b2 = alyh.b(i, akraVar2.a, akraVar2.b);
        int i5 = akraVar2.a - akraVar.a;
        int i6 = akraVar2.b - akraVar.b;
        if (Math.abs(i6) <= Math.abs(i5)) {
            this.f = 0;
            this.g = i2;
            this.c = 0;
            this.d = 1;
            i3 = b2.b;
            i4 = b.b;
        } else {
            this.f = i2;
            this.g = 0;
            this.c = 1;
            this.d = 0;
            i3 = b2.c;
            i4 = b.c;
        }
        int abs = Math.abs(i3 - i4);
        this.b = abs;
        if (abs == 0) {
            this.i = dcyn.a;
            this.h = dcyn.a;
        } else {
            double d = abs;
            double d2 = i5;
            Double.isNaN(d2);
            Double.isNaN(d);
            this.h = d2 / d;
            double d3 = i6;
            Double.isNaN(d3);
            Double.isNaN(d);
            this.i = d3 / d;
        }
        this.l = 0;
    }
}
