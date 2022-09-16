package defpackage;

import com.google.protos.youtube.api.innertube.ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gpd  reason: default package */
/* loaded from: classes3.dex */
public final class gpd implements aafl {
    private final aafo a;
    private final gpc b;

    public gpd(gpc gpcVar, aafo aafoVar) {
        this.a = aafoVar;
        this.b = gpcVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand = (ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand) apzgVar.qm(ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.showAccountLinkDialogFromDeepLinkCommand);
        int i = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.b;
        if ((i & 2) != 0) {
            gpc gpcVar = this.b;
            if (gpcVar.a == showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.d || (i & 1) == 0) {
                return;
            }
            aafo aafoVar = this.a;
            apzg apzgVar2 = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.c;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar.a(apzgVar2);
            this.b.a = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.d;
        }
    }
}
