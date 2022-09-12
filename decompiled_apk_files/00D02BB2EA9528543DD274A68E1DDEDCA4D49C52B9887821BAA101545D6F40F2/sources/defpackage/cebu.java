package defpackage;
/* compiled from: PG */
/* renamed from: cebu  reason: default package */
/* loaded from: classes4.dex */
public class cebu {
    private final cqat a;

    public cebu(cqat cqatVar) {
        this.a = cqatVar;
    }

    public static boolean a(cdjd cdjdVar) {
        return !cdjdVar.c().e().a() && !cdjdVar.a().c().equals(cdja.DRAFT);
    }

    public static boolean c(cdjd cdjdVar) {
        cdiz c = cdjdVar.c();
        if (!c.e().a()) {
            return (!c.b().a() || c.b().b().a().isEmpty()) && c.a().isEmpty();
        }
        return false;
    }

    public static boolean d(cdjd cdjdVar) {
        return !((String) ((cdsa) cdjdVar).b.b().h(cebs.a).c("")).isEmpty();
    }

    public final boolean b(cdjd cdjdVar, eaov eaovVar) {
        int i = eaov.b(cdjdVar.a().e(), new eapd(this.a.b())).p;
        return eaovVar == null ? i < 0 : i < eaovVar.p;
    }
}
