package defpackage;
/* compiled from: PG */
/* renamed from: dywk  reason: default package */
/* loaded from: classes6.dex */
public final class dywk extends dykk {
    public static final eaiz a = new eaiz();
    public final dyib<?, ?> b;
    public final String c;
    public final dyvi d;
    public final String e;
    public Object f;
    public volatile int g;
    public final dywj h;
    public boolean i;
    private final dywi j;
    private final dyel k;

    public dywk(dyib<?, ?> dyibVar, dyhw dyhwVar, dywa dywaVar, dywr dywrVar, dyxd dyxdVar, Object obj, int i, int i2, String str, String str2, dyvi dyviVar, dyvr dyvrVar, dyet dyetVar) {
        super(new dyxa(), dyviVar, dyvrVar, dyhwVar, dyetVar);
        this.g = -1;
        this.j = new dywi(this);
        this.i = false;
        dbsk.t(dyviVar, "statsTraceCtx");
        this.d = dyviVar;
        this.b = dyibVar;
        this.e = str;
        this.c = str2;
        this.k = dywrVar.o;
        String str3 = dyibVar.b;
        this.h = new dywj(this, i, dyviVar, obj, dywaVar, dyxdVar, dywrVar, i2);
    }

    @Override // defpackage.dyls
    public final dyel f() {
        return this.k;
    }

    public final dyhz o() {
        return this.b.a;
    }

    @Override // defpackage.dykk
    protected final /* bridge */ /* synthetic */ dykh s() {
        return this.j;
    }

    @Override // defpackage.dykk
    protected final /* bridge */ /* synthetic */ dykj t() {
        return this.h;
    }

    @Override // defpackage.dykk, defpackage.dykp
    protected final /* bridge */ /* synthetic */ dyko u() {
        return this.h;
    }
}
