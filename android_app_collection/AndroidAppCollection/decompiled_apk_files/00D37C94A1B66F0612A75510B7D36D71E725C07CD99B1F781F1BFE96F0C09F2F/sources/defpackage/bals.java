package defpackage;

import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: bals  reason: default package */
/* loaded from: classes2.dex */
final class bals {
    public final long a;
    public final baht b;
    bals c;
    private String d;
    private int e = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    private int f = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    public bals(baht bahtVar, long j) {
        this.a = j;
        this.b = bahtVar;
    }

    public final int a(long j) {
        bals balsVar = this.c;
        if (balsVar == null || j < balsVar.a) {
            int i = this.e;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            int a = this.b.a(this.a);
            this.e = a;
            return a;
        }
        return balsVar.a(j);
    }

    public final int b(long j) {
        bals balsVar = this.c;
        if (balsVar == null || j < balsVar.a) {
            int i = this.f;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            int c = this.b.c(this.a);
            this.f = c;
            return c;
        }
        return balsVar.b(j);
    }

    public final String c(long j) {
        bals balsVar = this.c;
        if (balsVar == null || j < balsVar.a) {
            if (this.d == null) {
                this.d = this.b.g(this.a);
            }
            return this.d;
        }
        return balsVar.c(j);
    }
}
