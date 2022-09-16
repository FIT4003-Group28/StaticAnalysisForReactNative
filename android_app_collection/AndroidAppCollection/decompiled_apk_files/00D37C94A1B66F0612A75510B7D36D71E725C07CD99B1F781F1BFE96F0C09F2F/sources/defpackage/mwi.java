package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: mwi  reason: default package */
/* loaded from: classes3.dex */
public final class mwi implements ajru {
    public final Context a;
    public final ajmy b;
    public final aafo c;
    public final ajxz d;
    public final ajyc e;
    public final wwk f;
    public final tjv g;
    public final wxc h;
    public final yni i;
    public final enm j;
    public final ViewGroup k;
    public final FrameLayout l;
    public final fjn m;
    public final akem n;
    private final Resources o;
    private mwh p;
    private mwh q;
    private mwh r;

    /* JADX INFO: Access modifiers changed from: protected */
    public mwi(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, yni yniVar, ViewGroup viewGroup, enm enmVar, fjn fjnVar, akem akemVar) {
        this.a = context;
        this.b = ajmyVar;
        this.c = aafoVar;
        this.d = ajxzVar;
        this.e = ajycVar;
        this.f = wwkVar;
        this.g = tjvVar;
        this.h = wxcVar;
        this.i = yniVar;
        this.j = enmVar;
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
        aozy aozyVar;
        apoj apojVar;
        apzg apzgVar;
        auhr auhrVar = (auhr) obj;
        ajrsVar.getClass();
        auhrVar.getClass();
        this.l.removeAllViews();
        if (this.o.getBoolean(R.bool.discovery_app_promo_compact_form_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new mwh(this, R.layout.promoted_discovery_app_promo_compact_form_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new mwh(this, R.layout.promoted_discovery_app_promo_compact_form_portrait);
            }
            this.r = this.p;
        }
        mwh mwhVar = this.r;
        auhs auhsVar = auhrVar.c;
        if (auhsVar == null) {
            auhsVar = auhs.a;
        }
        auhs auhsVar2 = auhsVar;
        auif[] c = nfj.c(auhrVar.d);
        if ((auhrVar.b & 2) != 0) {
            aozy aozyVar2 = auhrVar.e;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        mwhVar.f = ajrsVar.a;
        aunb aunbVar = auhsVar2.m;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = auhsVar2.m;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        mxk mxkVar = mwhVar.a;
        if ((auhsVar2.b & 256) != 0) {
            apzgVar = auhsVar2.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        apzg apzgVar2 = auhsVar2.l;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        mxkVar.b = apzgVar;
        mxkVar.c = amuk.r(apzgVar2);
        mwhVar.b.E(ajrsVar.a, auhrVar, auhrVar.g, auhsVar2, c, aozyVar, auhrVar.f.I());
        mwhVar.c.c(mwhVar.f, auhrVar, auhsVar2);
        mwhVar.d.c(mwhVar.f, apojVar, null);
        this.l.addView(this.r.e);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mwh mwhVar = this.r;
        mwhVar.getClass();
        mwhVar.b.c();
    }
}
