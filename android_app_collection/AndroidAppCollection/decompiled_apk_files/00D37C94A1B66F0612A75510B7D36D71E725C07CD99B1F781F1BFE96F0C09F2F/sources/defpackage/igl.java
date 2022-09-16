package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
/* compiled from: PG */
/* renamed from: igl  reason: default package */
/* loaded from: classes3.dex */
public final class igl extends aijj {
    public static final String f(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        return (reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) != 0 ? reelWatchEndpointOuterClass$ReelWatchEndpoint.e : "";
    }

    public static final String g(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        return (reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 2) != 0 ? reelWatchEndpointOuterClass$ReelWatchEndpoint.d : "";
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ ory a(Object obj) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj;
        aopa createBuilder = ory.a.createBuilder();
        String g = g(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        createBuilder.copyOnWrite();
        ory oryVar = (ory) createBuilder.instance;
        g.getClass();
        oryVar.b |= 1;
        oryVar.c = g;
        String f = f(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        createBuilder.copyOnWrite();
        ory oryVar2 = (ory) createBuilder.instance;
        f.getClass();
        oryVar2.b |= 2;
        oryVar2.e = f;
        int i = reelWatchEndpointOuterClass$ReelWatchEndpoint.f;
        createBuilder.copyOnWrite();
        ory oryVar3 = (ory) createBuilder.instance;
        oryVar3.b |= 4;
        oryVar3.f = i;
        createBuilder.copyOnWrite();
        ory oryVar4 = (ory) createBuilder.instance;
        oryVar4.b |= 8;
        oryVar4.g = "";
        String str = reelWatchEndpointOuterClass$ReelWatchEndpoint.g;
        createBuilder.copyOnWrite();
        ory oryVar5 = (ory) createBuilder.instance;
        str.getClass();
        oryVar5.b |= 512;
        oryVar5.m = str;
        createBuilder.copyOnWrite();
        ory oryVar6 = (ory) createBuilder.instance;
        oryVar6.b |= 256;
        oryVar6.l = 0L;
        createBuilder.copyOnWrite();
        ory oryVar7 = (ory) createBuilder.instance;
        oryVar7.b |= 2048;
        oryVar7.o = true;
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 1024) != 0) {
            atub atubVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.l;
            if (atubVar == null) {
                atubVar = atub.a;
            }
            if ((atubVar.b & 2) != 0) {
                atub atubVar2 = reelWatchEndpointOuterClass$ReelWatchEndpoint.l;
                if (atubVar2 == null) {
                    atubVar2 = atub.a;
                }
                attz attzVar = atubVar2.d;
                if (attzVar == null) {
                    attzVar = attz.a;
                }
                createBuilder.copyOnWrite();
                ory oryVar8 = (ory) createBuilder.instance;
                attzVar.getClass();
                oryVar8.s = attzVar;
                oryVar8.b |= 262144;
            }
            atub atubVar3 = reelWatchEndpointOuterClass$ReelWatchEndpoint.l;
            if (atubVar3 == null) {
                atubVar3 = atub.a;
            }
            if ((atubVar3.b & 1) != 0) {
                atub atubVar4 = reelWatchEndpointOuterClass$ReelWatchEndpoint.l;
                if (atubVar4 == null) {
                    atubVar4 = atub.a;
                }
                atty attyVar = atubVar4.c;
                if (attyVar == null) {
                    attyVar = atty.a;
                }
                createBuilder.copyOnWrite();
                ory oryVar9 = (ory) createBuilder.instance;
                attyVar.getClass();
                oryVar9.r = attyVar;
                oryVar9.b |= 65536;
            }
        }
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 4194304) != 0) {
            aweh awehVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.v;
            if (awehVar == null) {
                awehVar = aweh.a;
            }
            createBuilder.copyOnWrite();
            ory oryVar10 = (ory) createBuilder.instance;
            awehVar.getClass();
            oryVar10.A = awehVar;
            oryVar10.b |= 268435456;
        }
        return (ory) createBuilder.mo39build();
    }

    @Override // defpackage.aijm
    public final aooq b() {
        return ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return f((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj);
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return g((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj);
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return akzj.f((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj2);
    }
}
