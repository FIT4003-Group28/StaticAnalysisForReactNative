package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: hey  reason: default package */
/* loaded from: classes3.dex */
public final class hey {
    private final aafo a;

    public hey(aafo aafoVar) {
        this.a = aafoVar;
    }

    public final void a(acti actiVar, actj actjVar) {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopg aopgVar = BrowseEndpointOuterClass.browseEndpoint;
        aopa createBuilder = apnv.a.createBuilder();
        createBuilder.copyOnWrite();
        apnv apnvVar = (apnv) createBuilder.instance;
        apnvVar.b |= 1;
        apnvVar.c = "FEsfv_audio_picker";
        createBuilder.copyOnWrite();
        apnv apnvVar2 = (apnv) createBuilder.instance;
        apnvVar2.b |= 4;
        apnvVar2.d = "";
        aopcVar.e(aopgVar, (apnv) createBuilder.mo39build());
        aoob aoobVar = aoob.b;
        aopcVar.copyOnWrite();
        apzg apzgVar = (apzg) aopcVar.instance;
        aoobVar.getClass();
        apzgVar.b |= 1;
        apzgVar.c = aoobVar;
        this.a.a(gyq.d(actiVar, (apzg) aopcVar.mo39build(), actjVar.II));
    }
}
