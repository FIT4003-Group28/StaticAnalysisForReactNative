package defpackage;

import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ammo  reason: default package */
/* loaded from: classes2.dex */
public final class ammo extends amml {
    @dzsi
    private TimerTask K;
    private final float L;
    private final long a;
    @dzsi
    private Timer b;

    public ammo(bnsn bnsnVar, akzh akzhVar, anbe anbeVar, amox amoxVar, alvd alvdVar, int i, int i2, boolean z, ammc ammcVar, bvkx bvkxVar, amoh amohVar, amco amcoVar, Executor executor, amyj amyjVar, long j, alyl alylVar, akrz akrzVar) {
        super(bnsnVar, akzhVar, akrw.a(amoxVar.e()), alylVar, anbeVar, amoxVar, alvdVar, null, i, true, i2, i2, false, z, ammcVar, bvkxVar, amohVar, amcoVar, executor, null, null, amyjVar, null, null, akrzVar);
        this.a = j;
        this.L = 30.0f;
    }

    @Override // defpackage.amml
    public final void E() {
        this.b = new Timer("Traffic auto-refresh timer");
        ammn ammnVar = new ammn(this);
        this.K = ammnVar;
        this.b.schedule(ammnVar, 0L, this.a);
    }

    @Override // defpackage.amml
    public final void F() {
        TimerTask timerTask = this.K;
        if (timerTask != null) {
            timerTask.cancel();
            this.K = null;
        }
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
        }
    }

    @Override // defpackage.amml, defpackage.amlq
    public final void e(amxf amxfVar, boolean z, alwn alwnVar) {
        if (amxfVar == amxf.NO_MAP) {
            amxfVar = amxf.ROADMAP;
        }
        super.e(amxfVar, z, alwnVar);
    }

    @Override // defpackage.amml
    public final amml m(alyl alylVar, amco amcoVar) {
        return new ammo(this.B, this.I, this.g, this.h.a(alylVar, amcoVar), this.s, this.k, this.c, this.p, this.z, this.A, this.E, amcoVar, this.D, this.J, this.a, alylVar, this.H);
    }

    @Override // defpackage.amml
    public final synchronized void y(akzh akzhVar, Set<amqn> set) {
        if (akzhVar.p().k < this.L) {
            super.y(akzhVar, set);
        }
    }
}
