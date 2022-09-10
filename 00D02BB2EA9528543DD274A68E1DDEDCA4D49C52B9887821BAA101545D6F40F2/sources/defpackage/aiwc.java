package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.gmm.locationsharing.widget.LocationSharingCreateShortcutActivity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aiwc  reason: default package */
/* loaded from: classes2.dex */
public final class aiwc implements aivr {
    public final aiwa a;
    private final Context b;
    private jib c;
    private boolean d = true;
    private boolean e;
    @dzsi
    private ajcd f;

    public aiwc(Context context, aiwa aiwaVar, aiwb aiwbVar, cqhn cqhnVar, boolean z) {
        this.a = aiwaVar;
        this.b = context;
        this.e = z;
        this.c = h(context, aiwaVar, z);
    }

    static jib h(Context context, final aiwa aiwaVar, boolean z) {
        jhz a = jhz.a();
        a.q = ibm.b();
        a.a = context.getString(R.string.LOCATION_SHARING_FEATURE_TITLE_VARIANT_LOCATION_SHARING);
        a.x = false;
        a.l = context.getString(R.string.OVERFLOW_MENU_ACCESSIBILITY_TEXT);
        a.p = cjtd.a(dtxu.em);
        a.f(new View.OnClickListener(aiwaVar) { // from class: aivu
            private final aiwa a;

            {
                this.a = aiwaVar;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [ggg, aiwa] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gfq.m(this.a);
            }
        });
        a.j = cqrt.l(R.string.BACK_BUTTON);
        a.o = cjtd.a(dtxu.eh);
        if (z) {
            jhm a2 = jhm.a();
            a2.a = context.getString(R.string.ACTION_MANAGE_LOCATION_SHARING_SETTINGS);
            a2.h = 0;
            a2.d(new View.OnClickListener(aiwaVar) { // from class: aivv
                private final aiwa a;

                {
                    this.a = aiwaVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.d();
                }
            });
            a2.f = cjtd.a(dtxu.en);
            a.c(a2.c());
        }
        jhm a3 = jhm.a();
        a3.a = context.getString(R.string.ACTION_SHOW_BLOCKED_PEOPLE_LIST);
        a3.h = 0;
        a3.d(new View.OnClickListener(aiwaVar) { // from class: aivw
            private final aiwa a;

            {
                this.a = aiwaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aiwa aiwaVar2 = this.a;
                aiws aiwsVar = (aiws) aiwaVar2;
                aiwsVar.al.a().k(((fd) aiwaVar2).H(), aiwsVar.ar.getLocationSharingParameters().n, 1);
            }
        });
        a3.f = cjtd.a(dtxu.ej);
        a.c(a3.c());
        jhm a4 = jhm.a();
        a4.a = context.getString(R.string.ACTION_SHOW_HELP);
        a4.h = 0;
        a4.d(new View.OnClickListener(aiwaVar) { // from class: aivx
            private final aiwa a;

            {
                this.a = aiwaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((aiws) this.a).an.a().q("share_location_others_android");
            }
        });
        a4.f = cjtd.a(dtxu.el);
        a.c(a4.c());
        jhm a5 = jhm.a();
        a5.a = context.getString(R.string.ACTION_SEND_FEEDBACK);
        a5.h = 0;
        a5.d(new View.OnClickListener(aiwaVar) { // from class: aivy
            private final aiwa a;

            {
                this.a = aiwaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aiwa aiwaVar2 = this.a;
                acgz b = achb.b();
                b.c("LocationSharingFeature", "friends-list");
                ((aiws) aiwaVar2).an.a().k(false, true, achc.FRIENDS_LIST, b.b());
            }
        });
        a5.f = cjtd.a(dtxu.ek);
        a.c(a5.c());
        ddho ddhoVar = dtxu.ei;
        jhm a6 = jhm.a();
        a6.a = context.getString(R.string.CREATE_SHORTCUT_LABEL);
        a6.h = 0;
        a6.d(new View.OnClickListener(aiwaVar) { // from class: aivz
            private final aiwa a;

            {
                this.a = aiwaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aiwa aiwaVar2 = this.a;
                aiws aiwsVar = (aiws) aiwaVar2;
                if (aiwsVar.ax != null) {
                    if (ako.a()) {
                        fd fdVar = (fd) aiwaVar2;
                        if (jk.a(fdVar.H())) {
                            Context H = fdVar.H();
                            Context H2 = fdVar.H();
                            Intent l = ahyr.l(H2, dbpy.a, ahwe.SHORTCUT);
                            l.setAction("android.intent.action.VIEW");
                            aiwsVar.al.a().t(H, yzi.i(H2, "LocationSharingShortcutId", H2.getString(R.string.LOCATION_SHARING_FEATURE_TITLE), R.drawable.location_sharing_icon, l), null);
                            return;
                        }
                    }
                    fd fdVar2 = (fd) aiwaVar2;
                    Intent o = LocationSharingCreateShortcutActivity.o(fdVar2.H());
                    o.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                    deha.q(aiwsVar.al.a().I(fdVar2.H(), o), new aiwq(aiwsVar), aiwsVar.av);
                }
            }
        });
        a6.f = cjtd.a(ddhoVar);
        a.c(a6.c());
        return a.b();
    }

    @Override // defpackage.aivr
    @dzsi
    public ajbz a() {
        return this.f;
    }

    @Override // defpackage.aivr
    public Boolean b() {
        return Boolean.valueOf(!this.d);
    }

    @Override // defpackage.aivr
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.aivr
    public jib d() {
        return this.c;
    }

    public void e(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        this.c = h(this.b, this.a, this.e);
        cqkx.p(this);
    }

    public void f(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        this.c = h(this.b, this.a, z);
        cqkx.p(this);
    }

    public void g(dbsg<aion> dbsgVar) {
        dbsg dbsgVar2;
        ajcd ajcdVar = this.f;
        if (ajcdVar != null) {
            dbsgVar2 = dbsg.i(ajcdVar.a);
        } else {
            dbsgVar2 = dbpy.a;
        }
        if (dbsgVar2.equals(dbsgVar)) {
            return;
        }
        this.f = dbsgVar.a() ? new ajcd(dbsgVar.b(), new ajcc(this) { // from class: aivt
            private final aiwc a;

            {
                this.a = this;
            }

            @Override // defpackage.ajcc
            public final void a(aion aionVar) {
                aiws aiwsVar = (aiws) this.a.a;
                dbsg<btlu> dbsgVar3 = aiwsVar.ax;
                if (dbsgVar3 != null) {
                    aiwsVar.ap.a(dbsgVar3, aionVar);
                }
            }
        }) : null;
        cqkx.p(this);
    }
}
