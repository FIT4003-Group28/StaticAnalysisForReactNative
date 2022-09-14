package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: btbm  reason: default package */
/* loaded from: classes4.dex */
public final class btbm extends gen {
    Locale a;
    public bvjj ad;
    public ckcw ae;
    final Handler af = new Handler(Looper.getMainLooper());
    public gga b;
    public btcw c;
    public btby d;
    public bwqv e;
    public btvo g;

    @Override // defpackage.ges
    public final void Nv() {
        ((btbn) btsx.b(btbn.class, this)).dl(this);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        int i = this.g.getLanguageSettingParameters().f;
        this.af.removeCallbacksAndMessages(null);
        this.af.postDelayed(new Runnable(this) { // from class: btbk
            private final btbm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btbm btbmVar = this.a;
                btbmVar.ad.ac(bvjk.R, (String) ((dbsu) btbp.a(btbmVar.a)).a);
                btbmVar.aT();
                btbmVar.b.D(new btbi());
            }
        }, TimeUnit.SECONDS.toMillis(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cjkp B = cjkr.B();
        B.t("");
        cjke cjkeVar = (cjke) B;
        cjkeVar.a = ibn.l();
        cjkeVar.f = cqgr.fT(new btbo(), cqkp.T);
        return B.u(this.b).q();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [btcu] */
    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            Locale locale = (Locale) this.e.d(Locale.class, bundle, "new_locale_key");
            dbsk.s(locale);
            this.a = locale;
            btbl btblVar = new btbl(this);
            btcw btcwVar = this.c;
            final Locale locale2 = this.a;
            dals dalsVar = new dals();
            dalsVar.b.add(locale2);
            dalt daltVar = new dalt(dalsVar);
            btcwVar.a.e(btblVar);
            danb<Integer> a = btcwVar.a.a(daltVar);
            a.c(new Object(locale2) { // from class: btcu
                private final Locale a;

                {
                    this.a = locale2;
                }
            });
            a.b(new btcv(btcwVar));
            btcwVar.a.b(dcdc.f(locale2));
        } catch (IOException | NullPointerException e) {
            throw new IllegalStateException("Locale not set.", e);
        }
    }
}
