package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baqz  reason: default package */
/* loaded from: classes3.dex */
public class baqz extends barf {
    public final dxio<avik> a;
    public dccr<dltm> b;
    public baku c;

    public baqz(final dcdc<drdg> dcdcVar, gga ggaVar, cqhn cqhnVar, cqkj cqkjVar, bakv bakvVar, dxio<avij> dxioVar, dxio<avik> dxioVar2) {
        super(dcdcVar, ggaVar, cqkjVar, bakvVar);
        this.c = baku.a();
        this.a = dxioVar2;
        this.h = n(R.drawable.quantum_gm_ic_file_download_vd_theme_24);
        this.g = ggaVar.getString(R.string.TRIP_DESTINATION_OFFLINE_MAP_ACTION_BUTTON);
        this.i = cjtd.a(dtyd.cY);
        dxioVar.a().C().d(new crzp(this, dcdcVar) { // from class: baqv
            private final baqz a;
            private final dcdc b;

            {
                this.a = this;
                this.b = dcdcVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                final baqz baqzVar = this.a;
                final dcdc dcdcVar2 = this.b;
                avkr avkrVar = (avkr) crzmVar.l();
                if (avkrVar != null) {
                    baqzVar.b = avkrVar.c().values();
                    baqzVar.d.runOnUiThread(new Runnable(baqzVar, dcdcVar2) { // from class: baqy
                        private final baqz a;
                        private final dcdc b;

                        {
                            this.a = baqzVar;
                            this.b = dcdcVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            baku b;
                            List<baqb> c;
                            baqz baqzVar2 = this.a;
                            dcdc dcdcVar3 = this.b;
                            dccr<dltm> dccrVar = baqzVar2.b;
                            if (dcbg.b(dcdcVar3).p(new dbsl(dccrVar) { // from class: bakn
                                private final dccr a;

                                {
                                    this.a = dccrVar;
                                }

                                @Override // defpackage.dbsl
                                public final boolean a(Object obj) {
                                    return bakv.b((drdg) obj, this.a).d();
                                }
                            })) {
                                b = new baku(6, 0);
                            } else {
                                b = dcbg.b(dcdcVar3).q(new dbsl(dccrVar) { // from class: bako
                                    private final dccr a;

                                    {
                                        this.a = dccrVar;
                                    }

                                    @Override // defpackage.dbsl
                                    public final boolean a(Object obj) {
                                        return bakv.b((drdg) obj, this.a).c();
                                    }
                                }) ? baku.b() : baku.a();
                            }
                            baqzVar2.c = b;
                            baqzVar2.h = baqz.j(baqzVar2.c);
                            cqkx.p(baqzVar2);
                            baqc baqcVar = baqzVar2.j;
                            if (baqcVar == null) {
                                c = dcdc.e();
                            } else {
                                c = baqcVar.c();
                            }
                            for (baqb baqbVar : c) {
                                baqbVar.g(bakv.b(baqbVar.a(), baqzVar2.b));
                                cqkx.p(baqbVar);
                            }
                        }
                    });
                }
            }
        }, dege.a);
    }

    public static cqtd j(baku bakuVar) {
        if (bakuVar.d()) {
            return n(R.drawable.quantum_gm_ic_downloading_vd_theme_24);
        }
        if (bakuVar.c()) {
            return n(R.drawable.quantum_gm_ic_file_download_done_vd_theme_24);
        }
        return n(R.drawable.quantum_gm_ic_file_download_vd_theme_24);
    }

    @Override // defpackage.barf, defpackage.baqe
    public Boolean c() {
        return Boolean.valueOf(this.c.c());
    }

    @Override // defpackage.barf, defpackage.baqe
    public String f() {
        if (this.c.c()) {
            return this.d.getString(R.string.TRIP_DESTINATION_OFFLINE_MAP_ACTION_BUTTON_COMPLETED_ACCESSIBILITY_HINT);
        }
        if (this.c.d()) {
            return this.d.getString(R.string.TRIP_DESTINATION_OFFLINE_MAP_ACTION_BUTTON_PARTIALLY_COMPLETED_ACCESSIBILITY_HINT);
        }
        return this.d.getString(R.string.TRIP_DESTINATION_OFFLINE_MAP_ACTION_BUTTON_NOT_STARTED_ACCESSIBILITY_HINT);
    }

    @Override // defpackage.barf
    public final baqo h() {
        return new baqo(this) { // from class: baqw
            private final baqz a;

            {
                this.a = this;
            }

            @Override // defpackage.baqo
            public final void a(drdg drdgVar) {
                final baqz baqzVar = this.a;
                baqzVar.l();
                if (!baqzVar.c().booleanValue()) {
                    dccr<dltm> dccrVar = baqzVar.b;
                    baku b = dccrVar == null ? null : bakv.b(drdgVar, dccrVar);
                    if (b == null || (!b.d() && !b.c())) {
                        baqzVar.k(true);
                        baqzVar.e.a(drdgVar, new bakt(baqzVar) { // from class: baqx
                            private final baqz a;

                            {
                                this.a = baqzVar;
                            }

                            @Override // defpackage.bakt
                            public final void a(ilo iloVar) {
                                baqz baqzVar2 = this.a;
                                if (iloVar == null) {
                                    baqzVar2.m();
                                } else {
                                    dhjx ak = iloVar.ak();
                                    dbsk.s(ak);
                                    baqzVar2.a.a().i(alad.c(ak), iloVar.n());
                                }
                                baqzVar2.k(false);
                            }
                        });
                        return;
                    }
                }
                baqzVar.a.a().j();
            }
        };
    }

    @Override // defpackage.barf
    public final baqc i(gga ggaVar, dcdc<drdg> dcdcVar, baqo baqoVar) {
        return new baqr(ggaVar, R.string.TRIP_MULTI_DESTINATION_OFFLINE_MAP_SELECTOR_TITLE, R.string.TRIP_MULTI_DESTINATION_OFFLINE_MAP_SELECTOR_SUBTITLE, R.string.TRIP_MULTI_DESTINATION_OFFLINE_MAP_LIST_ITEM_ACCESSIBILITY_DESCRIPTION, dcdcVar, baqoVar);
    }
}
