package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: nat  reason: default package */
/* loaded from: classes3.dex */
public final class nat implements ajru {
    public final Context a;
    public final ajmy b;
    public final aafo c;
    public final ajxz d;
    public final ajyc e;
    public final wwk f;
    public final tjv g;
    public final wxc h;
    public final enm i;
    public final yni j;
    public final ViewGroup k;
    public final FrameLayout l;
    public final fjn m;
    public final akem n;
    private final Resources o;
    private nas p;
    private nas q;
    private nas r;

    /* JADX INFO: Access modifiers changed from: protected */
    public nat(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, fjn fjnVar, akem akemVar) {
        this.a = context;
        this.b = ajmyVar;
        this.c = aafoVar;
        this.d = ajxzVar;
        this.e = ajycVar;
        this.f = wwkVar;
        this.g = tjvVar;
        this.h = wxcVar;
        this.i = enmVar;
        this.j = yniVar;
        this.o = context.getResources();
        this.k = viewGroup;
        this.l = new FrameLayout(context);
        this.m = fjnVar;
        this.n = akemVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.l;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        atng atngVar;
        aozy aozyVar;
        apoj apojVar;
        auiz auizVar = (auiz) obj;
        ajrsVar.getClass();
        auizVar.getClass();
        this.l.removeAllViews();
        if (this.o.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new nas(this, R.layout.promoted_sparkles_text_product_home_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new nas(this, R.layout.promoted_sparkles_text_product_home);
            }
            this.r = this.p;
        }
        nas nasVar = this.r;
        auiy auiyVar = auizVar.c;
        if (auiyVar == null) {
            auiyVar = auiy.a;
        }
        auiy auiyVar2 = auiyVar;
        auif[] c = nfj.c(auizVar.d);
        aunb aunbVar = auizVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apzg apzgVar = null;
        if (aunbVar.qn(MutedSparklesRendererOuterClass.mutedSparklesRenderer)) {
            aunb aunbVar2 = auizVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atngVar = (atng) aunbVar2.qm(MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atngVar = null;
        }
        if ((auizVar.b & 4) != 0) {
            aozy aozyVar2 = auizVar.f;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        byte[] I = auizVar.g.I();
        nasVar.f = ajrsVar.a;
        aunb aunbVar3 = auiyVar2.n;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar4 = auiyVar2.n;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            apojVar = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        mxk mxkVar = nasVar.a;
        if ((auiyVar2.b & 512) != 0 && (apzgVar = auiyVar2.l) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, auiyVar2.q);
        nasVar.b.H(ajrsVar.a, auizVar, auizVar.h, auiyVar2, c, aozyVar, I);
        nasVar.c.i(nasVar.f, auizVar, auiyVar2, atngVar);
        nasVar.d.c(nasVar.f, apojVar, atngVar);
        this.l.addView(this.r.e);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        nas nasVar = this.r;
        nasVar.getClass();
        nasVar.b.c();
    }
}
