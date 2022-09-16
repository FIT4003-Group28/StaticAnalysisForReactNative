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
/* renamed from: nbx  reason: default package */
/* loaded from: classes3.dex */
public final class nbx implements ajru {
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
    private nbw n;
    private nbr o;
    private boolean p;

    /* JADX INFO: Access modifiers changed from: protected */
    public nbx(Context context, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajyc ajycVar, wwk wwkVar, tjv tjvVar, wxc wxcVar, enm enmVar, yni yniVar, fjn fjnVar, akem akemVar) {
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
        apzg apzgVar;
        aozy aozyVar2;
        aujf aujfVar = (aujf) obj;
        int d = d(ajrsVar);
        this.k.removeAllViews();
        boolean z = d > 1 || !aujfVar.f;
        this.p = z;
        if (z) {
            if (this.n == null) {
                this.n = new nbw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            nbw nbwVar = this.n;
            aujfVar.getClass();
            nbwVar.h = ajrsVar.a;
            auik auikVar = aujfVar.c;
            if (auikVar == null) {
                auikVar = auik.a;
            }
            aunb aunbVar = auikVar.p;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apoj apojVar = (apoj) ajjh.l(aunbVar, ButtonRendererOuterClass.buttonRenderer);
            aunb aunbVar2 = aujfVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atng atngVar = (atng) ajjh.l(aunbVar2, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
            mxk mxkVar = nbwVar.a;
            auik auikVar2 = aujfVar.c;
            if (auikVar2 == null) {
                auikVar2 = auik.a;
            }
            if ((auikVar2.b & 2048) != 0) {
                auik auikVar3 = aujfVar.c;
                if (auikVar3 == null) {
                    auikVar3 = auik.a;
                }
                apzgVar = auikVar3.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = null;
            }
            auik auikVar4 = aujfVar.c;
            if (auikVar4 == null) {
                auikVar4 = auik.a;
            }
            mxkVar.a(apzgVar, auikVar4.s);
            nck nckVar = nbwVar.b;
            acti actiVar = ajrsVar.a;
            String str = aujfVar.i;
            auik auikVar5 = aujfVar.c;
            if (auikVar5 == null) {
                auikVar5 = auik.a;
            }
            auik auikVar6 = auikVar5;
            auif[] auifVarArr = (auif[]) aujfVar.d.toArray(new auif[0]);
            if ((aujfVar.b & 8) != 0) {
                aozy aozyVar3 = aujfVar.g;
                if (aozyVar3 == null) {
                    aozyVar3 = aozy.a;
                }
                aozyVar2 = aozyVar3;
            } else {
                aozyVar2 = null;
            }
            nckVar.F(actiVar, aujfVar, str, auikVar6, auifVarArr, aozyVar2, aujfVar.h.I());
            auik auikVar7 = aujfVar.c;
            if (auikVar7 == null) {
                auikVar7 = auik.a;
            }
            nbwVar.c.d(ajrsVar.a, aujfVar, auikVar7, atngVar);
            int d2 = d(ajrsVar);
            nbwVar.e.postInvalidate();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nbwVar.g.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) nbwVar.f.getLayoutParams();
            Resources resources = nbwVar.e.getResources();
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
            nbwVar.d.c(nbwVar.h, apojVar, atngVar);
            this.k.addView(this.n.e);
            return;
        }
        if (this.o == null) {
            this.o = new nbr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null, this.l, this.m);
        }
        nbr nbrVar = this.o;
        aujfVar.getClass();
        String str2 = aujfVar.i;
        auik auikVar8 = aujfVar.c;
        if (auikVar8 == null) {
            auikVar8 = auik.a;
        }
        auik auikVar9 = auikVar8;
        auif[] auifVarArr2 = (auif[]) aujfVar.d.toArray(new auif[0]);
        aunb aunbVar3 = aujfVar.e;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        atng atngVar2 = (atng) ajjh.l(aunbVar3, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        if ((aujfVar.b & 8) != 0) {
            aozy aozyVar4 = aujfVar.g;
            if (aozyVar4 == null) {
                aozyVar4 = aozy.a;
            }
            aozyVar = aozyVar4;
        } else {
            aozyVar = null;
        }
        nbrVar.d(ajrsVar, aujfVar, str2, auikVar9, auifVarArr2, atngVar2, aozyVar, aujfVar.h.I());
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
