package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
/* compiled from: PG */
/* renamed from: far  reason: default package */
/* loaded from: classes3.dex */
public final class far {
    public static final apzg a;

    static {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(DownloadsPageEndpointOuterClass.downloadsPageEndpoint, aqpb.a);
        a = (apzg) aopcVar.mo39build();
    }

    public static apzg a(String str) {
        zgh.m(str);
        aopa createBuilder = atqn.a.createBuilder();
        createBuilder.copyOnWrite();
        atqn atqnVar = (atqn) createBuilder.instance;
        str.getClass();
        atqnVar.b |= 2;
        atqnVar.c = str;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(OfflineEndpointOuterClass.offlineEndpoint, (atqn) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    public static boolean b(apzg apzgVar) {
        return apzgVar.qn(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
    }

    public static boolean c(apzg apzgVar, azqb azqbVar) {
        return apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint) && elk.d(((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c) && ((fcl) azqbVar.get()).i(elk.c(((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c));
    }

    public static apzg d(String str) {
        zgh.m(str);
        aopa createBuilder = OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) createBuilder.instance;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b |= 1;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c = str;
        createBuilder.copyOnWrite();
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) createBuilder.instance;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2.d = 0;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2.b |= 2;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint, (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    public static apzg e(String str, String str2) {
        zgh.m(str);
        aopa createBuilder = OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
        str.getClass();
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = 1;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = str;
        if (!amps.e(str2)) {
            createBuilder.copyOnWrite();
            OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
            str2.getClass();
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.b |= 4;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.e = str2;
        }
        createBuilder.copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint3 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.f = 0;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.b |= 8;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }
}
