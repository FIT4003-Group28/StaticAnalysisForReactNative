package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: ipo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ipo implements amqo {
    public final /* synthetic */ ipr a;
    private final /* synthetic */ int b;

    public /* synthetic */ ipo(ipr iprVar, int i) {
        this.b = i;
        this.a = iprVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        if (this.b == 0) {
            ipr iprVar = this.a;
            PaneDescriptor a = iprVar.c.a(iprVar.aM());
            a.m(iprVar.ag);
            return a;
        }
        ipr iprVar2 = this.a;
        if (iprVar2.ag) {
            return iprVar2.d.a();
        }
        aopa createBuilder = apnv.a.createBuilder();
        createBuilder.copyOnWrite();
        apnv apnvVar = (apnv) createBuilder.instance;
        apnvVar.b |= 1;
        apnvVar.c = "FEhistory";
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) createBuilder.mo39build());
        return iprVar2.c.a((apzg) aopcVar.mo39build());
    }
}
