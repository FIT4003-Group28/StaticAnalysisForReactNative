package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: btdr  reason: default package */
/* loaded from: classes4.dex */
public abstract class btdr implements btdn {
    public static final cqtv a = cqrp.d(0.8d);
    private static final cqtv b = cqrp.d(4.0d);

    public static btdp c() {
        btda btdaVar = new btda();
        btdc d = btdd.d("clippedDM", gdj.a());
        btdc d2 = btdd.d("UnclippedDM", gdj.b());
        btdc d3 = btdd.d("darkGreyBackground", irm.t);
        btdc d4 = btdd.d("darkGreyBackgroundDM", irm.u);
        btdc d5 = btdd.d("defaultClipped", irm.c);
        btdc d6 = btdd.d("defaultClippedDM", irm.d);
        btdc d7 = btdd.d("defaultUnclipped", irm.a);
        btdc d8 = btdd.d("defaultUnclippedDM", irm.b);
        btdc d9 = btdd.d("fabBlueBackgroundDM", irm.B);
        btdc d10 = btdd.d("fabDarkBackgroundWhiteShadow", irm.E);
        cqtd c = gdj.c(R.color.qu_night_grey_700, R.color.quantum_night_grey900, gdj.f);
        cqss c2 = cqrt.c(R.color.qu_night_white_alpha_24);
        cqtv cqtvVar = b;
        btdaVar.a = dcdc.r(dcdc.p(d, d2, d3, d4, d5, d6, d7, d8, d9, d10, btdd.d("fabDarkBackgroundWhiteShadowDM", d(c, c2, cqtvVar)), btdd.d("fabLightBlueGreyBackgroundDM", irm.F), btdd.d("fabNightBackgroundWhiteShadow", irm.D), btdd.d("fabNightBackgroundWhiteShadowDM", d(gdj.c(R.color.qu_night_grey_800, R.color.quantum_night_greyblack1000, gdj.f), cqrt.c(R.color.qu_night_white_alpha_24), cqtvVar)), btdd.d("fabWhiteBackgroundDM", irm.w), btdd.d("fabWhiteBackgroundGreyShadow", irm.y), btdd.d("fabWhiteBackgroundGreyShadowDM", irm.z), btdd.d("greyBackground", irm.r), btdd.d("greyBackgroundDM", irm.s), btdd.d("greyUnclippedDM", irm.l), btdd.d("lightBlueBackgroundUnclippedDM", irm.j), btdd.d("lightBlueClippedDM", irm.i), btdd.d("lightBlueUnclippedDM", irm.h), btdd.d("lightRedUnclippedDM", irm.k), btdd.d("modFabBlueBackgroundDM", irm.C), btdd.d("navigationNightBlueUnclipped", irm.G), btdd.d("navigationNightBlueUnclippedDM", gdj.c(R.color.qu_night_google_blue_900, R.color.qu_night_navigation_night_blue, gdj.a)), btdd.d("nightBackground", irm.q), btdd.d("nightBackgroundDM", gdj.c(R.color.qu_night_grey_800, R.color.quantum_night_greyblack1000, gdj.a)), btdd.d("nightClipped", irm.p), btdd.d("nightClippedDM", gdj.c(R.color.qu_night_grey_800, 0, gdj.b)), btdd.d("nightUnclipped", irm.o), btdd.d("nightUnclippedDM", gdj.c(R.color.qu_night_grey_800, 0, gdj.a)), btdd.d("whiteBackground", irm.m), btdd.d("whiteBackgroundDM", irm.n), btdd.d("whiteClippedDM", irm.f), btdd.d("whiteUnclippedDM", irm.e), btdd.d("blueBackgroundStyleDM", irn.U()), btdd.d("flatButtonBlueBackgroundStyleDM", irn.W()), btdd.d("flatButtonGreyBackgroundStyleDM", irn.X()), btdd.d("flatButtonIndigoBackgroundStyle", irn.aa()), btdd.d("flatButtonIndigoBackgroundStyleDM", irn.ab()), btdd.d("flatButtonOrangeBackgroundStyle", irn.Y()), btdd.d("flatButtonOrangeBackgroundStyleDM", irn.Z()), btdd.d("whiteBackgroundStyle", irn.S()), btdd.d("whiteBackgroundStyleDM", irn.T()), btdd.d("modDayNightWhiteBackground", ibo.h()), btdd.d("modFabWhiteDayNightBackground", ibo.f()), btdd.d("modFabWhiteDayNightBackgroundDM", gdj.d(ibl.s(), ibl.w(), gdj.f)), btdd.d("modDayNightWhiteBackgroundDM", gdj.d(cqrt.c(R.color.google_night_blue100), ibm.b(), gdj.b)), btdd.d("modBlue100Clipped", ibo.a()), btdd.d("modBlue100ClippedGM", gdj.d(ibl.B(), null, gdj.b)), btdd.d("modBlue100ClippedDM", gdj.d(cqrt.c(R.color.google_night_blue100), null, gdj.b)), btdd.d("modBlue100Unclipped", ibo.b()), btdd.d("modBlue100UnclippedGM", gdj.d(ibl.B(), null, gdj.a)), btdd.d("modBlue100UnclippedDM", gdj.d(cqrt.c(R.color.google_night_blue100), null, gdj.a)), btdd.d("modGrey100Clipped", ibo.c()), btdd.d("modGrey100ClippedGM", gdj.d(ibl.h(), null, gdj.b)), btdd.d("modGrey100ClippedDM", gdj.d(cqrt.c(R.color.google_night_grey100), null, gdj.b)), btdd.d("modGreen600Clipped", ibo.d()), btdd.d("modGreen600ClippedGM", gdj.d(ibl.ac(), null, gdj.b)), btdd.d("modGreen600ClippedDM", gdj.d(ibl.aa(), null, gdj.b)), btdd.d("modGreen700Clipped", ibo.e()), btdd.d("modGreen700ClippedGM", gdj.d(ibl.ad(), null, gdj.b)), btdd.d("modGreen700ClippedDM", gdj.d(ibl.aa(), null, gdj.b)), btdd.d("modLightBlueUnclipped", ibq.D()), btdd.d("modLightBlueUnclippedDM", ibq.E()), btdd.d("modPowerSaveClipped", ibo.a), btdd.d("modPowerSaveClippedGM", gdj.d(ibl.r(), null, gdj.b)), btdd.d("modPowerSaveClippedDM", gdj.d(cqrt.c(R.color.mod_daynight_grey300), null, gdj.b))));
        return btdaVar;
    }

    private static cqtd d(cqtd cqtdVar, cqss cqssVar, cqtv cqtvVar) {
        return new btdo(new Object[]{cqtdVar, cqssVar, cqtvVar}, cqssVar, cqtvVar, cqtdVar);
    }

    public abstract dcdc<btdc> a();

    @Override // defpackage.btdn
    public /* bridge */ /* synthetic */ List b() {
        throw null;
    }
}
