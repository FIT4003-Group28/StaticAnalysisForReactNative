package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: isd  reason: default package */
/* loaded from: classes3.dex */
public final class isd {
    private final fcl a;
    private final ind b;
    private final jsc c;
    private final ise d;
    private final sdb e;

    public isd(sdb sdbVar, fcl fclVar, ind indVar, jsc jscVar, ise iseVar, byte[] bArr) {
        this.e = sdbVar;
        this.a = fclVar;
        this.b = indVar;
        this.c = jscVar;
        this.d = iseVar;
    }

    public final PaneDescriptor a(apzg apzgVar) {
        PaneFragmentPanelDescriptor b;
        boolean z = false;
        if (this.e.a && this.a.h()) {
            z = true;
        }
        PaneDescriptor a = this.b.a(apzgVar);
        a.m(z);
        PaneFragmentPanelDescriptor b2 = PaneFragmentPanelDescriptor.b(a);
        if (z) {
            b = PaneFragmentPanelDescriptor.b(this.c.a());
        } else {
            aopa createBuilder = apnv.a.createBuilder();
            createBuilder.copyOnWrite();
            apnv apnvVar = (apnv) createBuilder.instance;
            apnvVar.b = 1 | apnvVar.b;
            apnvVar.c = "FEhistory";
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) createBuilder.mo39build());
            b = PaneFragmentPanelDescriptor.b(this.b.a((apzg) aopcVar.mo39build()));
        }
        ise iseVar = this.d;
        Bundle a2 = PaneDescriptor.a();
        a2.putParcelable("panels_configuration", PanelsConfiguration.c(b2, b));
        return PaneDescriptor.c(iseVar.a, apzgVar, a2);
    }
}
