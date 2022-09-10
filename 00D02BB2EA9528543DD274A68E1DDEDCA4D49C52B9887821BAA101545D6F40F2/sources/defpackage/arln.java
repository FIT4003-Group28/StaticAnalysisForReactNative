package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arln  reason: default package */
/* loaded from: classes2.dex */
public final class arln extends dev {
    public bsvm ad;
    public cjqy ae;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dev
    public final ddho aR() {
        return dtxw.E;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        return layoutInflater.inflate(R.layout.tilt_info_dialog, viewGroup);
    }

    @Override // defpackage.ex, defpackage.fd
    public final void s() {
        SpannableString fromHtml;
        super.s();
        aQ(cjtd.a(dtxw.E));
        cjql aQ = aQ(cjtd.a(dtxw.F));
        View view = this.P;
        dbsk.s(view);
        ((Button) view.findViewById(R.id.dismiss_button)).setOnClickListener(new View.OnClickListener(this) { // from class: arll
            private final arln a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.f();
            }
        });
        arlm arlmVar = new arlm(this, aQ);
        TextView textView = (TextView) view.findViewById(R.id.description);
        String Rp = Rp(R.string.ARWN_TILT_INFO_DESCRIPTION);
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(Rp, 63);
        } else {
            fromHtml = Html.fromHtml(Rp);
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr.length > 0) {
            URLSpan uRLSpan = uRLSpanArr[0];
            int spanStart = fromHtml.getSpanStart(uRLSpan);
            int spanEnd = fromHtml.getSpanEnd(uRLSpan);
            SpannableString spannableString = new SpannableString(fromHtml);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(arlmVar, spanStart, spanEnd, 33);
            fromHtml = spannableString;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(fromHtml, TextView.BufferType.SPANNABLE);
    }
}
