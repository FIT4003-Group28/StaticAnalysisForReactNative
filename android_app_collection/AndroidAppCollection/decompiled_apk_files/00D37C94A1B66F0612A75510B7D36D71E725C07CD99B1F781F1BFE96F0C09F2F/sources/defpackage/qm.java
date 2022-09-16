package defpackage;
/* compiled from: PG */
/* renamed from: qm  reason: default package */
/* loaded from: classes4.dex */
public final class qm implements qs {
    final qs a;
    int b = 0;
    int c = -1;
    int d = -1;

    public qm(qs qsVar) {
        this.a = qsVar;
    }

    public final void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            qs qsVar = this.a;
            ((qg) qsVar).a.l(this.c, this.d);
        } else if (i != 2) {
            qs qsVar2 = this.a;
            ((qg) qsVar2).a.a.d(this.c, this.d, null);
        } else {
            qs qsVar3 = this.a;
            ((qg) qsVar3).a.m(this.c, this.d);
        }
        this.b = 0;
    }

    public final void b(int i, int i2) {
        a();
        ((qg) this.a).a.om(i, i2);
    }

    public final void c(int i) {
        int i2;
        int i3;
        int i4;
        if (this.b != 3 || i > (i3 = this.d + (i2 = this.c)) || (i4 = i + 1) < i2) {
            a();
            this.c = i;
            this.d = 1;
            this.b = 3;
            return;
        }
        this.c = Math.min(i, i2);
        this.d = Math.max(i3, i4) - this.c;
    }
}
