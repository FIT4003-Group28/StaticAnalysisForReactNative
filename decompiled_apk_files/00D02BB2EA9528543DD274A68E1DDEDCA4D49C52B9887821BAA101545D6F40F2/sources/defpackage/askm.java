package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: askm  reason: default package */
/* loaded from: classes2.dex */
public final class askm extends ex {
    private static final dcqe aq = dcqe.c("askm");
    @dzsi
    public askl ad;
    @dzsi
    public askn ae;
    public cjqy af;
    public cjqq ag;
    public bvjj ah;
    public bttf ai;
    public brlz aj;
    public asik ak;
    public akfa al;
    @dzsi
    private ImageView ar;
    public boolean am = false;
    private boolean as = false;
    public boolean an = false;
    public boolean ao = false;
    public boolean ap = false;

    private final void aK(Configuration configuration) {
        if (this.ar != null) {
            this.ar.setVisibility(configuration.orientation == 2 ? 8 : 0);
        }
    }

    private final Spanned aL(Spanned spanned, URLSpan uRLSpan, String str, ddho ddhoVar) {
        aski askiVar = new aski(this, ddhoVar, str);
        int spanStart = spanned.getSpanStart(uRLSpan);
        int spanEnd = spanned.getSpanEnd(uRLSpan);
        SpannableString spannableString = new SpannableString(spanned);
        spannableString.removeSpan(uRLSpan);
        spannableString.setSpan(askiVar, spanStart, spanEnd, 33);
        return spannableString;
    }

    public final void aJ(String str) {
        ff J = J();
        if (J instanceof gga) {
            afha wc = ((afgz) btsq.b(afgz.class, (gga) J)).wc();
            dbsk.s(wc);
            wc.H(J, str, 4);
            return;
        }
        btme.a(J).b(str);
    }

    @Override // defpackage.fd
    public final void ak() {
        Window window;
        super.ak();
        Dialog dialog = this.d;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }

    @Override // defpackage.fd
    public final void am() {
        this.ar = null;
        askn asknVar = this.ae;
        if (asknVar != null) {
            asknVar.b = null;
        }
        super.am();
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        ((askk) btsr.a(askk.class)).su(this);
        this.as = ashb.a(this.aj.g, this.ak, this.al);
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        askl asklVar = this.ad;
        if (asklVar != null) {
            asklVar.b();
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aK(configuration);
    }

    @Override // defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        String a;
        this.an = !this.as && !this.ah.m(bvjk.bR, false);
        this.ao = !this.ah.m(bvjk.bR, false) && this.as && !this.ah.m(bvjk.bS, false);
        this.ap = this.ah.m(bvjk.bR, false) && this.as && !this.ah.m(bvjk.bS, false);
        cjqp g = this.ag.g();
        if (this.an) {
            g.d(cjtd.a(dtxw.aq));
            g.d(cjtd.a(dtxw.ar));
            if (!bycr.a(this.ai)) {
                g.d(cjtd.a(dtxw.as));
            }
        } else if (this.ao) {
            g.d(cjtd.a(dtxj.dr));
            g.d(cjtd.a(dtxj.ds));
            g.d(cjtd.a(dtxj.du));
            g.d(cjtd.a(dtxj.dt));
            if (!bycr.a(this.ai)) {
                g.d(cjtd.a(dtxj.dv));
            }
        } else if (this.ap) {
            g.d(cjtd.a(dtxj.dn));
            g.d(cjtd.a(dtxj.dq));
            g.d(cjtd.a(dtxj.dp));
            g.d(cjtd.a(dtxj.f11do));
        }
        String string = J().getString(R.string.TUTORIAL_GOT_IT);
        askg askgVar = new askg(this);
        View inflate = J().getLayoutInflater().inflate(R.layout.qu_navigation_welcome_dialog, (ViewGroup) null, false);
        View findViewById = inflate.findViewById(R.id.navigation_welcome_dialog_image);
        if (findViewById == null) {
            bvoo.h("Failed to find R.id.navigation_welcome_dialog_image", new Object[0]);
        } else if (!(findViewById instanceof ImageView)) {
            bvoo.h("R.id.navigation_welcome_dialog_image is not an ImageView", new Object[0]);
        } else {
            ImageView imageView = (ImageView) findViewById;
            this.ar = imageView;
            imageView.setImageDrawable(dxer.a(Rn(), R.raw.navigation_welcome_dialog_image).a());
        }
        aK(Rn().getConfiguration());
        if (this.ap) {
            View findViewById2 = inflate.findViewById(R.id.navigation_welcome_title_text);
            if (findViewById2 == null) {
                bvoo.h("Failed to find R.id.navigation_welcome_title_text", new Object[0]);
            } else if (!(findViewById2 instanceof TextView)) {
                bvoo.h("R.id.navigation_welcome_title_text is not a TextView", new Object[0]);
            } else {
                ((TextView) findViewById2).setText(J().getString(R.string.NAVIGATION_NEW_ASSISTANT_USER_DISCLAIMER_TITLE));
            }
        }
        View findViewById3 = inflate.findViewById(R.id.navigation_welcome_dialog_text);
        if (findViewById3 == null) {
            bvoo.h("Failed to find R.id.navigation_welcome_dialog_text", new Object[0]);
        }
        if (this.ah.m(bvjk.bR, false)) {
            findViewById3.setVisibility(8);
        } else if (!bycr.a(this.ai)) {
            if (!(findViewById3 instanceof TextView)) {
                bvoo.h("R.id.navigation_welcome_dialog_text is not a TextView", new Object[0]);
            } else {
                int i = true != this.as ? R.string.NAVIGATION_DISCLAIMER_TEXT : R.string.NAVIGATION_WITH_ASSISTANT_DISCLAIMER_TEXT;
                TextView textView = (TextView) findViewById3;
                if (bycr.a(this.ai)) {
                    a = cjxr.l();
                } else {
                    a = cjxr.a(bycr.b(this.ai));
                }
                bvsx bvsxVar = new bvsx(Rn());
                bvsu c = bvsxVar.c(i);
                bvsu c2 = bvsxVar.c(R.string.NAVIGATION_DISCLAIMER_TERMS_LINK);
                c2.l(Rn().getColor(R.color.quantum_googblue));
                c.a(c2);
                textView.setText(c.c());
                textView.setOnClickListener(new askh(this, a));
            }
        }
        View findViewById4 = inflate.findViewById(R.id.navigation_assistant_dialog_text);
        if (findViewById4 == null) {
            bvoo.h("Failed to find R.id.navigation_assistant_dialog_text", new Object[0]);
        }
        if (this.ah.m(bvjk.bS, false) || !this.as) {
            findViewById4.setVisibility(8);
        } else if (!(findViewById4 instanceof TextView)) {
            bvoo.h("R.id.navigation_assistant_dialog_text is not a TextView", new Object[0]);
        } else {
            if (this.ap) {
                this.ah.S(bvjk.bS, true);
            }
            Spanned fromHtml = Html.fromHtml(J().getString(R.string.NAVIGATION_ASSISTANT_DISCLAIMER_TEXT));
            URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
            if (uRLSpanArr.length == 2) {
                Locale b = bycr.b(this.ai);
                fromHtml = aL(aL(fromHtml, uRLSpanArr[0], cjxr.d(b), this.ao ? dtxj.ds : dtxj.dq), uRLSpanArr[1], cjxr.e(b), this.ao ? dtxj.du : dtxj.dp);
            } else {
                bvoo.h("R.id.navigation_assistant_disclaimer_text doesn't contain 2 links", new Object[0]);
            }
            TextView textView2 = (TextView) findViewById4;
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(fromHtml, TextView.BufferType.SPANNABLE);
        }
        return new AlertDialog.Builder(J()).setView(inflate).setPositiveButton(string, askgVar).create();
    }

    @Override // defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        this.am = true;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void u() {
        this.am = false;
        super.u();
    }
}
