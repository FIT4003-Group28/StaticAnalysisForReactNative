package defpackage;

import com.google.protos.youtube.api.innertube.ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abjm  reason: default package */
/* loaded from: classes.dex */
public final class abjm implements aafl {
    public final abha a;
    public final yzj b;
    private final aaza c;

    public abjm(aaza aazaVar, abha abhaVar, yzj yzjVar) {
        aazaVar.getClass();
        this.c = aazaVar;
        abhaVar.getClass();
        this.a = abhaVar;
        yzjVar.getClass();
        this.b = yzjVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aaza aazaVar = this.c;
        aazc aazcVar = new aazc(aazaVar.e, aazaVar.a.c());
        aazcVar.a = ((ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint) apzgVar.qm(ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.moderateLiveChatEndpoint)).b;
        if ((apzgVar.b & 1) == 0) {
            aazcVar.i();
        } else {
            aazcVar.j(apzgVar.c);
        }
        aazaVar.g.e(aazcVar, new abjl(this, map));
    }
}
