package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvsy  reason: default package */
/* loaded from: classes4.dex */
public final class bvsy {
    private static final int e = (int) TimeUnit.MINUTES.toSeconds(1);
    private static final int f = (int) TimeUnit.HOURS.toSeconds(1);
    private static final int g = (int) TimeUnit.DAYS.toSeconds(1);
    int a;
    int b;
    int c;
    final int d;

    public bvsy(int i, bvsz bvszVar) {
        i = bvszVar != bvsz.FULL ? Math.round(i / 60.0f) * 60 : i;
        int i2 = g;
        this.a = i / i2;
        int i3 = i % i2;
        int i4 = f;
        this.b = i3 / i4;
        int i5 = i3 % i4;
        int i6 = e;
        this.c = i5 / i6;
        if (bvszVar == bvsz.FULL) {
            this.d = i5 % i6;
        } else {
            this.d = 0;
        }
        int ordinal = bvszVar.ordinal();
        if (ordinal == 3) {
            int i7 = this.a;
            if (i7 <= 0) {
                if (this.b <= 0) {
                    return;
                }
                a(true);
                return;
            }
            if (this.b > 12) {
                this.a = i7 + 1;
            }
            this.b = 0;
            this.c = 0;
        } else if (ordinal == 5) {
        } else {
            if (ordinal == 6) {
                if (this.a <= 0 && this.b < 10) {
                    return;
                }
                a(false);
                this.b += this.a * 24;
                this.a = 0;
            } else if (ordinal == 7) {
                if (this.a > 0) {
                    b();
                } else if (this.b < 12) {
                } else {
                    a(false);
                }
            } else if (ordinal != 8) {
                if (this.a <= 0) {
                    return;
                }
                a(true);
            } else if (this.a > 0) {
                b();
            } else if (this.b < 5) {
            } else {
                a(false);
            }
        }
    }

    private final void a(boolean z) {
        if (this.c > (true != z ? 29 : 30)) {
            int i = this.b + 1;
            this.b = i;
            if (i == 24) {
                this.b = 0;
                this.a++;
            }
        }
        this.c = 0;
    }

    private final void b() {
        int i = this.a;
        int i2 = g;
        this.a = ((i * i2) + ((this.b + 12) * f)) / i2;
        this.b = 0;
        this.c = 0;
    }
}
