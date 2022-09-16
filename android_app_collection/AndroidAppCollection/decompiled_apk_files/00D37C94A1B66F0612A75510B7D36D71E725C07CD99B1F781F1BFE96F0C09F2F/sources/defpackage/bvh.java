package defpackage;

import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bvh  reason: default package */
/* loaded from: classes2.dex */
public final class bvh {
    private final WorkDatabase a;

    public bvh(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    private final void c(String str, int i) {
        this.a.q().b(new btu(str, i));
    }

    public final int a(String str) {
        this.a.f();
        try {
            Long a = this.a.q().a(str);
            int i = 0;
            int intValue = a != null ? a.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            c(str, i);
            this.a.h();
            return intValue;
        } finally {
            this.a.g();
        }
    }

    public final int b() {
        int a;
        synchronized (bvh.class) {
            a = a("next_job_scheduler_id");
            if (a < 0) {
                c("next_job_scheduler_id", 1);
                a = 0;
            }
        }
        return a;
    }
}
