package defpackage;

import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: giv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class giv implements ayqb {
    public final /* synthetic */ gix a;
    public final /* synthetic */ CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b;
    public final /* synthetic */ Map c;
    private final /* synthetic */ int d;

    public /* synthetic */ giv(gix gixVar, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, Map map) {
        this.a = gixVar;
        this.b = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        this.c = map;
    }

    public /* synthetic */ giv(gix gixVar, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, Map map, int i) {
        this.d = i;
        this.a = gixVar;
        this.b = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        this.c = map;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.d == 0) {
            Throwable th = (Throwable) obj;
            this.a.c(amuk.q(), this.b, this.c);
            return;
        }
        this.a.c(((atjj) ((aajj) obj)).getSelectedVideoIds(), this.b, this.c);
    }
}
