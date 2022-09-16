package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: kwa  reason: default package */
/* loaded from: classes3.dex */
public final class kwa {
    private final Class a;

    public kwa(Class cls) {
        this.a = cls;
    }

    public final PaneDescriptor a(apzg apzgVar, auwg auwgVar, byte[] bArr, boolean z, argv argvVar, boolean z2, boolean z3, int i, int i2) {
        apzgVar.getClass();
        String str = ((auoy) apzgVar.qm(SearchEndpointOuterClass.searchEndpoint)).c;
        Bundle a = PaneDescriptor.a();
        a.putString("search_query", str);
        if (auwgVar != null) {
            a.putParcelable("innertube_search_filters", aphq.k(auwgVar));
        }
        a.putByteArray("searchbox_stats", bArr);
        a.putBoolean("preserve_search_nav_history", z);
        a.putInt("network_connectivity_requirement", 2);
        double random = Math.random();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
        sb.append("SEARCH_RESULTS_");
        sb.append(str);
        sb.append(random);
        a.putString("search_cache_key", sb.toString());
        if (argvVar != null) {
            a.putByteArray("sticky_horizontal_card_list", argvVar.toByteArray());
        }
        a.putBoolean("search_filter_chip_clicked", z2);
        a.putBoolean("search_filter_chip_applied", z3);
        a.putInt("search_filter_chip_count", i);
        a.putInt("search_chip_bar_selected_position", i2);
        return PaneDescriptor.c(this.a, apzgVar, a);
    }

    public final boolean b(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }
}
