package defpackage;

import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bhd  reason: default package */
/* loaded from: classes3.dex */
public final class bhd {
    private final WorkDatabase a;

    public bhd(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    private final void c(String str, int i) {
        this.a.z().a(new bfr(str, i));
    }

    public final int a(int i, int i2) {
        synchronized (bhd.class) {
            int b = b("next_job_scheduler_id");
            if (b >= i && b <= i2) {
                i = b;
            }
            c("next_job_scheduler_id", i + 1);
        }
        return i;
    }

    public final int b(String str) {
        this.a.F();
        try {
            Long b = this.a.z().b(str);
            int i = 0;
            int intValue = b != null ? b.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            c(str, i);
            this.a.l();
            return intValue;
        } finally {
            this.a.k();
        }
    }
}
