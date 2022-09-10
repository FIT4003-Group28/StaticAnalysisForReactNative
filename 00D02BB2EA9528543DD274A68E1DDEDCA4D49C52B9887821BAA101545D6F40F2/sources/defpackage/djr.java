package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: djr  reason: default package */
/* loaded from: classes6.dex */
public final class djr implements dfeq<dfgv> {
    public final djt a;
    private final czz b;
    private final dehq c;
    private final cjqq d;
    private final View e;
    private final View f;
    private final View g;
    private dfgu h = dfgu.STOPPED;
    @dzsi
    private dehn<?> i;

    public djr(dehq dehqVar, btvo btvoVar, cjqq cjqqVar, dju djuVar, czz czzVar, ff ffVar, czh czhVar, boolean z) {
        this.b = czzVar;
        this.c = dehqVar;
        this.d = cjqqVar;
        cjqy a = djuVar.a.a();
        dju.a(a, 1);
        crow a2 = djuVar.b.a();
        dju.a(a2, 2);
        dju.a(czhVar, 3);
        this.a = new djt(a, a2, czhVar);
        final View inflate = ffVar.getLayoutInflater().inflate(R.layout.localization_overlay, (ViewGroup) null);
        dhly dhlyVar = btvoVar.getNavigationParameters().J().h;
        if ((dhlyVar == null ? dhly.e : dhlyVar).c) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.ar_localization_animation);
            lottieAnimationView.setVisibility(0);
            ((WebImageView) inflate.findViewById(R.id.lite_mode_instruction)).setVisibility(8);
            lottieAnimationView.setFailureListener(new bjt(inflate) { // from class: djq
                private final View a;

                {
                    this.a = inflate;
                }

                @Override // defpackage.bjt
                public final void a(Object obj) {
                    Throwable th = (Throwable) obj;
                    djr.c(this.a);
                }
            });
            lottieAnimationView.setAnimation(R.raw.localization_instruction);
        } else {
            c(inflate);
        }
        if (z) {
            ((TextView) inflate.findViewById(R.id.ar_localization_text)).setText(R.string.AR_VENUE_LOCALIZING_GUIDANCE_MESSAGE);
        }
        this.e = inflate;
        this.f = ffVar.getLayoutInflater().inflate(R.layout.ar_localizing_text_view, (ViewGroup) null);
        this.g = ffVar.getLayoutInflater().inflate(R.layout.ar_done_localizing_text_view, (ViewGroup) null);
    }

    public static void c(View view) {
        WebImageView webImageView = (WebImageView) view.findViewById(R.id.lite_mode_instruction);
        doj.LITE_MODE_INSTRUCTION.a(webImageView, view.getResources().getDisplayMetrics());
        ((LottieAnimationView) view.findViewById(R.id.ar_localization_animation)).setVisibility(8);
        webImageView.setVisibility(0);
    }

    public final void b() {
        dehn<?> dehnVar = this.i;
        if (dehnVar == null) {
            return;
        }
        dehnVar.cancel(false);
        this.b.u();
        this.i = null;
    }

    @Override // defpackage.dfeq
    public final /* bridge */ /* synthetic */ void n(@dzsi dfgv dfgvVar) {
        dfgu dfguVar;
        dfgv dfgvVar2 = dfgvVar;
        bvrj.UI_THREAD.c();
        if (dfgvVar2 != null) {
            dfguVar = dfgu.b(dfgvVar2.b);
            if (dfguVar == null) {
                dfguVar = dfgu.NONE;
            }
        } else {
            dfguVar = dfgu.STOPPED;
        }
        dfguVar.name();
        dfgu dfguVar2 = this.h;
        if (dfguVar2 == dfguVar) {
            return;
        }
        this.h = dfguVar;
        b();
        int ordinal = this.h.ordinal();
        if (ordinal == 2) {
            this.b.s();
            this.b.t(this.f);
        } else if (ordinal == 3) {
            this.b.r(this.e);
            this.b.t(this.f);
            this.d.f(this.e).d(cjtd.a(dtxw.m));
        } else if (ordinal != 4) {
        } else {
            if (dfguVar2 == dfgu.STOPPED) {
                this.b.s();
                this.b.u();
                return;
            }
            this.b.s();
            this.b.t(this.g);
            dehq dehqVar = this.c;
            final czz czzVar = this.b;
            czzVar.getClass();
            this.i = dehqVar.d(new Runnable(czzVar) { // from class: djp
                private final czz a;

                {
                    this.a = czzVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.u();
                }
            }, 3000L, TimeUnit.MILLISECONDS);
        }
    }
}
