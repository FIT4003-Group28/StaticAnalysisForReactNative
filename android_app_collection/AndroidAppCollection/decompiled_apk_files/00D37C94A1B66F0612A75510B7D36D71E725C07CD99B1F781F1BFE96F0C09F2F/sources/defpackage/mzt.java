package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
/* compiled from: PG */
/* renamed from: mzt  reason: default package */
/* loaded from: classes3.dex */
public final class mzt implements ajru {
    private final Context a;
    private final ajmy b;
    private final aafo c;
    private final ajxz d;
    private final ajyc e;
    private final wwk f;
    private final tjv g;
    private final wxc h;
    private final enm i;
    private final yni j;
    private final FrameLayout k;
    private final fjn l;
    private final akem m;
    private mzs n;
    private mzh o;
    private boolean p;

    /* JADX INFO: Access modifiers changed from: protected */
    public mzt(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, fjn fjnVar, akem akemVar) {
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
        this.k = new FrameLayout(context);
        this.l = fjnVar;
        this.m = akemVar;
    }

    public static int d(ajrs ajrsVar) {
        Object c = ajrsVar.c("horizontalShelfColumnCountSupplier");
        if (c instanceof ajxu) {
            return ((ajxu) c).a();
        }
        return 1;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.k;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aozy aozyVar;
        apoj apojVar;
        apzg apzgVar;
        aozy aozyVar2;
        auiu auiuVar = (auiu) obj;
        int d = d(ajrsVar);
        this.k.removeAllViews();
        boolean z = d > 1 || !auiuVar.f;
        this.p = z;
        if (z) {
            if (this.n == null) {
                this.n = new mzs(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            mzs mzsVar = this.n;
            auiuVar.getClass();
            mzsVar.h = ajrsVar.a;
            auil auilVar = auiuVar.c;
            if (auilVar == null) {
                auilVar = auil.a;
            }
            aunb aunbVar = auilVar.s;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                auil auilVar2 = auiuVar.c;
                if (auilVar2 == null) {
                    auilVar2 = auil.a;
                }
                aunb aunbVar2 = auilVar2.s;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
            } else {
                apojVar = null;
            }
            aunb aunbVar3 = auiuVar.e;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            atng atngVar = (atng) ajjh.l(aunbVar3, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
            mxk mxkVar = mzsVar.a;
            auil auilVar3 = auiuVar.c;
            if (auilVar3 == null) {
                auilVar3 = auil.a;
            }
            if ((auilVar3.b & 32768) != 0) {
                auil auilVar4 = auiuVar.c;
                if (auilVar4 == null) {
                    auilVar4 = auil.a;
                }
                apzgVar = auilVar4.q;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = null;
            }
            auil auilVar5 = auiuVar.c;
            if (auilVar5 == null) {
                auilVar5 = auil.a;
            }
            mxkVar.a(apzgVar, auilVar5.v);
            nck nckVar = mzsVar.b;
            acti actiVar = ajrsVar.a;
            String str = auiuVar.i;
            auil auilVar6 = auiuVar.c;
            if (auilVar6 == null) {
                auilVar6 = auil.a;
            }
            auil auilVar7 = auilVar6;
            auif[] auifVarArr = (auif[]) auiuVar.d.toArray(new auif[0]);
            if ((auiuVar.b & 8) != 0) {
                aozy aozyVar3 = auiuVar.g;
                if (aozyVar3 == null) {
                    aozyVar3 = aozy.a;
                }
                aozyVar2 = aozyVar3;
            } else {
                aozyVar2 = null;
            }
            nckVar.G(actiVar, auiuVar, str, auilVar7, auifVarArr, aozyVar2, auiuVar.h.I());
            auil auilVar8 = auiuVar.c;
            if (auilVar8 == null) {
                auilVar8 = auil.a;
            }
            mzsVar.c.v(mzsVar.h, auiuVar, auilVar8, atngVar);
            int d2 = d(ajrsVar);
            mzsVar.e.postInvalidate();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mzsVar.g.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) mzsVar.f.getLayoutParams();
            Resources resources = mzsVar.e.getResources();
            if (d2 > 1) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                layoutParams2.width = 0;
                layoutParams2.weight = d2 - 1;
            } else {
                layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
                layoutParams.weight = 0.0f;
                layoutParams2.width = -2;
                layoutParams2.weight = 1.0f;
            }
            mzsVar.d.c(mzsVar.h, apojVar, atngVar);
            this.k.addView(this.n.e);
            return;
        }
        if (this.o == null) {
            this.o = new mzh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null, this.l, this.m);
        }
        mzh mzhVar = this.o;
        auiuVar.getClass();
        String str2 = auiuVar.i;
        auil auilVar9 = auiuVar.c;
        if (auilVar9 == null) {
            auilVar9 = auil.a;
        }
        auil auilVar10 = auilVar9;
        auif[] auifVarArr2 = (auif[]) auiuVar.d.toArray(new auif[0]);
        aunb aunbVar4 = auiuVar.e;
        if (aunbVar4 == null) {
            aunbVar4 = aunb.a;
        }
        atng atngVar2 = (atng) ajjh.l(aunbVar4, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        if ((auiuVar.b & 8) != 0) {
            aozy aozyVar4 = auiuVar.g;
            if (aozyVar4 == null) {
                aozyVar4 = aozy.a;
            }
            aozyVar = aozyVar4;
        } else {
            aozyVar = null;
        }
        mzhVar.d(ajrsVar, auiuVar, str2, auilVar10, auifVarArr2, atngVar2, aozyVar, auiuVar.h.I());
        this.k.addView(this.o.c);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if (this.p) {
            this.n.b.c();
        } else {
            this.o.qZ(ajsaVar);
        }
    }
}
