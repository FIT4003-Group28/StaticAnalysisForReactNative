package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: yey  reason: default package */
/* loaded from: classes4.dex */
public final class yey implements ajru, xyl {
    private final LayoutInflater a;
    private final ajrx b;
    private final aafo c;
    private final TextView d;
    private final TextView e;
    private final akbm f;
    private final akbm g;
    private final akbm h;
    private final xyn i;
    private avnv j;
    private final LinearLayout k;
    private final LinkedList l;

    public yey(Context context, yef yefVar, akbn akbnVar, aafo aafoVar, xyn xynVar) {
        this.b = yefVar;
        this.c = aafoVar;
        this.i = xynVar;
        LayoutInflater from = LayoutInflater.from(context);
        this.a = from;
        View inflate = from.inflate(R.layout.unlimited_manage_subscription_page, (ViewGroup) null);
        this.d = (TextView) inflate.findViewById(R.id.subscription_title);
        this.e = (TextView) inflate.findViewById(R.id.additional_info);
        this.f = akbnVar.a((TextView) inflate.findViewById(R.id.manage_family_button));
        this.g = akbnVar.a((TextView) inflate.findViewById(R.id.manage_subscription_button));
        this.h = akbnVar.a((TextView) inflate.findViewById(R.id.manage_fix_fop_button));
        this.k = (LinearLayout) inflate.findViewById(R.id.details_list_container);
        this.l = new LinkedList();
        yefVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((yef) this.b).a;
    }

    @Override // defpackage.xyl
    public final void d(boolean z) {
        if (z) {
            avnv avnvVar = this.j;
            if ((avnvVar.b & 64) == 0) {
                return;
            }
            aafo aafoVar = this.c;
            apzg apzgVar = avnvVar.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }

    @Override // defpackage.xym
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apoj apojVar;
        apoj apojVar2;
        LinearLayout linearLayout;
        avnv avnvVar = (avnv) obj;
        this.i.c(this);
        if (akzj.f(this.j, avnvVar)) {
            return;
        }
        this.j = avnvVar;
        acti actiVar = ajrsVar.a;
        apoj apojVar3 = null;
        actiVar.u(new acte(avnvVar.h), null);
        TextView textView = this.d;
        arag aragVar = avnvVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        this.k.removeAllViews();
        for (int i = 0; i < avnvVar.d.size(); i++) {
            if ((((avnx) avnvVar.d.get(i)).b & 1) != 0) {
                avnw avnwVar = ((avnx) avnvVar.d.get(i)).c;
                if (avnwVar == null) {
                    avnwVar = avnw.a;
                }
                if (i < this.l.size()) {
                    linearLayout = (LinearLayout) this.l.get(i);
                } else {
                    linearLayout = (LinearLayout) this.a.inflate(R.layout.unlimited_manage_subscription_page_offer_item, (ViewGroup) null);
                    this.l.add(linearLayout);
                }
                TextView textView2 = (TextView) linearLayout.findViewById(R.id.title);
                arag aragVar2 = avnwVar.b;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                zag.m(textView2, ajgl.b(aragVar2));
                TextView textView3 = (TextView) linearLayout.findViewById(R.id.content);
                arag aragVar3 = avnwVar.c;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                zag.m(textView3, ajgl.b(aragVar3));
                this.k.addView(linearLayout);
            }
        }
        zag.m(this.e, avnvVar.f.isEmpty() ? null : ajgl.j(TextUtils.concat(System.getProperty("line.separator")), aafv.d(avnvVar.f, this.c)));
        akbm akbmVar = this.f;
        avnu avnuVar = avnvVar.i;
        if (avnuVar == null) {
            avnuVar = avnu.a;
        }
        if (avnuVar.b == 65153809) {
            avnu avnuVar2 = avnvVar.i;
            if (avnuVar2 == null) {
                avnuVar2 = avnu.a;
            }
            if (avnuVar2.b == 65153809) {
                apojVar = (apoj) avnuVar2.c;
            } else {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        akbmVar.b(apojVar, actiVar);
        akbm akbmVar2 = this.g;
        apok apokVar = avnvVar.e;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = avnvVar.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
        } else {
            apojVar2 = null;
        }
        akbmVar2.b(apojVar2, actiVar);
        akbm akbmVar3 = this.h;
        aunb aunbVar = avnvVar.g;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = avnvVar.g;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apojVar3 = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        }
        akbmVar3.b(apojVar3, actiVar);
        this.b.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.i.d(this);
    }
}
