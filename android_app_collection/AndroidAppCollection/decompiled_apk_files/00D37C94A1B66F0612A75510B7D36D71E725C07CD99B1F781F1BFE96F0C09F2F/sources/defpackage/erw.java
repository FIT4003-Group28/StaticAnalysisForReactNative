package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowTooltipCommandOuterClass;
import com.google.protos.youtube.api.innertube.TooltipRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: erw  reason: default package */
/* loaded from: classes3.dex */
public final class erw implements aafl {
    public static final /* synthetic */ int a = 0;
    private final akfc b;
    private final acth c;
    private final akfw d;

    public erw(akfc akfcVar, acth acthVar, akfw akfwVar) {
        this.b = akfcVar;
        this.c = acthVar;
        this.d = akfwVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        auvv auvvVar = (auvv) apzgVar.qm(ShowTooltipCommandOuterClass.showTooltipCommand);
        if ((auvvVar.b & 1) != 0) {
            Object I = zew.I(map, "hint_anchor_tag");
            aunb aunbVar = auvvVar.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(HintRendererOuterClass.hintRenderer) || !(I instanceof View)) {
                aunb aunbVar2 = auvvVar.c;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                if (!aunbVar2.qn(TooltipRendererOuterClass.tooltipRenderer)) {
                    return;
                }
                akfw akfwVar = this.d;
                aunb aunbVar3 = auvvVar.c;
                if (aunbVar3 == null) {
                    aunbVar3 = aunb.a;
                }
                akfwVar.e((avjf) aunbVar3.qm(TooltipRendererOuterClass.tooltipRenderer), ejw.k);
                return;
            }
            akfc akfcVar = this.b;
            aunb aunbVar4 = auvvVar.c;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            akfcVar.b((argj) aunbVar4.qm(HintRendererOuterClass.hintRenderer), (View) I, zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.c.oi());
        }
    }
}
