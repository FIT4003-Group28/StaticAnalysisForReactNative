package defpackage;
/* compiled from: PG */
/* renamed from: dsiy  reason: default package */
/* loaded from: classes6.dex */
public final class dsiy implements dewu {
    public final dcep<String> f;
    private final dcdn<String, dews<?, ?>> h;
    public static final cwsv a = cwsv.a("peoplestack.PeopleStackAutocompleteService.");
    private static final cwsv g = cwsv.a("peoplestack.PeopleStackAutocompleteService/");
    public static final dews<dsgf, dsgh> b = new dsiv();
    public static final dews<dsik, dsim> c = new dsiw();
    public static final dews<dshn, dsht> d = new dsix();
    public static final dsiy e = new dsiy();
    private static final cwsv i = cwsv.a("peoplestack-pa.googleapis.com");

    private dsiy() {
        dccx F = dcdc.F();
        F.g("peoplestack-pa.googleapis.com");
        F.f();
        dcen N = dcep.N();
        N.b("https://www.googleapis.com/auth/peopleapi.readonly");
        this.f = N.f();
        dews<dsgf, dsgh> dewsVar = b;
        dews<dsik, dsim> dewsVar2 = c;
        dews<dshn, dsht> dewsVar3 = d;
        dcep.D(dewsVar, dewsVar2, dewsVar3);
        dcdg p = dcdn.p();
        p.f("Autocomplete", dewsVar);
        p.f("Warmup", dewsVar2);
        p.f("Lookup", dewsVar3);
        this.h = p.b();
        dcdn.p().b();
    }

    @Override // defpackage.dewu
    public final cwsv a() {
        return i;
    }

    @Override // defpackage.dewu
    @dzsi
    public final dews<?, ?> b(String str) {
        String str2 = g.a;
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (!this.h.containsKey(substring)) {
                return null;
            }
            return this.h.get(substring);
        }
        return null;
    }

    @Override // defpackage.dewu
    @dzsi
    public final String c() {
        return null;
    }
}
