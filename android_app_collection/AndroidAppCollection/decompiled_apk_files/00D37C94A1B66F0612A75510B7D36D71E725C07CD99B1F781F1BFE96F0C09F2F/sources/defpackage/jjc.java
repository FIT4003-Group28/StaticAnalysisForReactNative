package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
/* compiled from: PG */
/* renamed from: jjc  reason: default package */
/* loaded from: classes3.dex */
public final class jjc {
    public final Class a;

    public jjc(Class cls) {
        this.a = cls;
    }

    public final PaneDescriptor a(String str, boolean z, String str2) {
        zgh.m(str);
        Class cls = this.a;
        Bundle a = PaneDescriptor.a();
        a.putString("playlist_id", str);
        a.putInt("network_connectivity_requirement", 1);
        a.putBoolean("detail_pane", z);
        if (!amps.e(str2)) {
            a.putString("offline_playlist_top_level_tab_id", str2);
        }
        return new PaneDescriptor(cls, a);
    }
}
