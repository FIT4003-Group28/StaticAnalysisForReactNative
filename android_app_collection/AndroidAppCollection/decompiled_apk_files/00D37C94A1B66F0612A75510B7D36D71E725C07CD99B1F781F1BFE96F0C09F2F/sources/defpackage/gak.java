package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: gak  reason: default package */
/* loaded from: classes3.dex */
public final class gak implements gbp {
    private final azpb a = azpd.ar().ax();
    private final aacz b;

    public gak(aacz aaczVar) {
        this.b = aaczVar;
    }

    public final ayoi a() {
        return this.a.W();
    }

    @Override // defpackage.gbp
    public final void aI(gbr gbrVar) {
        PaneDescriptor paneDescriptor;
        avve avveVar = this.b.b().s;
        if (avveVar == null) {
            avveVar = avve.a;
        }
        if (!avveVar.h || (paneDescriptor = gbrVar.b) == null || paneDescriptor.e() == null || !paneDescriptor.e().qn(BrowseEndpointOuterClass.browseEndpoint)) {
            return;
        }
        this.a.c(((apnv) paneDescriptor.e().qm(BrowseEndpointOuterClass.browseEndpoint)).c);
    }
}
