package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: affq  reason: default package */
/* loaded from: classes.dex */
public final class affq {
    public final pvq a;
    private final amqo c;
    private final amqo d;
    private final amqo e;
    private final boolean g;
    private long f = -1;
    public volatile long b = -1;

    public affq(amqo amqoVar, amqo amqoVar2, amqo amqoVar3, boolean z, pvq pvqVar) {
        this.c = amqoVar;
        this.d = amqoVar2;
        this.e = amqoVar3;
        this.g = z;
        this.a = pvqVar;
    }

    public final boolean a(long j) {
        long intValue = ((Integer) this.c.get()).intValue() * 1000;
        long intValue2 = ((Integer) this.d.get()).intValue() * 1000;
        int intValue3 = ((Integer) this.e.get()).intValue();
        if (intValue > intValue2) {
            if (this.g) {
                if (this.b == -1) {
                    this.b = SystemClock.elapsedRealtime();
                }
                intValue = Math.min(intValue, intValue2 + (intValue3 * (SystemClock.elapsedRealtime() - this.b)));
            } else if (j == 0 || this.f == -1) {
                this.f = SystemClock.elapsedRealtime();
                intValue = intValue2;
            } else {
                intValue = Math.min(intValue, intValue2 + (intValue3 * (SystemClock.elapsedRealtime() - this.f)));
            }
        }
        return j <= intValue;
    }
}
