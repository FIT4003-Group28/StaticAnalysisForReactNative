package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gni  reason: default package */
/* loaded from: classes3.dex */
public final class gni implements aafl {
    private final aafo a;
    private final acth b;
    private final wxc c;

    public gni(aafo aafoVar, acth acthVar, wxc wxcVar) {
        this.a = aafoVar;
        this.b = acthVar;
        wxcVar.getClass();
        this.c = wxcVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aopa createBuilder;
        if (!apzgVar.qn(AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.adsClickWrapperCommand)) {
            return;
        }
        AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand adsClickWrapperCommandOuterClass$AdsClickWrapperCommand = (AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand) apzgVar.qm(AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.adsClickWrapperCommand);
        apby apbyVar = adsClickWrapperCommandOuterClass$AdsClickWrapperCommand.d;
        if (apbyVar == null) {
            apbyVar = apby.a;
        }
        if (apbyVar.b && this.c.d(zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"))) {
            return;
        }
        apzh apzhVar = apzgVar.e;
        if (apzhVar == null) {
            apzhVar = apzh.a;
        }
        if (apzhVar.qn(askh.a)) {
            createBuilder = ((asjj) apzhVar.qm(askh.a)).mo52toBuilder();
        } else {
            createBuilder = asjj.a.createBuilder();
        }
        if (apbyVar.e && apzhVar.qn(asjb.b)) {
            asjb asjbVar = (asjb) apzhVar.qm(asjb.b);
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asjbVar.getClass();
            asjjVar.w = asjbVar;
            asjjVar.c |= 8192;
        }
        asjj asjjVar2 = (asjj) createBuilder.mo39build();
        if (apbyVar.d) {
            this.b.oi().H(3, new acte(apzgVar.c), true != asjj.a.equals(asjjVar2) ? asjjVar2 : null);
        }
        if (apbyVar.c && apzhVar.qn(asjb.b)) {
            View view = (View) zew.I(map, "com.google.android.libraries.youtube.rendering.elements.sender_view");
            if (view != null) {
                asjb asjbVar2 = (asjb) apzhVar.qm(asjb.b);
                wzi wziVar = new wzi(view);
                wziVar.d(asjbVar2.d, asjbVar2.e);
                map.put("MacrosConverters.CustomConvertersKey", new afzn[]{wziVar});
            } else {
                afus.b(2, 1, "The AdsClickWrapperCommandResolver has no View set in its event data.");
            }
        }
        if ((adsClickWrapperCommandOuterClass$AdsClickWrapperCommand.b & 1) == 0) {
            return;
        }
        apzg apzgVar2 = adsClickWrapperCommandOuterClass$AdsClickWrapperCommand.c;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        if (!asjj.a.equals(asjjVar2)) {
            aopc aopcVar = (aopc) apzgVar2.mo52toBuilder();
            aopc aopcVar2 = (aopc) apzh.a.createBuilder();
            aopcVar2.e(askh.a, asjjVar2);
            apzh apzhVar2 = (apzh) aopcVar2.mo39build();
            aopcVar.copyOnWrite();
            apzg apzgVar3 = (apzg) aopcVar.instance;
            apzhVar2.getClass();
            apzgVar3.e = apzhVar2;
            apzgVar3.b |= 2;
            apzgVar2 = (apzg) aopcVar.mo39build();
        }
        this.a.c(apzgVar2, map);
    }
}
