package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: mad  reason: default package */
/* loaded from: classes3.dex */
public final class mad implements lzt {
    public augk a;
    private final ajmy b;
    private final aafo c;
    private final acti d;
    private final wxc e;
    private final ajgj f;
    private final fjn g;
    private fjm h;
    private wzi i;
    private View j;
    private View k;
    private View l;
    private TextView m;
    private TextView n;
    private ImageView o;

    public mad(ajmy ajmyVar, aafo aafoVar, acti actiVar, wxc wxcVar, Context context, fjn fjnVar) {
        ajmyVar.getClass();
        this.b = ajmyVar;
        aafoVar.getClass();
        this.c = aafoVar;
        actiVar.getClass();
        this.d = actiVar;
        wxcVar.getClass();
        this.e = wxcVar;
        ajgi a = ajgj.a();
        a.a = context;
        a.c = new ajve(aafoVar);
        this.f = a.a();
        this.g = fjnVar;
    }

    @Override // defpackage.lzt
    public final /* bridge */ /* synthetic */ void a(View view, Object obj) {
        avhn avhnVar;
        augk augkVar = (augk) obj;
        if (augkVar == null) {
            return;
        }
        arag aragVar = null;
        if (this.j == null) {
            View g = zag.g(view, R.id.prefilled_form_companion_extension_stub, R.id.prefilled_form_companion_extension);
            this.j = g;
            this.m = (TextView) g.findViewById(R.id.prefilled_input_text);
            this.o = (ImageView) this.j.findViewById(R.id.edit_icon);
            this.k = this.j.findViewById(R.id.ad_cta_button);
            this.n = (TextView) this.j.findViewById(R.id.disclaimer);
            this.l = this.j.findViewById(R.id.prefilled_input);
            this.i = new wzi(this.j, null);
            this.h = this.g.a(new fjp() { // from class: mac
                @Override // defpackage.fjp
                public final void a(Object obj2, List list) {
                    mad.this.c(obj2, list);
                }
            }, this.k);
        }
        this.a = augkVar;
        this.d.u(new acte(this.a.j), null);
        aafo aafoVar = this.c;
        augk augkVar2 = this.a;
        aafx.c(aafoVar, augkVar2.k, augkVar2);
        aopa mo52toBuilder = this.a.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((augk) mo52toBuilder.instance).k = augk.emptyProtobufList();
        augk augkVar3 = (augk) mo52toBuilder.mo39build();
        this.a = augkVar3;
        ajmy ajmyVar = this.b;
        ImageView imageView = this.o;
        if ((augkVar3.b & 2) != 0) {
            avhnVar = augkVar3.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.m;
        augk augkVar4 = this.a;
        if ((augkVar4.b & 1) != 0 && (aragVar = augkVar4.c) == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.n;
        arag aragVar2 = this.a.i;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.d(aragVar2, this.f));
        this.l.setBackgroundColor(this.a.f);
        this.j.setBackgroundColor(this.a.g);
        aunb aunbVar = this.a.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            fjm fjmVar = this.h;
            aunb aunbVar2 = this.a.h;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            fjmVar.a((aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer), this.d);
        }
        this.l.setOnClickListener(new View.OnClickListener() { // from class: mab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mad madVar = mad.this;
                augk augkVar5 = madVar.a;
                if (augkVar5 == null || (augkVar5.b & 4) == 0) {
                    return;
                }
                apzg apzgVar = augkVar5.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                madVar.c(augkVar5, amuk.r(apzgVar));
            }
        });
        this.j.setVisibility(0);
    }

    @Override // defpackage.lzt
    public final void b() {
        this.e.b(this.a);
        View view = this.j;
        if (view != null) {
            view.setVisibility(8);
            this.i.c();
            this.h.d();
        }
        this.j = null;
        this.a = null;
    }

    public final void c(Object obj, List list) {
        if (this.e.d(obj)) {
            return;
        }
        aafo aafoVar = this.c;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{this.i});
        aafx.d(aafoVar, list, hashMap);
    }
}
