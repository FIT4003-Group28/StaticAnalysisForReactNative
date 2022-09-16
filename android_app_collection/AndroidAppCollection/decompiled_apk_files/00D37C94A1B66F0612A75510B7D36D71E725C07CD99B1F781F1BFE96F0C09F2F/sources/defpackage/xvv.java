package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xvv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xvv implements View.OnClickListener {
    public final /* synthetic */ xwb a;
    private final /* synthetic */ int b;

    public /* synthetic */ xvv(xwb xwbVar) {
        this.a = xwbVar;
    }

    public /* synthetic */ xvv(xwb xwbVar, int i) {
        this.b = i;
        this.a = xwbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.az.cancel();
                return;
            } else if (i != 2) {
                Runnable runnable = this.a.au;
                if (runnable == null) {
                    return;
                }
                runnable.run();
                return;
            } else {
                Runnable runnable2 = this.a.av;
                if (runnable2 == null) {
                    return;
                }
                runnable2.run();
                return;
            }
        }
        xwb xwbVar = this.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xwbVar.a());
        xxs.b(spannableStringBuilder);
        if (!xwbVar.m() && (xwbVar.aB || xwbVar.aJ())) {
            xwbVar.az.setCancelable(false);
            xwbVar.az.setCanceledOnTouchOutside(false);
            xwbVar.aE(xwbVar.aA);
            xwbVar.aG(false);
            xwbVar.aq.setVisibility(0);
            xwbVar.ap.setEnabled(false);
            xwbVar.aC = true;
            xks xksVar = xwbVar.aH;
            if (xksVar == null) {
                return;
            }
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            xli xliVar = xksVar.a;
            xwc xwcVar = xksVar.b;
            xlp xlpVar = xksVar.c;
            ajyj ajyjVar = xksVar.d;
            Long l = xksVar.e;
            boolean z = xksVar.f;
            if (!xliVar.c.o()) {
                xwcVar.dismiss();
                xliVar.d(xliVar.a.getText(R.string.common_error_connection), amon.a, R.string.comments_discard_positive_button, xlpVar, ajyjVar, xwcVar, l, z, false);
                return;
            } else if (xlpVar.p - 1 != 0) {
                xliVar.m(ajyjVar, spannableStringBuilder2, xlpVar, xwcVar);
                return;
            } else {
                xliVar.l(spannableStringBuilder2, ajyjVar, xlpVar, xwcVar, l);
                return;
            }
        }
        xwbVar.dismiss();
    }
}
