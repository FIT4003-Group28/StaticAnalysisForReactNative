package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;
/* compiled from: PG */
/* renamed from: xhe  reason: default package */
/* loaded from: classes7.dex */
public class xhe implements xgs {
    public final Activity a;
    public final dxio<afha> b;
    public final Runnable c;
    public final diyj d;
    @dzsi
    public String e;
    public cpbq f;
    private final bvsx g;
    private final eiq h;
    private final cjqy i;
    @dzsi
    private CharSequence j;

    public xhe(Activity activity, dxio<afha> dxioVar, Runnable runnable, diyj diyjVar, eiq eiqVar, cjqy cjqyVar, @dzsi CharSequence charSequence, @dzsi String str) {
        this.a = activity;
        this.b = dxioVar;
        this.c = runnable;
        this.d = diyjVar;
        this.h = eiqVar;
        this.j = charSequence;
        this.e = str;
        this.f = cpaa.a(activity);
        this.i = cjqyVar;
        this.g = new bvsx(activity.getResources());
    }

    @Override // defpackage.xgs
    @dzsi
    public jic a() {
        if (b() != null) {
            return null;
        }
        dihv dihvVar = this.d.a;
        if (dihvVar == null) {
            dihvVar = dihv.b;
        }
        return new jic(dihvVar.a, ckqc.FIFE_MERGE, ibm.i(), 80);
    }

    @Override // defpackage.xgs
    @dzsi
    public eik b() {
        dihz dihzVar = this.d.g;
        if (dihzVar == null) {
            dihzVar = dihz.d;
        }
        int a = dihy.a(dihzVar.a);
        if (a != 0 && a == 2 && !dihzVar.b.isEmpty()) {
            return this.h.a(dihzVar.b);
        }
        return null;
    }

    @Override // defpackage.xgs
    public Boolean c() {
        dihz dihzVar = this.d.g;
        if (dihzVar == null) {
            dihzVar = dihz.d;
        }
        return Boolean.valueOf(dihzVar.c);
    }

    @Override // defpackage.xgs
    public Boolean d() {
        return Boolean.valueOf(this.j != null);
    }

    @Override // defpackage.xgs
    public Boolean e() {
        return Boolean.valueOf(!q().isEmpty());
    }

    @Override // defpackage.xgs
    public String f() {
        if (d().booleanValue()) {
            dnpq dnpqVar = this.d.d;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            return dnpqVar.d;
        }
        return this.a.getString(R.string.TRANSIT_PAYMENTS_OPEN_LOOP_BUTTON_ADD);
    }

    @Override // defpackage.xgs
    @dzsi
    public String g() {
        if (d().booleanValue()) {
            return this.a.getString(R.string.TUTORIAL_GOT_IT);
        }
        return null;
    }

    @Override // defpackage.xgs
    public String h() {
        if (d().booleanValue()) {
            return this.a.getString(R.string.TRANSIT_PAYMENTS_OPEN_LOOP_TITLE_ALL_SET);
        }
        return this.a.getString(R.string.TRANSIT_PAYMENTS_OPEN_LOOP_TITLE_ADD);
    }

    @Override // defpackage.xgs
    public CharSequence i() {
        if (d().booleanValue()) {
            bvsx bvsxVar = new bvsx(this.a.getResources());
            CharSequence charSequence = this.j;
            dbsk.s(charSequence);
            bvsv a = bvsxVar.a(charSequence);
            a.i();
            a.l(ibm.w().b(this.a));
            bvsu c = bvsxVar.c(R.string.TRANSIT_PAYMENTS_CARD_NAME_MESSAGE);
            c.a(a);
            bvsv a2 = bvsxVar.a(this.d.f);
            a2.g(" ");
            a2.f(c);
            return a2.c();
        } else if (!e().booleanValue()) {
            return this.d.e;
        } else {
            bvsu c2 = this.g.c(R.string.TRANSIT_PAYMENTS_SETUP_WITH_PARTICIPATING_BANKS_MESSAGE);
            bvsu b = this.g.b(this.a.getString(R.string.TRANSIT_PAYMENTS_PARTICIPATING_BANKS));
            b.k(jmw.e(ibm.w().b(this.a), this.i, dtyc.dX, new Runnable(this) { // from class: xhd
                private final xhe a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    xhe xheVar = this.a;
                    xheVar.b.a().f(xheVar.a, new Intent("android.intent.action.VIEW", Uri.parse(xheVar.q())), 4);
                }
            }));
            c2.a(b);
            return c2.c();
        }
    }

    @Override // defpackage.xgs
    @dzsi
    public jic j() {
        if (!d().booleanValue()) {
            dihv dihvVar = this.d.b;
            if (dihvVar == null) {
                dihvVar = dihv.b;
            }
            return new jic(dihvVar.a, ckqc.FIFE_MERGE, 0);
        }
        return null;
    }

    @Override // defpackage.xgs
    public View.OnClickListener k() {
        return new View.OnClickListener(this) { // from class: xhc
            private final xhe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xhe xheVar = this.a;
                if (xheVar.d().booleanValue()) {
                    xheVar.r();
                }
            }
        };
    }

    @Override // defpackage.xgs
    public View.OnClickListener l() {
        return new View.OnClickListener(this) { // from class: xha
            private final xhe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xhe xheVar = this.a;
                if (xheVar.d().booleanValue()) {
                    dnpq dnpqVar = xheVar.d.d;
                    if (dnpqVar == null) {
                        dnpqVar = dnpq.g;
                    }
                    xheVar.b.a().f(xheVar.a, new Intent("android.intent.action.VIEW", Uri.parse(dnpqVar.c)), 4);
                } else if (xheVar.e != null) {
                    cpbq cpbqVar = xheVar.f;
                    Activity activity = xheVar.a;
                    cntc builder = cntd.builder();
                    builder.a = new cnsr(activity) { // from class: cpbo
                        private final Activity a;

                        {
                            this.a = activity;
                        }

                        @Override // defpackage.cnsr
                        public final void a(Object obj, Object obj2) {
                            Activity activity2 = this.a;
                            FirstPartyTokenizePanRequest firstPartyTokenizePanRequest = new FirstPartyTokenizePanRequest();
                            firstPartyTokenizePanRequest.a = null;
                            firstPartyTokenizePanRequest.b = false;
                            firstPartyTokenizePanRequest.c = null;
                            firstPartyTokenizePanRequest.d = null;
                            firstPartyTokenizePanRequest.e = false;
                            firstPartyTokenizePanRequest.f = null;
                            firstPartyTokenizePanRequest.g = false;
                            firstPartyTokenizePanRequest.h = false;
                            ((cpbb) ((cpbg) obj).L()).f(firstPartyTokenizePanRequest, new cpbf(activity2));
                            cntf.c(Status.a, null, (cpct) obj2);
                        }
                    };
                    builder.b = new Feature[]{cozr.q};
                    builder.c = 2121;
                    cpbqVar.d(builder.a());
                } else {
                    xheVar.r();
                }
            }
        };
    }

    @Override // defpackage.xgs
    public View.OnClickListener m() {
        return new View.OnClickListener(this) { // from class: xhb
            private final xhe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.run();
            }
        };
    }

    @Override // defpackage.xgs
    @dzsi
    public cjtd n() {
        if (d().booleanValue()) {
            return cjtd.a(dtyc.dW);
        }
        return null;
    }

    @Override // defpackage.xgs
    public cjtd o() {
        if (d().booleanValue()) {
            return cjtd.a(dtyc.dV);
        }
        return cjtd.a(dtyc.dT);
    }

    @Override // defpackage.xgs
    @dzsi
    public cjtd p() {
        if (d().booleanValue()) {
            return cjtd.a(dtyc.dU);
        }
        return null;
    }

    public final String q() {
        dnpq dnpqVar = this.d.h;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.c;
    }

    public final void r() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity"));
        this.b.a().f(this.a, intent, 4);
    }

    public void s(@dzsi CharSequence charSequence, @dzsi String str) {
        this.j = charSequence;
        this.e = str;
    }
}
