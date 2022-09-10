package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aqvu  reason: default package */
/* loaded from: classes2.dex */
public class aqvu implements aquw {
    public final Activity a;
    public final dxio<apyu> b;
    public final dehq c;
    public final apyx d;
    public final String e;
    public final AtomicBoolean f = new AtomicBoolean(true);
    public final crzo<Boolean> g;
    public final dxio<apyz> h;
    public aqux i;
    public btlu j;
    public final bvjj k;
    public List<aquu> l;
    private final dxio<akfa> m;
    private final dehq n;
    private final cqhn o;
    private final aqvx p;
    private final cjtd q;
    private final apzy r;
    private crzp<apsi<dbsg<apzn>>> s;
    private crzm<apsi<dbsg<apzn>>> t;
    private aquu u;
    private final View.OnClickListener v;

    public aqvu(Activity activity, dxio<akfa> dxioVar, dxio<aqbo> dxioVar2, dxio<apyu> dxioVar3, dehq dehqVar, dehq dehqVar2, apzy apzyVar, cqhn cqhnVar, aqvx aqvxVar, bvjj bvjjVar, apyx apyxVar, dxio<apyz> dxioVar4, String str, ddce ddceVar) {
        crzo<Boolean> crzoVar = new crzo<>();
        this.g = crzoVar;
        this.v = new View.OnClickListener(this) { // from class: aqvo
            private final aqvu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aqvu aqvuVar = this.a;
                aqux aquxVar = aqvuVar.i;
                dbsk.s(aquxVar);
                boolean booleanValue = aquxVar.h().booleanValue();
                aqvuVar.h(!booleanValue);
                if (!booleanValue) {
                    if (!aqvuVar.j()) {
                        return;
                    }
                    aqvuVar.g.b(Boolean.FALSE);
                    String str2 = aqvuVar.e;
                    btlu btluVar = aqvuVar.j;
                    dbsk.s(btluVar);
                    dehn<apzn> d = aqvuVar.b.a().d(str2, btluVar);
                    Activity activity2 = aqvuVar.a;
                    deha.q(d, new aqvt(activity2, activity2.getString(R.string.MERCHANT_MESSAGING_SETTINGS_TURN_ON_SUCCESS), aqvuVar.a.getString(R.string.MESSAGING_GENERIC_ERROR_MESSAGE)), aqvuVar.c);
                } else if (!aqvuVar.j()) {
                } else {
                    aqvuVar.g.b(Boolean.FALSE);
                    String str3 = aqvuVar.e;
                    btlu btluVar2 = aqvuVar.j;
                    dbsk.s(btluVar2);
                    dehn<apzn> e = aqvuVar.b.a().e(str3, btluVar2);
                    Activity activity3 = aqvuVar.a;
                    deha.q(e, new aqvt(activity3, activity3.getString(R.string.MERCHANT_MESSAGING_SETTINGS_TURN_OFF_SUCCESS), aqvuVar.a.getString(R.string.MESSAGING_GENERIC_ERROR_MESSAGE)), aqvuVar.c);
                }
            }
        };
        new View.OnClickListener(this) { // from class: aqvp
            private final aqvu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dbsk.s(null);
                throw null;
            }
        };
        this.a = activity;
        this.m = dxioVar;
        this.b = dxioVar3;
        this.n = dehqVar;
        this.c = dehqVar2;
        this.o = cqhnVar;
        this.p = aqvxVar;
        this.d = apyxVar;
        this.e = str;
        cjta b = cjtd.b();
        b.d = dtxk.P;
        ddes bZ = ddet.D.bZ();
        ddbz bZ2 = ddcf.k.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddcf ddcfVar = (ddcf) bZ2.b;
        ddcfVar.j = ddceVar.e;
        ddcfVar.a |= 16384;
        ddcf bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        bK.getClass();
        ddetVar.p = bK;
        ddetVar.a |= 16384;
        b.s(bZ.bK());
        this.q = b.a();
        this.l = dcdc.e();
        this.i = null;
        this.u = null;
        crzoVar.a(Boolean.FALSE);
        this.k = bvjjVar;
        this.r = apzyVar;
        this.h = dxioVar4;
    }

    @Override // defpackage.aquw
    public void a() {
        this.j = this.m.a().j();
        if (j() && this.s == null && this.t == null) {
            this.s = new crzp(this) { // from class: aqvr
                private final aqvu a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    final aqvu aqvuVar = this.a;
                    apsi apsiVar = (apsi) crzmVar.l();
                    if (apsiVar == null || !((dbsg) apsiVar.a()).a()) {
                        aqvuVar.a.runOnUiThread(new Runnable(aqvuVar) { // from class: aqvs
                            private final aqvu a;

                            {
                                this.a = aqvuVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                aqvu aqvuVar2 = this.a;
                                ckos.a(aqvuVar2.a.findViewById(16908290), aqvuVar2.a.getString(R.string.MESSAGING_GENERIC_ERROR_MESSAGE), 0).c();
                            }
                        });
                        aqvuVar.f.set(false);
                        aqvuVar.g.b(Boolean.TRUE);
                        aqvuVar.i();
                    } else if (apsiVar.b() == 1) {
                        if (aqvuVar.l.isEmpty()) {
                            aqvuVar.g((apzn) ((dbsg) apsiVar.a()).b());
                        }
                        aqvuVar.f.set(true);
                        aqvuVar.g.b(Boolean.FALSE);
                        aqvuVar.i();
                    } else {
                        aqvuVar.g((apzn) ((dbsg) apsiVar.a()).b());
                        aqvuVar.f.set(false);
                        aqvuVar.g.b(Boolean.TRUE);
                        aqvuVar.i();
                    }
                }
            };
            String str = this.e;
            btlu btluVar = this.j;
            dbsk.s(btluVar);
            crzm<apsi<dbsg<apzn>>> b = this.b.a().b(str, btluVar);
            this.t = b;
            crzp<apsi<dbsg<apzn>>> crzpVar = this.s;
            dbsk.s(crzpVar);
            b.d(crzpVar, this.n);
        }
    }

    @Override // defpackage.aquw
    public crzm<Boolean> b() {
        return this.g.a;
    }

    @Override // defpackage.aquw
    public List<aquu> c() {
        return this.l;
    }

    @Override // defpackage.aquw
    public Boolean d() {
        return Boolean.valueOf(this.f.get());
    }

    @Override // defpackage.aquw
    public void e() {
        crzp<apsi<dbsg<apzn>>> crzpVar;
        crzm<apsi<dbsg<apzn>>> crzmVar = this.t;
        if (crzmVar != null && (crzpVar = this.s) != null) {
            crzmVar.c(crzpVar);
            this.t = null;
            this.s = null;
        }
        this.l = dcdc.e();
    }

    @Override // defpackage.aquw
    public cjtd f() {
        return this.q;
    }

    public final void g(apzn apznVar) {
        dccx F = dcdc.F();
        if (this.i == null) {
            this.i = this.p.a(this.a.getString(R.string.MESSAGING_SETTINGS_MESSAGING_OPTION_TITLE), this.a.getString(R.string.MESSAGING_SETTINGS_MESSAGING_OPTION_DESCRIPTION), Boolean.valueOf(apznVar.e()), true, this.v, aqdb.a(dtxk.O, this.e).a());
        } else {
            h(apznVar.e());
        }
        aqux aquxVar = this.i;
        dbsk.s(aquxVar);
        F.g(aquxVar);
        this.d.h();
        if (this.r.k()) {
            if (this.u == null) {
                this.u = new aqva(this.a.getString(R.string.MERCHANT_MESSAGING_EDIT_WELCOME_MESSAGE_BUTTON_TEXT), this.a.getString(R.string.MESSAGING_SETTINGS_EDIT_WELCOME_MESSAGE_OPTION_DESCRIPTION), new View.OnClickListener(this) { // from class: aqvq
                    private final aqvu a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        aqvu aqvuVar = this.a;
                        aqvuVar.h.a().e(aqvuVar.e);
                        bvjj bvjjVar = aqvuVar.k;
                        dbsk.s(bvjjVar);
                        Set<String> C = bvjjVar.C(bvjk.jy, new HashSet());
                        C.add(aqvuVar.e);
                        bvjj bvjjVar2 = aqvuVar.k;
                        dbsk.s(bvjjVar2);
                        bvjjVar2.af(bvjk.jy, C);
                    }
                }, aqdb.a(dtxk.N, this.e).a());
            }
            this.u.g(apznVar.e());
            aquu aquuVar = this.u;
            dbsk.s(aquuVar);
            F.g(aquuVar);
        }
        this.l = F.f();
    }

    public final void h(boolean z) {
        aqux aquxVar = this.i;
        dbsk.s(aquxVar);
        aquxVar.i(z);
    }

    public final void i() {
        this.a.runOnUiThread(new apzx(this));
    }

    public final boolean j() {
        btlu btluVar = this.j;
        return btluVar != null && btluVar.l();
    }
}
