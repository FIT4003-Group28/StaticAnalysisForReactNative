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
/* renamed from: mzz  reason: default package */
/* loaded from: classes3.dex */
public final class mzz implements ajru {
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
    private mzy p;
    private mzy q;
    private mzy r;

    /* JADX INFO: Access modifiers changed from: protected */
    public mzz(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, fjn fjnVar, akem akemVar) {
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
        aozy aozyVar;
        auiv auivVar = (auiv) obj;
        ajrsVar.getClass();
        auivVar.getClass();
        this.l.removeAllViews();
        if (this.o.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new mzy(this, R.layout.promoted_sparkles_text_home_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new mzy(this, R.layout.promoted_sparkles_text_home);
            }
            this.r = this.p;
        }
        mzy mzyVar = this.r;
        auik auikVar = auivVar.c;
        if (auikVar == null) {
            auikVar = auik.a;
        }
        auik auikVar2 = auikVar;
        auif[] c = nfj.c(auivVar.d);
        aunb aunbVar = auivVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        atng atngVar = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        apzg apzgVar = null;
        if ((auivVar.b & 4) != 0) {
            aozy aozyVar2 = auivVar.f;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        mzyVar.f = ajrsVar.a;
        aunb aunbVar2 = auikVar2.p;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        apoj apojVar = (apoj) ajjh.l(aunbVar2, ButtonRendererOuterClass.buttonRenderer);
        mxk mxkVar = mzyVar.a;
        if ((auikVar2.b & 2048) != 0 && (apzgVar = auikVar2.n) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, auikVar2.s);
        mzyVar.b.F(ajrsVar.a, auivVar, auivVar.h, auikVar2, c, aozyVar, auivVar.g.I());
        mzyVar.c.d(mzyVar.f, auivVar, auikVar2, atngVar);
        mzyVar.d.c(mzyVar.f, apojVar, atngVar);
        this.l.addView(this.r.e);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mzy mzyVar = this.r;
        mzyVar.getClass();
        mzyVar.b.c();
    }
}
