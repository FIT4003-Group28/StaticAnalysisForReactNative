package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactCompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.PrefilledFormCompanionExtensionRendererOuterClass;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: lzp  reason: default package */
/* loaded from: classes3.dex */
public final class lzp implements wkg, wkf {
    public final aafo a;
    public final wxc b;
    public aqdl c;
    public wzi d;
    private final ajmy e;
    private final acti f;
    private final fjn g;
    private String h = "";
    private boolean i;
    private final lzu j;
    private final lzs k;
    private View l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private ImageView r;
    private fjm s;
    private View t;
    private View u;
    private fjs v;

    public lzp(ajmy ajmyVar, aafo aafoVar, acti actiVar, wxc wxcVar, lzu lzuVar, lzs lzsVar, fjn fjnVar) {
        this.e = ajmyVar;
        this.a = aafoVar;
        this.f = actiVar;
        this.b = wxcVar;
        this.j = lzuVar;
        this.k = lzsVar;
        this.g = fjnVar;
    }

    private final void c(View view) {
        if (view != null) {
            zag.g(view, R.id.compact_companion_card_stub, R.id.compact_companion_card).setVisibility(8);
        }
        aqdl aqdlVar = this.c;
        if (aqdlVar != null && (aqdlVar.b & 256) != 0) {
            aunb aunbVar = aqdlVar.k;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                this.j.b(aunbVar.qm(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer));
            } else if (aunbVar.qn(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer)) {
                this.j.b(aunbVar.qm(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer));
            } else {
                this.j.b(null);
            }
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        fjm fjmVar = this.s;
        if (fjmVar != null) {
            fjmVar.d();
        }
        fjs fjsVar = this.v;
        if (fjsVar != null) {
            fjsVar.d();
        }
        wzi wziVar = this.d;
        if (wziVar != null) {
            wziVar.c();
        }
    }

    private final void g() {
        View view;
        if (!this.i || (view = this.l) == null || this.c == null) {
            return;
        }
        view.setVisibility(0);
    }

    private static final void l(TextView textView, View view, aqdk aqdkVar) {
        if (aqdkVar == null) {
            textView.setText("");
            view.setVisibility(8);
            return;
        }
        arag aragVar = aqdkVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        zag.o(view, aqdkVar.c);
    }

    @Override // defpackage.wke
    public final void a() {
        g();
    }

    public final void b(Object obj, List list) {
        if (!this.b.d(obj)) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c);
            aafx.d(this.a, list, hashMap);
        }
    }

    @Override // defpackage.wke
    public final void d(View view, ajrs ajrsVar) {
        aqdk aqdkVar;
        aqdk aqdkVar2;
        atep atepVar;
        aqgw aqgwVar;
        if (this.c != null) {
            View view2 = this.l;
            if (view2 == null || view2.getParent() != view) {
                c(view);
                View g = zag.g(view, R.id.compact_companion_card_stub, R.id.compact_companion_card);
                this.l = g;
                this.m = (ImageView) g.findViewById(R.id.thumbnail);
                this.n = (TextView) this.l.findViewById(R.id.heading_text);
                this.o = (TextView) this.l.findViewById(R.id.heading_ad_badge);
                this.p = (TextView) this.l.findViewById(R.id.subheading_text);
                this.q = (TextView) this.l.findViewById(R.id.subheading_ad_badge);
                this.r = (ImageView) this.l.findViewById(R.id.contextual_menu_anchor);
                this.u = this.l.findViewById(R.id.action_button);
                this.t = this.l.findViewById(R.id.secondary_button);
            }
            ajmy ajmyVar = this.e;
            ImageView imageView = this.m;
            avhn avhnVar = this.c.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            TextView textView = this.n;
            TextView textView2 = this.o;
            aqdl aqdlVar = this.c;
            if ((aqdlVar.b & 2) != 0) {
                aqdkVar = aqdlVar.d;
                if (aqdkVar == null) {
                    aqdkVar = aqdk.a;
                }
            } else {
                aqdkVar = null;
            }
            l(textView, textView2, aqdkVar);
            TextView textView3 = this.p;
            TextView textView4 = this.q;
            aqdl aqdlVar2 = this.c;
            if ((aqdlVar2.b & 4) != 0) {
                aqdkVar2 = aqdlVar2.e;
                if (aqdkVar2 == null) {
                    aqdkVar2 = aqdk.a;
                }
            } else {
                aqdkVar2 = null;
            }
            l(textView3, textView4, aqdkVar2);
            this.l.setBackgroundColor(this.c.h);
            this.s = this.g.a(new lzo(this, 1), this.u);
            this.v = new fjs(this.t, this.e, null);
            this.d = new wzi(this.l, null);
            aqdl aqdlVar3 = this.c;
            if (aqdlVar3 != null && (aqdlVar3.b & 256) != 0) {
                aunb aunbVar = aqdlVar3.k;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                    this.j.a(this.l, aunbVar.qm(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer));
                } else if (aunbVar.qn(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer)) {
                    this.j.a(this.l, aunbVar.qm(PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer));
                } else {
                    this.j.a(this.l, null);
                }
            }
            aunb aunbVar2 = this.c.f;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            if (aunbVar2.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                fjm fjmVar = this.s;
                aunb aunbVar3 = this.c.f;
                if (aunbVar3 == null) {
                    aunbVar3 = aunb.a;
                }
                fjmVar.a((aoyl) aunbVar3.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer), this.f);
            } else {
                this.s.d();
            }
            aunb aunbVar4 = this.c.g;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            if (aunbVar4.qn(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer)) {
                aunb aunbVar5 = this.c.g;
                if (aunbVar5 == null) {
                    aunbVar5 = aunb.a;
                }
                apau apauVar = (apau) aunbVar5.qm(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer);
                if ((apauVar.b & 8) != 0) {
                    aafo aafoVar = this.a;
                    apzg apzgVar = apauVar.f;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, null);
                    aopa mo52toBuilder = apauVar.mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    apau apauVar2 = (apau) mo52toBuilder.instance;
                    apauVar2.f = null;
                    apauVar2.b &= -9;
                    apauVar = (apau) mo52toBuilder.mo39build();
                    aopa mo52toBuilder2 = this.c.mo52toBuilder();
                    aunb aunbVar6 = this.c.g;
                    if (aunbVar6 == null) {
                        aunbVar6 = aunb.a;
                    }
                    aopc aopcVar = (aopc) aunbVar6.mo52toBuilder();
                    aopcVar.e(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer, apauVar);
                    mo52toBuilder2.copyOnWrite();
                    aqdl aqdlVar4 = (aqdl) mo52toBuilder2.instance;
                    aunb aunbVar7 = (aunb) aopcVar.mo39build();
                    aunbVar7.getClass();
                    aqdlVar4.g = aunbVar7;
                    aqdlVar4.b |= 16;
                    this.c = (aqdl) mo52toBuilder2.mo39build();
                }
                this.v.b(new lzo(this));
                this.v.a(apauVar, this.f);
            } else {
                this.v.d();
            }
            lzs lzsVar = this.k;
            View rootView = this.l.getRootView();
            ImageView imageView2 = this.r;
            aunb aunbVar8 = this.c.i;
            if (aunbVar8 == null) {
                aunbVar8 = aunb.a;
            }
            if (aunbVar8.qn(MenuRendererOuterClass.menuRenderer)) {
                aunb aunbVar9 = this.c.i;
                if (aunbVar9 == null) {
                    aunbVar9 = aunb.a;
                }
                atepVar = (atep) aunbVar9.qm(MenuRendererOuterClass.menuRenderer);
            } else {
                atepVar = null;
            }
            aqdl aqdlVar5 = this.c;
            if ((aqdlVar5.b & 2048) != 0) {
                aqgw aqgwVar2 = aqdlVar5.n;
                if (aqgwVar2 == null) {
                    aqgwVar2 = aqgw.a;
                }
                aqgwVar = aqgwVar2;
            } else {
                aqgwVar = null;
            }
            lzsVar.a(rootView, imageView2, atepVar, aqgwVar, this.c, acti.l);
            this.l.setOnClickListener(new View.OnClickListener() { // from class: lzn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    lzp lzpVar = lzp.this;
                    aqdl aqdlVar6 = lzpVar.c;
                    if (aqdlVar6 == null || (aqdlVar6.b & 128) == 0) {
                        return;
                    }
                    apzg apzgVar2 = aqdlVar6.j;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    lzpVar.b(aqdlVar6, amuk.r(apzgVar2));
                }
            });
            this.f.u(new acte(this.c.o), null);
            aafo aafoVar2 = this.a;
            aqdl aqdlVar6 = this.c;
            aafx.c(aafoVar2, aqdlVar6.l, aqdlVar6);
            aopa mo52toBuilder3 = this.c.mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            ((aqdl) mo52toBuilder3.instance).l = aqdl.emptyProtobufList();
            this.c = (aqdl) mo52toBuilder3.mo39build();
            g();
        }
    }

    @Override // defpackage.wke
    public final void e(View view) {
        this.h = "";
        this.i = false;
        c(view);
        this.c = null;
    }

    @Override // defpackage.wke
    public final void f() {
        this.i = true;
        g();
    }

    @Override // defpackage.wke
    public final void h(wxo wxoVar) {
        aafo aafoVar = this.a;
        aqdl aqdlVar = this.c;
        apzg apzgVar = null;
        if (aqdlVar != null && (aqdlVar.b & 512) != 0 && (apzgVar = aqdlVar.m) == null) {
            apzgVar = apzg.a;
        }
        man.c(aafoVar, aqdlVar, apzgVar, this.v);
    }

    @Override // defpackage.wkg
    public final boolean i(String str, aqfd aqfdVar, asit asitVar) {
        this.h = str;
        this.c = null;
        if ((aqfdVar.b & 8) != 0) {
            aqdl aqdlVar = aqfdVar.f;
            if (aqdlVar == null) {
                aqdlVar = aqdl.a;
            }
            this.c = aqdlVar;
            return true;
        }
        return false;
    }

    @Override // defpackage.wkf
    public final boolean j(String str, aunb aunbVar) {
        this.h = str;
        if (aunbVar == null || !aunbVar.qn(CompactCompanionAdRendererOuterClass.compactCompanionAdRenderer)) {
            return false;
        }
        this.c = (aqdl) aunbVar.qm(CompactCompanionAdRendererOuterClass.compactCompanionAdRenderer);
        return true;
    }

    @Override // defpackage.wkf
    public final boolean k(aunb aunbVar, boolean z) {
        if (!j(this.h, aunbVar)) {
            return false;
        }
        this.i = true;
        return true;
    }
}
