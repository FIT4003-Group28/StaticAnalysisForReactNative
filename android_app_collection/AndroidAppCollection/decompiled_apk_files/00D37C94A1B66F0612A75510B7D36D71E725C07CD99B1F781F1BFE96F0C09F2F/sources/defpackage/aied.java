package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: aied  reason: default package */
/* loaded from: classes.dex */
public final class aied implements aidy {
    private final afmt a;

    public aied(afmt afmtVar) {
        this.a = afmtVar;
    }

    public static boolean d(atzb atzbVar) {
        atzbVar.getClass();
        return atzbVar.d < 0 || atzbVar.e < 0;
    }

    @Override // defpackage.aidy
    public final ampq a(atzb atzbVar) {
        return d(atzbVar) ? amon.a : ampq.j(this.a.get());
    }

    @Override // defpackage.aidy
    public final atzb b(apzg apzgVar) {
        if (apzgVar != null && apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
            awel awelVar = (awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint);
            awem awemVar = awelVar.l;
            if (awemVar == null) {
                awemVar = awem.a;
            }
            if ((awemVar.b & 1) != 0) {
                awem awemVar2 = awelVar.l;
                if (awemVar2 == null) {
                    awemVar2 = awem.a;
                }
                atzb atzbVar = awemVar2.c;
                return atzbVar == null ? atzb.a : atzbVar;
            }
        }
        return null;
    }

    @Override // defpackage.aidy
    public final atzc c(apzg apzgVar) {
        if (apzgVar != null && apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
            awel awelVar = (awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint);
            awem awemVar = awelVar.l;
            if (awemVar == null) {
                awemVar = awem.a;
            }
            if ((awemVar.b & 8) != 0) {
                awem awemVar2 = awelVar.l;
                if (awemVar2 == null) {
                    awemVar2 = awem.a;
                }
                atzc atzcVar = awemVar2.e;
                return atzcVar == null ? atzc.a : atzcVar;
            }
        }
        return null;
    }
}
