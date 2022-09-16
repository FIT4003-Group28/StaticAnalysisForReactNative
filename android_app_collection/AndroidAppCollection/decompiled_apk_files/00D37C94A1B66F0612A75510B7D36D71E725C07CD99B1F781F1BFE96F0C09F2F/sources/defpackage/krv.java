package defpackage;

import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: krv  reason: default package */
/* loaded from: classes3.dex */
public final class krv implements kse {
    private final abbe a;
    private final Map b = new HashMap();

    public krv(abbe abbeVar) {
        this.a = abbeVar;
    }

    private final ksc d(String str) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, new ksc(this.a, str));
        }
        return (ksc) this.b.get(str);
    }

    @Override // defpackage.kse
    public final void a(String str, String str2, String str3, afzf afzfVar) {
        ksc d = d(str);
        d.a(new krx(d, str2, str3, afzfVar));
    }

    @Override // defpackage.kse
    public final void b(String str) {
        d(str).d();
    }

    @Override // defpackage.kse
    public final boolean c(apzg apzgVar, afzf afzfVar) {
        int cf;
        krz krwVar;
        int cf2;
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apzgVar.qm(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.size() != 0) {
            int cf3 = awwc.cf(((auci) playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.get(0)).c);
            if ((cf3 == 0 || cf3 != 3) && ((cf = awwc.cf(((auci) playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.get(0)).c)) == 0 || cf != 11)) {
                return false;
            }
            ksc d = d(playlistEditEndpointOuterClass$PlaylistEditEndpoint.b);
            PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint2 = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apzgVar.qm(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
            if (playlistEditEndpointOuterClass$PlaylistEditEndpoint2.c.size() != 1 || (cf2 = awwc.cf(((auci) playlistEditEndpointOuterClass$PlaylistEditEndpoint2.c.get(0)).c)) == 0 || cf2 != 11) {
                krwVar = new krw(d, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.c, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.e, apzgVar.c, afzfVar);
            } else {
                krwVar = new ksb(d, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.c, playlistEditEndpointOuterClass$PlaylistEditEndpoint2.e, apzgVar.c, afzfVar);
            }
            d.a(krwVar);
            return true;
        }
        return false;
    }
}
