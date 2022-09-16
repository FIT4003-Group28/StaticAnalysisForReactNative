package com.google.android.apps.youtube.app.ui.inappreviews;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.youtube.app.ui.inappreviews.InAppReviewController;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InAppReviewController implements f, nxg {
    public final Activity a;
    public final alsj c;
    private final aadd d;
    private final nxh e;
    private final airw f;
    private final axnm g;
    private final snc h;
    private final apy i;
    private final axxi j;
    public long b = 0;
    private aypg k = ayqj.INSTANCE;

    public InAppReviewController(Activity activity, aadd aaddVar, nxh nxhVar, alsj alsjVar, airw airwVar, axnm axnmVar, snc sncVar, apy apyVar, axxi axxiVar) {
        this.c = alsjVar;
        this.a = activity;
        this.d = aaddVar;
        this.e = nxhVar;
        this.f = airwVar;
        this.g = axnmVar;
        this.h = sncVar;
        this.i = apyVar;
        this.j = axxiVar;
    }

    private final long g() {
        return ((mbn) ((yve) this.g.get()).c()).c;
    }

    private final void h(long j) {
        ylx.n(this.i, ((yve) this.g.get()).b(new fcp(j, 5)), mbi.a, ylx.b);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.k = this.f.G().d.Z(new ayqb() { // from class: mbm
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                InAppReviewController.this.b = ((ahhx) obj).e();
            }
        });
        this.e.a(this);
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.k.qr();
        this.e.b(this);
    }

    @Override // defpackage.nxg
    public final void n(int i) {
        ApplicationInfo applicationInfo;
        alvd alvdVar;
        long c = this.h.c();
        try {
            applicationInfo = this.a.getPackageManager().getApplicationInfo("com.android.vending", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            zep.c("Package not found", "com.android.vending");
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            asxp asxpVar = this.d.a().e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (!asxpVar.aU) {
                return;
            }
            if (!this.e.c() || this.b <= 60000 || c - g() < ((Long) this.j.a.a.V(axxd.g).B().aw()).longValue() || !applicationInfo.enabled) {
                if (c >= g()) {
                    return;
                }
                h(c);
                return;
            }
            h(c);
            alsm alsmVar = this.c.a;
            if (alsmVar.b == null) {
                alsm.a.a("Play Store app is either not installed or not the official version", new Object[0]);
                alvdVar = anqx.i(new alsi());
            } else {
                alvg alvgVar = new alvg();
                alsmVar.b.b(new alsk(alsmVar, alvgVar, alvgVar), alvgVar);
                alvdVar = alvgVar.a;
            }
            alvdVar.e(new alvb() { // from class: mbk
                @Override // defpackage.alvb
                public final void a(Object obj) {
                    InAppReviewController inAppReviewController = InAppReviewController.this;
                    alsj alsjVar = inAppReviewController.c;
                    Activity activity = inAppReviewController.a;
                    Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
                    intent.putExtra("confirmation_intent", ((ReviewInfo) obj).a());
                    intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
                    final alvg alvgVar2 = new alvg();
                    intent.putExtra("result_receiver", new ResultReceiver(alsjVar.b) { // from class: com.google.android.play.core.review.ReviewManagerImpl$1
                        @Override // android.os.ResultReceiver
                        public final void onReceiveResult(int i2, Bundle bundle) {
                            alvgVar2.b(null);
                        }
                    });
                    activity.startActivity(intent);
                    alvd alvdVar2 = alvgVar2.a;
                    alvdVar2.e(new alvb() { // from class: mbl
                        @Override // defpackage.alvb
                        public final void a(Object obj2) {
                            Void r1 = (Void) obj2;
                            zep.g("Successfully launched review flow");
                        }
                    });
                    alvdVar2.d(mbj.b);
                }
            });
            alvdVar.d(mbj.a);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
