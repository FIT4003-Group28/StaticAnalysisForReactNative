package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bare  reason: default package */
/* loaded from: classes3.dex */
public class bare extends barf {
    public final dxio<axwo> a;
    public final dxio<begg> b;

    public bare(dcdc<drdg> dcdcVar, gga ggaVar, cqhn cqhnVar, cqkj cqkjVar, bakv bakvVar, dxio<axwo> dxioVar, dxio<begg> dxioVar2) {
        super(dcdcVar, ggaVar, cqkjVar, bakvVar);
        this.a = dxioVar;
        this.b = dxioVar2;
        this.h = n(R.drawable.quantum_gm_ic_bookmark_border_vd_theme_24);
        this.g = ggaVar.getString(R.string.TRIP_DESTINATION_SAVED_PLACES_ACTION_BUTTON);
        this.i = cjtd.a(dtyd.cZ);
    }

    @Override // defpackage.barf
    public final baqo h() {
        return new baqo(this) { // from class: bara
            private final bare a;

            {
                this.a = this;
            }

            @Override // defpackage.baqo
            public final void a(drdg drdgVar) {
                bare bareVar = this.a;
                bareVar.k(true);
                bareVar.l();
                bareVar.e.d(drdgVar, new barb(bareVar, drdgVar));
            }
        };
    }

    @Override // defpackage.barf
    public final baqc i(gga ggaVar, dcdc<drdg> dcdcVar, baqo baqoVar) {
        return new baqr(ggaVar, R.string.TRIP_MULTI_DESTINATION_SAVED_PLACES_SELECTOR_TITLE, R.string.TRIP_MULTI_DESTINATION_SAVED_PLACES_SELECTOR_SUBTITLE, R.string.TRIP_MULTI_DESTINATION_SAVED_PLACES_LIST_ITEM_ACCESSIBILITY_DESCRIPTION, dcdcVar, baqoVar);
    }
}
