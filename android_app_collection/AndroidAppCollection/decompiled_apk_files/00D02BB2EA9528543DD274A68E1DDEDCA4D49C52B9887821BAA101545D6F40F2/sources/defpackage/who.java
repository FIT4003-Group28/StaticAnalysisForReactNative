package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: who  reason: default package */
/* loaded from: classes7.dex */
final class who implements degu<Void> {
    final /* synthetic */ boolean a;
    final /* synthetic */ whr b;

    public who(whr whrVar, boolean z) {
        this.b = whrVar;
        this.a = z;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.b.b();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Void r7) {
        whr whrVar = this.b;
        boolean z = this.a;
        cqkx.p(whrVar);
        final whv a = whrVar.c.a();
        wgj wgjVar = whrVar.d;
        dbsk.s(wgjVar);
        gga ggaVar = a.a.get();
        if (ggaVar != null && ggaVar.aZ) {
            if (z) {
                cjkp B = cjkr.B();
                B.t(ggaVar.getResources().getString(R.string.FIRST_TIME_PINNED_TRIP_PROMO_DIALOG_TITLE));
                ((cjke) B).e = ggaVar.getResources().getString(R.string.FIRST_TIME_PINNED_TRIP_PROMO_DIALOG_DESCRIPTION);
                B.y(ggaVar.getResources().getString(R.string.FIRST_TIME_PINNED_TRIP_PROMO_DIALOG_CLOSE), null, cjtd.a(dtxp.ah));
                B.z(ggaVar.getResources().getString(R.string.FIRST_TIME_PINNED_TRIP_PROMO_DIALOG_AFFIRM), new View.OnClickListener(a) { // from class: whu
                    private final whv a;

                    {
                        this.a = a;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.c.a().N();
                    }
                }, cjtd.a(dtxp.ag));
                a.d = B.u(ggaVar);
                a.d.q().show();
            } else if (wgjVar.a() || a.b.d(ggaVar)) {
                dafk a2 = ckos.a(ggaVar.findViewById(16908290), ggaVar.getString(wgjVar.a() ? wgjVar.c() == dqvj.TRANSIT ? R.string.SAVED_TRIPS_TRANSIT_TRIP_PINNED : R.string.SAVED_TRIPS_DRIVING_TRIP_PINNED : R.string.SAVED_TRIPS_TRIP_UNPINNED), 0);
                if (wgjVar.a()) {
                    a2.t(R.string.SAVED_TRIPS_PROD_VIEW, new View.OnClickListener(a) { // from class: wht
                        private final whv a;

                        {
                            this.a = a;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.c.a().N();
                        }
                    });
                }
                a2.c();
            }
        }
        whrVar.b.a();
    }
}
