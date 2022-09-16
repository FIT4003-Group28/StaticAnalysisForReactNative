package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eqr  reason: default package */
/* loaded from: classes3.dex */
public final class eqr implements aafl, eoy {
    private final gbh a;
    private final yni b;
    private final jsc c;
    private final jjc d;

    public eqr(gbh gbhVar, yni yniVar, jsc jscVar, jjc jjcVar) {
        this.a = gbhVar;
        this.b = yniVar;
        this.c = jscVar;
        this.d = jjcVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        PaneDescriptor b;
        String str = ((atqn) apzgVar.qm(OfflineEndpointOuterClass.offlineEndpoint)).c;
        boolean z = false;
        if (map != null && map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext") && ((ajrs) map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext")).j("nested_fragment_key", false)) {
            z = true;
        }
        String str2 = (String) zew.K(map, "offline_playlist_top_level_tab_id", String.class);
        if ("PPSV".equals(str) || amps.e(str)) {
            b = this.c.b(apzgVar);
        } else {
            b = this.d.a(str, z, str2);
        }
        this.b.d(new ewr());
        this.a.d(b);
    }
}
