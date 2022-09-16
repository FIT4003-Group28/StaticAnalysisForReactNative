package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yds  reason: default package */
/* loaded from: classes4.dex */
public final class yds extends ajsl implements DialogInterface.OnDismissListener {
    public final Runnable a;
    public final Runnable b;
    public final View c;
    public int d = 0;
    private final LayoutInflater e;
    private final aafo f;
    private final Map g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final LinearLayout l;
    private final TextView m;
    private final akbm n;
    private final TextView o;
    private final akbm p;
    private awjf q;

    public yds(Context context, aafo aafoVar, akbn akbnVar, Runnable runnable, Runnable runnable2, Map map) {
        this.f = aafoVar;
        this.a = runnable;
        this.b = runnable2;
        this.g = map;
        LayoutInflater from = LayoutInflater.from(context);
        this.e = from;
        View inflate = from.inflate(R.layout.upgrade_dialog, (ViewGroup) null, false);
        this.c = inflate;
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (TextView) inflate.findViewById(R.id.offer_display_title);
        this.j = (TextView) inflate.findViewById(R.id.access_message);
        this.k = (TextView) inflate.findViewById(R.id.legal_text);
        this.l = (LinearLayout) inflate.findViewById(R.id.billing_details_container);
        TextView textView = (TextView) inflate.findViewById(R.id.continue_button);
        this.m = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.cancel_button);
        this.o = textView2;
        this.n = akbnVar.a(textView);
        this.p = akbnVar.a(textView2);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        apoj apojVar;
        awjf awjfVar = (awjf) obj;
        acti actiVar = ajrsVar.a;
        this.q = awjfVar;
        TextView textView = this.h;
        awje awjeVar = awjfVar.c;
        if (awjeVar == null) {
            awjeVar = awje.a;
        }
        arag aragVar2 = awjeVar.b;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView.setText(ajgl.b(aragVar2));
        TextView textView2 = this.i;
        awje awjeVar2 = awjfVar.c;
        if (awjeVar2 == null) {
            awjeVar2 = awje.a;
        }
        arag aragVar3 = awjeVar2.c;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar3));
        TextView textView3 = this.j;
        awje awjeVar3 = awjfVar.c;
        if (awjeVar3 == null) {
            awjeVar3 = awje.a;
        }
        arag aragVar4 = awjeVar3.d;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        textView3.setText(ajgl.b(aragVar4));
        TextView textView4 = this.k;
        if ((awjfVar.b & 2) != 0) {
            aragVar = awjfVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView4, ajgl.b(aragVar));
        this.l.removeAllViews();
        for (awjd awjdVar : awjfVar.d) {
            View inflate = this.e.inflate(R.layout.billing_item, (ViewGroup) null, false);
            TextView textView5 = (TextView) inflate.findViewById(R.id.title);
            arag aragVar5 = awjdVar.b;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
            textView5.setText(ajgl.b(aragVar5));
            TextView textView6 = (TextView) inflate.findViewById(R.id.subtitle);
            arag aragVar6 = awjdVar.c;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            textView6.setText(ajgl.b(aragVar6));
            TextView textView7 = (TextView) inflate.findViewById(R.id.description);
            arag aragVar7 = awjdVar.d;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
            textView7.setText(ajgl.b(aragVar7));
            this.l.addView(inflate);
        }
        if ((awjfVar.b & 8) == 0) {
            this.o.setVisibility(8);
        } else {
            akbm akbmVar = this.p;
            aunb aunbVar = awjfVar.g;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            akbmVar.b((apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer), actiVar);
            this.p.d = new ydr(this, 1);
        }
        akbm akbmVar2 = this.n;
        aunb aunbVar2 = awjfVar.f;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar3 = awjfVar.f;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            apojVar = (apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        akbmVar2.a(apojVar, actiVar, this.g);
        this.n.d = new ydr(this);
        if (awjfVar.h.size() != 0) {
            this.f.d(awjfVar.h, null);
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awjf) obj).j.I();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.q.i.size() == 0 || this.d == 1) {
            return;
        }
        this.f.d(this.q.i, null);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
