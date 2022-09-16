package defpackage;
/* compiled from: PG */
/* renamed from: duo  reason: default package */
/* loaded from: classes3.dex */
public final class duo extends dux {
    private final boolean h;

    public duo(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "FNppBUxPUBrne7MLqLDx+dDJA1RrSxvtH4m9zj+3rXLqKVhRHKgv3P+ef/Alz8+T", "u1GQspq8LWa8vRNbR+JVvgCocf8B0huoYc3A7KupNuo=", aopaVar, i, 61);
        this.h = dtqVar.o.a;
    }

    @Override // defpackage.dux
    protected final void a() {
        long longValue = ((Long) this.d.invoke(null, this.a.a, Boolean.valueOf(this.h))).longValue();
        synchronized (this.g) {
            aopa aopaVar = this.g;
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.c |= 8388608;
            dnwVar.U = longValue;
        }
    }
}
