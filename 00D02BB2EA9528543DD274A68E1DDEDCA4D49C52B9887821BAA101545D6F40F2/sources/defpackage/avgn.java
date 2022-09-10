package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avgn  reason: default package */
/* loaded from: classes2.dex */
public final class avgn extends itb implements avik {
    public final gga a;
    public final Executor b;
    public final Executor c;
    public final Executor d;
    public final dxio<avki> e;
    public final bvjj f;
    public final avmh g;
    public final dehn<awcv> h;
    public final avzh i;
    public final away j;
    public final avhz k;
    private final btrm o;
    private final btvo p;
    private final akfa q;
    private final awar r;
    private final awfh s;
    private final dzsj<avjo> t;
    private final crzm<avkc> u;
    private final bvkx v;
    private final avzm w;
    private final bwqv x;
    private final dxio<avrw> y;
    private final dxio<afha> z;
    @dzsi
    private avgb C = null;
    @dzsi
    private crzp<Boolean> A = null;
    @dzsi
    private crzp<Boolean> B = null;

    public avgn(gga ggaVar, btrm btrmVar, btvo btvoVar, akfa akfaVar, Executor executor, Executor executor2, Executor executor3, dxio<avki> dxioVar, awar awarVar, bvjj bvjjVar, awfh awfhVar, dehn<awcv> dehnVar, avhz avhzVar, dzsj<avjo> dzsjVar, avmh avmhVar, crzm<avkc> crzmVar, avzh avzhVar, bvkx bvkxVar, avzm avzmVar, away awayVar, bwqv bwqvVar, dxio<avrw> dxioVar2, dxio<afha> dxioVar3) {
        this.a = ggaVar;
        this.o = btrmVar;
        this.p = btvoVar;
        this.q = akfaVar;
        this.b = executor;
        this.c = executor2;
        this.d = executor3;
        this.e = dxioVar;
        this.r = awarVar;
        this.f = bvjjVar;
        this.s = awfhVar;
        this.k = avhzVar;
        this.h = dehnVar;
        this.t = dzsjVar;
        this.g = avmhVar;
        this.u = crzmVar;
        this.i = avzhVar;
        this.v = bvkxVar;
        this.w = avzmVar;
        this.j = awayVar;
        this.x = bwqvVar;
        this.y = dxioVar2;
        this.z = dxioVar3;
    }

    private final afaw F() {
        bwqv bwqvVar = this.x;
        afdr i = afdt.i();
        i.c(avfw.a);
        i.g(R.string.OFFLINE_MAPS_TITLE);
        i.b(R.string.OFFLINE_INCOGNITO_PROMO_BODY_TEXT);
        return afaw.aR(bwqvVar, i.a());
    }

    @Override // defpackage.avik
    public final void B(final dspd dspdVar, final dlug dlugVar, final String str) {
        akqs c;
        if (this.e.a().q() && (c = this.w.a(dlugVar).c()) != null) {
            this.e.a().n(dspdVar, new avif(this, dspdVar, dlugVar, str) { // from class: avft
                private final avgn a;
                private final dspd b;
                private final dlug c;
                private final String d;

                {
                    this.a = this;
                    this.b = dspdVar;
                    this.c = dlugVar;
                    this.d = str;
                }

                @Override // defpackage.avif
                public final void a() {
                    final avgn avgnVar = this.a;
                    final dspd dspdVar2 = this.b;
                    final dlug dlugVar2 = this.c;
                    final String str2 = this.d;
                    avgnVar.d.execute(new Runnable(avgnVar, dspdVar2, dlugVar2, str2) { // from class: avfx
                        private final avgn a;
                        private final dspd b;
                        private final dlug c;
                        private final String d;

                        {
                            this.a = avgnVar;
                            this.b = dspdVar2;
                            this.c = dlugVar2;
                            this.d = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.E(this.b, this.c, this.d);
                        }
                    });
                }
            });
            this.z.a().f(this.a, afft.a(this.a).setAction("android.intent.action.VIEW").setData(afhl.b(this.a, c)), 2);
        }
    }

    @Override // defpackage.avik
    public final void C() {
        bvqj.c(this.e.a().v(), new bvqg(this) { // from class: avfu
            private final avgn a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                Void r2 = (Void) obj;
                this.a.j();
            }
        }, this.b);
    }

    @Override // defpackage.avik
    public final ggg D() {
        return new awbc();
    }

    public final void E(dspd dspdVar, dlug dlugVar, String str) {
        avkc l = this.u.l();
        dbsk.s(l);
        if (l.c() != 1) {
            deha.q(this.e.a().R(dspdVar, dlugVar, str), bvqj.b(avfv.a), this.d);
            this.e.a().h();
            this.j.c();
            return;
        }
        this.e.a().d(dspdVar, false);
        this.j.e();
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        bvrj.UI_THREAD.c();
        this.A = new avgm(this.s, this.t);
        this.B = new avgm(this.s, this.t);
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        btrm btrmVar = this.o;
        dceq a = dcet.a();
        a.b(avpp.class, new avgo(0, avpp.class, this, bvrj.UI_THREAD));
        a.b(gds.class, new avgo(1, gds.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        crzm<Boolean> e = this.s.e();
        crzp<Boolean> crzpVar = this.A;
        dbsk.s(crzpVar);
        e.a(crzpVar, this.c);
        crzj<Boolean> crzjVar = this.s.f;
        crzp<Boolean> crzpVar2 = this.B;
        dbsk.s(crzpVar2);
        crzjVar.a(crzpVar2, this.c);
        this.v.k(new Runnable(this) { // from class: avfq
            private final avgn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final avgn avgnVar = this.a;
                avgnVar.e.a().y();
                bvqj.c(avgnVar.h, new bvqg(avgnVar) { // from class: avga
                    private final avgn a;

                    {
                        this.a = avgnVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        this.a.e((awcv) obj);
                    }
                }, avgnVar.c);
            }
        }, this.c, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    @Override // defpackage.itb
    public final void Po() {
        this.v.k(new Runnable(this) { // from class: avgc
            private final avgn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e.a().z();
            }
        }, this.c, bvkw.ON_STARTUP_FULLY_COMPLETE);
        bvqj.c(this.h, new bvqg(this) { // from class: avgd
            private final avgn a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.e((awcv) obj);
            }
        }, this.c);
        this.o.a(this);
        crzm<Boolean> e = this.s.e();
        crzp<Boolean> crzpVar = this.A;
        dbsk.s(crzpVar);
        e.c(crzpVar);
        crzj<Boolean> crzjVar = this.s.f;
        crzp<Boolean> crzpVar2 = this.B;
        dbsk.s(crzpVar2);
        crzjVar.c(crzpVar2);
        super.Po();
    }

    public final synchronized void e(@dzsi awcv awcvVar) {
        if (awcvVar == null) {
            return;
        }
        if (this.C == null && w()) {
            avgb avgbVar = new avgb(this);
            this.C = avgbVar;
            awcvVar.d(avgbVar, this.b);
            return;
        }
        if (this.C == null || w()) {
            return;
        }
        avgb avgbVar2 = this.C;
        dbsk.s(avgbVar2);
        awcvVar.e(avgbVar2);
        this.C = null;
    }

    @Override // defpackage.avik
    public final void f() {
        i(null, null);
    }

    @Override // defpackage.avik
    public final void i(@dzsi final alad aladVar, @dzsi final String str) {
        if (w()) {
            if (this.y.a().a()) {
                this.a.D(F());
                return;
            }
            btlu j = this.q.j();
            if ((j == null || !j.u()) && !this.s.b()) {
                gga ggaVar = this.a;
                avua avuaVar = new avua();
                Bundle bundle = new Bundle();
                bundle.putSerializable("camera", aladVar);
                bundle.putString("area_name", str);
                avuaVar.B(bundle);
                ggaVar.D(avuaVar);
                return;
            }
            this.e.a().t(new avie(this, aladVar, str) { // from class: avgg
                private final avgn a;
                private final alad b;
                private final String c;

                {
                    this.a = this;
                    this.b = aladVar;
                    this.c = str;
                }

                @Override // defpackage.avie
                public final void a(boolean z) {
                    avgn avgnVar = this.a;
                    avgnVar.b.execute(new Runnable(avgnVar, z, this.b, this.c) { // from class: avfz
                        private final avgn a;
                        private final boolean b;
                        private final alad c;
                        private final String d;

                        {
                            this.a = avgnVar;
                            this.b = z;
                            this.c = r3;
                            this.d = r4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            avgn avgnVar2 = this.a;
                            boolean z2 = this.b;
                            alad aladVar2 = this.c;
                            String str2 = this.d;
                            if (!z2) {
                                if (!avgnVar2.w()) {
                                    return;
                                }
                                akqq akqqVar = aladVar2 != null ? aladVar2.i : null;
                                float f = aladVar2 != null ? aladVar2.k : 0.0f;
                                awev awevVar = new awev();
                                Bundle bundle2 = new Bundle();
                                if (akqqVar != null) {
                                    bvrs.k(bundle2, "camera_position_target", akqqVar.o());
                                    bundle2.putFloat("camera_position_zoom", f);
                                }
                                bundle2.putString("area_name", str2);
                                awevVar.B(bundle2);
                                if (avgnVar2.a.K() instanceof awnw) {
                                    avgnVar2.a.E(awevVar);
                                    return;
                                } else {
                                    avgnVar2.a.D(awevVar);
                                    return;
                                }
                            }
                            avgnVar2.j.j();
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.avik
    public final void j() {
        if (this.y.a().a()) {
            this.a.D(F());
        } else if (this.p.getOfflineMapsParameters().n) {
            final avhz avhzVar = this.k;
            new avgl(this, null);
            gcz a = avhzVar.b.a();
            a.i(R.string.OFFLINE_APP_UPGRADE_TITLE);
            a.d(R.string.OFFLINE_APP_UPGRADE_CONTENT);
            a.h(R.string.OFFLINE_APP_UPGRADE_ACTION, null, new gdd(avhzVar) { // from class: avhg
                private final avhz a;

                {
                    this.a = avhzVar;
                }

                @Override // defpackage.gdd
                public final void a(DialogInterface dialogInterface) {
                    avhz avhzVar2 = this.a;
                    String packageName = avhzVar2.a.getPackageName();
                    avhzVar2.c.a().B(avhzVar2.a, cjxr.t(packageName), cjxr.s(packageName));
                }
            });
            a.e(R.string.CANCEL_BUTTON, null, new gdd() { // from class: avhh
                @Override // defpackage.gdd
                public final void a(DialogInterface dialogInterface) {
                }
            });
            a.g(new gdd() { // from class: avhi
                @Override // defpackage.gdd
                public final void a(DialogInterface dialogInterface) {
                }
            });
            a.b();
        } else if ((this.a.K() instanceof avvz) || ((avvz) this.a.z(avvz.class)) != null) {
        } else {
            this.a.D(avvz.aR());
        }
    }

    @Override // defpackage.avik
    public final void k() {
        if (this.y.a().a()) {
            this.a.D(F());
        } else if (this.a.K() instanceof awfw) {
        } else {
            this.a.D(new awfw());
        }
    }

    @Override // defpackage.avik
    public final void l(dltm dltmVar) {
        this.a.D(avuo.g(dltmVar));
    }

    @Override // defpackage.avik
    public final void m(final dspd dspdVar, final boolean z) {
        final crzm<avkr> C = this.e.a().C();
        C.j().Pk(new Runnable(this, C, dspdVar, z) { // from class: avgh
            private final avgn a;
            private final crzm b;
            private final dspd c;
            private final boolean d;

            {
                this.a = this;
                this.b = C;
                this.c = dspdVar;
                this.d = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avkr avkrVar;
                dltm dltmVar;
                avgn avgnVar = this.a;
                crzm crzmVar = this.b;
                dspd dspdVar2 = this.c;
                boolean z2 = this.d;
                if (!avgnVar.a.aZ || (avkrVar = (avkr) crzmVar.l()) == null || (dltmVar = avkrVar.c().get(dspdVar2)) == null) {
                    return;
                }
                if (z2 && avgnVar.a.K() == null) {
                    avgnVar.a.D(avvz.aR());
                }
                avgnVar.a.D(avuo.g(dltmVar));
            }
        }, this.b);
    }

    @Override // defpackage.avik
    public final void n(dlug dlugVar) {
        gga ggaVar = this.a;
        avuo avuoVar = new avuo();
        Bundle bundle = new Bundle();
        bundle.putByteArray("geometry", dlugVar.bS());
        avuoVar.B(bundle);
        ggaVar.D(avuoVar);
    }

    @Override // defpackage.avik
    public final void o(final dltm dltmVar) {
        if (v()) {
            dkse dkseVar = this.p.getOfflineMapsParameters().G;
            if (dkseVar == null) {
                dkseVar = dkse.b;
            }
            if (dkseVar.a) {
                this.b.execute(new Runnable(this, dltmVar) { // from class: avgi
                    private final avgn a;
                    private final dltm b;

                    {
                        this.a = this;
                        this.b = dltmVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.r(this.b.b);
                    }
                });
            } else {
                bvqj.c(this.e.a().r(), new bvqg(this, dltmVar) { // from class: avfr
                    private final avgn a;
                    private final dltm b;

                    {
                        this.a = this;
                        this.b = dltmVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        avgn avgnVar = this.a;
                        dltm dltmVar2 = this.b;
                        if (((Boolean) obj).booleanValue()) {
                            avgnVar.r(dltmVar2.b);
                            return;
                        }
                        avhz avhzVar = avgnVar.k;
                        new avgl(avgnVar, dltmVar2.b);
                        avhzVar.b();
                    }
                }, this.b);
            }
        }
    }

    @Override // defpackage.avik
    public final void p() {
        if (!v()) {
            return;
        }
        if (this.k.a(new avgj(this), null)) {
            return;
        }
        this.e.a().e(false);
    }

    @Override // defpackage.avik
    public final void q(final dltm dltmVar) {
        avhz avhzVar = this.k;
        final avgl avglVar = new avgl(this, dltmVar.b);
        View inflate = ((LayoutInflater) avhzVar.a.getSystemService("layout_inflater")).inflate(R.layout.offlinecache_rename_internal, (ViewGroup) null);
        cjtd a = cjtd.a(dtxx.bc);
        final EditText editText = (EditText) inflate.findViewById(R.id.rename_textbox);
        editText.setText(dltmVar.a);
        editText.setSelection(dltmVar.a.length());
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
        gcz a2 = avhzVar.b.a();
        a2.i(R.string.OFFLINE_MAPS_RENAME_AREA_TITLE);
        a2.m = inflate;
        a2.h(R.string.SAVE, a, new gdd(avglVar, dltmVar, editText) { // from class: avhj
            private final dltm a;
            private final EditText b;
            private final avhy c;

            {
                this.c = avglVar;
                this.a = dltmVar;
                this.b = editText;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                avhy avhyVar = this.c;
                dltm dltmVar2 = this.a;
                String obj = this.b.getText().toString();
                avgl avglVar2 = (avgl) avhyVar;
                if (!avglVar2.c.w() || dltmVar2.a.equals(obj)) {
                    return;
                }
                avglVar2.c.e.a().l(dltmVar2.b, obj);
            }
        });
        a2.e(R.string.CANCEL_BUTTON, null, new gdd() { // from class: avhk
            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
            }
        });
        a2.g(new gdd() { // from class: avhl
            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
            }
        });
        gde b = a2.b();
        editText.setSelectAllOnFocus(true);
        editText.addTextChangedListener(new avhx(editText, b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(dspd dspdVar) {
        if (this.k.a(new avgk(this, dspdVar, dspdVar), dspdVar)) {
            return;
        }
        this.e.a().d(dspdVar, false);
    }

    @Override // defpackage.avik
    public final void s() {
        this.e.a().k();
    }

    @Override // defpackage.avik
    public final void t() {
        if (!this.e.a().q()) {
            return;
        }
        final dltm a = this.i.a();
        if (a != null) {
            this.e.a().n(a.b, new avif(this, a) { // from class: avfs
                private final avgn a;
                private final dltm b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // defpackage.avif
                public final void a() {
                    final avgn avgnVar = this.a;
                    final dltm dltmVar = this.b;
                    avgnVar.d.execute(new Runnable(avgnVar, dltmVar) { // from class: avfy
                        private final avgn a;
                        private final dltm b;

                        {
                            this.a = avgnVar;
                            this.b = dltmVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            avgn avgnVar2 = this.a;
                            dltm dltmVar2 = this.b;
                            avgnVar2.i.c(dltmVar2.b);
                            dspd dspdVar = dltmVar2.b;
                            dlug dlugVar = dltmVar2.c;
                            if (dlugVar == null) {
                                dlugVar = dlug.c;
                            }
                            avgnVar2.E(dspdVar, dlugVar, dltmVar2.a);
                        }
                    });
                }
            });
        } else {
            this.j.d();
        }
        this.r.z();
    }
}
