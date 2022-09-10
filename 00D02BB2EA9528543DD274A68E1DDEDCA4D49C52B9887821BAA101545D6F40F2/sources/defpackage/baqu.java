package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baqu  reason: default package */
/* loaded from: classes3.dex */
public class baqu extends barf {
    public final dxio<begg> a;

    public baqu(dcdc<drdg> dcdcVar, gga ggaVar, cqhn cqhnVar, cqkj cqkjVar, bakv bakvVar, dxio<begg> dxioVar) {
        super(dcdcVar, ggaVar, cqkjVar, bakvVar);
        this.a = dxioVar;
        this.h = n(R.drawable.quantum_gm_ic_explore_vd_theme_24);
        this.g = ggaVar.getString(R.string.TRIP_DESTINATION_GUIDE_ACTION_BUTTON);
        this.i = cjtd.a(dtyd.da);
    }

    @Override // defpackage.barf
    public final baqo h() {
        return new baqo(this) { // from class: baqt
            private final baqu a;

            {
                this.a = this;
            }

            @Override // defpackage.baqo
            public final void a(drdg drdgVar) {
                baqu baquVar = this.a;
                baquVar.l();
                baquVar.k(true);
                ily ilyVar = new ily();
                ilyVar.w(drdgVar);
                baquVar.a.a().o(barf.o(ilyVar.d()), false, null);
                baquVar.k(false);
            }
        };
    }

    @Override // defpackage.barf
    public final baqc i(gga ggaVar, dcdc<drdg> dcdcVar, baqo baqoVar) {
        return new baqr(ggaVar, R.string.TRIP_MULTI_DESTINATION_GUIDE_SELECTOR_TITLE, R.string.TRIP_MULTI_DESTINATION_GUIDE_SELECTOR_SUBTITLE, R.string.TRIP_MULTI_DESTINATION_GUIDE_LIST_ITEM_ACCESSIBILITY_DESCRIPTION, dcdcVar, baqoVar);
    }
}
