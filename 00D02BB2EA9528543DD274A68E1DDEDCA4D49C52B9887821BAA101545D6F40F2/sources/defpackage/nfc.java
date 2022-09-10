package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: nfc  reason: default package */
/* loaded from: classes7.dex */
public final class nfc {
    public final nfg a;
    public final ngq b;
    private final akfa c;

    public nfc(nfg nfgVar, ngq ngqVar, akfa akfaVar) {
        this.a = nfgVar;
        this.b = ngqVar;
        this.c = akfaVar;
    }

    public final noq a(nfh nfhVar, final kdg kdgVar, final cqkj cqkjVar, final not notVar, final nop nopVar, final noo nooVar, final kdi kdiVar, final jty jtyVar, afwo afwoVar, final kxu kxuVar, final dbty<lxh> dbtyVar, final asmp asmpVar, final boolean z) {
        nfg nfgVar = this.a;
        lxh a = dbtyVar.a();
        nooVar.getClass();
        Runnable runnable = new Runnable(nooVar) { // from class: net
            private final noo a;

            {
                this.a = nooVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        };
        nooVar.getClass();
        Runnable runnable2 = new Runnable(nooVar) { // from class: nex
            private final noo a;

            {
                this.a = nooVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        };
        String string = cqkjVar.d.getString(R.string.CAR_SETTINGS_TITLE);
        final Context context = cqkjVar.d;
        dccx F = dcdc.F();
        F.i(dcdc.g(new nfz(1, new ngl(afwoVar, afwm.TRAFFIC, nfhVar.c, bvjk.gj, false, dtxm.ek, nfhVar.b.getString(R.string.CAR_DRAWER_TRAFFIC), nfhVar.a, nfhVar.d, nfhVar.b, nfhVar.e)), new nfz(1, new ngl(afwoVar, afwm.SATELLITE, nfhVar.c, bvjk.gk, false, dtxm.ej, nfhVar.b.getString(R.string.CAR_DRAWER_SATELLITE), nfhVar.a, nfhVar.d, nfhVar.b, nfhVar.e))));
        F.g(new nfz(3, new ngt(context.getString(R.string.MENU_GUIDANCE_AUDIO), new Runnable(this, nooVar, nopVar, cqkjVar, notVar, kxuVar, dbtyVar, kdgVar, context, jtyVar) { // from class: ney
            private final nfc a;
            private final noo b;
            private final nop c;
            private final cqkj d;
            private final not e;
            private final kxu f;
            private final dbty g;
            private final kdg h;
            private final Context i;
            private final jty j;

            {
                this.a = this;
                this.b = nooVar;
                this.c = nopVar;
                this.d = cqkjVar;
                this.e = notVar;
                this.f = kxuVar;
                this.g = dbtyVar;
                this.h = kdgVar;
                this.i = context;
                this.j = jtyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nfc nfcVar = this.a;
                noo nooVar2 = this.b;
                nop nopVar2 = this.c;
                cqkj cqkjVar2 = this.d;
                not notVar2 = this.e;
                kxu kxuVar2 = this.f;
                dbty dbtyVar2 = this.g;
                kdg kdgVar2 = this.h;
                Context context2 = this.i;
                jty jtyVar2 = this.j;
                ngp a2 = nfcVar.b.a(nooVar2);
                nooVar2.getClass();
                Runnable runnable3 = new Runnable(nooVar2) { // from class: nev
                    private final noo a;

                    {
                        this.a = nooVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                };
                nooVar2.getClass();
                nopVar2.k(nfcVar.a.a(cqkjVar2, notVar2, kxuVar2, (lxh) dbtyVar2.a(), kdgVar2, runnable3, new Runnable(nooVar2) { // from class: new
                    private final noo a;

                    {
                        this.a = nooVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                }, context2.getString(R.string.MENU_GUIDANCE_AUDIO), true, dcdc.g(new nfz(5, a2), new nfz(6, a2)), jtyVar2, null, cjtd.a(dtxm.dW), cjtd.a(dtxm.dV)));
            }
        }, (CharSequence) null, dtxm.dX, context.getString(R.string.MENU_GUIDANCE_AUDIO))));
        F.g(new nfz(3, new ngt(context.getString(R.string.CAR_ROUTE_OPTIONS), new Runnable(nopVar, kdiVar, z, asmpVar, notVar) { // from class: nez
            private final nop a;
            private final kdi b;
            private final boolean c;
            private final asmp d;
            private final not e;

            {
                this.a = nopVar;
                this.b = kdiVar;
                this.c = z;
                this.d = asmpVar;
                this.e = notVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nop nopVar2 = this.a;
                kdi kdiVar2 = this.b;
                boolean z2 = this.c;
                asmp asmpVar2 = this.d;
                nopVar2.k(kdiVar2.j(!z2, new nfb(asmpVar2), neu.a, this.e));
            }
        }, (CharSequence) null, dtxm.ei, context.getString(R.string.CAR_ROUTE_OPTIONS))));
        String string2 = context.getString(nei.a(btlu.p(this.c.j())));
        F.g(new nfz(3, new ngt(string2, new Runnable(nopVar, kdiVar, notVar) { // from class: nfa
            private final nop a;
            private final kdi b;
            private final not c;

            {
                this.a = nopVar;
                this.b = kdiVar;
                this.c = notVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nop nopVar2;
                jty jtyVar2;
                kdg kdgVar2;
                kxu kxuVar2;
                nop nopVar3 = this.a;
                kdi kdiVar2 = this.b;
                not notVar2 = this.c;
                jur jurVar = (jur) kdiVar2;
                jvh jvhVar = jurVar.c;
                nej nejVar = jvhVar.ai;
                nfh nfhVar2 = jvhVar.S;
                kdg kdgVar3 = jvhVar.u;
                cqkj cqkjVar2 = jvhVar.v;
                nop nopVar4 = jurVar.a;
                noo nooVar2 = jvhVar.y;
                kxu kxuVar3 = jvhVar.C;
                dbty dbtyVar2 = new dbty(jurVar) { // from class: jup
                    private final jur a;

                    {
                        this.a = jurVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return this.a.t();
                    }
                };
                jty jtyVar3 = jurVar.c.bc;
                nfg a2 = nejVar.a.a();
                nej.a(a2, 1);
                nej.a(nfhVar2, 2);
                nej.a(kdgVar3, 3);
                nej.a(cqkjVar2, 4);
                nej.a(notVar2, 5);
                nej.a(nopVar4, 6);
                nej.a(nooVar2, 7);
                nej.a(kdiVar2, 8);
                nej.a(kxuVar3, 9);
                nej.a(dbtyVar2, 10);
                nej.a(jtyVar3, 11);
                akfa a3 = nejVar.b.a();
                nej.a(a3, 12);
                Context context2 = cqkjVar2.d;
                boolean p = btlu.p(a3.j());
                lxh lxhVar = (lxh) dbtyVar2.a();
                nfj nfjVar = nfhVar2.f;
                dccx F2 = dcdc.F();
                Context context3 = cqkjVar2.d;
                ner nerVar = (ner) nfjVar;
                btlu j = nerVar.b.j();
                if (j == null || j.o()) {
                    nee neeVar = nerVar.a;
                    nopVar2 = nopVar3;
                    jtyVar2 = jtyVar3;
                    kdgVar2 = kdgVar3;
                    kxuVar2 = kxuVar3;
                    F2.g(new nfz(1, new ngw(new dbty(neeVar) { // from class: nea
                        private final nee a;

                        {
                            this.a = neeVar;
                        }

                        @Override // defpackage.dbty
                        public final Object a() {
                            return Boolean.valueOf(this.a.a.m(bvjk.jG, true));
                        }
                    }, new neb(neeVar, nerVar.c), dtxm.ec, context3.getString(R.string.CAR_SAVE_RECENT_SEARCHES_ON_DEVICE))));
                    F2.g(new nfz(3, new ngt(context3.getString(R.string.CAR_DELETE_SEARCH_HISTORY), new Runnable(nerVar.a, nerVar.c, context3) { // from class: nec
                        private final nee a;
                        private final bxtx b;
                        private final Context c;

                        {
                            this.a = r1;
                            this.b = r2;
                            this.c = context3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            nee neeVar2 = this.a;
                            bxtx bxtxVar = this.b;
                            Context context4 = this.c;
                            bxtxVar.a();
                            neeVar2.b.k(context4.getString(R.string.CAR_SEARCH_HISTORY_DELETED), 1);
                        }
                    }, null, new dbty(nerVar.d) { // from class: ned
                        private final bxtv a;

                        {
                            this.a = r1;
                        }

                        @Override // defpackage.dbty
                        public final Object a() {
                            dehn<dcdc<dpte>> d = this.a.d();
                            boolean z2 = false;
                            if (d.isDone()) {
                                try {
                                } catch (InterruptedException | ExecutionException unused) {
                                    return z2;
                                }
                            }
                            return Boolean.valueOf(!d.get().isEmpty());
                        }
                    }, null, dtxm.eb)));
                } else {
                    nopVar2 = nopVar3;
                    kdgVar2 = kdgVar3;
                    kxuVar2 = kxuVar3;
                    jtyVar2 = jtyVar3;
                }
                F2.g(new nfz(4, new ngu(context3.getString(R.string.APP_FULL_NAME), context3.getString(R.string.COPYRIGHT))));
                F2.g(new nfz(4, new ngu(context3.getString(R.string.VERSION), context3.getString(R.string.ABOUT_VERSION_SUMMARY, bvoc.a(context3), Long.toString(bvoc.c(context3))))));
                dcdc<nfz> f = F2.f();
                lxh lxhVar2 = (lxh) dbtyVar2.a();
                nooVar2.getClass();
                Runnable runnable3 = new Runnable(nooVar2) { // from class: neg
                    private final noo a;

                    {
                        this.a = nooVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                };
                nooVar2.getClass();
                nopVar2.k(a2.a(cqkjVar2, notVar2, kxuVar2, lxhVar2, kdgVar2, runnable3, new Runnable(nooVar2) { // from class: neh
                    private final noo a;

                    {
                        this.a = nooVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                }, context2.getString(nei.a(p)), true, f, jtyVar2, null, cjtd.a(dtxm.dR), cjtd.a(dtxm.dQ)));
            }
        }, (CharSequence) null, dtxm.dS, string2)));
        return nfgVar.a(cqkjVar, notVar, kxuVar, a, kdgVar, runnable, runnable2, string, false, F.f(), jtyVar, new cjsz(z ? dtxm.aM : dtxm.bX), cjtd.a(dtxm.dU), null);
    }
}
