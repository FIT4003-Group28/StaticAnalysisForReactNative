package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
/* compiled from: PG */
/* renamed from: jsc  reason: default package */
/* loaded from: classes3.dex */
public final class jsc {
    public final Class a;

    public jsc(Class cls) {
        this.a = cls;
    }

    public final PaneDescriptor a() {
        return b(far.a);
    }

    public final PaneDescriptor b(apzg apzgVar) {
        return c(apzgVar, false, false);
    }

    public final PaneDescriptor c(apzg apzgVar, boolean z, boolean z2) {
        Bundle a = PaneDescriptor.a();
        a.putBoolean("detail_pane", z);
        a.putBoolean("selection_panel_selection_changed", z2);
        return PaneDescriptor.c(this.a, apzgVar, a);
    }

    public final boolean d(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }
}
