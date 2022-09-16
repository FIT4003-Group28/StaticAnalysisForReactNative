package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: ind  reason: default package */
/* loaded from: classes3.dex */
public final class ind {
    public final Class a;
    private final Class b;

    public ind(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static boolean d(apzg apzgVar, String str) {
        return ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c.equals(str);
    }

    public static boolean j(apzg apzgVar) {
        return d(apzgVar, "FElibrary");
    }

    private static boolean m(apzg apzgVar) {
        return d(apzgVar, "FEhistory");
    }

    public final PaneDescriptor a(apzg apzgVar) {
        apzgVar.getClass();
        aqxo.p(apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint));
        return b(apzgVar, jfw.i(apzgVar));
    }

    public final PaneDescriptor b(apzg apzgVar, boolean z) {
        return c(apzgVar, z, false, false);
    }

    public final PaneDescriptor c(apzg apzgVar, boolean z, boolean z2, boolean z3) {
        apzgVar.getClass();
        Bundle a = PaneDescriptor.a();
        a.putBoolean("home_pane", z);
        a.putBoolean("detail_pane", z2);
        a.putBoolean("selection_panel_selection_changed", z3);
        a.putInt("network_connectivity_requirement", 2);
        if (!z) {
            return PaneDescriptor.c(this.a, apzgVar, a);
        }
        return PaneDescriptor.c(this.b, apzgVar, a);
    }

    public final boolean e(PaneDescriptor paneDescriptor) {
        return this.a.isAssignableFrom(paneDescriptor.a);
    }

    public final boolean f(PaneDescriptor paneDescriptor) {
        return e(paneDescriptor) && m(paneDescriptor.e());
    }

    public final boolean g(PaneDescriptor paneDescriptor) {
        if (e(paneDescriptor)) {
            apzg e = paneDescriptor.e();
            return m(e) && !((apnv) e.qm(BrowseEndpointOuterClass.browseEndpoint)).e.isEmpty();
        }
        return false;
    }

    public final boolean h(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.b;
    }

    public final boolean i(PaneDescriptor paneDescriptor) {
        return e(paneDescriptor) && d(paneDescriptor.e(), "FEwhat_to_watch");
    }

    public final boolean k(PaneDescriptor paneDescriptor) {
        return e(paneDescriptor) && j(paneDescriptor.e());
    }

    public final boolean l(PaneDescriptor paneDescriptor) {
        return e(paneDescriptor) && jfw.i(paneDescriptor.e());
    }
}
