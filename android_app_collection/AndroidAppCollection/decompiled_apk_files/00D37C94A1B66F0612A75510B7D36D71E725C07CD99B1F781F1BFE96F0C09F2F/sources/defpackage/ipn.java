package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
/* compiled from: PG */
/* renamed from: ipn  reason: default package */
/* loaded from: classes3.dex */
public final class ipn {
    public final Class a;

    public ipn(Class cls) {
        this.a = cls;
    }

    public final PaneDescriptor a(apzg apzgVar) {
        apzgVar.getClass();
        return PaneDescriptor.c(this.a, apzgVar, PaneDescriptor.a());
    }

    public final boolean b(PaneDescriptor paneDescriptor) {
        return this.a.isAssignableFrom(paneDescriptor.a);
    }
}
