package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: kko  reason: default package */
/* loaded from: classes3.dex */
final class kko implements View.OnClickListener {
    final /* synthetic */ kkq a;
    private final /* synthetic */ int b;

    public kko(kkq kkqVar) {
        this.a = kkqVar;
    }

    public kko(kkq kkqVar, int i) {
        this.b = i;
        this.a = kkqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            kkq kkqVar = this.a;
            Object obj = kkqVar.p;
            if (obj == null) {
                kkqVar.k("Expanded view has null renderer on click");
                return;
            }
            apzb apzbVar = ((apza) obj).d;
            if (apzbVar == null) {
                apzbVar = apzb.a;
            }
            aunb aunbVar = apzbVar.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                return;
            }
            apzb apzbVar2 = ((apza) this.a.p).d;
            if (apzbVar2 == null) {
                apzbVar2 = apzb.a;
            }
            aunb aunbVar2 = apzbVar2.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aoyl aoylVar = (aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            ArrayList arrayList = new ArrayList(aoylVar.n);
            if ((aoylVar.b & 512) != 0) {
                apzg apzgVar = aoylVar.m;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                arrayList.add(apzgVar);
            }
            this.a.a(aoylVar, arrayList);
            return;
        }
        kkq kkqVar2 = this.a;
        Object obj2 = kkqVar2.p;
        if (obj2 == null) {
            kkqVar2.k("Thumbnail view has null renderer on click");
            return;
        }
        apyz apyzVar = ((apza) obj2).e;
        if (apyzVar == null) {
            apyzVar = apyz.a;
        }
        aunb aunbVar3 = apyzVar.b;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (!aunbVar3.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            return;
        }
        apyz apyzVar2 = ((apza) this.a.p).e;
        if (apyzVar2 == null) {
            apyzVar2 = apyz.a;
        }
        aunb aunbVar4 = apyzVar2.b;
        if (aunbVar4 == null) {
            aunbVar4 = aunb.a;
        }
        aoyl aoylVar2 = (aoyl) aunbVar4.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        ArrayList arrayList2 = new ArrayList(aoylVar2.n);
        if ((aoylVar2.b & 512) != 0) {
            apzg apzgVar2 = aoylVar2.m;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            arrayList2.add(apzgVar2);
        }
        this.a.a(aoylVar2, arrayList2);
    }
}
