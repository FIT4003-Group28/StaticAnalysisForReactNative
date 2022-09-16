package defpackage;
/* compiled from: PG */
/* renamed from: ozn  reason: default package */
/* loaded from: classes4.dex */
final class ozn {
    public long d;
    public final ozq a = new ozq();
    public final pct b = new pct(282);
    private final ozp e = new ozp();
    public int c = -1;

    public final boolean a(oxn oxnVar, pct pctVar) {
        pce.d(true);
        boolean z = false;
        while (!z) {
            int i = this.c;
            if (i < 0) {
                if (!ozr.c(oxnVar, this.a, this.b, true)) {
                    return false;
                }
                ozq ozqVar = this.a;
                int i2 = ozqVar.d;
                if ((ozqVar.a & 1) == 1 && pctVar.c == 0) {
                    ozr.a(ozqVar, 0, this.e);
                    ozp ozpVar = this.e;
                    int i3 = ozpVar.b;
                    i2 += ozpVar.a;
                    i = i3;
                } else {
                    i = 0;
                }
                oxnVar.j(i2);
                this.c = i;
            }
            ozr.a(this.a, i, this.e);
            int i4 = this.c;
            ozp ozpVar2 = this.e;
            int i5 = i4 + ozpVar2.b;
            int i6 = ozpVar2.a;
            if (i6 > 0) {
                oxnVar.h(pctVar.a, pctVar.c, i6);
                pctVar.y(pctVar.c + this.e.a);
                z = this.a.f[i5 + (-1)] != 255;
            }
            if (i5 == this.a.c) {
                i5 = -1;
            }
            this.c = i5;
        }
        return true;
    }
}
