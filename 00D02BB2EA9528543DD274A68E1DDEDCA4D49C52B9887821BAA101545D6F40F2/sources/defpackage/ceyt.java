package defpackage;
/* compiled from: PG */
/* renamed from: ceyt  reason: default package */
/* loaded from: classes4.dex */
public class ceyt implements cesh {
    private final ceet a;
    private final dhtc b;
    private final dhsy c;
    @dzsi
    private final String d;
    private final cevz e;

    public ceyt(ceet ceetVar, dhtc dhtcVar, dhsy dhsyVar, @dzsi String str, cevz cevzVar) {
        this.a = ceetVar;
        this.b = dhtcVar;
        this.c = dhsyVar;
        this.d = str;
        this.e = cevzVar;
    }

    @Override // defpackage.cesh
    public String a() {
        return "";
    }

    @Override // defpackage.cesh
    public Boolean b() {
        return false;
    }

    @Override // defpackage.cesh
    public Boolean c() {
        return Boolean.valueOf(this.c.e);
    }

    @Override // defpackage.cesi
    public String g() {
        return this.c.d;
    }

    @Override // defpackage.cesi
    public cqkl h() {
        drds b = drds.b(this.c.c);
        if (b == null) {
            b = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
        }
        if (cevh.a(b)) {
            ceet ceetVar = this.a;
            String str = this.d;
            drds b2 = drds.b(this.c.c);
            if (b2 == null) {
                b2 = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
            }
            boolean z = this.d != null;
            ceer g = cees.g();
            g.b(this.b);
            ((ceep) g).b = this.e;
            ceetVar.l(str, b2, z, g.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.cesi
    public cjtd i() {
        drds b = drds.b(this.c.c);
        if (b == null) {
            b = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 4) {
            if (ordinal == 5) {
                return cjtd.a(dtxl.fs);
            }
            if (ordinal == 6) {
                return cjtd.a(dtxl.eS);
            }
            return cjtd.b;
        }
        return cjtd.a(dtxl.eQ);
    }
}
