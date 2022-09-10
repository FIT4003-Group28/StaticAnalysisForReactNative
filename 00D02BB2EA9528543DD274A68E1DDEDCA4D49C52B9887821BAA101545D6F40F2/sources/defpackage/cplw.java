package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel;
import com.google.android.libraries.abuse.reporting.ReportAbuseHorizontalScrollView;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cplw  reason: default package */
/* loaded from: classes5.dex */
public final class cplw extends fd {
    public String a;
    public String ad;
    public LinearLayout ae;
    public ProgressBar af;
    public ReportAbuseHorizontalScrollView ag;
    public RelativeLayout ah;
    public int ai = 0;
    public Handler aj;
    private Button ak;
    private Button al;
    private Button am;
    private Button an;
    private ImageButton ao;
    private Button ap;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    private final View.OnClickListener aJ(final int i, final int i2) {
        return new View.OnClickListener(this, i, i2) { // from class: cpls
            private final cplw a;
            private final int b;
            private final int c;

            {
                this.a = this;
                this.b = i;
                this.c = i2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cplw cplwVar = this.a;
                cplwVar.d().l(this.b, this.c);
            }
        };
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.component, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title_text)).setText(this.a);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.cancel_button);
        imageButton.setContentDescription(this.b);
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: cplr
            private final cplw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d().o();
            }
        });
        this.ag = (ReportAbuseHorizontalScrollView) inflate.findViewById(R.id.cards_area_wrapper);
        this.ae = (LinearLayout) inflate.findViewById(R.id.cards_area);
        this.af = (ProgressBar) inflate.findViewById(R.id.loading_indicator);
        this.ah = (RelativeLayout) inflate.findViewById(R.id.footer_buttons_area);
        this.ak = (Button) inflate.findViewById(R.id.accept_message_button);
        this.al = (Button) inflate.findViewById(R.id.done_button);
        this.am = (Button) inflate.findViewById(R.id.next_button);
        this.an = (Button) inflate.findViewById(R.id.submit_button);
        this.ao = (ImageButton) inflate.findViewById(R.id.back_button);
        this.ap = (Button) inflate.findViewById(R.id.undo_button);
        this.ak.setOnClickListener(aJ(2, 1));
        this.ak.setText(this.e);
        this.al.setOnClickListener(aJ(2, 2));
        this.al.setText(this.f);
        this.am.setOnClickListener(aJ(2, 3));
        this.am.setText(this.g);
        this.an.setOnClickListener(aJ(2, 4));
        this.an.setText(this.ad);
        this.ao.setOnClickListener(aJ(1, 1));
        this.ao.setContentDescription(this.c);
        this.ap.setText(this.d);
        this.ap.setOnClickListener(aJ(1, 2));
        return inflate;
    }

    @Override // defpackage.fd
    public final void am() {
        super.am();
        this.aj.removeCallbacksAndMessages(null);
    }

    public final cplj d() {
        return (cplj) J();
    }

    public final int e() {
        return this.P.findViewById(R.id.cards_area).getWidth() / this.ai;
    }

    public final boolean f() {
        return od.s(this.P) == 1;
    }

    public final int g() {
        return f() ? -e() : e();
    }

    public final void h(boolean z) {
        this.ak.setEnabled(z);
        this.al.setEnabled(z);
        this.am.setEnabled(z);
        this.an.setEnabled(z);
        this.ao.setEnabled(z);
        this.ap.setEnabled(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r7) {
        /*
            r6 = this;
            int r0 = r7.g
            ckh r1 = r7.d
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel$ButtonState r2 = r7.h
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L23
            java.util.ArrayList<ckd> r2 = r7.c
            int r2 = r2.size()
            if (r2 != 0) goto L18
            if (r0 == r3) goto L16
            goto L18
        L16:
            r0 = 2
            goto L23
        L18:
            if (r0 == r5) goto L23
            if (r1 == 0) goto L21
            boolean r1 = r1.c
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = 1
        L24:
            r6.p(r0, r1)
            int r7 = r7.f
            android.view.View r0 = r6.P
            r1 = 2131429233(0x7f0b0771, float:1.8480133E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            android.view.View r1 = r6.P
            r2 = 2131427531(0x7f0b00cb, float:1.847668E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r2 = 8
            r0.setVisibility(r2)
            r1.setVisibility(r2)
            if (r7 == r5) goto L50
            if (r7 == r3) goto L4c
            return
        L4c:
            r0.setVisibility(r4)
            return
        L50:
            r1.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cplw.i(com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel):void");
    }

    public final void p(int i, boolean z) {
        Button button = (Button) this.P.findViewById(R.id.accept_message_button);
        Button button2 = (Button) this.P.findViewById(R.id.done_button);
        Button button3 = (Button) this.P.findViewById(R.id.next_button);
        Button button4 = (Button) this.P.findViewById(R.id.submit_button);
        button.setVisibility(8);
        button2.setVisibility(8);
        button3.setVisibility(8);
        button4.setVisibility(8);
        if (i != 0) {
            if (i != 1) {
                button = i != 2 ? i != 3 ? i != 4 ? null : button4 : button3 : button2;
            }
            button.setEnabled(z);
            button.setVisibility(0);
        }
    }

    public final void q(ReportAbuseCardConfigParcel reportAbuseCardConfigParcel) {
        ViewGroup viewGroup = (ViewGroup) this.P;
        cplj d = d();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uraw_card, (ViewGroup) viewGroup.findViewById(R.id.cards_area), false);
        ((TextView) inflate.findViewById(R.id.card_header_text)).setText(reportAbuseCardConfigParcel.a);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.card_content_area);
        ArrayList<ckn> arrayList = reportAbuseCardConfigParcel.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ckn cknVar = arrayList.get(i);
            cplk.b(cknVar.g, cknVar.h, 0, cplk.a(cknVar.g), viewGroup2, d);
        }
        ArrayList<ckd> arrayList2 = reportAbuseCardConfigParcel.c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ckd ckdVar = arrayList2.get(i2);
            if (ckdVar.c != 0) {
                cplk.b(ckdVar.b, ckdVar.e, 1, cplk.a(ckdVar.b), viewGroup2, d);
            }
        }
        if (reportAbuseCardConfigParcel.d != null) {
            TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_message, viewGroup2, false);
            textView.setText(reportAbuseCardConfigParcel.d.e);
            viewGroup2.addView(textView);
        }
        ReportAbuseCardConfigParcel.ButtonState buttonState = reportAbuseCardConfigParcel.h;
        if (buttonState != null) {
            ((RadioButton) viewGroup2.getChildAt(buttonState.a)).setChecked(true);
        }
        this.ae.addView(inflate, new RelativeLayout.LayoutParams(viewGroup.getWidth(), (viewGroup.getHeight() - viewGroup.findViewById(R.id.component_header).getHeight()) - viewGroup.findViewById(R.id.footer_buttons_area).getHeight()));
        this.ai++;
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        this.aj = new Handler();
    }

    public final void w() {
        if (this.ae.getChildCount() > 0) {
            for (int i = 0; i < this.ae.getChildCount() - 1; i++) {
                View childAt = this.ae.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    childAt.setFocusable(false);
                    ((ViewGroup) childAt).setDescendantFocusability(ImageMetadata.HOT_PIXEL_MODE);
                }
            }
            LinearLayout linearLayout = this.ae;
            View childAt2 = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if (!(childAt2 instanceof ViewGroup)) {
                return;
            }
            childAt2.setFocusable(true);
            ((ViewGroup) childAt2).setDescendantFocusability(262144);
            View findViewById = childAt2.findViewById(R.id.card_header_text);
            if (findViewById == null) {
                return;
            }
            findViewById.sendAccessibilityEvent(8);
        }
    }
}
