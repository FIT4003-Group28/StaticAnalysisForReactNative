package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: snt  reason: default package */
/* loaded from: classes7.dex */
public class snt implements jam {
    private final sns a;
    private final cqtd b;
    private final CharSequence c;
    private final CharSequence d;
    private final CharSequence e;
    private final Runnable f;
    private final cjtd g;
    private final cjtd h;

    public snt(gga ggaVar, final akfc akfcVar, final gun gunVar, sns snsVar, final Runnable runnable) {
        this.a = snsVar;
        if (snsVar == sns.SIGNED_OUT) {
            this.b = iva.e(iup.e(R.raw.transportation_tab_offline_error), iup.e(R.raw.transportation_tab_offline_error_dark));
            this.c = ggaVar.getString(R.string.SIGNED_OUT_ERROR_TITLE);
            this.d = ggaVar.getString(R.string.SIGNED_OUT_ERROR_SUBTITLE);
            this.e = ggaVar.getString(R.string.RECENTS_SIGN_IN_PROMO_BUTTON);
            this.g = cjtd.a(dtyc.fM);
            this.h = cjtd.a(dtyc.fN);
            this.f = new Runnable(akfcVar, runnable) { // from class: sno
                private final akfc a;
                private final Runnable b;

                {
                    this.a = akfcVar;
                    this.b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    akfc akfcVar2 = this.a;
                    final Runnable runnable2 = this.b;
                    akfcVar2.a(akeu.j(new akeo(runnable2) { // from class: snq
                        private final Runnable a;

                        {
                            this.a = runnable2;
                        }

                        @Override // defpackage.akeo
                        public final void a(gga ggaVar2, btlu btluVar) {
                            this.a.run();
                        }

                        @Override // defpackage.akeo
                        public final void b(gga ggaVar2, btlu btluVar) {
                        }
                    }).b());
                }
            };
        } else if (snsVar == sns.OFFLINE) {
            this.b = iva.e(iup.e(R.raw.transportation_tab_offline_error), iup.e(R.raw.transportation_tab_offline_error_dark));
            this.c = ggaVar.getString(R.string.OFFLINE_ERROR_TITLE);
            this.d = ggaVar.getString(R.string.OFFLINE_ERROR_SUBTITLE);
            this.e = ggaVar.getString(R.string.TRY_AGAIN);
            this.g = cjtd.a(dtyc.fF);
            this.h = cjtd.a(dtyc.fG);
            this.f = runnable;
        } else if (snsVar == sns.LOCATION_DISABLED) {
            this.b = iva.e(iup.e(R.raw.transportation_tab_offline_error), iup.e(R.raw.transportation_tab_offline_error_dark));
            this.c = ggaVar.getString(R.string.LOCATION_DISABLED_ERROR_TITLE);
            this.d = ggaVar.getString(R.string.LOCATION_DISABLED_ERROR_SUBTITLE);
            this.e = ggaVar.getString(R.string.LOCATION_DISABLED_ERROR_ACTION_TEXT);
            this.g = cjtd.a(dtyc.fA);
            this.h = cjtd.a(dtyc.fB);
            this.f = new Runnable(this, gunVar, runnable) { // from class: snp
                private final snt a;
                private final gun b;
                private final Runnable c;

                {
                    this.a = this;
                    this.b = gunVar;
                    this.c = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.b.a(dtyc.fC, dtyc.fD, dtyc.fy, dtyc.fz, new snr(this.c)).a();
                }
            };
        } else {
            this.b = iup.e(R.raw.transportation_tab_failed_trips_error);
            this.c = ggaVar.getString(R.string.FAILED_TRIPS_ERROR_TITLE);
            this.d = ggaVar.getString(R.string.FAILED_TRIPS_ERROR_SUBTITLE);
            this.e = "";
            this.g = cjtd.a(dtyc.fx);
            this.h = cjtd.b;
            this.f = runnable;
        }
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.jam
    public cjtd c() {
        return this.g;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return false;
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        return cqkl.a;
    }

    @Override // defpackage.jam
    public cjtd g() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean h() {
        return Boolean.valueOf(!TextUtils.isEmpty(this.e));
    }

    @Override // defpackage.jam
    public cqkl i() {
        this.f.run();
        return cqkl.a;
    }

    @Override // defpackage.jam
    public CharSequence j() {
        return this.e;
    }

    @Override // defpackage.jam
    public Boolean k() {
        return jak.a();
    }

    @Override // defpackage.jam
    public cjtd l() {
        return this.h;
    }

    @Override // defpackage.jam
    public cqtd m() {
        return null;
    }

    @Override // defpackage.jam
    public CharSequence n() {
        return this.d;
    }

    @Override // defpackage.jam
    public cqtd o() {
        return this.b;
    }

    public sns p() {
        return this.a;
    }
}
