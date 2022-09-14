package defpackage;
/* compiled from: PG */
/* renamed from: dhgb  reason: default package */
/* loaded from: classes6.dex */
public final class dhgb implements dewu {
    public final dcep<String> h;
    private final dcdn<String, dews<?, ?>> j;
    public static final cwsv a = cwsv.a("google.internal.people.v2.minimal.InternalPeopleMinimalService.");
    private static final cwsv i = cwsv.a("google.internal.people.v2.minimal.InternalPeopleMinimalService/");
    public static final dews<dhdw, dhdy> b = new dhfw();
    public static final dews c = new dhfx();
    public static final dews<dher, dhet> d = new dhfy();
    public static final dews e = new dhfz();
    public static final dews<dhek, dhep> f = new dhga();
    public static final dhgb g = new dhgb();
    private static final cwsv k = cwsv.a("people-pa.googleapis.com");

    private dhgb() {
        dccx F = dcdc.F();
        F.g("people-pa.googleapis.com");
        F.f();
        dcen N = dcep.N();
        N.b("https://www.googleapis.com/auth/peopleapi.readonly");
        this.h = N.f();
        dews<dhdw, dhdy> dewsVar = b;
        dews dewsVar2 = c;
        dews<dher, dhet> dewsVar3 = d;
        dews dewsVar4 = e;
        dews<dhek, dhep> dewsVar5 = f;
        dcep.F(dewsVar, dewsVar2, dewsVar3, dewsVar4, dewsVar5);
        dcdg p = dcdn.p();
        p.f("GetPeople", dewsVar);
        p.f("ListContactPeople", dewsVar2);
        p.f("ListRankedTargets", dewsVar3);
        p.f("BatchListRankedTargets", dewsVar4);
        p.f("ListPeopleByKnownId", dewsVar5);
        this.j = p.b();
        dcdn.p().b();
    }

    @Override // defpackage.dewu
    public final cwsv a() {
        return k;
    }

    @Override // defpackage.dewu
    @dzsi
    public final dews<?, ?> b(String str) {
        String str2 = i.a;
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (!this.j.containsKey(substring)) {
                return null;
            }
            return this.j.get(substring);
        }
        return null;
    }

    @Override // defpackage.dewu
    @dzsi
    public final String c() {
        return null;
    }
}
