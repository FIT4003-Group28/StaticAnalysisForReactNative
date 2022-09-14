package defpackage;
/* compiled from: PG */
/* renamed from: dtcz  reason: default package */
/* loaded from: classes6.dex */
public final class dtcz implements dewu {
    public final dcep<String> d;
    private final dcdn<String, dews<?, ?>> f;
    public static final cwsv a = cwsv.a("mdi.InfiniteData.");
    private static final cwsv e = cwsv.a("mdi.InfiniteData/");
    public static final dews<dtcr, dtct> b = new dtcy();
    public static final dtcz c = new dtcz();
    private static final cwsv g = cwsv.a("infinitedata-pa.googleapis.com");

    private dtcz() {
        dccx F = dcdc.F();
        F.g("autopush-infinitedata-pa.sandbox.googleapis.com");
        F.g("staging-infinitedata-pa.sandbox.googleapis.com");
        F.g("infinitedata-pa.googleapis.com");
        F.f();
        this.d = dcep.N().f();
        dews<dtcr, dtct> dewsVar = b;
        dcep.B(dewsVar);
        dcdg p = dcdn.p();
        p.f("Lookup", dewsVar);
        this.f = p.b();
        dcdn.p().b();
    }

    @Override // defpackage.dewu
    public final cwsv a() {
        return g;
    }

    @Override // defpackage.dewu
    @dzsi
    public final dews<?, ?> b(String str) {
        String str2 = e.a;
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (!this.f.containsKey(substring)) {
                return null;
            }
            return this.f.get(substring);
        }
        return null;
    }

    @Override // defpackage.dewu
    @dzsi
    public final String c() {
        return null;
    }
}
