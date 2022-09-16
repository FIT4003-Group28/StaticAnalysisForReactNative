package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akhc  reason: default package */
/* loaded from: classes.dex */
public final class akhc implements akhx {
    public final akgt a;
    public final akhd b;
    public final akgy c;
    public final ScheduledExecutorService d;

    public akhc(akgt akgtVar, akhd akhdVar, akgy akgyVar, ScheduledExecutorService scheduledExecutorService) {
        akgtVar.getClass();
        this.a = akgtVar;
        this.b = akhdVar;
        this.c = akgyVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.akhx
    public final akhe a(akhr akhrVar) {
        ankt v;
        ankt v2 = anlz.v(new akgz(this, akhrVar), this.d);
        if ((!this.a.l() && !this.a.m()) || akhrVar.d.isEmpty()) {
            v = anlz.q(akhe.a);
        } else {
            v = anlz.v(new akgz(this, akhrVar, 1), this.d);
        }
        ankt x = anlz.x(anlz.r(v2), this.a.c(), TimeUnit.MILLISECONDS, this.d);
        try {
            return (akhe) anlz.k(x, v).b(new akhb(this, x, v, v2), this.d).get();
        } catch (InterruptedException | ExecutionException unused) {
            return akhe.a;
        }
    }
}
