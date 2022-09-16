package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
/* compiled from: PG */
/* renamed from: ohl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ohl implements gay {
    private final /* synthetic */ int c;
    public static final /* synthetic */ ohl b = new ohl(1);
    public static final /* synthetic */ ohl a = new ohl();

    private /* synthetic */ ohl() {
    }

    private /* synthetic */ ohl(int i) {
        this.c = i;
    }

    @Override // defpackage.gay
    public final PaneDescriptor a(apzg apzgVar) {
        if (this.c == 0) {
            apzgVar.getClass();
            aqxo.p(apzgVar.qn(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint));
            String str = ((PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint) apzgVar.qm(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)).b;
            Bundle a2 = PaneDescriptor.a();
            a2.putString("playlist_id", str);
            return PaneDescriptor.c(iqp.class, apzgVar, a2);
        }
        return PaneDescriptor.c(eki.class, apzgVar, PaneDescriptor.a());
    }
}
