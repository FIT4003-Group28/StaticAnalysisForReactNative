package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.libraries.youtube.comment.image.ImageGalleryActivity;
import com.google.protos.youtube.api.innertube.SharePlaylistEndpointOuterClass$SharePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.ShareVideoEndpointOuterClass$ShareVideoEndpoint;
/* compiled from: PG */
/* renamed from: ohm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ohm implements oho {
    public final /* synthetic */ dt a;
    private final /* synthetic */ int b;

    public /* synthetic */ ohm(dt dtVar, int i) {
        this.b = i;
        this.a = dtVar;
    }

    @Override // defpackage.oho
    public final Intent a(apzg apzgVar) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                Intent intent = new Intent(this.a, MainLiveCreationActivity.class);
                intent.putExtra("navigation_endpoint", apzgVar.toByteArray());
                return intent;
            } else if (i == 2) {
                return ImageGalleryActivity.b(this.a, apzgVar).addFlags(536870912);
            } else {
                if (i == 3) {
                    dt dtVar = this.a;
                    SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint = (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) apzgVar.qm(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint);
                    return zgt.D(dtVar, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.d, Uri.parse(sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.c));
                }
                return zgt.E(this.a, ((ShareVideoEndpointOuterClass$ShareVideoEndpoint) apzgVar.qm(ShareVideoEndpointOuterClass$ShareVideoEndpoint.shareVideoEndpoint)).c, Uri.parse(((ShareVideoEndpointOuterClass$ShareVideoEndpoint) apzgVar.qm(ShareVideoEndpointOuterClass$ShareVideoEndpoint.shareVideoEndpoint)).b));
            }
        }
        return ImageGalleryActivity.b(this.a, apzgVar).addFlags(536870912);
    }
}
