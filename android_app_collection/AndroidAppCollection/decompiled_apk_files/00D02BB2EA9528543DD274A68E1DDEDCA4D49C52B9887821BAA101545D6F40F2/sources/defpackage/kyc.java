package defpackage;
/* compiled from: PG */
/* renamed from: kyc  reason: default package */
/* loaded from: classes7.dex */
public final class kyc implements aktm {
    public static final aktm a = new kyb();
    private final bvjj b;
    private final bnwn c;
    private final kyx d;
    private final kyy e;
    private final boolean f;

    public kyc(bvjj bvjjVar, bnwn bnwnVar, kyx kyxVar, kyy kyyVar, boolean z) {
        this.b = bvjjVar;
        this.c = bnwnVar;
        this.d = kyxVar;
        this.e = kyyVar;
        this.f = z;
    }

    @Override // defpackage.aktm
    public final void b(akvp akvpVar, akra akraVar) {
        Object k = akvpVar.a().k();
        if (k instanceof dmpn) {
            dbsg<cjqm> dbsgVar = dbpy.a;
            if (akvpVar instanceof alnf) {
                dbsgVar = ((alnf) akvpVar).a().g();
            }
            alaq a2 = alap.a((dmpn) k, akraVar, dbsgVar);
            if (a2 instanceof alap) {
                this.d.a(ldm.d((alap) a2), false);
            } else if (!(a2 instanceof alav)) {
            } else {
                this.e.a((alav) a2);
            }
        }
    }

    @Override // defpackage.aktm
    public final void c(akvp akvpVar, akra akraVar) {
        b(akvpVar, akraVar);
    }

    @Override // defpackage.aktm
    public final void d(akra akraVar) {
        akqq S = akraVar.S();
        String z = this.b.z(bvjk.aq, "fake_my_location_disabled");
        if (z.equals("fake_my_location_latest_tap")) {
            this.c.g(S);
        } else if (z.equals("fake_my_location_next_tap")) {
            this.b.ac(bvjk.aq, S.a());
        } else if (!this.f) {
        } else {
            e(akraVar);
        }
    }

    @Override // defpackage.aktm
    public final void e(akra akraVar) {
        this.d.a(ldm.e(akraVar.S()), true);
    }
}
