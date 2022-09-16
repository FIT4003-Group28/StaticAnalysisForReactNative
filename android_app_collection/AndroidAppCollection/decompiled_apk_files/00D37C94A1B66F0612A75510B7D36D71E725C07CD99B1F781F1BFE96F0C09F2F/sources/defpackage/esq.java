package defpackage;
/* compiled from: PG */
/* renamed from: esq  reason: default package */
/* loaded from: classes3.dex */
public final class esq implements yrl {
    private final acrr b;
    private final yrj c;

    public esq(acrr acrrVar, yrj yrjVar) {
        this.b = acrrVar;
        this.c = yrjVar;
    }

    @Override // defpackage.yrl
    public final void a(cff cffVar) {
        if (!(cffVar instanceof cev) || !this.c.o()) {
            return;
        }
        aukd a = auke.a();
        aukf aukfVar = aukf.REACHABILITY_DETECTION_EVENT_TYPE_FAILED_REQUEST;
        a.copyOnWrite();
        ((auke) a.instance).f(aukfVar);
        aqlv f = this.c.f();
        a.copyOnWrite();
        ((auke) a.instance).g(f);
        aukg aukgVar = aukg.REACHABILITY_DETECTION_STRATEGY_TYPE_UNKNOWN;
        a.copyOnWrite();
        ((auke) a.instance).h(aukgVar);
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dy((auke) a.mo39build());
        this.b.c((arrh) a2.mo39build());
    }

    @Override // defpackage.yrl
    public final void b() {
        if (this.c.o()) {
            return;
        }
        aukd a = auke.a();
        aukf aukfVar = aukf.REACHABILITY_DETECTION_EVENT_TYPE_SUCCESSFUL_REQUEST;
        a.copyOnWrite();
        ((auke) a.instance).f(aukfVar);
        aqlv f = this.c.f();
        a.copyOnWrite();
        ((auke) a.instance).g(f);
        aukg aukgVar = aukg.REACHABILITY_DETECTION_STRATEGY_TYPE_UNKNOWN;
        a.copyOnWrite();
        ((auke) a.instance).h(aukgVar);
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dy((auke) a.mo39build());
        this.b.c((arrh) a2.mo39build());
    }
}
