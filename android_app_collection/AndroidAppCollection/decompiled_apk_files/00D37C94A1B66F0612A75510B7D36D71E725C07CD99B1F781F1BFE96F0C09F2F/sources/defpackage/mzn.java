package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: mzn  reason: default package */
/* loaded from: classes3.dex */
public final class mzn implements ajru {
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
    private mzm o;

    /* JADX INFO: Access modifiers changed from: protected */
    public mzn(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, ViewGroup viewGroup, fjn fjnVar, akem akemVar) {
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
        apoj apojVar;
        auit auitVar = (auit) obj;
        ajrsVar.getClass();
        auitVar.getClass();
        this.l.removeAllViews();
        if (this.o == null) {
            this.o = new mzm(this);
        }
        mzm mzmVar = this.o;
        auif[] auifVarArr = (auif[]) auitVar.d.toArray(new auif[0]);
        apzg apzgVar = null;
        String str = (auitVar.b & 64) != 0 ? auitVar.h : null;
        auil auilVar = auitVar.c;
        if (auilVar == null) {
            auilVar = auil.a;
        }
        auil auilVar2 = auilVar;
        if ((auitVar.b & 2) != 0) {
            aunb aunbVar = auitVar.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            atngVar = (atng) ajjh.l(aunbVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atngVar = null;
        }
        aozy aozyVar = auitVar.f;
        if (aozyVar == null) {
            aozyVar = aozy.a;
        }
        aozy aozyVar2 = aozyVar;
        byte[] I = auitVar.g.I();
        mzmVar.g = ajrsVar.a;
        aunb aunbVar2 = auilVar2.s;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar3 = auilVar2.s;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            apojVar = (apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        mxk mxkVar = mzmVar.a;
        if ((auilVar2.b & 32768) != 0 && (apzgVar = auilVar2.q) == null) {
            apzgVar = apzg.a;
        }
        mxkVar.a(apzgVar, auilVar2.v);
        mzmVar.b.G(ajrsVar.a, auitVar, str, auilVar2, auifVarArr, aozyVar2, I);
        mzmVar.c.l(mzmVar.g, auitVar, auilVar2, atngVar, Integer.valueOf(zhn.j(mzmVar.f.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        mzmVar.d.c(mzmVar.g, apojVar, atngVar);
        this.l.addView(this.o.e);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mzm mzmVar = this.o;
        mzmVar.getClass();
        mzmVar.b.c();
    }
}
