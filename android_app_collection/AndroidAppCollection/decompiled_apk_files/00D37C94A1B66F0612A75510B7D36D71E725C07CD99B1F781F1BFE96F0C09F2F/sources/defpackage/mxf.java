package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
/* compiled from: PG */
/* renamed from: mxf  reason: default package */
/* loaded from: classes3.dex */
public class mxf extends mxd {
    protected final ajmy m;
    protected final ajxz n;
    protected final View o;
    protected final View p;
    protected final View q;
    protected final View r;
    protected final TextView s;
    protected final View t;
    protected final frf u;
    protected final fjm v;
    public boolean w;
    private final boolean x;
    private final ggw y;

    /* JADX INFO: Access modifiers changed from: protected */
    public mxf(Context context, ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, boolean z, boolean z2, fjn fjnVar, akem akemVar) {
        super(context, ajycVar, view, view2, z2, akemVar);
        this.m = ajmyVar;
        this.n = ajxzVar;
        this.x = z;
        View findViewById = view2.findViewById(R.id.cta_button_wrapper);
        this.o = findViewById;
        this.p = findViewById.findViewById(R.id.cta_button_start_filler);
        this.q = findViewById.findViewById(R.id.cta_button_touchable_wrapper);
        this.r = findViewById.findViewById(R.id.cta_button_end_filler);
        TextView textView = (TextView) findViewById.findViewById(R.id.cta_button);
        this.s = textView;
        View findViewById2 = findViewById.findViewById(R.id.ad_cta_button);
        this.t = findViewById2;
        frf h = mxt.h(view.getContext());
        this.u = h;
        view.setBackground(h);
        zag.k(textView, textView.getBackground());
        if (findViewById2 != null) {
            this.v = fjnVar.a(null, findViewById2);
        } else {
            this.v = null;
        }
        this.y = new ggw(new Handler());
        this.w = false;
    }

    private final void a() {
        this.y.a();
    }

    public static void o(View view, View view2, View view3, View view4, View view5, auij auijVar) {
        auij auijVar2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
        ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
        if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || !(layoutParams3 instanceof LinearLayout.LayoutParams) || !(layoutParams4 instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams2;
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams3;
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams4;
        if (auijVar != null) {
            aopa mo52toBuilder = auijVar.mo52toBuilder();
            float f = auijVar.d;
            if (f < 0.0f) {
                mo52toBuilder.copyOnWrite();
                auij auijVar3 = (auij) mo52toBuilder.instance;
                auijVar3.b |= 2;
                auijVar3.d = 0.0f;
            } else if (f > 1.0f) {
                mo52toBuilder.copyOnWrite();
                auij auijVar4 = (auij) mo52toBuilder.instance;
                auijVar4.b |= 2;
                auijVar4.d = 1.0f;
            }
            auijVar2 = (auij) mo52toBuilder.mo39build();
        } else {
            auijVar2 = null;
        }
        if (auijVar2 == null) {
            layoutParams.width = -2;
            layoutParams6.width = 0;
            layoutParams7.width = -2;
            layoutParams8.width = 0;
            layoutParams5.width = -2;
            layoutParams6.weight = 0.0f;
            layoutParams7.weight = 0.0f;
            layoutParams8.weight = 0.0f;
        } else if (auijVar2.d == 1.0f) {
            layoutParams.width = -1;
            layoutParams6.width = 0;
            layoutParams7.width = -1;
            layoutParams8.width = 0;
            layoutParams5.width = -1;
            layoutParams6.weight = 0.0f;
            layoutParams7.weight = 0.0f;
            layoutParams8.weight = 0.0f;
        } else {
            layoutParams.width = -1;
            layoutParams6.width = 0;
            layoutParams7.width = -2;
            layoutParams8.width = 0;
            layoutParams5.width = -1;
            float f2 = auijVar2.d;
            float f3 = 1.0f - f2;
            layoutParams7.weight = f2;
            int bV = awwc.bV(auijVar2.c);
            if (bV == 0) {
                bV = 1;
            }
            int i = bV - 1;
            if (i == 2) {
                layoutParams6.weight = f3;
                layoutParams8.weight = 0.0f;
            } else if (i == 3) {
                float f4 = f3 / 2.0f;
                layoutParams6.weight = f4;
                layoutParams8.weight = f4;
            } else {
                layoutParams6.weight = 0.0f;
                layoutParams8.weight = f3;
            }
        }
        view.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    private final void q(Spanned spanned, aoyl aoylVar, auij auijVar, boolean z) {
        TextView textView;
        TextView textView2;
        View view;
        View view2;
        View view3;
        boolean z2 = false;
        if (aoylVar == null) {
            zag.m(this.s, spanned);
            textView = this.s;
            View view4 = this.o;
            if (spanned != null) {
                z2 = true;
            }
            zag.o(view4, z2);
            View view5 = this.t;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        } else if (this.t == null || this.v == null) {
            this.o.setVisibility(8);
            textView = null;
        } else {
            this.o.setVisibility(0);
            this.s.setVisibility(8);
            this.t.setVisibility(0);
            ?? r8 = this.t;
            this.v.c(aoylVar);
            textView2 = r8;
            this.w = true;
            if (this.x && this.o.getVisibility() == 0 && (view = this.p) != null && (view2 = this.q) != null && (view3 = this.r) != null && textView2 != null) {
                o(this.o, view, view2, view3, textView2, auijVar);
            }
            this.u.e(z);
        }
        textView2 = textView;
        this.w = true;
        if (this.x) {
            o(this.o, view, view2, view3, textView2, auijVar);
        }
        this.u.e(z);
    }

    private final boolean r() {
        return (this.t == null || this.v == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(acti actiVar, Object obj, auhs auhsVar, auht auhtVar, boolean z) {
        aoyl aoylVar;
        Spanned b;
        super.c(actiVar, obj, auhsVar);
        aunb aunbVar = auhtVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        auij auijVar = null;
        if (aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aunb aunbVar2 = auhtVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aoylVar = (aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aoylVar = null;
        }
        if (aoylVar == null) {
            b = null;
        } else {
            arag aragVar = aoylVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            b = ajgl.b(aragVar);
        }
        if (z) {
            if ((auhtVar.b & 8) != 0 && (auijVar = auhtVar.f) == null) {
                auijVar = auij.a;
            }
        } else if ((auhtVar.b & 4) != 0 && (auijVar = auhtVar.e) == null) {
            auijVar = auij.a;
        }
        q(b, aoylVar, auijVar, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxd
    public void c(acti actiVar, Object obj, auhs auhsVar) {
        super.c(actiVar, obj, auhsVar);
        q(null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(acti actiVar, Object obj, auiy auiyVar, atng atngVar) {
        arag aragVar;
        arag aragVar2;
        auhy auhyVar;
        atep atepVar;
        aoyl aoylVar;
        auij auijVar;
        auiyVar.getClass();
        if ((auiyVar.b & 8) != 0) {
            aragVar = auiyVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((auiyVar.b & 16) != 0) {
            aragVar2 = auiyVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        if ((auiyVar.b & 32768) != 0) {
            auhy auhyVar2 = auiyVar.s;
            if (auhyVar2 == null) {
                auhyVar2 = auhy.a;
            }
            auhyVar = auhyVar2;
        } else {
            auhyVar = null;
        }
        aunb aunbVar = auiyVar.n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        boolean z = aunbVar.qn(ButtonRendererOuterClass.buttonRenderer) && atngVar != null;
        aunb aunbVar2 = auiyVar.n;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(MenuRendererOuterClass.menuRenderer)) {
            aunb aunbVar3 = auiyVar.n;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            atepVar = (atep) aunbVar3.qm(MenuRendererOuterClass.menuRenderer);
        } else {
            atepVar = null;
        }
        super.e(actiVar, obj, b, b2, auhyVar, z, atepVar);
        aunb aunbVar4 = auiyVar.k;
        if (aunbVar4 == null) {
            aunbVar4 = aunb.a;
        }
        if (aunbVar4.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aunb aunbVar5 = auiyVar.k;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            aoylVar = (aoyl) aunbVar5.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aoylVar = null;
        }
        if ((auiyVar.b & 65536) != 0) {
            auijVar = auiyVar.t;
            if (auijVar == null) {
                auijVar = auij.a;
            }
        } else {
            auijVar = null;
        }
        q(null, aoylVar, auijVar, auiyVar.r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(acti actiVar, Object obj, aujb aujbVar, atng atngVar) {
        arag aragVar;
        arag aragVar2;
        auhy auhyVar;
        atep atepVar;
        aoyl aoylVar;
        aujbVar.getClass();
        if ((aujbVar.b & 1) != 0) {
            aragVar = aujbVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((aujbVar.b & 2) != 0) {
            aragVar2 = aujbVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        if ((aujbVar.b & 128) != 0) {
            auhy auhyVar2 = aujbVar.l;
            if (auhyVar2 == null) {
                auhyVar2 = auhy.a;
            }
            auhyVar = auhyVar2;
        } else {
            auhyVar = null;
        }
        aunb aunbVar = aujbVar.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        boolean z = aunbVar.qn(ButtonRendererOuterClass.buttonRenderer) && atngVar != null;
        aunb aunbVar2 = aujbVar.h;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(MenuRendererOuterClass.menuRenderer)) {
            aunb aunbVar3 = aujbVar.h;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            atepVar = (atep) aunbVar3.qm(MenuRendererOuterClass.menuRenderer);
        } else {
            atepVar = null;
        }
        super.e(actiVar, obj, b, b2, auhyVar, z, atepVar);
        aunb aunbVar4 = aujbVar.m;
        if (aunbVar4 == null) {
            aunbVar4 = aunb.a;
        }
        if (aunbVar4.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aunb aunbVar5 = aujbVar.m;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            aoylVar = (aoyl) aunbVar5.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aoylVar = null;
        }
        q(null, aoylVar, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(acti actiVar, Object obj, auik auikVar, atng atngVar, Integer num) {
        aopa aopaVar;
        arag aragVar;
        super.d(actiVar, obj, auikVar, atngVar);
        aunb aunbVar = auikVar.i;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        auij auijVar = null;
        if (aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aunb aunbVar2 = auikVar.i;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aopaVar = ((aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)).mo52toBuilder();
        } else {
            aopaVar = null;
        }
        if (aopaVar != null) {
            aoyl aoylVar = (aoyl) aopaVar.instance;
            if ((aoylVar.b & 1) != 0) {
                arag aragVar2 = aoylVar.e;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                if ((aragVar2.b & 1) != 0 && num != null) {
                    int intValue = num.intValue();
                    aopaVar.copyOnWrite();
                    aoyl aoylVar2 = (aoyl) aopaVar.instance;
                    aoylVar2.c = 3;
                    aoylVar2.d = Integer.valueOf(intValue);
                }
            }
        }
        if ((auikVar.b & 32) != 0) {
            aragVar = auikVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        aoyl aoylVar3 = aopaVar != null ? (aoyl) aopaVar.mo39build() : null;
        if ((auikVar.b & 262144) != 0 && (auijVar = auikVar.v) == null) {
            auijVar = auij.a;
        }
        q(b, aoylVar3, auijVar, auikVar.t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(acti actiVar, Object obj, auil auilVar, atng atngVar, Integer num) {
        arag aragVar;
        arag aragVar2;
        auhy auhyVar;
        atep atepVar;
        aopa aopaVar;
        arag aragVar3;
        auilVar.getClass();
        auij auijVar = null;
        if ((auilVar.b & 16) != 0) {
            aragVar = auilVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((auilVar.b & 512) != 0) {
            aragVar2 = auilVar.k;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        if ((auilVar.b & 2097152) != 0) {
            auhy auhyVar2 = auilVar.x;
            if (auhyVar2 == null) {
                auhyVar2 = auhy.a;
            }
            auhyVar = auhyVar2;
        } else {
            auhyVar = null;
        }
        aunb aunbVar = auilVar.s;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        boolean z = aunbVar.qn(ButtonRendererOuterClass.buttonRenderer) && atngVar != null;
        aunb aunbVar2 = auilVar.s;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(MenuRendererOuterClass.menuRenderer)) {
            aunb aunbVar3 = auilVar.s;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            atepVar = (atep) aunbVar3.qm(MenuRendererOuterClass.menuRenderer);
        } else {
            atepVar = null;
        }
        super.e(actiVar, obj, b, b2, auhyVar, z, atepVar);
        aunb aunbVar4 = auilVar.m;
        if (aunbVar4 == null) {
            aunbVar4 = aunb.a;
        }
        if (aunbVar4.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aunb aunbVar5 = auilVar.m;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            aopaVar = ((aoyl) aunbVar5.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)).mo52toBuilder();
        } else {
            aopaVar = null;
        }
        if (aopaVar != null) {
            arag aragVar4 = ((aoyl) aopaVar.instance).e;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            if ((aragVar4.b & 1) != 0 && num != null) {
                int intValue = num.intValue();
                aopaVar.copyOnWrite();
                aoyl aoylVar = (aoyl) aopaVar.instance;
                aoylVar.c = 3;
                aoylVar.d = Integer.valueOf(intValue);
            }
        }
        if ((auilVar.b & 1024) != 0) {
            aragVar3 = auilVar.l;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        Spanned b3 = ajgl.b(aragVar3);
        aoyl aoylVar2 = aopaVar != null ? (aoyl) aopaVar.mo39build() : null;
        if ((auilVar.b & 4194304) != 0 && (auijVar = auilVar.y) == null) {
            auijVar = auij.a;
        }
        q(b3, aoylVar2, auijVar, auilVar.w);
    }

    public final void m(auik auikVar) {
        a();
        if (!r() || (auikVar.b & 64) == 0 || this.w) {
            return;
        }
        aunb aunbVar = auikVar.i;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        this.v.c((aoyl) aunbVar.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
        this.w = true;
    }

    public final void n(auil auilVar) {
        a();
        if (!r() || (auilVar.b & 2048) == 0 || this.w) {
            return;
        }
        aunb aunbVar = auilVar.m;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        this.v.c((aoyl) aunbVar.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
        this.w = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(acti actiVar, Object obj, auik auikVar, auhp auhpVar, boolean z) {
        aoyl aoylVar;
        Spanned b;
        auij auijVar = null;
        super.d(actiVar, obj, auikVar, null);
        aunb aunbVar = auhpVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aunb aunbVar2 = auhpVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aoylVar = (aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aoylVar = null;
        }
        if (aoylVar == null) {
            b = null;
        } else {
            arag aragVar = aoylVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            b = ajgl.b(aragVar);
        }
        if (z) {
            if ((auhpVar.b & 8) != 0 && (auijVar = auhpVar.f) == null) {
                auijVar = auij.a;
            }
        } else if ((auhpVar.b & 4) != 0 && (auijVar = auhpVar.e) == null) {
            auijVar = auij.a;
        }
        q(b, aoylVar, auijVar, true);
    }

    public final aynr g(int i, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, auik auikVar, boolean z) {
        if (i != 0 || z) {
            if (r() && (auikVar.b & 128) != 0 && this.w) {
                aunb aunbVar = auikVar.j;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                this.y.c(new mxe(this, (aoyl) aunbVar.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)), auikVar.k);
            }
            return inlinePlaybackLifecycleController.h();
        }
        m(auikVar);
        return aynr.f();
    }

    public final aynr h(int i, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, auil auilVar, boolean z) {
        if (i != 0 || z) {
            if (r() && (auilVar.b & 8192) != 0 && this.w) {
                aunb aunbVar = auilVar.o;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                this.y.c(new mxe(this, (aoyl) aunbVar.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer), 1), auilVar.n);
            }
            return inlinePlaybackLifecycleController.h();
        }
        n(auilVar);
        return aynr.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public mxf(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, boolean z, fjn fjnVar, akem akemVar) {
        this(null, ajmyVar, ajxzVar, ajycVar, view, view2, z, false, fjnVar, akemVar);
    }
}
