package defpackage;

import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SignalServiceEndpointOuterClass$SignalServiceEndpoint;
import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: esd  reason: default package */
/* loaded from: classes3.dex */
public final class esd implements aafl {
    private final aafo a;
    private final /* synthetic */ int b;

    public esd(aafo aafoVar) {
        this.a = aafoVar;
    }

    public esd(aafo aafoVar, int i) {
        this.b = i;
        this.a = aafoVar;
    }

    public esd(aafo aafoVar, int i, byte[] bArr) {
        this.b = i;
        aafoVar.getClass();
        this.a = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        int i = this.b;
        if (i == 0) {
            this.a.d(((UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint) apzgVar.qm(UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.updateHorizontalCardListActionEndpoint)).b, map);
        } else if (i == 1) {
            if (!apzgVar.qn(SignalServiceEndpointOuterClass$SignalServiceEndpoint.signalServiceEndpoint)) {
                return;
            }
            this.a.d(((SignalServiceEndpointOuterClass$SignalServiceEndpoint) apzgVar.qm(SignalServiceEndpointOuterClass$SignalServiceEndpoint.signalServiceEndpoint)).b, map);
        } else if (i == 2) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("replace_previous_search_result_page", true);
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(SearchEndpointOuterClass.searchEndpoint, auoy.a);
            this.a.c((apzg) aopcVar.mo39build(), hashMap);
        } else {
            for (apzg apzgVar2 : ((CommandExecutorCommandOuterClass$CommandExecutorCommand) apzgVar.qm(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b) {
                this.a.c(apzgVar2, map);
            }
        }
    }
}
