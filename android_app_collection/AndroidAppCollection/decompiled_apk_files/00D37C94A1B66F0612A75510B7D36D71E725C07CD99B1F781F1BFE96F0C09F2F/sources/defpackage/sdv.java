package defpackage;

import java.util.Calendar;
/* compiled from: PG */
/* renamed from: sdv  reason: default package */
/* loaded from: classes4.dex */
public abstract class sdv implements see {
    public final Calendar a = saa.a();

    public static void d(int i) {
        sho.a(i > 0, "tickIncrement must be greater than 0");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long a(Calendar calendar, long j, int i);

    public final long b(Calendar calendar, long j, int i) {
        long c = c(calendar, j, i);
        return c == j ? c : a(calendar, c, i);
    }

    protected abstract long c(Calendar calendar, long j, int i);

    @Override // defpackage.see
    public final sdt e(sek sekVar) {
        return new sdt(this, sekVar);
    }

    @Override // defpackage.see
    public final int f(sek sekVar) {
        d(1);
        long b = b(this.a, ((Double) sekVar.a).longValue(), 1);
        long longValue = ((Double) sekVar.b).longValue();
        int i = 0;
        while (b <= longValue) {
            i++;
            b = a(this.a, b, 1);
        }
        return i;
    }
}
