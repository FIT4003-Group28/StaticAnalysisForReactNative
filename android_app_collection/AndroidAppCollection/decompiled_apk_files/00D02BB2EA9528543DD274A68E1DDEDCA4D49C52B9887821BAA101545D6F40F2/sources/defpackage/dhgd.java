package defpackage;
/* compiled from: PG */
/* renamed from: dhgd  reason: default package */
/* loaded from: classes6.dex */
public final class dhgd implements dewu {
    public final dcep<String> d;
    private final dcdn<String, dews<?, ?>> f;
    public static final cwsv a = cwsv.a("google.internal.people.v2.minimal.PeopleApiAutocompleteMinimalService.");
    private static final cwsv e = cwsv.a("google.internal.people.v2.minimal.PeopleApiAutocompleteMinimalService/");
    public static final dews<dhef, dheh> b = new dhgc();
    public static final dhgd c = new dhgd();
    private static final cwsv g = cwsv.a("people-pa.googleapis.com");

    private dhgd() {
        dccx F = dcdc.F();
        F.g("people-pa.googleapis.com");
        F.f();
        this.d = dcep.N().f();
        dews<dhef, dheh> dewsVar = b;
        dcep.B(dewsVar);
        dcdg p = dcdn.p();
        p.f("ListAutocompletions", dewsVar);
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
