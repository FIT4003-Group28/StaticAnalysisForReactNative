package com.google.android.apps.youtube.embeddedplayer.service.csi.service;

import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import j$.util.Optional;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    private final acvf a;
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();

    public a(acvf acvfVar) {
        this.a = acvfVar;
    }

    private final synchronized void n(SetOperationType setOperationType, long j, String str) {
        Optional of = Optional.of(this.a.c(asny.LATENCY_ACTION_WATCH));
        this.b = of;
        ((acvg) of.get()).f(j);
        aopa createBuilder = asnq.a.createBuilder();
        int i = setOperationType.d;
        createBuilder.copyOnWrite();
        asnq asnqVar = (asnq) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            asnqVar.d = i2;
            asnqVar.b |= 8;
            aopa createBuilder2 = asno.a.createBuilder();
            asny asnyVar = asny.LATENCY_ACTION_WATCH;
            createBuilder2.copyOnWrite();
            asno asnoVar = (asno) createBuilder2.instance;
            asnoVar.d = asnyVar.bL;
            asnoVar.b |= 1;
            createBuilder2.copyOnWrite();
            asno asnoVar2 = (asno) createBuilder2.instance;
            asnq asnqVar2 = (asnq) createBuilder.mo39build();
            asnqVar2.getClass();
            asnoVar2.v = asnqVar2;
            asnoVar2.c |= 262144;
            createBuilder2.copyOnWrite();
            asno asnoVar3 = (asno) createBuilder2.instance;
            asnoVar3.b |= 8;
            asnoVar3.g = str;
            asno asnoVar4 = (asno) createBuilder2.mo39build();
            if (!this.b.isPresent()) {
                return;
            }
            ((acvg) this.b.get()).a(asnoVar4);
            return;
        }
        throw null;
    }

    public final synchronized aijp a() {
        aijp a;
        if (!this.b.isPresent()) {
            this.b = Optional.of(this.a.c(asny.LATENCY_ACTION_WATCH));
        }
        aijo a2 = aijp.a();
        a2.a = (acvg) this.b.get();
        a = a2.a();
        this.b = Optional.empty();
        return a;
    }

    public final synchronized void b() {
        this.c = Optional.empty();
    }

    public final synchronized void c() {
        this.d = Optional.empty();
    }

    public final synchronized void d() {
        this.b = Optional.empty();
    }

    public final synchronized void e(Tick tick, long j) {
        if (this.c.isPresent()) {
            ((acvg) this.c.get()).d(tick.l, j);
        }
    }

    public final synchronized void f(Tick tick) {
        if (this.d.isPresent()) {
            ((acvg) this.d.get()).c(tick.l);
        }
    }

    public final synchronized void g(Tick tick, long j) {
        if (this.d.isPresent()) {
            ((acvg) this.d.get()).d(tick.l, j);
        }
    }

    public final synchronized void h(Tick tick) {
        if (this.b.isPresent()) {
            ((acvg) this.b.get()).c(tick.l);
        }
    }

    public final synchronized void i(Tick tick, long j) {
        if (this.b.isPresent()) {
            ((acvg) this.b.get()).d(tick.l, j);
        }
    }

    public final synchronized void j(long j) {
        Optional of = Optional.of(this.a.c(asny.LATENCY_ACTION_EMBED));
        this.c = of;
        ((acvg) of.get()).f(j);
    }

    public final synchronized void k(long j) {
        Optional of = Optional.of(this.a.c(asny.LATENCY_ACTION_VIDEO_PREVIEW));
        this.d = of;
        ((acvg) of.get()).f(j);
    }

    public final synchronized void l(SetOperationType setOperationType, long j) {
        n(setOperationType, j, "warm");
    }

    public final synchronized void m(SetOperationType setOperationType, long j) {
        n(setOperationType, j, "cold");
    }
}
