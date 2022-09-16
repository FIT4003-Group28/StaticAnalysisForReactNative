package defpackage;

import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vxd  reason: default package */
/* loaded from: classes4.dex */
public final class vxd implements aafl {
    private final azqb a;
    private final vyh b;

    public vxd(azqb azqbVar, vyh vyhVar) {
        this.a = azqbVar;
        this.b = vyhVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        awlf awlfVar;
        ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint) apzgVar.qm(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
        if ((channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.b & 2) == 0) {
            ((vxk) this.a.get()).aF(apzgVar);
            return;
        }
        awle awleVar = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d;
        if (awleVar == null) {
            awleVar = awle.a;
        }
        if (awleVar.b != 1) {
            throw new aafy("Zero step parameters not set.");
        }
        vyh vyhVar = this.b;
        aavf aavfVar = (aavf) zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        awle awleVar2 = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d;
        if (awleVar2 == null) {
            awleVar2 = awle.a;
        }
        aopa mo52toBuilder = awleVar2.mo52toBuilder();
        aatq a = vyhVar.b.a();
        a.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
        if (aavfVar != null) {
            awle awleVar3 = (awle) mo52toBuilder.instance;
            if (awleVar3.b == 1) {
                awlfVar = (awlf) awleVar3.c;
            } else {
                awlfVar = awlf.a;
            }
            aopa mo52toBuilder2 = awlfVar.mo52toBuilder();
            String c = aavfVar.c();
            mo52toBuilder2.copyOnWrite();
            awlf awlfVar2 = (awlf) mo52toBuilder2.instance;
            c.getClass();
            awlfVar2.b |= 1;
            awlfVar2.c = c;
            awlf awlfVar3 = (awlf) mo52toBuilder2.mo39build();
            mo52toBuilder.copyOnWrite();
            awle awleVar4 = (awle) mo52toBuilder.instance;
            awlfVar3.getClass();
            awleVar4.c = awlfVar3;
            awleVar4.b = 1;
        }
        a.v = (awle) mo52toBuilder.mo39build();
        vyhVar.b.b(a, new vyf(vyhVar, aavfVar, mo52toBuilder));
    }
}
