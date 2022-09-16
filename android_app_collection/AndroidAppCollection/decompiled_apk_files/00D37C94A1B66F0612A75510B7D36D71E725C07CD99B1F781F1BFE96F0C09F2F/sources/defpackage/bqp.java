package defpackage;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bqp  reason: default package */
/* loaded from: classes2.dex */
public abstract class bqp {
    public bum c;
    public boolean a = false;
    final Set d = new HashSet();
    UUID b = UUID.randomUUID();

    public bqp(Class cls) {
        this.c = new bum(this.b.toString(), cls.getName());
        c(cls.getName());
    }

    public abstract bqq a();

    public final bqq b() {
        bqq a = a();
        bpu bpuVar = this.c.k;
        boolean z = false;
        if ((Build.VERSION.SDK_INT >= 24 && bpuVar.a()) || bpuVar.d || bpuVar.b || (Build.VERSION.SDK_INT >= 23 && bpuVar.c)) {
            z = true;
        }
        if (!this.c.q || !z) {
            this.b = UUID.randomUUID();
            bum bumVar = new bum(this.c);
            this.c = bumVar;
            bumVar.c = this.b.toString();
            return a;
        }
        throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
    }

    public final void c(String str) {
        this.d.add(str);
    }

    public final void d(bpu bpuVar) {
        this.c.k = bpuVar;
    }

    public final void e(long j, TimeUnit timeUnit) {
        this.c.h = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.h) {
            return;
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    public final void f(bpx bpxVar) {
        this.c.f = bpxVar;
    }
}
