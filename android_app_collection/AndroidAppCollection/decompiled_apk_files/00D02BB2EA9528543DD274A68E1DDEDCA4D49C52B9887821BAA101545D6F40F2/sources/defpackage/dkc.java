package defpackage;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dkc  reason: default package */
/* loaded from: classes6.dex */
public final class dkc extends det {
    public cklf am;
    public dkn an;
    public czj ao;
    public dxio<araj> ap;
    public aufc aq;
    Runnable ar = djv.a;

    private final void aU(View view, ddho ddhoVar, View.OnClickListener onClickListener) {
        this.an.a(view, cjtd.a(ddhoVar));
        this.an.b(view, onClickListener);
    }

    @Override // defpackage.det
    protected final void aO(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String Rp;
        String str;
        Spanned fromHtml;
        boolean f = this.aq.f();
        czh a = this.ag.a();
        czh czhVar = czh.CALIBRATOR;
        View inflate = layoutInflater.inflate(R.layout.timeout_dialog, viewGroup);
        (f ? doj.TIMEOUT_NIGHT_IMAGE : doj.TIMEOUT_DAY_IMAGE).a((WebImageView) inflate.findViewById(R.id.timeout_image), Rn().getDisplayMetrics());
        if (a == czhVar) {
            str = Rp(R.string.CALIBRATOR_TIMEOUT_DIALOG_TITLE);
            Rp = Rp(R.string.CALIBRATOR_TIMEOUT_DIALOG_DESCRIPTION);
        } else {
            String Rp2 = Rp(true != f ? R.string.ARWN_TIMEOUT_DIALOG_TITLE : R.string.ARWN_NIGHT_TIMEOUT_DIALOG_TITLE);
            Rp = Rp(true != f ? R.string.ARWN_TIMEOUT_DIALOG_DESCRIPTION : R.string.ARWN_NIGHT_TIMEOUT_DIALOG_DESCRIPTION);
            str = Rp2;
        }
        TextView textView = (TextView) inflate.findViewById(R.id.timeout_description);
        ((TextView) inflate.findViewById(R.id.timeout_title)).setText(str);
        dkb dkbVar = new dkb(new Runnable(this) { // from class: djw
            private final dkc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                boolean z;
                dkc dkcVar = this.a;
                Bundle bundle = dkcVar.o;
                if (bundle != null) {
                    boolean z2 = bundle.getBoolean("IS_ARLO");
                    str2 = bundle.getString("ARG_GEO_AR_SESSION_ID");
                    z = z2;
                } else {
                    str2 = null;
                    z = false;
                }
                dkcVar.ao.a(dkcVar.ag.a(), null, z, str2, dkcVar.ar);
                dkcVar.f();
            }
        });
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(Rp, 63);
        } else {
            fromHtml = Html.fromHtml(Rp);
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        SpannableString spannableString = fromHtml;
        if (uRLSpanArr.length > 0) {
            URLSpan uRLSpan = uRLSpanArr[0];
            int spanStart = fromHtml.getSpanStart(uRLSpan);
            int spanEnd = fromHtml.getSpanEnd(uRLSpan);
            SpannableString spannableString2 = new SpannableString(fromHtml);
            spannableString2.removeSpan(uRLSpan);
            spannableString2.setSpan(dkbVar, spanStart, spanEnd, 33);
            spannableString = spannableString2;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        aU((Button) inflate.findViewById(R.id.timeout_try_again_button), dtxw.k, new View.OnClickListener(this) { // from class: djx
            private final dkc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.aS();
            }
        });
        Button button = (Button) inflate.findViewById(R.id.timeout_back_to_map_button);
        if (a == czhVar) {
            button.setText(R.string.CALIBRATOR_TIMEOUT_DIALOG_USE_COMPASS_BUTTON);
            aU(button, dtxj.bp, new View.OnClickListener(this) { // from class: djy
                private final dkc a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dkc dkcVar = this.a;
                    dkcVar.aT();
                    dkcVar.ap.a().q();
                }
            });
        } else {
            aU(button, dtxw.l, new View.OnClickListener(this) { // from class: djz
                private final dkc a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.aT();
                }
            });
        }
        ((ImageButton) inflate.findViewById(R.id.timeout_more_info_button)).setOnClickListener(new View.OnClickListener(this) { // from class: dka
            private final dkc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.am.a("arnavigation");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dev
    public final ddho aR() {
        return dtxw.j;
    }

    public final void aS() {
        f();
        this.ar.run();
    }

    public final void aT() {
        f();
        aL();
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        aS();
    }

    @Override // defpackage.det, defpackage.des, defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        aQ(cjtd.a(dtxw.j));
    }
}
