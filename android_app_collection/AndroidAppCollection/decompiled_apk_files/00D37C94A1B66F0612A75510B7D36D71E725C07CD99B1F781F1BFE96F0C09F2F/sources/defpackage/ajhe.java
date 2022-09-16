package defpackage;

import com.google.protos.youtube.api.innertube.DismissDialogEndpointOuterClass$DismissDialogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajhe  reason: default package */
/* loaded from: classes.dex */
public final class ajhe implements aafl {
    private final ajgz a;

    public ajhe(ajgz ajgzVar) {
        this.a = ajgzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        DismissDialogEndpointOuterClass$DismissDialogEndpoint dismissDialogEndpointOuterClass$DismissDialogEndpoint = (DismissDialogEndpointOuterClass$DismissDialogEndpoint) apzgVar.qm(DismissDialogEndpointOuterClass$DismissDialogEndpoint.dismissDialogEndpoint);
        if ((dismissDialogEndpointOuterClass$DismissDialogEndpoint.b & 1) == 0) {
            this.a.c();
            return;
        }
        ajgz ajgzVar = this.a;
        String str = dismissDialogEndpointOuterClass$DismissDialogEndpoint.c;
        ylr.c();
        for (ajgy ajgyVar : ajgzVar.a.e(str)) {
            ajgyVar.lL();
        }
    }
}
