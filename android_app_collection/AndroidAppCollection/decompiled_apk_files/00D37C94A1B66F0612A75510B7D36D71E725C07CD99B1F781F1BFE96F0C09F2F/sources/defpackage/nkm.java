package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: nkm  reason: default package */
/* loaded from: classes3.dex */
public final class nkm implements nlx {
    private final Context a;
    private final axnm b;
    private final ajhl c;
    private final acti d;
    private final asjj e;
    private final apdo f;
    private aqtb g;
    private ViewGroup h;
    private ajhh i;

    public nkm(Context context, ajhl ajhlVar, axnm axnmVar, acti actiVar, asjj asjjVar, apdo apdoVar) {
        this.a = context;
        this.b = axnmVar;
        this.c = ajhlVar;
        this.d = actiVar;
        this.f = apdoVar;
        this.e = asjjVar;
    }

    private final void m() {
        if (this.h != null) {
            return;
        }
        this.h = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.ads_engagement_panel_elements_header, (ViewGroup) null, false);
    }

    @Override // defpackage.nlx
    public final View a() {
        return null;
    }

    @Override // defpackage.nlx
    public final View b() {
        m();
        return this.h;
    }

    @Override // defpackage.nlx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.nlx
    public final void d() {
        acti actiVar = this.d;
        aunb aunbVar = this.f.b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        actiVar.D(new acte(((aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer)).e));
        if (this.i != null) {
            return;
        }
        m();
        aunb aunbVar2 = this.f.b;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (!aunbVar2.qn(ElementRendererOuterClass.elementRenderer)) {
            this.h.setVisibility(8);
            return;
        }
        aunb aunbVar3 = this.f.b;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        this.g = (aqtb) aunbVar3.qm(ElementRendererOuterClass.elementRenderer);
        this.h.setVisibility(0);
        ajin ajinVar = (ajin) this.b.get();
        this.i = ajhh.a(this.g);
        ajrs ajrsVar = new ajrs();
        ajrsVar.g(new HashMap());
        ajrsVar.a(this.d);
        asjj asjjVar = this.e;
        if (asjjVar != null) {
            ajrsVar.c = asjjVar;
        }
        this.h.addView(this.c.a());
        this.c.oK(ajrsVar, this.i);
    }

    @Override // defpackage.nlx
    public final void e(boolean z) {
    }

    @Override // defpackage.nlx
    public final void f(auxr auxrVar) {
    }

    @Override // defpackage.nlx
    public final void g(nma nmaVar) {
    }

    @Override // defpackage.nlx
    public final void h(nly nlyVar) {
    }

    @Override // defpackage.nlx
    public final void i(CharSequence charSequence) {
    }

    @Override // defpackage.nlx
    public final void j(CharSequence charSequence) {
    }

    @Override // defpackage.nlx
    public final boolean k() {
        return false;
    }

    @Override // defpackage.nlx
    public final void l(nmn nmnVar) {
    }
}
