package defpackage;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: caxm  reason: default package */
/* loaded from: classes4.dex */
public final class caxm {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final caxn f;
    public final Activity g;
    public final cklf h;
    public final caxa i;
    private final CharSequence j;
    private final CharSequence k;
    private final dzss l;
    private final cjjd m;
    private final cjjj n;
    private final cqkj o;
    private final Executor p;

    public caxm(cjjj cjjjVar, caxn caxnVar, Activity activity, cqkj cqkjVar, cklf cklfVar, Executor executor, caxa caxaVar) {
        this.n = cjjjVar;
        this.f = caxnVar;
        this.g = activity;
        this.o = cqkjVar;
        this.h = cklfVar;
        this.p = executor;
        this.i = caxaVar;
        CharSequence text = activity.getText(R.string.ugc_disclosure_popup_read_more_link);
        dzvx.b(text, "activity.getText(R.strin…ure_popup_read_more_link)");
        this.a = text;
        CharSequence text2 = activity.getText(R.string.ugc_disclosure_dialog_confirmation_title);
        dzvx.b(text2, "activity.getText(R.strin…ialog_confirmation_title)");
        this.b = text2;
        CharSequence text3 = activity.getText(R.string.ugc_disclosure_dialog_confirmation_button);
        dzvx.b(text3, "activity.getText(R.strin…alog_confirmation_button)");
        this.c = text3;
        CharSequence text4 = activity.getText(R.string.ugc_disclosure_dialog_positive_button);
        dzvx.b(text4, "activity.getText(R.strin…e_dialog_positive_button)");
        this.j = text4;
        CharSequence text5 = activity.getResources().getText(R.string.ugc_disclosure_posting_publicly);
        dzvx.b(text5, "activity.resources.getTe…closure_posting_publicly)");
        this.k = text5;
        CharSequence text6 = activity.getResources().getText(R.string.ugc_disclosure_popup_content);
        dzvx.b(text6, "activity.resources.getTe…disclosure_popup_content)");
        this.d = text6;
        this.l = dzst.a(new caxh(this));
        cjjd a = cjje.a();
        cjju cjjuVar = new cjju(a(), text5);
        cjix cjixVar = (cjix) a;
        cjixVar.a = cjjuVar;
        cjtd a2 = cjtd.a(dtxy.nf);
        dzvx.b(a2, "Ue3LoggingCommonParams.f…OLL_TOOLTIP_PROMO\n      )");
        cjixVar.c = a2;
        this.m = a;
        this.e = caxnVar.a;
    }

    private final boolean e() {
        return this.f.a(this.i);
    }

    public final CharSequence a() {
        return (CharSequence) this.l.a();
    }

    public final void b(View view, boolean z) {
        if (!this.e) {
            return;
        }
        if (e()) {
            if (!z) {
                return;
            }
            z = true;
        }
        if (view == null || !view.isShown()) {
            c(z);
            return;
        }
        cjjj cjjjVar = this.n;
        cjjd cjjdVar = this.m;
        cjjdVar.d(view);
        cjjjVar.a(cjjdVar.a());
        this.p.execute(new caxl(this));
    }

    public final void c(boolean z) {
        if (!this.e) {
            return;
        }
        if (e() && !z) {
            return;
        }
        d(this.k, this.j, caxj.a);
        this.f.b(this.i);
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2, dzut<dztc> dzutVar) {
        iii iiiVar = new iii();
        iiiVar.b = a();
        iiiVar.d = LinkMovementMethod.getInstance();
        iiiVar.a = charSequence;
        iiiVar.d(charSequence2, new caxk(dzutVar), cjtd.a(dtxy.om));
        iiiVar.a(this.g, this.o).k();
    }
}
