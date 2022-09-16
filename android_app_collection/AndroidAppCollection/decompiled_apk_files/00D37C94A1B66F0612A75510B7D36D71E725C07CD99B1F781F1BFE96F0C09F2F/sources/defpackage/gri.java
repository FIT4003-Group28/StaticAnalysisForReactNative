package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gri  reason: default package */
/* loaded from: classes3.dex */
public final class gri {
    final /* synthetic */ grk c;
    public final grj a = new grj(3);
    public final grj b = new grj(4);
    private final amqo d = new grh(this, 1);
    private final amqo e = new grh(this);
    private final amqo f = new grh(this, 2);
    private final amqo g = new grh(this, 3);
    private final amqo h = new grh(this, 4);
    private final amqo i = new grh(this, 5);
    private final amqo j = new grh(this, 6);

    public gri(grk grkVar) {
        this.c = grkVar;
    }

    private final String h() {
        return (String) this.b.a("clipDurationFormatted", this.g);
    }

    private final String i() {
        return (String) this.b.a("clipEndFormatted", this.i);
    }

    private final String j() {
        return (String) this.b.a("clipStartFormatted", this.h);
    }

    private final String k() {
        return (String) this.b.a("maxLengthFormatted", this.j);
    }

    public final long a() {
        return ((Long) this.a.a("durationMs", this.f)).longValue();
    }

    public final long b() {
        return ((Long) this.a.a("endTimeMs", this.e)).longValue();
    }

    public final long c() {
        return ((Long) this.a.a("startTimeMs", this.d)).longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        grk grkVar = this.c;
        if (grkVar.F == null || grkVar.w != 0) {
            return;
        }
        grkVar.r.m = grkVar.l.replace("$start_time", j()).replace("$end_time", i()).replace("$clip_length", h());
        grk grkVar2 = this.c;
        grkVar2.r.n = grkVar2.m.replace("$start_time", j()).replace("$clip_length", h()).replace("$max_length", k());
        grk grkVar3 = this.c;
        grkVar3.r.o = grkVar3.n.replace("$end_time", i()).replace("$clip_length", h()).replace("$max_length", k());
        this.c.r.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        grk grkVar = this.c;
        if (grkVar.p == null) {
            return;
        }
        this.c.p.setText(grkVar.j.replace("$clip_length", h()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        aopa createBuilder = apym.a.createBuilder();
        String str = this.c.k;
        createBuilder.copyOnWrite();
        apym apymVar = (apym) createBuilder.instance;
        str.getClass();
        apymVar.b |= 1;
        apymVar.c = str;
        long c = c();
        createBuilder.copyOnWrite();
        apym apymVar2 = (apym) createBuilder.instance;
        apymVar2.b |= 4;
        apymVar2.e = c;
        long a = a();
        createBuilder.copyOnWrite();
        apym apymVar3 = (apym) createBuilder.instance;
        apymVar3.b |= 16;
        apymVar3.f = a;
        String str2 = this.c.v;
        createBuilder.copyOnWrite();
        apym apymVar4 = (apym) createBuilder.instance;
        str2.getClass();
        apymVar4.b |= 2;
        apymVar4.d = str2;
        ((tdb) this.c.g.get()).b(this.c.k, ((apym) createBuilder.mo39build()).toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(boolean z) {
        grk grkVar = this.c;
        if (grkVar.F == null || grkVar.w != 0) {
            return;
        }
        long c = c();
        long b = b();
        ((ahvz) this.c.e.get()).b(c, b);
        if (!z) {
            c = b - grk.a;
        }
        grk grkVar2 = this.c;
        grkVar2.E = !((airr) grkVar2.f.get()).V(c);
        this.c.u(c);
    }
}
