package defpackage;

import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: giw  reason: default package */
/* loaded from: classes3.dex */
public final class giw implements afwa {
    final /* synthetic */ List a;
    final /* synthetic */ CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b;
    final /* synthetic */ ampq c;
    final /* synthetic */ gix d;

    public giw(gix gixVar, List list, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, ampq ampqVar) {
        this.d = gixVar;
        this.a = list;
        this.b = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        this.c = ampqVar;
    }

    @Override // defpackage.afwa
    public final void a() {
    }

    @Override // defpackage.afwa
    public final void b() {
        this.d.b(this.a, this.b, this.c);
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.d.a.e(exc);
    }
}
