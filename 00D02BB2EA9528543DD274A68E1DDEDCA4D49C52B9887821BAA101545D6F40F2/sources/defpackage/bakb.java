package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bakb  reason: default package */
/* loaded from: classes3.dex */
public final class bakb extends gen {
    public gga a;
    public ckcw ad;
    cjkr ae;
    public akfa b;
    public akfc c;
    public btrm d;
    public axwq e;
    public bvrb g;

    public static bakb q(int i, @dzsi String str) {
        Bundle bundle = new Bundle();
        bundle.putString("signOutMode", i != 1 ? "SWITCH_ACCOUNTS" : "SIGN_OUT");
        bundle.putString("switchToAccountName", str);
        bakb bakbVar = new bakb();
        bakbVar.B(bundle);
        return bakbVar;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((bakc) btsx.b(bakc.class, this)).cA(this);
    }

    public final void g(Runnable runnable) {
        aT();
        this.g.b(runnable, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        char c;
        char c2;
        Bundle bundle2 = this.o;
        String string = bundle2.getString("signOutMode");
        dbsk.s(string);
        int hashCode = string.hashCode();
        if (hashCode != -816477039) {
            if (hashCode == 1095242156 && string.equals("SIGN_OUT")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (string.equals("SWITCH_ACCOUNTS")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            c2 = 1;
        } else if (c != 1) {
            throw new IllegalArgumentException();
        } else {
            c2 = 2;
        }
        cjkp B = cjkr.B();
        if (c2 == 1) {
            ((ckcn) this.ad.a(ckkf.d)).a();
            B.t(this.a.getString(R.string.SYNC_LOGOUT_DIALOG_TITLE));
            ((cjke) B).e = this.a.getString(R.string.SYNC_LOGOUT_DIALOG_MESSAGE);
            B.y(this.a.getString(R.string.SYNC_LOGOUT_BUTTON), new View.OnClickListener(this) { // from class: bajw
                private final bakb a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final bakb bakbVar = this.a;
                    bakbVar.g(new Runnable(bakbVar) { // from class: baka
                        private final bakb a;

                        {
                            this.a = bakbVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bakb bakbVar2 = this.a;
                            bakbVar2.e.s(null);
                            bakbVar2.b.r(akez.USER_TRIGERRED_PERSONAL_PLACES);
                        }
                    });
                }
            }, null);
        } else {
            ((ckcn) this.ad.a(ckkf.e)).a();
            final String string2 = bundle2.getString("switchToAccountName");
            dbsk.s(string2);
            B.t(this.a.getString(R.string.SYNC_SWITCH_ACCOUNTS_DIALOG_TITLE));
            ((cjke) B).e = this.a.getString(R.string.SYNC_SWITCH_ACCOUNTS_DIALOG_MESSAGE);
            B.y(this.a.getString(R.string.SYNC_SWITCH_ACCOUNTS_BUTTON), new View.OnClickListener(this, string2) { // from class: bajx
                private final bakb a;
                private final String b;

                {
                    this.a = this;
                    this.b = string2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final bakb bakbVar = this.a;
                    final String str = this.b;
                    bakbVar.g(new Runnable(bakbVar, str) { // from class: bajz
                        private final bakb a;
                        private final String b;

                        {
                            this.a = bakbVar;
                            this.b = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bakb bakbVar2 = this.a;
                            String str2 = this.b;
                            bakbVar2.e.s(null);
                            bakbVar2.c.e(str2, null);
                        }
                    });
                }
            }, null);
        }
        B.z(this.a.getString(R.string.SYNC_WAIT_BUTTON), new View.OnClickListener(this) { // from class: bajv
            private final bakb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final bakb bakbVar = this.a;
                bakbVar.g(new Runnable(bakbVar) { // from class: bajy
                    private final bakb a;

                    {
                        this.a = bakbVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bakb bakbVar2 = this.a;
                        bakbVar2.e.s(null);
                        bakbVar2.d.b(new gds(bakbVar2.b.j()));
                    }
                });
            }
        }, null);
        ((cjke) B).a = ibn.l();
        cjkr u = B.u(this.a);
        this.ae = u;
        return u.q();
    }
}
