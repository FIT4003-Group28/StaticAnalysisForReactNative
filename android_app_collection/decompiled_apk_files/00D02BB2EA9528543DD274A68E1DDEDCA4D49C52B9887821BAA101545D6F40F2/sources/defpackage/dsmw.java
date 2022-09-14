package defpackage;
/* compiled from: PG */
/* renamed from: dsmw  reason: default package */
/* loaded from: classes6.dex */
public final class dsmw implements dewu {
    public final dcep<String> k;
    private final dcdn<String, dews<?, ?>> m;
    public static final cwsv a = cwsv.a("footprints.oneplatform.FootprintsService.");
    private static final cwsv l = cwsv.a("footprints.oneplatform.FootprintsService/");
    public static final dews b = new dsmo();
    public static final dews c = new dsmp();
    public static final dews d = new dsmq();
    public static final dews e = new dsmr();
    public static final dews<dslp, dslt> f = new dsms();
    public static final dews<dsml, dsmn> g = new dsmt();
    public static final dews<dslv, dslz> h = new dsmu();
    public static final dews i = new dsmv();
    public static final dsmw j = new dsmw();
    private static final cwsv n = cwsv.a("footprints-pa.googleapis.com");

    private dsmw() {
        dccx F = dcdc.F();
        F.g("autopush-footprints-pa.sandbox.googleapis.com");
        F.g("autopushsearchqual-footprints-pa.sandbox.googleapis.com");
        F.g("staging-footprints-pa.sandbox.googleapis.com");
        F.g("footprints-pa.googleapis.com");
        F.f();
        this.k = dcep.N().f();
        dews dewsVar = b;
        dews dewsVar2 = c;
        dews dewsVar3 = d;
        dews dewsVar4 = e;
        dews<dslp, dslt> dewsVar5 = f;
        dews<dsml, dsmn> dewsVar6 = g;
        dews<dslv, dslz> dewsVar7 = h;
        dews dewsVar8 = i;
        dcep.G(dewsVar, dewsVar2, dewsVar3, dewsVar4, dewsVar5, dewsVar6, dewsVar7, dewsVar8);
        dcdg p = dcdn.p();
        p.f("Read", dewsVar);
        p.f("Write", dewsVar2);
        p.f("Delete", dewsVar3);
        p.f("GetFacs", dewsVar4);
        p.f("GetActivityControlsSettings", dewsVar5);
        p.f("UpdateActivityControlsSettings", dewsVar6);
        p.f("GetSettingText", dewsVar7);
        p.f("GetDeletions", dewsVar8);
        this.m = p.b();
        dcdn.p().b();
    }

    @Override // defpackage.dewu
    public final cwsv a() {
        return n;
    }

    @Override // defpackage.dewu
    @dzsi
    public final dews<?, ?> b(String str) {
        String str2 = l.a;
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (!this.m.containsKey(substring)) {
                return null;
            }
            return this.m.get(substring);
        }
        return null;
    }

    @Override // defpackage.dewu
    @dzsi
    public final String c() {
        return null;
    }
}
