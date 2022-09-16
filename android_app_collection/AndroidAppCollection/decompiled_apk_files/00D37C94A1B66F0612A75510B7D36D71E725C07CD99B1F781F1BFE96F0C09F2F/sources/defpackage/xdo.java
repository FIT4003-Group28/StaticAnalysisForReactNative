package defpackage;

import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: xdo  reason: default package */
/* loaded from: classes4.dex */
public final class xdo {
    public final ReelWatchEndpointOuterClass$ReelWatchEndpoint a;
    public final ankt b;
    public final xdn c;
    public ViewGroup d;
    public boolean e;

    public xdo(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        this.a = reelWatchEndpointOuterClass$ReelWatchEndpoint;
        final xdn xdnVar = new xdn();
        this.c = xdnVar;
        this.b = aed.c(new agr() { // from class: xdm
            @Override // defpackage.agr
            public final Object a(agp agpVar) {
                xdn.this.a = agpVar;
                return "ReelsObjectBinder.";
            }
        });
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xdo)) {
            return false;
        }
        return Objects.equals(this.a, ((xdo) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        String str = this.a.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append("ReelAdMetadata[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
