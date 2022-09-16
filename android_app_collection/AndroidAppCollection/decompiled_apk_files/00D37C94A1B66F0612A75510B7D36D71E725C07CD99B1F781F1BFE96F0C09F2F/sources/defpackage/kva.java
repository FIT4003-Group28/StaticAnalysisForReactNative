package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: kva  reason: default package */
/* loaded from: classes3.dex */
public final class kva {
    private final Class a;

    public kva(Class cls) {
        this.a = cls;
    }

    public final PaneDescriptor a(apzg apzgVar, String str, int i, boolean z, int i2, String str2) {
        apzgVar.getClass();
        auoy auoyVar = (auoy) apzgVar.qm(SearchEndpointOuterClass.searchEndpoint);
        Bundle a = PaneDescriptor.a();
        boolean z2 = true;
        a.putBoolean("no_history", true);
        a.putString("query", auoyVar.c);
        a.putString("parent_csn", str);
        a.putInt("parent_ve_type", i);
        if (!z && !auoyVar.h) {
            z2 = false;
        }
        a.putBoolean("is_voice_search", z2);
        a.putInt("cursor_offset", i2);
        if (str2 != null) {
            a.putString("conversation_id", str2);
        }
        a.putInt("network_connectivity_requirement", 2);
        return PaneDescriptor.c(this.a, apzgVar, a);
    }

    public final boolean b(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }
}
