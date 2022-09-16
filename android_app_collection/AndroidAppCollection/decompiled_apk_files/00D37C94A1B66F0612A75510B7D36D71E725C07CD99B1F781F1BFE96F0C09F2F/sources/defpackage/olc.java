package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: olc  reason: default package */
/* loaded from: classes3.dex */
public final class olc {
    private final ipn a;
    private final ind b;
    private final jsc c;
    private final jjc d;
    private final ise e;

    public olc(ipn ipnVar, ind indVar, jsc jscVar, jjc jjcVar, ise iseVar) {
        this.a = ipnVar;
        this.b = indVar;
        this.c = jscVar;
        this.d = jjcVar;
        this.e = iseVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional a(PaneDescriptor paneDescriptor) {
        if (paneDescriptor == null) {
            return Optional.empty();
        }
        String str = "FElibrary";
        if (paneDescriptor.a == this.d.a) {
            String g = paneDescriptor.g("offline_playlist_top_level_tab_id");
            if (g != null) {
                str = g;
            }
            return Optional.ofNullable(str);
        } else if (this.c.d(paneDescriptor)) {
            return Optional.of(str);
        } else {
            if (this.b.e(paneDescriptor) || paneDescriptor.b.getBoolean("home_pane", false) || this.a.b(paneDescriptor) || this.e.a(paneDescriptor)) {
                apnv apnvVar = (apnv) paneDescriptor.e().qm(BrowseEndpointOuterClass.browseEndpoint);
                return Optional.ofNullable(!apnvVar.j.isEmpty() ? apnvVar.j : apnvVar.c);
            }
            return Optional.empty();
        }
    }
}
