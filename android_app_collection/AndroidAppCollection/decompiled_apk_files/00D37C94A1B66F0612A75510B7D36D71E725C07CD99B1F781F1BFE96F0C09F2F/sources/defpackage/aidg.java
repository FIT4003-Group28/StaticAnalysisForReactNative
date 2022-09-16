package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: aidg  reason: default package */
/* loaded from: classes.dex */
public final class aidg {
    public final azqb a;
    public final aios b;

    public aidg(azqb azqbVar, aios aiosVar) {
        azqbVar.getClass();
        this.a = azqbVar;
        aiosVar.getClass();
        this.b = aiosVar;
    }

    public static final boolean a(apzg apzgVar) {
        if (apzgVar != null && apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
            awem awemVar = ((awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint)).l;
            if (awemVar == null) {
                awemVar = awem.a;
            }
            atza atzaVar = awemVar.d;
            if (atzaVar == null) {
                atzaVar = atza.a;
            }
            if ((atzaVar.b & 1) != 0) {
                return true;
            }
        }
        return false;
    }
}
