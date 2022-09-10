package defpackage;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gmm.ar.api.ArLauncherParams;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.gmm.shared.util.IncognitoSafeURLSpan;
import com.google.android.apps.maps.R;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dlz  reason: default package */
/* loaded from: classes6.dex */
public final class dlz extends det {
    private static final dcdn<czh, ddho> ap = dcdn.m(czh.LIGHTHOUSE, dtxj.bC, czh.CALIBRATOR, dtxj.bi, czh.WALKING_NAVIGATION, dtxw.r);
    private static final dcdn<czh, ddho> aq = dcdn.m(czh.LIGHTHOUSE, dtxj.bD, czh.CALIBRATOR, dtxj.bj, czh.WALKING_NAVIGATION, dtxw.s);
    private static final dcdn<czh, ddho> ar = dcdn.m(czh.LIGHTHOUSE, dtxj.bE, czh.CALIBRATOR, dtxj.bk, czh.WALKING_NAVIGATION, dtxw.t);
    public dku am;
    public dkn an;
    public cpv ao;
    private int as = -1;

    private static ddho aT(czh czhVar) {
        return ap.getOrDefault(czhVar, dtxw.r);
    }

    @Override // defpackage.det
    protected final void aO(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View inflate = layoutInflater.inflate(R.layout.consent_dialog, viewGroup);
        DisplayMetrics displayMetrics = Rn().getDisplayMetrics();
        doj.ONBOARDING_CAMERA_IMAGE.a((WebImageView) inflate.findViewById(R.id.consent_access_camera_image), displayMetrics);
        doj.ONBOARDING_AWARENESS_IMAGE.a((WebImageView) inflate.findViewById(R.id.consent_awareness_image), displayMetrics);
        TextView textView = (TextView) inflate.findViewById(R.id.consent_awareness_description);
        textView.setText(IncognitoSafeURLSpan.a(Html.fromHtml(String.format(textView.getText().toString(), cjxr.a(Locale.getDefault())))));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        dcpd<Map.Entry<czq, String>> it = this.ag.l().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<czq, String> next = it.next();
            czq key = next.getKey();
            czq czqVar = czq.DIRECTIONS_OVERLAY;
            int ordinal = key.ordinal();
            if (ordinal == 0) {
                dbsk.s(inflate);
                findViewById3 = inflate.findViewById(R.id.consent_directions_overlay_title);
            } else if (ordinal == 1) {
                dbsk.s(inflate);
                findViewById3 = inflate.findViewById(R.id.consent_access_camera_title);
            } else if (ordinal == 2) {
                dbsk.s(inflate);
                findViewById3 = inflate.findViewById(R.id.consent_awareness_title);
            } else {
                String valueOf = String.valueOf(key);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Unknown onboarding step: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            ((TextView) findViewById3).setText(next.getValue());
        }
        dcpd<Map.Entry<czq, String>> it2 = this.ag.m().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<czq, String> next2 = it2.next();
            czq key2 = next2.getKey();
            czq czqVar2 = czq.DIRECTIONS_OVERLAY;
            int ordinal2 = key2.ordinal();
            if (ordinal2 == 0) {
                dbsk.s(inflate);
                findViewById2 = inflate.findViewById(R.id.consent_directions_overlay_description);
            } else if (ordinal2 == 1) {
                dbsk.s(inflate);
                findViewById2 = inflate.findViewById(R.id.consent_access_camera_description);
            } else if (ordinal2 == 2) {
                dbsk.s(inflate);
                findViewById2 = inflate.findViewById(R.id.consent_awareness_description);
            } else {
                String valueOf2 = String.valueOf(key2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                sb2.append("Unknown onboarding step: ");
                sb2.append(valueOf2);
                throw new IllegalArgumentException(sb2.toString());
            }
            ((TextView) findViewById2).setText(next2.getValue());
        }
        dcpd<Map.Entry<czq, String>> it3 = this.ag.n().entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<czq, String> next3 = it3.next();
            czq key3 = next3.getKey();
            czq czqVar3 = czq.DIRECTIONS_OVERLAY;
            int ordinal3 = key3.ordinal();
            if (ordinal3 == 0) {
                dbsk.s(inflate);
                findViewById = inflate.findViewById(R.id.consent_directions_overlay_next_button);
            } else if (ordinal3 == 1) {
                dbsk.s(inflate);
                findViewById = inflate.findViewById(R.id.consent_access_camera_next_button);
            } else if (ordinal3 == 2) {
                dbsk.s(inflate);
                findViewById = inflate.findViewById(R.id.consent_awareness_start_button);
            } else {
                String valueOf3 = String.valueOf(key3);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                sb3.append("Unknown onboarding step: ");
                sb3.append(valueOf3);
                throw new IllegalArgumentException(sb3.toString());
            }
            ((TextView) findViewById).setText(next3.getValue());
        }
        czh a = this.ag.a();
        Button button = (Button) inflate.findViewById(R.id.consent_directions_overlay_next_button);
        this.an.a(button, cjtd.a(aq.getOrDefault(a, dtxw.s)));
        this.an.b(button, new View.OnClickListener(this) { // from class: dlu
            private final dlz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.aS();
            }
        });
        ((Button) inflate.findViewById(R.id.consent_access_camera_next_button)).setOnClickListener(new View.OnClickListener(this) { // from class: dlv
            private final dlz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.aS();
            }
        });
        Button button2 = (Button) inflate.findViewById(R.id.consent_awareness_start_button);
        this.an.a(button2, cjtd.a(ar.getOrDefault(this.ag.a(), dtxw.t)));
        this.an.b(button2, new View.OnClickListener(this) { // from class: dlw
            private final dlz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.aS();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dev
    public final ddho aR() {
        return aT(this.ag.a());
    }

    public final void aS() {
        boolean z;
        dcdc<czq> c = this.ag.c();
        int i = this.as;
        int i2 = 0;
        if (i != -1) {
            View view = this.P;
            dbsk.s(view);
            czq czqVar = czq.DIRECTIONS_OVERLAY;
            int ordinal = c.get(i).ordinal();
            if (ordinal == 0) {
                view.findViewById(R.id.consent_directions_overlay).setVisibility(8);
                ((LottieAnimationView) view.findViewById(R.id.consent_directions_overlay_image)).e();
            } else if (ordinal == 1) {
                view.findViewById(R.id.consent_access_camera).setVisibility(8);
            } else if (ordinal == 2) {
                view.findViewById(R.id.consent_awareness).setVisibility(8);
            }
            z = true;
        } else {
            z = false;
        }
        int i3 = this.as + 1;
        this.as = i3;
        if (i3 == c.size()) {
            super.aM().f();
            czp o = this.ag.o();
            o.l(dcdc.e());
            o.k(true);
            final ArLauncherParams d = o.d();
            ff J = J();
            dbsk.s(J);
            J.runOnUiThread(new Runnable(this, d) { // from class: dly
                private final dlz a;
                private final ArLauncherParams b;

                {
                    this.a = this;
                    this.b = d;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.aK(this.b);
                }
            });
            f();
            return;
        }
        View view2 = this.P;
        dbsk.s(view2);
        czq czqVar2 = czq.DIRECTIONS_OVERLAY;
        int ordinal2 = c.get(this.as).ordinal();
        if (ordinal2 == 0) {
            view2.findViewById(R.id.consent_directions_overlay).setVisibility(0);
            final LottieAnimationView lottieAnimationView = (LottieAnimationView) view2.findViewById(R.id.consent_directions_overlay_image);
            lottieAnimationView.b(true);
            final dku dkuVar = this.am;
            doi j = this.ag.j();
            boolean aN = aN();
            Locale locale = Locale.US;
            String str = j.d;
            Object[] objArr = new Object[1];
            objArr[0] = true != aN ? "light" : "dark";
            final String format = String.format(locale, str, objArr);
            final ImageView.ScaleType k = this.ag.k();
            final o oVar = this.Z;
            dkuVar.d.execute(new Runnable(dkuVar, format, lottieAnimationView, k, oVar) { // from class: dko
                private final dku a;
                private final String b;
                private final LottieAnimationView c;
                private final ImageView.ScaleType d;
                private final k e;

                {
                    this.a = dkuVar;
                    this.b = format;
                    this.c = lottieAnimationView;
                    this.d = k;
                    this.e = oVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    dku dkuVar2 = this.a;
                    String str2 = this.b;
                    LottieAnimationView lottieAnimationView2 = this.c;
                    ImageView.ScaleType scaleType = this.d;
                    k kVar = this.e;
                    try {
                        if (!((o) kVar).a.a(j.CREATED)) {
                            return;
                        }
                        File file2 = new File(dkuVar2.b.getCacheDir(), "lottie_cache");
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        String trim = ((String) dcft.s(dku.a.g(str2))).trim();
                        if (trim.isEmpty()) {
                            file = File.createTempFile("lottie_animation", ".zip", file2);
                        } else {
                            file = new File(file2, trim);
                        }
                        if (file.exists()) {
                            dku.a(file, trim, lottieAnimationView2, scaleType, kVar);
                            return;
                        }
                        cvie a = dkuVar2.c.a(str2, file2, String.valueOf(trim).concat(".tmp"), new dkt(dkuVar2, trim, lottieAnimationView2, scaleType, kVar));
                        a.f(cvid.WIFI_OR_CELLULAR);
                        a.d();
                    } catch (IOException unused) {
                    }
                }
            });
            Button button = (Button) view2.findViewById(R.id.consent_directions_overlay_cancel_button);
            this.an.a(button, cjtd.a(dtxj.bm));
            this.an.b(button, new View.OnClickListener(this) { // from class: dlx
                private final dlz a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.a.f();
                }
            });
            if (true != this.ag.h()) {
                i2 = 8;
            }
            button.setVisibility(i2);
        } else if (ordinal2 == 1) {
            view2.findViewById(R.id.consent_access_camera).setVisibility(0);
        } else if (ordinal2 == 2) {
            view2.findViewById(R.id.consent_awareness).setVisibility(0);
        }
        if (!z) {
            return;
        }
        cpv cpvVar = this.ao;
        View view3 = this.P;
        dbsk.s(view3);
        cpvVar.c(view3, 8);
    }

    @Override // defpackage.det, defpackage.des, defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        aQ(cjtd.a(aT(this.ag.a())));
        if (this.as == -1) {
            aS();
        }
    }
}
