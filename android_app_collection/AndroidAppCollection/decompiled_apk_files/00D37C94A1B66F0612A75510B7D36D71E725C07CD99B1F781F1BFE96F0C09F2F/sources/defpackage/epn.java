package defpackage;

import com.google.protos.youtube.api.innertube.DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: epn  reason: default package */
/* loaded from: classes3.dex */
public final class epn implements aafl {
    private final gea a;

    public epn(gea geaVar) {
        this.a = geaVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.a.a(((DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint) apzgVar.qm(DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.deletePlaylistEndpoint)).b).show();
    }
}
