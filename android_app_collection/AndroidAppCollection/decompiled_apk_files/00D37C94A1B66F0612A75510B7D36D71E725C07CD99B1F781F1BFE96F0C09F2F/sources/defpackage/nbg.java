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
/* renamed from: nbg  reason: default package */
/* loaded from: classes3.dex */
public final class nbg implements ajru {
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
    private nbf p;
    private nbf q;
    private nbf r;

    /* JADX INFO: Access modifiers changed from: protected */
    public nbg(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, fjn fjnVar, akem akemVar) {
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
        aujc aujcVar = (aujc) obj;
        ajrsVar.getClass();
        aujcVar.getClass();
        this.l.removeAllViews();
        if (this.o.getBoolean(R.bool.sparkles_text_on_search_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new nbf(this, R.layout.promoted_sparkles_text_search_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new nbf(this, R.layout.promoted_sparkles_text_search_potrait);
            }
            this.r = this.p;
        }
        nbf nbfVar = this.r;
        aujb aujbVar = aujcVar.c;
        if (aujbVar == null) {
            aujbVar = aujb.a;
        }
        aujb aujbVar2 = aujbVar;
        auif[] auifVarArr = (auif[]) aujcVar.d.toArray(new auif[0]);
        aunb aunbVar = aujcVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apzg apzgVar = null;
        if (aunbVar.qn(MutedSparklesRendererOuterClass.mutedSparklesRenderer)) {
            aunb aunbVar2 = aujcVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atngVar = (atng) aunbVar2.qm(MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atngVar = null;
        }
        if ((aujcVar.b & 4) != 0) {
            aozy aozyVar2 = aujcVar.f;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        nbfVar.f = ajrsVar.a;
        aunb aunbVar3 = aujbVar2.h;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar4 = aujbVar2.h;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            apojVar = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        mxk mxkVar = nbfVar.a;
        if ((aujbVar2.b & 8) != 0 && (apzgVar = aujbVar2.f) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, aujbVar2.k);
        nck nckVar = nbfVar.b;
        acti actiVar = ajrsVar.a;
        String str = aujcVar.h;
        byte[] I = aujcVar.g.I();
        aopu aopuVar = aujbVar2.g;
        apnp apnpVar = aujbVar2.j;
        if (apnpVar == null) {
            apnpVar = apnp.a;
        }
        nckVar.I(actiVar, aujcVar, str, aopuVar, auifVarArr, apnpVar, aujbVar2.i, aozyVar, I);
        nbfVar.c.j(nbfVar.f, aujcVar, aujbVar2, atngVar);
        nbfVar.d.c(nbfVar.f, apojVar, atngVar);
        this.l.addView(this.r.e);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        nbf nbfVar = this.r;
        nbfVar.getClass();
        nbfVar.b.c();
    }
}
