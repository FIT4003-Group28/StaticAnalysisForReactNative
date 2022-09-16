package defpackage;

import com.google.protos.youtube.api.innertube.SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abjo  reason: default package */
/* loaded from: classes.dex */
public final class abjo implements aafl {
    private final aaza a;
    private final abha b;

    public abjo(aaza aazaVar, abha abhaVar) {
        aazaVar.getClass();
        this.a = aazaVar;
        abhaVar.getClass();
        this.b = abhaVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        abjh abjhVar = (abjh) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", abjh.class);
        SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint) apzgVar.qm(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint);
        aaza aazaVar = this.a;
        aazd aazdVar = new aazd(aazaVar.e, aazaVar.a.c());
        aazdVar.b = abjhVar.e();
        aazdVar.c = abjhVar.c();
        aazdVar.d = abjhVar.d();
        aoob aoobVar = sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.b;
        if (aoobVar != null) {
            aazdVar.a = aoobVar;
        }
        if (sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.c.size() != 0) {
            this.b.a(sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.c, abjhVar.a(), true);
        }
        if ((apzgVar.b & 1) != 0) {
            aazdVar.j(apzgVar.c);
        } else {
            aazdVar.i();
        }
        aaza aazaVar2 = this.a;
        aazaVar2.c.e(aazdVar, abjhVar.b());
    }
}
