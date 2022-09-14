package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mqk  reason: default package */
/* loaded from: classes7.dex */
public final class mqk implements kcz<dcdc<ldm>> {
    final /* synthetic */ mql a;
    private final mqg b;

    public mqk(mql mqlVar, mqg mqgVar) {
        this.a = mqlVar;
        this.b = mqgVar;
    }

    @Override // defpackage.kcz
    public final void a(@dzsi bttq bttqVar) {
        if (btlu.i(this.a.c.j()) != btlt.GOOGLE) {
            this.b.a(this.a.a.getString(R.string.CAR_NO_RECENT_PLACES_MAPS_NOT_SIGNED_IN));
        } else {
            this.b.a(this.a.a.getString(R.string.CAR_UNABLE_TO_RETRIEVE_RECENT_PLACES));
        }
    }

    @Override // defpackage.kcz
    public final void b() {
    }

    @Override // defpackage.kcz
    public final /* bridge */ /* synthetic */ void c(dcdc<ldm> dcdcVar, int i) {
        dcdc<ldm> dcdcVar2 = dcdcVar;
        if (dcdcVar2.isEmpty()) {
            this.b.a(this.a.a.getString(R.string.CAR_NO_SEARCH_RESULTS_FOUND));
            return;
        }
        final mql mqlVar = this.a;
        int min = Math.min(dcdcVar2.size(), 26);
        dccx G = dcdc.G(min);
        for (int i2 = 0; i2 < min; i2++) {
            final ldm ldmVar = dcdcVar2.get(i2);
            G.g(new mrb(ldmVar, i2, new Runnable(mqlVar, ldmVar) { // from class: mqj
                private final mql a;
                private final ldm b;

                {
                    this.a = mqlVar;
                    this.b = ldmVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    mql mqlVar2 = this.a;
                    mqlVar2.e.k(mqlVar2.d.c(this.b, null, null, kdk.NOTHING, mnz.ADD_STOP_RECENT_PLACES, false, true, mqlVar2.b, null, mqlVar2.g, mqlVar2.e));
                }
            }));
        }
        mqlVar.h = G.f();
        mqg mqgVar = this.b;
        dcdc<mqz> dcdcVar3 = this.a.h;
        dbsk.a(!dcdcVar3.isEmpty());
        mqgVar.a.b.B();
        mqi mqiVar = mqgVar.a;
        mqiVar.b.b(mqiVar.a, dcdcVar3);
        mqgVar.a.c.g(false);
    }
}
