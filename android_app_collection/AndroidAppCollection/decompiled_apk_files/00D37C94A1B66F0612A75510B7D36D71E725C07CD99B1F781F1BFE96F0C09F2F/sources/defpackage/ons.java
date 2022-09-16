package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: ons  reason: default package */
/* loaded from: classes3.dex */
public final class ons extends ajsl {
    public final egn a;
    public awcn b;
    public int c;
    private final aafo d;
    private final acti e;
    private final Context f;
    private final View g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;

    public ons(aafo aafoVar, acti actiVar, Context context, egn egnVar, ViewGroup viewGroup) {
        this.d = aafoVar;
        this.e = actiVar;
        this.a = egnVar;
        this.f = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_break, viewGroup, false);
        this.g = inflate;
        this.h = (TextView) inflate.findViewById(R.id.heading);
        this.i = (TextView) inflate.findViewById(R.id.notice);
        TextView textView = (TextView) inflate.findViewById(R.id.primary_button);
        this.j = textView;
        textView.setOnClickListener(new onr(this, 1));
        TextView textView2 = (TextView) inflate.findViewById(R.id.secondary_button);
        this.k = textView2;
        textView2.setOnClickListener(new onr(this));
        this.l = (ImageView) inflate.findViewById(R.id.reminder_icon);
        this.c = 1;
    }

    private static void g(TextView textView, aunb aunbVar) {
        arag aragVar;
        if (!aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            textView.setVisibility(8);
            return;
        }
        apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        if ((apojVar.b & 256) != 0) {
            aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        awcn awcnVar = (awcn) obj;
        this.b = awcnVar;
        if ((awcnVar.b & 16) != 0) {
            int W = awwc.W(awcnVar.g);
            if (W == 0) {
                W = 1;
            }
            this.c = W;
        }
        TextView textView = this.h;
        arag aragVar = this.b.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.i;
        arag aragVar2 = this.b.d;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, aafv.a(aragVar2, this.d, false));
        TextView textView3 = this.j;
        aunb aunbVar = this.b.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        g(textView3, aunbVar);
        TextView textView4 = this.k;
        aunb aunbVar2 = this.b.f;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        g(textView4, aunbVar2);
        TextView textView5 = this.j;
        zag.k(textView5, textView5.getBackground());
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            this.l.setImageDrawable(zhn.g(this.f, R.attr.bedtimeSlothIcon));
        } else {
            this.l.setImageDrawable(zhn.g(this.f, R.attr.takeABreakIcon));
        }
        int i2 = this.c;
        if (i2 == 0) {
            throw null;
        }
        if (i2 != 3) {
            return;
        }
        this.a.d(apnc.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awcn) obj).h.I();
    }

    public final void f(aunb aunbVar) {
        apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        if ((apojVar.b & 32768) != 0) {
            aafo aafoVar = this.d;
            apzg apzgVar = apojVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            this.e.H(3, new acte(apojVar.t), null);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
