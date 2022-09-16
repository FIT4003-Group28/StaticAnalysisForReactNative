package defpackage;

import com.google.protos.youtube.api.innertube.AdsDebounceCommandOuterClass$AdsDebounceCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eng  reason: default package */
/* loaded from: classes3.dex */
public final class eng implements aafl {
    private final wxc a;
    private final aafo b;

    public eng(wxc wxcVar, aafo aafoVar) {
        wxcVar.getClass();
        this.a = wxcVar;
        aafoVar.getClass();
        this.b = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar == null || !apzgVar.qn(AdsDebounceCommandOuterClass$AdsDebounceCommand.adsDebounceCommand)) {
            return;
        }
        AdsDebounceCommandOuterClass$AdsDebounceCommand adsDebounceCommandOuterClass$AdsDebounceCommand = (AdsDebounceCommandOuterClass$AdsDebounceCommand) apzgVar.qm(AdsDebounceCommandOuterClass$AdsDebounceCommand.adsDebounceCommand);
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.a.d(I)) {
            return;
        }
        apzg apzgVar2 = adsDebounceCommandOuterClass$AdsDebounceCommand.b;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        apzh apzhVar = apzgVar.e;
        if (apzhVar == null) {
            apzhVar = apzh.a;
        }
        if (apzhVar.qn(askh.a)) {
            apzh apzhVar2 = apzgVar.e;
            if (apzhVar2 == null) {
                apzhVar2 = apzh.a;
            }
            asjj asjjVar = (asjj) apzhVar2.qm(askh.a);
            aopc aopcVar = (aopc) apzgVar2.mo52toBuilder();
            apzh apzhVar3 = apzgVar2.e;
            if (apzhVar3 == null) {
                apzhVar3 = apzh.a;
            }
            aopc aopcVar2 = (aopc) apzhVar3.mo52toBuilder();
            aopcVar2.e(askh.a, asjjVar);
            apzh apzhVar4 = (apzh) aopcVar2.mo39build();
            aopcVar.copyOnWrite();
            apzg apzgVar3 = (apzg) aopcVar.instance;
            apzhVar4.getClass();
            apzgVar3.e = apzhVar4;
            apzgVar3.b |= 2;
            apzgVar2 = (apzg) aopcVar.mo39build();
        }
        this.b.c(apzgVar2, map);
        if (!adsDebounceCommandOuterClass$AdsDebounceCommand.c) {
            return;
        }
        this.a.c(I, apel.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE);
    }
}
