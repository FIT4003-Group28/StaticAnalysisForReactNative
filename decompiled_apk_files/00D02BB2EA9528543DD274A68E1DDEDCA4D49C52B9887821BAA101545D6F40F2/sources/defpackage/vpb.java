package defpackage;
/* compiled from: PG */
/* renamed from: vpb  reason: default package */
/* loaded from: classes7.dex */
public abstract class vpb implements vpd {
    private static final dcdn<dowl, dphv> a;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dowl.JAKARTA_ODD, dphv.EVEN_ONLY);
        dcdgVar.f(dowl.JAKARTA_EVEN, dphv.ODD_ONLY);
        dcdgVar.f(dowl.SAO_PAULO_RODIZIO_1_2, dphv.RODIZIO_1_2);
        dcdgVar.f(dowl.SAO_PAULO_RODIZIO_3_4, dphv.RODIZIO_3_4);
        dcdgVar.f(dowl.SAO_PAULO_RODIZIO_5_6, dphv.RODIZIO_5_6);
        dcdgVar.f(dowl.SAO_PAULO_RODIZIO_7_8, dphv.RODIZIO_7_8);
        dcdgVar.f(dowl.SAO_PAULO_RODIZIO_9_0, dphv.RODIZIO_9_0);
        dcdgVar.f(dowl.MANILA_NUMBER_CODING_1_2, dphv.MANILA_1_2);
        dcdgVar.f(dowl.MANILA_NUMBER_CODING_3_4, dphv.MANILA_3_4);
        dcdgVar.f(dowl.MANILA_NUMBER_CODING_5_6, dphv.MANILA_5_6);
        dcdgVar.f(dowl.MANILA_NUMBER_CODING_7_8, dphv.MANILA_7_8);
        dcdgVar.f(dowl.MANILA_NUMBER_CODING_9_0, dphv.MANILA_9_0);
        dcdgVar.f(dowl.SANTIAGO_SELLO_VERDE_0_1, dphv.SANTIAGO_0_1);
        dcdgVar.f(dowl.SANTIAGO_SELLO_VERDE_2_3, dphv.SANTIAGO_2_3);
        dcdgVar.f(dowl.SANTIAGO_SELLO_VERDE_4_5, dphv.SANTIAGO_4_5);
        dcdgVar.f(dowl.SANTIAGO_SELLO_VERDE_6_7, dphv.SANTIAGO_6_7);
        dcdgVar.f(dowl.SANTIAGO_SELLO_VERDE_8_9, dphv.SANTIAGO_8_9);
        a = dcdgVar.b();
    }

    @Override // defpackage.vpd
    public final boolean a() {
        return !vph.a(l());
    }

    @Override // defpackage.vpd
    public final boolean b(dphv dphvVar) {
        vpc g = vph.g(dphvVar);
        if (g == null) {
            return true;
        }
        return a() && vph.b(l()) == g && a.get(l()) != dphvVar;
    }
}
