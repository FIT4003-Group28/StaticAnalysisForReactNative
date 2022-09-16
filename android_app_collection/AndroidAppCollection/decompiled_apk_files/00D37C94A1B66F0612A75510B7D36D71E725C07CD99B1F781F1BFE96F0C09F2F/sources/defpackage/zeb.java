package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: zeb  reason: default package */
/* loaded from: classes4.dex */
public final class zeb {
    private final zea b;
    private final snc c;
    private long e;
    private final Random d = new Random();
    public long a = 0;

    public zeb(zea zeaVar, snc sncVar) {
        this.b = zeaVar;
        this.c = sncVar;
    }

    public final long a() {
        if (this.a == 0) {
            return 0L;
        }
        return this.c.d() - this.e;
    }

    public final boolean b() {
        long j = this.a;
        Long l = null;
        if (j < this.b.c) {
            if (j == 0) {
                this.e = this.c.d();
            }
            double nextDouble = this.d.nextDouble();
            zea zeaVar = this.b;
            double d = zeaVar.a;
            Double.isNaN(d);
            long min = Math.min((long) ((nextDouble + 1.0d) * d * Math.pow(zeaVar.e, this.a)), this.b.b);
            long j2 = this.b.d;
            if (j2 >= 0) {
                min = Math.min(min, j2 - (this.c.d() - this.e));
            }
            if (min >= this.b.a) {
                l = Long.valueOf(min);
            }
        }
        if (l == null) {
            return false;
        }
        try {
            String.valueOf(String.valueOf(l)).length();
            Thread.sleep(l.longValue());
            this.a++;
            l.longValue();
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zep.d("Thread interrupted", e);
            return false;
        }
    }
}
