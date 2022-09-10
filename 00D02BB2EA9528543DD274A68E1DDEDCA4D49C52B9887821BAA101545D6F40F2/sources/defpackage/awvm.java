package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awvm  reason: default package */
/* loaded from: classes3.dex */
public final class awvm {
    private final cqat a;
    private final awvj b;

    public awvm(cqat cqatVar, awvj awvjVar) {
        new awvk(this);
        new awvl(this);
        this.a = cqatVar;
        this.b = awvjVar;
    }

    private final synchronized void b() {
        axev axevVar = this.b.a;
        dsqp dsqpVar = (dsqp) axevVar.cu(5);
        dsqpVar.bC(axevVar);
        axeu axeuVar = (axeu) dsqpVar;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.a.b());
        if (axeuVar.c) {
            axeuVar.bF();
            axeuVar.c = false;
        }
        axev axevVar2 = (axev) axeuVar.b;
        axev axevVar3 = axev.e;
        axevVar2.a |= 4;
        axevVar2.d = seconds;
        this.b.a = axeuVar.bK();
    }

    public final void a() {
        b();
    }
}
