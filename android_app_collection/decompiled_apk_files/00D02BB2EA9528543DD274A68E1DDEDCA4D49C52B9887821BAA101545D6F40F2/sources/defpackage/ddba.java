package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ddba  reason: default package */
/* loaded from: classes5.dex */
class ddba extends ddbc {
    final int a;
    final int b;
    final double c;

    public ddba(int i, int i2) {
        ddbc.d(i2);
        this.a = i2;
        ddbc.d(i);
        this.b = i;
        dbsk.a(true);
        this.c = 2.0d;
    }

    @Override // defpackage.ddbc
    public final boolean a(int i) {
        dbsk.a(i >= 0);
        return i < this.a;
    }

    @Override // defpackage.ddbc
    public final int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (!a(i)) {
            return -1;
        }
        double d = this.b;
        double pow = Math.pow(2.0d, i - 1);
        Double.isNaN(d);
        return ddbc.c(d * pow);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof ddba) {
            ddba ddbaVar = (ddba) obj;
            if (this.b == ddbaVar.b) {
                double d = ddbaVar.c;
                if (this.a == ddbaVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Double.valueOf(2.0d)});
    }
}
