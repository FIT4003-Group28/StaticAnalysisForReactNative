package defpackage;
/* compiled from: PG */
/* renamed from: aoxq  reason: default package */
/* loaded from: classes2.dex */
public class aoxq {
    public static final dcdn<String, Integer> b;
    private final btvo d;
    private static final dcqe c = dcqe.c("aoxq");
    public static final int a = 2131232390;

    static {
        dcdg p = dcdn.p();
        p.f("FOOD_AND_DRINKS", 2131232320);
        p.f("SHOPPING", 2131232329);
        p.f("AIRPORTS", 2131232318);
        p.f("HOTELS", 2131232295);
        p.f("CULTURE", 2131232129);
        p.f("ATTRACTIONS", 2131232335);
        p.f("SPORTS", 2131232469);
        b = p.b();
    }

    public aoxq(btvo btvoVar) {
        this.d = btvoVar;
    }

    public final dccr<aoxp> a() {
        return dcdc.r(dchl.k(this.d.getMapsActivitiesParameters().f, aoxi.a));
    }

    public final String b(aoxp aoxpVar) {
        return (String) d(aoxpVar, aoxj.a);
    }

    @dzsi
    public final ddho c(final aoxp aoxpVar, dbrn<duyh, Integer> dbrnVar) {
        dbsg m = dcft.m(this.d.getMapsActivitiesParameters().f, new dbsl(aoxpVar) { // from class: aoxo
            private final aoxp a;

            {
                this.a = aoxpVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                aoxp aoxpVar2 = this.a;
                int i = aoxq.a;
                return ((duyh) obj).a.equals(aoxpVar2.a());
            }
        });
        if (!m.a()) {
            bvoo.h("Non-existent categoryId %s passed in", aoxpVar);
            return null;
        }
        return cjth.d(dbrnVar.a((duyh) m.b()).intValue());
    }

    public final <T> T d(final aoxp aoxpVar, dbrn<duyh, T> dbrnVar) {
        dbsg m = dcft.m(this.d.getMapsActivitiesParameters().f, new dbsl(aoxpVar) { // from class: aoxn
            private final aoxp a;

            {
                this.a = aoxpVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                aoxp aoxpVar2 = this.a;
                int i = aoxq.a;
                return ((duyh) obj).a.equals(aoxpVar2.a());
            }
        });
        if (!m.a()) {
            bvoo.h("Non-existent categoryId %s passed in", aoxpVar);
            return "";
        }
        return dbrnVar.a((duyh) m.b());
    }
}
