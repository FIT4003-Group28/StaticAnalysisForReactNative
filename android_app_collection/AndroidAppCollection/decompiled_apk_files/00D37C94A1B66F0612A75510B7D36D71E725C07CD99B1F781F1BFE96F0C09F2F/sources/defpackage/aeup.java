package defpackage;
/* compiled from: PG */
/* renamed from: aeup  reason: default package */
/* loaded from: classes.dex */
public final class aeup {
    long a = -1;
    int b = -1;

    public final aeuq a() {
        return new aeuq(this.a, this.b);
    }

    public final void b(long j) {
        boolean z = true;
        if (j < 0 && j != -1) {
            z = false;
        }
        afms.b(z);
        this.a = j;
    }

    public final void c(int i) {
        boolean z = true;
        afms.b(i >= 0);
        if (this.a < 0) {
            z = false;
        }
        afms.b(z);
        double d = this.a;
        Double.isNaN(d);
        double d2 = i;
        Double.isNaN(d2);
        this.b = (int) (((d / 1000000.0d) * d2) / 8.0d);
    }
}
