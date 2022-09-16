package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: erc  reason: default package */
/* loaded from: classes3.dex */
public final class erc implements aafl {
    public final azqb a;
    public final yzj b;
    public final jor c;
    private final abbe d;
    private final Activity e;
    private final afvn f;
    private final afwc g;
    private final kse h;

    public erc(abbe abbeVar, azqb azqbVar, yzj yzjVar, Activity activity, afvn afvnVar, afwc afwcVar, jor jorVar, kse kseVar) {
        abbeVar.getClass();
        this.d = abbeVar;
        azqbVar.getClass();
        this.a = azqbVar;
        yzjVar.getClass();
        this.b = yzjVar;
        this.e = activity;
        this.f = afvnVar;
        this.g = afwcVar;
        this.c = jorVar;
        this.h = kseVar;
    }

    public final void b(apzg apzgVar, Object obj) {
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apzgVar.qm(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        erb erbVar = new erb(this, playlistEditEndpointOuterClass$PlaylistEditEndpoint.b, playlistEditEndpointOuterClass$PlaylistEditEndpoint.c, obj);
        kse kseVar = this.h;
        if (kseVar == null || !kseVar.c(apzgVar, erbVar)) {
            abbb a = this.d.a();
            a.j(apzgVar.c);
            a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
            a.t(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
            a.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.e;
            this.d.b(a, erbVar);
        }
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.d.size() != 0) {
            ((aafo) this.a.get()).e(playlistEditEndpointOuterClass$PlaylistEditEndpoint.d, obj);
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        afvn afvnVar;
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.e == null || this.g == null || (afvnVar = this.f) == null || afvnVar.t()) {
            b(apzgVar, I);
        } else {
            this.g.c(this.e, null, new era(this, apzgVar, I));
        }
    }
}
