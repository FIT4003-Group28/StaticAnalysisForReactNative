package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: nlu  reason: default package */
/* loaded from: classes3.dex */
public final class nlu implements nlw {
    public final nlt a;
    private final Context b;
    private final axnm c;
    private final ajhl d;
    private final acti e;
    private final asjj f;
    private final aqti g;
    private FrameLayout h;

    public nlu(Context context, ajhl ajhlVar, axnm axnmVar, acti actiVar, asjj asjjVar, nlt nltVar, aqti aqtiVar) {
        this.b = context;
        this.d = ajhlVar;
        this.c = axnmVar;
        this.e = actiVar;
        this.f = asjjVar;
        this.g = aqtiVar;
        this.a = nltVar;
    }

    private final void f() {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            zgd.t(frameLayout, zgd.s(-1, -2), FrameLayout.LayoutParams.class);
            zgd.t(this.h, zgd.g(80), FrameLayout.LayoutParams.class);
            return;
        }
        nls nlsVar = new nls(this, this.b);
        this.h = nlsVar;
        nlsVar.setVisibility(8);
    }

    @Override // defpackage.nlw
    public final ViewGroup a() {
        f();
        return this.h;
    }

    @Override // defpackage.nnc
    public final void d() {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    @Override // defpackage.nnc
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.nnc
    public final void h() {
        f();
        if (this.h.getChildCount() > 0) {
            this.h.setVisibility(0);
            return;
        }
        aunb aunbVar = this.g.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qm(ElementRendererOuterClass.elementRenderer) == null) {
            return;
        }
        this.h.setVisibility(0);
        ajin ajinVar = (ajin) this.c.get();
        ajhh a = ajhh.a((aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer));
        ajrs ajrsVar = new ajrs();
        ajrsVar.g(new HashMap());
        ajrsVar.a(this.e);
        asjj asjjVar = this.f;
        if (asjjVar != null) {
            ajrsVar.c = asjjVar;
        }
        this.h.addView(this.d.a(), 0);
        this.d.oK(ajrsVar, a);
    }

    @Override // defpackage.nnc
    public final void pc() {
        d();
    }

    @Override // defpackage.nnc
    public final void pd() {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.h.setVisibility(8);
        }
        this.d.qZ(null);
    }
}
