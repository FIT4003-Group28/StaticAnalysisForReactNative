package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.protos.youtube.api.innertube.MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adcx  reason: default package */
/* loaded from: classes.dex */
public final class adcx implements aafl {
    private static final String a = zep.a("MDX.MdxPlaybackCommand");
    private final adgc b;
    private final adoa c;
    private final acxh d;

    public adcx(adgc adgcVar, adoa adoaVar, acxh acxhVar) {
        this.b = adgcVar;
        this.c = adoaVar;
        this.d = acxhVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        atcr atcrVar;
        atcr atcrVar2;
        atcr atcrVar3;
        bhc bhcVar;
        if (!apzgVar.qn(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint)) {
            zep.m(a, "Mdx playback endpoint not filled");
            return;
        }
        MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint = (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint) apzgVar.qm(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint);
        if ((mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b & 1) == 0) {
            zep.m(a, "Mdx playback endpoint not filled");
            return;
        }
        atdp atdpVar = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
        if (atdpVar == null) {
            atdpVar = atdp.a;
        }
        atcq atcqVar = atdpVar.c;
        if (atcqVar == null) {
            atcqVar = atcq.a;
        }
        if (atcqVar.b != 1) {
            zep.m(a, "Endpoint did not contain a MdxDevice or MdxScreen to connect to.");
            return;
        }
        atdp atdpVar2 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
        if (atdpVar2 == null) {
            atdpVar2 = atdp.a;
        }
        atcq atcqVar2 = atdpVar2.c;
        if (atcqVar2 == null) {
            atcqVar2 = atcq.a;
        }
        if (atcqVar2.b == 1) {
            atcrVar = (atcr) atcqVar2.c;
        } else {
            atcrVar = atcr.a;
        }
        if (atcrVar.e.isEmpty()) {
            if (atcrVar.d.isEmpty()) {
                return;
            }
            atdp atdpVar3 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
            if (atdpVar3 == null) {
                atdpVar3 = atdp.a;
            }
            adnk j = adnl.d(atdpVar3).j();
            j.d = (apzgVar.b & 1) != 0 ? apzgVar.c.I() : null;
            adnl a2 = j.a();
            acxj a3 = acxk.a();
            a3.c(atcrVar.d);
            a3.b(atcrVar.c);
            a3.a = a2;
            zep.h(a, "starting background playback");
            this.d.e(a3.a());
            return;
        }
        adgc adgcVar = this.b;
        atdp atdpVar4 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
        if (atdpVar4 == null) {
            atdpVar4 = atdp.a;
        }
        atcq atcqVar3 = atdpVar4.c;
        if (atcqVar3 == null) {
            atcqVar3 = atcq.a;
        }
        if (atcqVar3.b == 1) {
            atcrVar2 = (atcr) atcqVar3.c;
        } else {
            atcrVar2 = atcr.a;
        }
        bhc J2 = adgcVar.J(new ScreenId(atcrVar2.e));
        if (J2 == null || (bhcVar = adgcVar.c) == null || !adgl.c(J2.c, bhcVar.c) || this.c.e() == null) {
            adgc adgcVar2 = this.b;
            atdp atdpVar5 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
            if (atdpVar5 == null) {
                atdpVar5 = atdp.a;
            }
            atcq atcqVar4 = atdpVar5.c;
            if (atcqVar4 == null) {
                atcqVar4 = atcq.a;
            }
            if (atcqVar4.b == 1) {
                atcrVar3 = (atcr) atcqVar4.c;
            } else {
                atcrVar3 = atcr.a;
            }
            ScreenId screenId = new ScreenId(atcrVar3.e);
            atdp atdpVar6 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
            if (atdpVar6 == null) {
                atdpVar6 = atdp.a;
            }
            adnl d = adnl.d(atdpVar6);
            bhc J3 = adgcVar2.J(screenId);
            if (J3 == null) {
                return;
            }
            adgcVar2.V(J3, d);
            return;
        }
        adnt e = this.c.e();
        atdp atdpVar7 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
        if (atdpVar7 == null) {
            atdpVar7 = atdp.a;
        }
        e.L(adnl.d(atdpVar7));
    }
}
