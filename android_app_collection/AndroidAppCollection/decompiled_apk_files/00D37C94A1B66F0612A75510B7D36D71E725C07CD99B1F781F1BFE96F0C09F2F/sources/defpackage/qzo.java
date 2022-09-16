package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: qzo  reason: default package */
/* loaded from: classes4.dex */
public final class qzo implements qzm {
    private final qzn a;
    private long b;
    private final qyh c;
    private final aopa d;

    public qzo(qzn qznVar) {
        qyh qyhVar = qyh.a;
        this.a = qznVar;
        this.c = qyhVar;
        this.d = amof.a.createBuilder();
        this.b = -1L;
    }

    @Override // defpackage.qzm
    public final amof b() {
        return (amof) this.d.mo39build();
    }

    @Override // defpackage.qzm
    public final void c(amod amodVar, qzn qznVar) {
        if (qznVar == qzn.NOTHING) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        }
        if (qznVar.compareTo(this.a) > 0) {
            return;
        }
        amoc a = amoe.a();
        a.copyOnWrite();
        ((amoe) a.instance).f(amodVar);
        long nanoTime = System.nanoTime();
        if (this.b >= 0) {
            long millis = TimeUnit.NANOSECONDS.toMillis(nanoTime - this.b);
            a.copyOnWrite();
            ((amoe) a.instance).e(millis);
        }
        this.b = nanoTime;
        aopa aopaVar = this.d;
        aopaVar.copyOnWrite();
        amof amofVar = (amof) aopaVar.instance;
        amoe amoeVar = (amoe) a.mo39build();
        amof amofVar2 = amof.a;
        amoeVar.getClass();
        aopu aopuVar = amofVar.b;
        if (!aopuVar.c()) {
            amofVar.b = aopi.mutableCopy(aopuVar);
        }
        amofVar.b.add(amoeVar);
    }

    @Override // defpackage.qzm
    /* renamed from: d */
    public final qzo clone() {
        return new qzo(this);
    }

    private qzo(qzo qzoVar) {
        this.a = qzoVar.a;
        this.c = qzoVar.c;
        this.d = qzoVar.d.mo43clone();
        this.b = qzoVar.b;
    }
}
