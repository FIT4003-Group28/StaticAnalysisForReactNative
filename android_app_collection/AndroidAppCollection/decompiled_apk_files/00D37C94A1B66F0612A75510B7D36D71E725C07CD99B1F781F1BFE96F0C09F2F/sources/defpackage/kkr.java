package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: kkr  reason: default package */
/* loaded from: classes3.dex */
public final class kkr implements kkc {
    public final ajhl a;
    public aqtb b;
    public ViewGroup c;
    public aqtf d;
    public ajhh e;
    private final axnm f;
    private final acti g;

    public kkr(axnm axnmVar, ajhl ajhlVar, acti actiVar) {
        axnmVar.getClass();
        this.f = axnmVar;
        this.a = ajhlVar;
        this.g = actiVar;
    }

    @Override // defpackage.kkc
    public final void b(View view) {
        if (this.c != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) zag.g(view, R.id.elements_ad_cta_overlay_stub, R.id.elements_ad_cta_overlay);
        this.c = viewGroup;
        viewGroup.setVisibility(8);
    }

    @Override // defpackage.kkc
    public final void c() {
        aqtb aqtbVar;
        aqtf aqtfVar = this.d;
        if (aqtfVar == null || this.c == null) {
            return;
        }
        aunb aunbVar = aqtfVar.b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
            aunb aunbVar2 = this.d.b;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aqtbVar = (aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer);
        } else {
            aqtbVar = null;
        }
        this.b = aqtbVar;
        this.c.addView(this.a.a());
    }

    @Override // defpackage.kkc
    public final void d() {
        throw null;
    }

    @Override // defpackage.kkc
    public final void e(boolean z) {
    }

    @Override // defpackage.kkc
    public final void f(wlv wlvVar) {
    }

    @Override // defpackage.kkc
    public final void g(int i, boolean z) {
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            return;
        }
        if (i != 2) {
            viewGroup.setVisibility(8);
        } else if (this.b == null) {
            viewGroup.setVisibility(8);
        } else if (this.e != null) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(0);
            ajrs ajrsVar = new ajrs();
            ajrsVar.g(new HashMap());
            ajrsVar.a(this.g);
            ajin ajinVar = (ajin) this.f.get();
            ajhh a = ajhh.a(this.b);
            this.e = a;
            this.a.oK(ajrsVar, a);
        }
    }
}
