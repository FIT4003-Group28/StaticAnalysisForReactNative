package defpackage;

import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
/* compiled from: PG */
/* renamed from: ksd  reason: default package */
/* loaded from: classes3.dex */
public final class ksd implements kse {
    private final abbe a;

    public ksd(abbe abbeVar) {
        this.a = abbeVar;
    }

    @Override // defpackage.kse
    public final void a(String str, String str2, String str3, afzf afzfVar) {
        abbb a = this.a.a();
        a.a = str;
        a.u(str2, str3);
        a.i();
        this.a.b(a, afzfVar);
    }

    @Override // defpackage.kse
    public final void b(String str) {
    }

    @Override // defpackage.kse
    public final boolean c(apzg apzgVar, afzf afzfVar) {
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apzgVar.qm(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        abbb a = this.a.a();
        a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
        a.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.e;
        if ((apzgVar.b & 1) == 0) {
            a.i();
        } else {
            a.j(apzgVar.c);
        }
        a.t(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
        this.a.b(a, afzfVar);
        return true;
    }
}
