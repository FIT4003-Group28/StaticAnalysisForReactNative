package defpackage;

import android.accounts.Account;
import android.app.Activity;
/* compiled from: PG */
/* renamed from: bzov  reason: default package */
/* loaded from: classes4.dex */
public final class bzov extends bzpy {
    public final gga a;

    public bzov(final gga ggaVar, akfa akfaVar, Activity activity) {
        super(activity, akfaVar, new bzpx(ggaVar) { // from class: bzor
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // defpackage.bzpx
            public final void a() {
                this.a.g().f();
            }
        });
        this.a = ggaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.bzpy
    public final void a(String str) {
        char c;
        final dgyd dgydVar;
        switch (str.hashCode()) {
            case -2076650431:
                if (str.equals("timeline")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1393162301:
                if (str.equals("your_places_visited")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -374253036:
                if (str.equals("gmm_lh_promo1350786")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 123221755:
                if (str.equals("gmm_commute_setup_lh")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 681200401:
                if (str.equals("personal_score_setup")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            dgydVar = dgyd.MAPS_TIMELINE_ONBOARDING;
        } else if (c == 1) {
            dgydVar = dgyd.MAPS_PERSONAL_SCORE_SETUP;
        } else if (c == 2) {
            dgydVar = dgyd.MAPS_YOUR_PLACES_VISITIED;
        } else if (c == 3) {
            dgydVar = dgyd.MAPS_LH_PROMO1350786;
        } else if (c == 4) {
            dgydVar = dgyd.MAPS_COMMUTE_SETUP;
        } else {
            dgydVar = dgyd.MAPS_FALLBACK_FLOW;
        }
        if (dgydVar == dgyd.FLOW_ID_UNSPECIFIED) {
            c();
            return;
        }
        final Account e = e();
        cqdk.c = new bzou(this.c.getApplicationContext());
        new cqdk().a(this.c, e, dgydVar, new cqdj(this, e, dgydVar) { // from class: bzos
            private final bzov a;
            private final Account b;
            private final dgyd c;

            {
                this.a = this;
                this.b = e;
                this.c = dgydVar;
            }

            @Override // defpackage.cqdj
            public final void a(cqeo cqeoVar) {
                final bzov bzovVar = this.a;
                Account account = this.b;
                dgyd dgydVar2 = this.c;
                int ordinal = cqeoVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            bzpo bzpoVar = bzovVar.e;
                            if (bzpoVar != null) {
                                bzpoVar.a();
                                return;
                            }
                            final bzqe bzqeVar = new bzqe();
                            bzqeVar.aM(account, dgydVar2);
                            bzqeVar.ad = bzovVar;
                            bzovVar.c.runOnUiThread(new Runnable(bzovVar, bzqeVar) { // from class: bzot
                                private final bzov a;
                                private final bzqe b;

                                {
                                    this.a = bzovVar;
                                    this.b = bzqeVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    bzov bzovVar2 = this.a;
                                    bzovVar2.a.C(this.b, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
                                }
                            });
                            bzovVar.f();
                            return;
                        } else if (ordinal != 3) {
                            return;
                        }
                    }
                    bzovVar.c();
                    return;
                }
                bzovVar.b();
            }
        });
    }
}
