package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajsa  reason: default package */
/* loaded from: classes2.dex */
public class ajsa {
    public final Executor a;
    public final gga b;
    public final awnm c;
    public final dxio<arag> d;
    public final cqkj e;
    public final cjqq f;
    public final akai g;
    public final ajqz h;
    public final dxio<ajqg> i;
    private final Executor j;
    private final ajmq k;
    private final bvrb l;
    @dzsi
    private final ahwo m;

    public ajsa(Executor executor, Executor executor2, gga ggaVar, ajmq ajmqVar, awnm awnmVar, dxio dxioVar, bvrb bvrbVar, cqkj cqkjVar, cjqq cjqqVar, akai akaiVar, ajqz ajqzVar, dxio dxioVar2, ahwo ahwoVar) {
        this.j = executor;
        this.a = executor2;
        this.b = ggaVar;
        this.k = ajmqVar;
        this.c = awnmVar;
        this.d = dxioVar;
        this.l = bvrbVar;
        this.e = cqkjVar;
        this.f = cjqqVar;
        this.g = akaiVar;
        this.h = ajqzVar;
        this.i = dxioVar2;
        this.m = ahwoVar;
    }

    private static v<ajqa> d(v<ajqa> vVar, final dbty<v<ajqa>> dbtyVar) {
        return am.b(vVar, new ahp(dbtyVar) { // from class: ajrt
            private final dbty a;

            {
                this.a = dbtyVar;
            }

            @Override // defpackage.ahp
            public final Object a(Object obj) {
                dbty dbtyVar2 = this.a;
                ajqa ajqaVar = (ajqa) obj;
                if (ajqaVar.a() == 2) {
                    return new z(ajqaVar);
                }
                return (v) dbtyVar2.a();
            }
        });
    }

    private final void e(btlu btluVar) {
        bvrj.UI_THREAD.c();
        c();
        final gga ggaVar = this.b;
        deha.q(this.k.b(btluVar, dcep.B(dqym.FIX_NOT_SHARING_FROM_THIS_DEVICE)), bvqj.b(new bvqg(this, ggaVar) { // from class: ajru
            private final ajsa a;
            private final Activity b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ajsa ajsaVar = this.a;
                Activity activity = this.b;
                ajne ajneVar = (ajne) obj;
                ajne ajneVar2 = ajne.GENERAL_FAILURE;
                ajsaVar.c();
                if (ajneVar == ajne.LOCATION_COLLECTION_FAILURE) {
                    ckos.a(activity.findViewById(16908290), activity.getString(R.string.UNABLE_TO_GET_LOCATION_TEXT), 0).c();
                }
            }
        }), this.j);
    }

    public final void a(final btlu btluVar) {
        bvrj.UI_THREAD.c();
        akah a = this.g.a(btluVar);
        c();
        if (a.equals(akai.b)) {
            c();
        } else if (a.f()) {
            e(btluVar);
        } else if (a.g()) {
            dcep<akaf> dcepVar = ((ajzf) a).b;
            if (a.i() || dcepVar.contains(akaf.DEVICE_LOCATION_DISABLED) || dcepVar.contains(akaf.BATTERY_SAVER_ENABLED) || dcepVar.contains(akaf.REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT)) {
                v<ajqc<btlu>> b = b(btluVar, this.g.a(btluVar));
                b.b(this.b, new ajry(this, btluVar, b));
            } else if (dcepVar.contains(akaf.ULR_NOT_ENABLED)) {
                bvrj.UI_THREAD.c();
                this.l.b(new Runnable(this, btluVar) { // from class: ajrm
                    private final ajsa a;
                    private final btlu b;

                    {
                        this.a = this;
                        this.b = btluVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        final ajsa ajsaVar = this.a;
                        final btlu btluVar2 = this.b;
                        final Runnable runnable = new Runnable(ajsaVar, btluVar2) { // from class: ajrn
                            private final ajsa a;
                            private final btlu b;

                            {
                                this.a = ajsaVar;
                                this.b = btluVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ajsa ajsaVar2 = this.a;
                                btlu btluVar3 = this.b;
                                ajsaVar2.c.e(cord.a(btluVar3.s()), new ajrc(btluVar3));
                                ajsaVar2.g.e();
                            }
                        };
                        ajsaVar.f.g().d(cjtd.a(dtxu.es));
                        iii iiiVar = new iii();
                        iiiVar.a = ajsaVar.b.getString(R.string.OPEN_LOCATION_HISTORY_SETTINGS_TITLE);
                        iiiVar.b = ajsaVar.b.getString(R.string.OPEN_LOCATION_HISTORY_SETTINGS_MESSAGE);
                        iiiVar.d(ajsaVar.b.getString(R.string.FIX_LOCATION_SETTINGS), new View.OnClickListener(runnable) { // from class: ajro
                            private final Runnable a;

                            {
                                this.a = runnable;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.a.run();
                            }
                        }, cjtd.a(dtxu.et));
                        iiiVar.c(ajsaVar.b.getString(R.string.CANCEL_BUTTON), null, cjtd.a(dtxu.eu));
                        iiiVar.a(ajsaVar.b, ajsaVar.e).k();
                    }
                }, bvrj.UI_THREAD);
            }
            if (dcepVar.contains(akaf.NOT_PRIMARY_REPORTING_DEVICE)) {
                e(btluVar);
            } else if (!dcepVar.contains(akaf.PRIMARY_BUT_NOT_REPORTING)) {
            } else {
                e(btluVar);
            }
        } else {
            c();
        }
    }

    public final v<ajqc<btlu>> b(final btlu btluVar, akah akahVar) {
        bvrj.UI_THREAD.c();
        if (akahVar.f()) {
            return new z(ajpz.a(btluVar));
        }
        if (akahVar.equals(akai.b) || !akahVar.g()) {
            return new z(ajpz.b(new ahwp()));
        }
        v<ajqa> zVar = new z<>(ajps.a);
        if (akahVar.i()) {
            zVar = d(zVar, new dbty(this) { // from class: ajrj
                private final ajsa a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    final ajsa ajsaVar = this.a;
                    bvrj.UI_THREAD.c();
                    final z zVar2 = new z();
                    final ajif a = ajgh.a(ajsaVar.b.g());
                    a.e();
                    a.d(new ajie(ajsaVar, a, zVar2) { // from class: ajrv
                        private final ajsa a;
                        private final ajif b;
                        private final z c;

                        {
                            this.a = ajsaVar;
                            this.b = a;
                            this.c = zVar2;
                        }

                        @Override // defpackage.ajie
                        public final void g(ajzp ajzpVar) {
                            ajsa ajsaVar2 = this.a;
                            ajif ajifVar = this.b;
                            z zVar3 = this.c;
                            ajifVar.e();
                            zVar3.f(((ajze) ajzpVar).a);
                            ajsaVar2.g.e();
                        }
                    });
                    a.f(true);
                    return am.a(zVar2, new ahp(ajsaVar) { // from class: ajrw
                        private final ajsa a;

                        {
                            this.a = ajsaVar;
                        }

                        @Override // defpackage.ahp
                        public final Object a(Object obj) {
                            ajsa ajsaVar2 = this.a;
                            if (((ajzo) obj) == ajzo.PERMISSIONS_RESULT_SUCCESS) {
                                ajsaVar2.c();
                                return ajps.a;
                            }
                            ajsaVar2.c();
                            return ajpv.a(new ahwp());
                        }
                    });
                }
            });
        }
        dcep<akaf> dcepVar = ((ajzf) akahVar).b;
        if (dcepVar.contains(akaf.DEVICE_LOCATION_DISABLED)) {
            zVar = d(zVar, new dbty(this) { // from class: ajrp
                private final ajsa a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    ajsa ajsaVar = this.a;
                    z zVar2 = new z();
                    ajsaVar.d.a().f(true, new arae(zVar2) { // from class: ajrk
                        private final z a;

                        {
                            this.a = zVar2;
                        }

                        @Override // defpackage.arae
                        public final void a(araf arafVar) {
                            this.a.f(arafVar);
                        }
                    });
                    return am.a(zVar2, new ahp(ajsaVar) { // from class: ajrl
                        private final ajsa a;

                        {
                            this.a = ajsaVar;
                        }

                        @Override // defpackage.ahp
                        public final Object a(Object obj) {
                            ajsa ajsaVar2 = this.a;
                            if (((araf) obj) != araf.NOT_OPTIMIZED_OR_DISABLED) {
                                ajsaVar2.c();
                                ajsaVar2.g.e();
                                return ajps.a;
                            }
                            ajsaVar2.c();
                            return ajpv.a(new ahwp());
                        }
                    });
                }
            });
        }
        if (dcepVar.contains(akaf.BATTERY_SAVER_ENABLED)) {
            zVar = d(zVar, new dbty(this) { // from class: ajrq
                private final ajsa a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    ajsa ajsaVar = this.a;
                    dyzp a = ajsaVar.i.a().a(ajsaVar.b);
                    final akai akaiVar = ajsaVar.g;
                    akaiVar.getClass();
                    dzcm dzcmVar = new dzcm(a, new dzax(akaiVar) { // from class: ajrx
                        private final akai a;

                        {
                            this.a = akaiVar;
                        }

                        @Override // defpackage.dzax
                        public final void a() {
                            this.a.e();
                        }
                    });
                    dzfy.d();
                    dzco dzcoVar = new dzco(dzcmVar, ajqj.a);
                    dzfy.g();
                    dzdv dzdvVar = new dzdv(dzcoVar, ajqk.a);
                    dzfy.g();
                    dzdr dzdrVar = new dzdr(dzdvVar);
                    dzfy.g();
                    return new ajqi(dzdrVar);
                }
            });
        }
        if (dcepVar.contains(akaf.REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT)) {
            dbsk.m(true, "Appropriate flags not enabled");
            zVar = d(zVar, new dbty(this, btluVar) { // from class: ajrr
                private final ajsa a;
                private final btlu b;

                {
                    this.a = this;
                    this.b = btluVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    ajsa ajsaVar = this.a;
                    btlu btluVar2 = this.b;
                    dbsk.m(true, "Appropriate flags not enabled");
                    bvrj.UI_THREAD.c();
                    z zVar2 = new z();
                    deha.q(ajsaVar.h.a(btluVar2, ajsaVar.b, ajsaVar.e), new ajrz(ajsaVar, btluVar2, zVar2), ajsaVar.a);
                    return zVar2;
                }
            });
        }
        return am.a(zVar, new ahp(btluVar) { // from class: ajrs
            private final btlu a;

            {
                this.a = btluVar;
            }

            @Override // defpackage.ahp
            public final Object a(Object obj) {
                btlu btluVar2 = this.a;
                ajqa ajqaVar = (ajqa) obj;
                int a = ajqaVar.a();
                int i = a - 1;
                if (a != 0) {
                    if (i == 0) {
                        return ajpz.a(btluVar2);
                    }
                    if (i == 1) {
                        return ajpz.b(ajqaVar.b());
                    }
                    return ajpz.b(new ahwp());
                }
                throw null;
            }
        });
    }

    public final void c() {
        ahwo ahwoVar = this.m;
        if (ahwoVar != null) {
            ahwoVar.b();
        }
    }
}
