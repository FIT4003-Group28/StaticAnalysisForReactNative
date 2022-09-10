package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.maps.R;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.lens.sdk.LensApi;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afxu  reason: default package */
/* loaded from: classes2.dex */
public final class afxu extends ckqk {
    final /* synthetic */ ckhe a;
    final /* synthetic */ afxd b;
    final /* synthetic */ afxv c;

    public afxu(afxv afxvVar, ckhe ckheVar, afxd afxdVar) {
        this.c = afxvVar;
        this.a = ckheVar;
        this.b = afxdVar;
    }

    @Override // defpackage.ckqk
    public final void a(final Bitmap bitmap) {
        fd d;
        Runnable runnable;
        akqq aj;
        if (!this.c.j()) {
            Executor h = this.c.e.h();
            Context context = this.c.h;
            cjxu.l(h, context, context.getString(R.string.ERROR_MESSAGE_LENS_SERVICE));
            this.a.e();
            this.c.q.set(false);
            return;
        }
        afxv afxvVar = this.c;
        if (afxvVar.n.get()) {
            afxn afxnVar = afxvVar.g;
            dkni dkniVar = afxnVar.c.getLensParameters().j;
            if (dkniVar == null) {
                dkniVar = dkni.b;
            }
            if (dkniVar.a) {
                afye afyeVar = afxnVar.d;
                dkmz dkmzVar = afyeVar.a.getLensParameters().b;
                if (dkmzVar == null) {
                    dkmzVar = dkmz.e;
                }
                if (afyeVar.a(dkmzVar.c) && (d = afxvVar.k.d()) != null && d.J() != null && afxvVar.r.f() != 0) {
                    final afxv afxvVar2 = this.c;
                    afxd afxdVar = this.b;
                    btlu j = afxvVar2.c.a().j();
                    final fd d2 = afxvVar2.k.d();
                    if (d2 == null || d2.J() == null) {
                        runnable = afxo.a;
                    } else {
                        String g = afxv.g(afxdVar);
                        final csfq csfqVar = new csfq();
                        csfqVar.a.e(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
                        csfqVar.a.a.putString("account_name", dbsj.e(j.t()));
                        csfqVar.a.d(afxv.l(afxdVar, g).bS());
                        csfqVar.a.a.putString("image_place_id", g);
                        csfqVar.a.c(afxv.k(afxdVar));
                        csfqVar.a.f();
                        if (!afxvVar2.i(afxdVar.c().f())) {
                            afxvVar2.s = new LensImage(bitmap, null);
                        } else {
                            afxvVar2.s = new LensImage(bitmap, afxdVar.a().b());
                        }
                        csfqVar.a.a.putParcelable("postcapture_image", afxvVar2.s);
                        csfqVar.a.b(afxvVar2.r.f());
                        if (afxdVar.c().a()) {
                            akqq a = ckob.a(afxdVar.c().b());
                            if (a.a > dcyn.a && a.b > dcyn.a) {
                                csfqVar.a(afxv.h(a));
                                runnable = new Runnable(afxvVar2, d2, csfqVar) { // from class: afxp
                                    private final afxv a;
                                    private final fd b;
                                    private final csfq c;

                                    {
                                        this.a = afxvVar2;
                                        this.b = d2;
                                        this.c = csfqVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        afxv afxvVar3 = this.a;
                                        fd fdVar = this.b;
                                        csfq csfqVar2 = this.c;
                                        cseg csegVar = afxvVar3.r.b;
                                        cser.b();
                                        if (csegVar.a.e()) {
                                            csegVar.a.a();
                                        }
                                        ff J = fdVar.J();
                                        csfo csfoVar = csfqVar2.a;
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(Uri.parse("google://lens"));
                                        intent.setPackage("com.google.android.googlequicksearchbox");
                                        csfoVar.a.putString("caller_package", J.getPackageName());
                                        csfoVar.a.putLong("start_activity_time_nanos", SystemClock.elapsedRealtimeNanos());
                                        intent.putExtra("lens_activity_params", csfoVar.a);
                                        if (csfoVar.a.containsKey("handover_session_id") && csfoVar.a() != 0) {
                                            intent.putExtra("handover-session-id", csfoVar.a());
                                        }
                                        J.startActivityForResult(intent, 1022);
                                    }
                                };
                            }
                        }
                        if (afxdVar.d().a()) {
                            ilo b = afxdVar.d().b();
                            if (!afxv.f(b) && (aj = b.aj()) != null) {
                                csfqVar.a(afxv.h(aj));
                            }
                        }
                        runnable = new Runnable(afxvVar2, d2, csfqVar) { // from class: afxp
                            private final afxv a;
                            private final fd b;
                            private final csfq c;

                            {
                                this.a = afxvVar2;
                                this.b = d2;
                                this.c = csfqVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                afxv afxvVar3 = this.a;
                                fd fdVar = this.b;
                                csfq csfqVar2 = this.c;
                                cseg csegVar = afxvVar3.r.b;
                                cser.b();
                                if (csegVar.a.e()) {
                                    csegVar.a.a();
                                }
                                ff J = fdVar.J();
                                csfo csfoVar = csfqVar2.a;
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse("google://lens"));
                                intent.setPackage("com.google.android.googlequicksearchbox");
                                csfoVar.a.putString("caller_package", J.getPackageName());
                                csfoVar.a.putLong("start_activity_time_nanos", SystemClock.elapsedRealtimeNanos());
                                intent.putExtra("lens_activity_params", csfoVar.a);
                                if (csfoVar.a.containsKey("handover_session_id") && csfoVar.a() != 0) {
                                    intent.putExtra("handover-session-id", csfoVar.a());
                                }
                                J.startActivityForResult(intent, 1022);
                            }
                        };
                    }
                    afxvVar2.e(runnable);
                    this.a.c();
                    this.c.q.set(false);
                }
            }
        }
        afxv afxvVar3 = this.c;
        final afxd afxdVar2 = this.b;
        afxvVar3.e(new Runnable(this, bitmap, afxdVar2) { // from class: afxt
            private final afxu a;
            private final Bitmap b;
            private final afxd c;

            {
                this.a = this;
                this.b = bitmap;
                this.c = afxdVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                akqq aj2;
                afxu afxuVar = this.a;
                Bitmap bitmap2 = this.b;
                afxd afxdVar3 = this.c;
                afxv afxvVar4 = afxuVar.c;
                LensApi lensApi = afxvVar4.r;
                btlu j2 = afxvVar4.c.a().j();
                String g2 = afxv.g(afxdVar3);
                dhib v = dhic.v();
                dhhq dhhqVar = (dhhq) v;
                dhhqVar.f = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
                dhhqVar.c = dbsj.e(btlu.q(j2).t());
                dhhqVar.h = afxv.l(afxdVar3, g2);
                dhhqVar.j = Integer.valueOf(afxv.k(afxdVar3));
                dhhqVar.i = 0;
                dhhqVar.e = g2;
                dhhqVar.g = true;
                if (afxvVar4.i(afxdVar3.c().f())) {
                    dhhqVar.k = afxdVar3.a().b();
                }
                if (afxdVar3.c().a()) {
                    akqq a2 = ckob.a(afxdVar3.c().b());
                    if (a2.a > dcyn.a && a2.b > dcyn.a) {
                        dhhqVar.d = afxv.h(a2);
                        lensApi.c(bitmap2, v.a());
                    }
                }
                if (afxdVar3.d().a()) {
                    ilo b2 = afxdVar3.d().b();
                    if (!afxv.f(b2) && (aj2 = b2.aj()) != null) {
                        dhhqVar.d = afxv.h(aj2);
                    }
                }
                lensApi.c(bitmap2, v.a());
            }
        });
        this.a.c();
        this.c.q.set(false);
    }

    @Override // defpackage.ckqk
    public final void b() {
        this.c.d();
        this.c.q.set(false);
        Executor h = this.c.e.h();
        Context context = this.c.h;
        cjxu.l(h, context, context.getString(R.string.ERROR_MESSAGE_IMAGE_PROCESSING));
        this.a.e();
    }
}
