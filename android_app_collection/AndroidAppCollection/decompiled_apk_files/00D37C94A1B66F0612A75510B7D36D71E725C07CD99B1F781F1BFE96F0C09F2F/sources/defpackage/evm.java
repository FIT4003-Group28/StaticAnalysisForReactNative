package defpackage;
/* compiled from: PG */
/* renamed from: evm  reason: default package */
/* loaded from: classes3.dex */
public final class evm {
    private static final acvg a = new acvi();
    private final acvh b;
    private final etn c;
    private final aiix d;

    public evm(acvh acvhVar, etn etnVar, aiix aiixVar) {
        this.b = acvhVar;
        this.c = etnVar;
        this.d = aiixVar;
    }

    private static void d(acvg acvgVar, int i, String str) {
        aopa createBuilder = asno.a.createBuilder();
        aopa createBuilder2 = asnq.a.createBuilder();
        createBuilder2.copyOnWrite();
        asnq asnqVar = (asnq) createBuilder2.instance;
        asnqVar.d = i - 1;
        asnqVar.b |= 8;
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asnq asnqVar2 = (asnq) createBuilder2.mo39build();
        asnqVar2.getClass();
        asnoVar.v = asnqVar2;
        asnoVar.c |= 262144;
        createBuilder.copyOnWrite();
        asno asnoVar2 = (asno) createBuilder.instance;
        asnoVar2.b |= 8;
        asnoVar2.g = str;
        acvgVar.a((asno) createBuilder.mo39build());
    }

    public final acvg a() {
        long j;
        if (!this.d.v()) {
            this.c.a();
            return a;
        } else if (this.c.e()) {
            if (!this.d.v()) {
                this.c.a();
                return a;
            }
            acvg c = this.b.c(asny.LATENCY_ACTION_WATCH);
            etn etnVar = this.c;
            if (etnVar.e()) {
                etnVar.b = -2L;
                j = etnVar.a;
            } else {
                j = -1;
            }
            c.f(j);
            d(c, 2, "cold");
            return c;
        } else {
            return c(2);
        }
    }

    public final void b() {
        this.c.a();
    }

    public final acvg c(int i) {
        if (!this.d.v()) {
            return a;
        }
        acvg b = this.b.b(asny.LATENCY_ACTION_WATCH);
        d(b, i, "warm");
        return b;
    }
}
