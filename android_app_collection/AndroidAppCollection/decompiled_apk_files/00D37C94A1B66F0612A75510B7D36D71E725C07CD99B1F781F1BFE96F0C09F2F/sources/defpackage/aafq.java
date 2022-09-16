package defpackage;

import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: aafq  reason: default package */
/* loaded from: classes.dex */
public final class aafq implements aafc {
    private final /* synthetic */ int a;

    public aafq() {
    }

    public aafq(int i) {
        this.a = i;
    }

    @Override // defpackage.aafc
    public final boolean a(apzg apzgVar, apzg apzgVar2) {
        if (this.a == 0) {
            if (apzgVar.qn(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint) && apzgVar2.qn(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint)) {
                return true;
            }
            if (!apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint) || !apzgVar2.qn(BrowseEndpointOuterClass.browseEndpoint)) {
                if (apzgVar.qn(OfflineEndpointOuterClass.offlineEndpoint) && apzgVar2.qn(OfflineEndpointOuterClass.offlineEndpoint)) {
                    return true;
                }
                if (!apzgVar.qn(SearchEndpointOuterClass.searchEndpoint) || !apzgVar2.qn(SearchEndpointOuterClass.searchEndpoint)) {
                    if (!apzgVar.qn(UrlEndpointOuterClass.urlEndpoint) || !apzgVar2.qn(UrlEndpointOuterClass.urlEndpoint)) {
                        if (apzgVar.qn(WatchEndpointOuterClass.watchEndpoint) && apzgVar2.qn(WatchEndpointOuterClass.watchEndpoint)) {
                            awel awelVar = (awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint);
                            awel awelVar2 = (awel) apzgVar2.qm(WatchEndpointOuterClass.watchEndpoint);
                            if (awelVar.f.equals(awelVar2.f) && awelVar.k.equals(awelVar2.k) && Float.compare(awelVar.j, awelVar2.j) == 0 && Float.compare(awelVar.i, awelVar2.i) == 0 && awelVar.g == awelVar2.g && awelVar.e == awelVar2.e && awelVar.c.equals(awelVar2.c) && awelVar.d.equals(awelVar2.d)) {
                                return true;
                            }
                        }
                    } else {
                        return ((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).c.equals(((avvk) apzgVar2.qm(UrlEndpointOuterClass.urlEndpoint)).c);
                    }
                } else {
                    auoy auoyVar = (auoy) apzgVar.qm(SearchEndpointOuterClass.searchEndpoint);
                    auoy auoyVar2 = (auoy) apzgVar2.qm(SearchEndpointOuterClass.searchEndpoint);
                    if (auoyVar.c.equals(auoyVar2.c) && auoyVar.d.equals(auoyVar2.d)) {
                        return true;
                    }
                }
            } else {
                apnv apnvVar = (apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint);
                apnv apnvVar2 = (apnv) apzgVar2.qm(BrowseEndpointOuterClass.browseEndpoint);
                if (apnvVar.c.equals(apnvVar2.c) && apnvVar.f == apnvVar2.f && apnvVar.d.equals(apnvVar2.d)) {
                    return true;
                }
            }
            return false;
        } else if (!apzgVar.qn(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint) || !apzgVar2.qn(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)) {
            if (!apzgVar.qn(DownloadsPageEndpointOuterClass.downloadsPageEndpoint) || !apzgVar2.qn(DownloadsPageEndpointOuterClass.downloadsPageEndpoint)) {
                return false;
            }
            aqpa b = aqpa.b(((aqpb) apzgVar.qm(DownloadsPageEndpointOuterClass.downloadsPageEndpoint)).c);
            if (b == null) {
                b = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
            aqpa b2 = aqpa.b(((aqpb) apzgVar2.qm(DownloadsPageEndpointOuterClass.downloadsPageEndpoint)).c);
            if (b2 == null) {
                b2 = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
            return b == b2;
        } else {
            return ((PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint) apzgVar.qm(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)).b.equals(((PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint) apzgVar2.qm(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)).b);
        }
    }
}
