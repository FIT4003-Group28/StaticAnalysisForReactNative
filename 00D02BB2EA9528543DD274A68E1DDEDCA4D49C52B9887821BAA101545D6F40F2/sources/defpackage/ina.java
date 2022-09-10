package defpackage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ina  reason: default package */
/* loaded from: classes.dex */
public final class ina {
    public final gga a;
    public final dxio<cvze<cwfm>> b;
    public final dxio<bycs> c;
    public final dxio<cjxl> d;
    public final dxio<cjqy> e;
    private final dxio<akfa> f;
    private final dxio<afdw> g;
    private final imu h;
    private cvze<cwfm> i;

    public ina(gga ggaVar, dxio<cvze<cwfm>> dxioVar, dxio<akfa> dxioVar2, dxio<bycs> dxioVar3, dxio<cjxl> dxioVar4, dxio<cjqy> dxioVar5, dxio<afdw> dxioVar6, imu imuVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar3;
        this.f = dxioVar2;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.g = dxioVar6;
        this.h = imuVar;
    }

    public final cvze<cwfm> a() {
        return b(false);
    }

    public final synchronized cvze<cwfm> b(boolean z) {
        if (this.i == null || z) {
            cvze<cwfm> a = this.b.a();
            gga ggaVar = this.a;
            cvzd<cwfm> n = a.n();
            n.a = ggaVar.getApplicationContext();
            cvyv<cwfm> d = a.b().d();
            d.b(new cvyu(this) { // from class: imv
                private final ina a;

                {
                    this.a = this;
                }

                @Override // defpackage.cvyu, defpackage.cvub
                public final void a(View view, Object obj) {
                    ina inaVar = this.a;
                    cvyw<cwfm> b = inaVar.b.a().b();
                    inaVar.e.a().i(cjtd.a(dtxj.e));
                    b.c().a(view, (cwfm) obj);
                }
            });
            d.c(new cvyu(this) { // from class: imw
                private final ina a;

                {
                    this.a = this;
                }

                @Override // defpackage.cvyu, defpackage.cvub
                public final void a(View view, Object obj) {
                    ina inaVar = this.a;
                    cvyw<cwfm> b = inaVar.b.a().b();
                    inaVar.e.a().i(cjtd.a(dtxj.f));
                    b.a().a(view, (cwfm) obj);
                }
            });
            d.d(new cvyu(this) { // from class: imx
                private final ina a;

                {
                    this.a = this;
                }

                @Override // defpackage.cvyu, defpackage.cvub
                public final void a(View view, Object obj) {
                    ina inaVar = this.a;
                    cvyw<cwfm> b = inaVar.b.a().b();
                    inaVar.e.a().i(cjtd.a(dtxj.g));
                    b.b().a(view, (cwfm) obj);
                }
            });
            n.p(d.a());
            cwds l = cwdt.l();
            cwfe cwfeVar = new cwfe();
            cwfeVar.b = dbsg.i(new cvub(this) { // from class: imy
                private final ina a;

                {
                    this.a = this;
                }

                @Override // defpackage.cvub
                public final void a(View view, Object obj) {
                    ina inaVar = this.a;
                    cwfm cwfmVar = (cwfm) obj;
                    inaVar.e.a().i(cjtd.a(dtxv.u));
                    inaVar.c.a().b();
                }
            });
            cwfeVar.a = dbsg.i(new cvub(this) { // from class: imz
                private final ina a;

                {
                    this.a = this;
                }

                @Override // defpackage.cvub
                public final void a(View view, Object obj) {
                    ina inaVar = this.a;
                    cwfm cwfmVar = (cwfm) obj;
                    inaVar.e.a().i(cjtd.a(dtxv.r));
                    inaVar.d.a().a(inaVar.a);
                }
            });
            ((cwdu) l).b = new cwff(cwfeVar.a, cwfeVar.b, cwfeVar.c, cwfeVar.d);
            final imu imuVar = this.h;
            cvzg<cwfm> a2 = a.a();
            dccx dccxVar = new dccx();
            gga ggaVar2 = imuVar.a;
            View.OnClickListener onClickListener = new View.OnClickListener(imuVar) { // from class: ims
                private final imu a;

                {
                    this.a = imuVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    imu imuVar2 = this.a;
                    imuVar2.a(view, dtxv.t);
                    imuVar2.c.a().e();
                }
            };
            Drawable c = cwiz.c(ggaVar2, R.drawable.quantum_gm_ic_settings_vd_theme_24);
            dbsk.s(c);
            String string = ggaVar2.getString(R.string.og_settings);
            cwdb l2 = cwdc.l();
            l2.d(R.id.og_ai_settings);
            l2.c(c);
            l2.e(string);
            l2.g(90537);
            l2.f(onClickListener);
            l2.h(true);
            l2.b(cwda.SETTINGS);
            dccxVar.g(l2.a());
            gga ggaVar3 = imuVar.a;
            View.OnClickListener onClickListener2 = new View.OnClickListener(imuVar) { // from class: imt
                private final imu a;

                {
                    this.a = imuVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    imu imuVar2 = this.a;
                    imuVar2.a(view, dtyi.N);
                    imuVar2.d.a().o(false, achc.ACCOUNT_PARTICLE_MENU);
                }
            };
            Drawable c2 = cwiz.c(ggaVar3, R.drawable.quantum_gm_ic_help_outline_vd_theme_24);
            dbsk.s(c2);
            cwdb l3 = cwdc.l();
            l3.d(R.id.og_ai_help_and_feedback);
            l3.c(c2);
            l3.e(ggaVar3.getString(R.string.og_help_feedback));
            l3.g(90538);
            l3.f(onClickListener2);
            l3.h(true);
            l3.b(cwda.HELP_AND_FEEDBACK);
            dccxVar.g(l3.a());
            if (imuVar.m.a()) {
                gga ggaVar4 = imuVar.a;
                bam a3 = bam.a(ggaVar4.getResources(), R.drawable.ic_privacy_advisor_icon, imuVar.a.getTheme());
                dbsk.s(a3);
                String string2 = imuVar.a.getString(R.string.MAPS_APP_NAME);
                View.OnClickListener onClickListener3 = new View.OnClickListener(imuVar) { // from class: imr
                    private final imu a;

                    {
                        this.a = imuVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        imu imuVar2 = this.a;
                        imuVar2.a(view, dtxy.oq);
                        imuVar2.k.a(new btxt(imuVar2) { // from class: imk
                            private final imu a;

                            {
                                this.a = imuVar2;
                            }

                            @Override // defpackage.btxt
                            public final void a(int i) {
                                final imu imuVar3 = this.a;
                                boolean z2 = true;
                                if (i != 1) {
                                    imuVar3.a.runOnUiThread(new Runnable(imuVar3) { // from class: iml
                                        private final imu a;

                                        {
                                            this.a = imuVar3;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            imu imuVar4 = this.a;
                                            ckos.a(imuVar4.a.findViewById(16908290), imuVar4.a.getString(R.string.PRIVACY_ADVISOR_NOT_AVAILABLE_OFFLINE), 0).c();
                                        }
                                    });
                                    return;
                                }
                                bnlf a4 = imuVar3.b.a();
                                if (!a4.c.a()) {
                                    return;
                                }
                                Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 519).putExtra("extra.accountName", a4.a.a().o());
                                putExtra.addFlags(ImageMetadata.LENS_APERTURE);
                                if (btlu.i(a4.a.a().j()) == btlt.INCOGNITO) {
                                    z2 = false;
                                }
                                dbsk.l(z2);
                                a4.b.a().j(putExtra, 0, 2);
                            }
                        });
                    }
                };
                cwdb l4 = cwdc.l();
                l4.d(R.id.og_ai_privacy_advisor);
                l4.c(a3);
                l4.e(ggaVar4.getString(R.string.og_privacy_advisor, string2));
                l4.g(90536);
                l4.f(onClickListener3);
                ((cwde) l4).a = new cwdo(a2);
                l4.b(cwda.PRIVACY_ADVISOR);
                dccxVar.g(l4.a());
            }
            l.b(dccxVar.f());
            cwek cwekVar = new cwek();
            cwekVar.a(dcdc.e());
            dcdc<cwbe<AccountT, ? extends cwbn>> e = dcdc.e();
            if (e == 0) {
                throw new NullPointerException("Null dynamicCards");
            }
            cwekVar.c = e;
            final imu imuVar2 = this.h;
            cvzg<cwfm> a4 = a.a();
            dccx dccxVar2 = new dccx();
            if (imuVar2.j.a.getCreatorProfileParameters().f) {
                cwdz h = cwea.h();
                bam a5 = bam.a(imuVar2.a.getResources(), R.drawable.quantum_gm_ic_person_vd_theme_24, imuVar2.a.getTheme());
                dbsk.s(a5);
                ((cwdw) h).b = a5;
                h.b(imuVar2.a.getString(R.string.YOUR_PROFILE_SIDE_MENU_BUTTON));
                h.c(new View.OnClickListener(imuVar2) { // from class: imj
                    private final imu a;

                    {
                        this.a = imuVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        imu imuVar3 = this.a;
                        imuVar3.a(view, dtxv.s);
                        imuVar3.i.a().i(null);
                    }
                });
                dccxVar2.g(h.a());
            }
            cwdz h2 = cwea.h();
            bam a6 = bam.a(imuVar2.a.getResources(), R.drawable.quantum_gm_ic_storefront_vd_theme_24, imuVar2.a.getTheme());
            dbsk.s(a6);
            ((cwdw) h2).b = a6;
            h2.b(imuVar2.a.getString(R.string.YOUR_BUSINESSES_PROFILE_LINK_TITLE));
            h2.c(new View.OnClickListener(imuVar2) { // from class: imm
                private final imu a;

                {
                    this.a = imuVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    imu imuVar3 = this.a;
                    imuVar3.a(view, dtxv.p);
                    imuVar3.h.a().e();
                }
            });
            imi imiVar = imuVar2.l;
            imi.a(a4, 1);
            dxio a7 = ((dxjh) imiVar.a).a();
            imi.a(a7, 2);
            bvjj a8 = imiVar.b.a();
            imi.a(a8, 3);
            ((cwdw) h2).c = new imh(a4, a7, a8);
            dccxVar2.g(h2.a());
            cwdz h3 = cwea.h();
            bam a9 = bam.a(imuVar2.a.getResources(), R.drawable.quantum_gm_ic_timeline_vd_theme_24, imuVar2.a.getTheme());
            dbsk.s(a9);
            ((cwdw) h3).b = a9;
            h3.b(imuVar2.a.getString(R.string.YOUR_TIMELINE));
            h3.c(new View.OnClickListener(imuVar2) { // from class: imn
                private final imu a;

                {
                    this.a = imuVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    imu imuVar3 = this.a;
                    imuVar3.a(view, dtyi.dn);
                    imuVar3.e.a().C();
                }
            });
            dccxVar2.g(h3.a());
            cwdz h4 = cwea.h();
            bam a10 = bam.a(imuVar2.a.getResources(), R.drawable.quantum_gm_ic_record_voice_over_vd_theme_24, imuVar2.a.getTheme());
            dbsk.s(a10);
            ((cwdw) h4).b = a10;
            h4.b(imuVar2.a.getString(R.string.LOCATION_SHARING_FEATURE_TITLE_VARIANT_LOCATION_SHARING));
            h4.c(new View.OnClickListener(imuVar2) { // from class: imo
                private final imu a;

                {
                    this.a = imuVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    imu imuVar3 = this.a;
                    imuVar3.a(view, dtye.k);
                    imuVar3.f.a().q();
                }
            });
            dccxVar2.g(h4.a());
            cwdz h5 = cwea.h();
            bam a11 = bam.a(imuVar2.a.getResources(), R.drawable.quantum_gm_ic_cloud_off_vd_theme_24, imuVar2.a.getTheme());
            dbsk.s(a11);
            ((cwdw) h5).b = a11;
            h5.b(imuVar2.a.getString(R.string.OFFLINE_MAPS_TITLE));
            h5.c(new View.OnClickListener(imuVar2) { // from class: imp
                private final imu a;

                {
                    this.a = imuVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    imu imuVar3 = this.a;
                    imuVar3.a(view, dtye.n);
                    imuVar3.g.a().j();
                }
            });
            dccxVar2.g(h5.a());
            if (Locale.FRANCE.getCountry().equals(imuVar2.n.a())) {
                cwdz h6 = cwea.h();
                bam a12 = bam.a(imuVar2.a.getResources(), R.drawable.quantum_gm_ic_info_vd_theme_24, imuVar2.a.getTheme());
                dbsk.s(a12);
                ((cwdw) h6).b = a12;
                h6.b(imuVar2.a.getString(R.string.CONSUMER_INFORMATION));
                h6.c(new View.OnClickListener(imuVar2) { // from class: imq
                    private final imu a;

                    {
                        this.a = imuVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        imu imuVar3 = this.a;
                        imuVar3.a(view, dtxv.m);
                        imuVar3.d.a().C();
                    }
                });
                dccxVar2.g(h6.a());
            }
            cwekVar.a(dccxVar2.f());
            String str = cwekVar.b == null ? " customActions" : "";
            if (cwekVar.c == null) {
                str = str.concat(" dynamicCards");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            ((cwdu) l).c = dbsg.i(new cwel(cwekVar.a, cwekVar.b, cwekVar.c));
            if (this.g.a().a() && !btlu.p(this.f.a().j())) {
                ((cwdu) l).a = dbsg.i(new cweo());
            }
            n.r(l.a());
            n.q(cwdl.g().a());
            this.i = n.k();
        }
        return this.i;
    }
}
