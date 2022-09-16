package defpackage;

import com.google.protos.youtube.api.innertube.MuteAdEndpointOuterClass$MuteAdEndpoint;
/* compiled from: PG */
/* renamed from: xgc  reason: default package */
/* loaded from: classes4.dex */
public class xgc {
    private final MuteAdEndpointOuterClass$MuteAdEndpoint a;
    private final Object b;
    private xgb c;

    public xgc(MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint, Object obj) {
        muteAdEndpointOuterClass$MuteAdEndpoint.getClass();
        this.a = muteAdEndpointOuterClass$MuteAdEndpoint;
        this.b = obj;
    }

    public xgb a() {
        if (this.c == null) {
            int aB = akel.aB(this.a.b);
            if (aB == 0) {
                aB = 1;
            }
            int i = aB - 1;
            if (i == 1) {
                this.c = xgb.HIDE;
            } else if (i == 2) {
                this.c = xgb.SKIP;
            } else {
                this.c = xgb.UNKNOWN_MUTE_TYPE;
            }
        }
        return this.c;
    }
}
