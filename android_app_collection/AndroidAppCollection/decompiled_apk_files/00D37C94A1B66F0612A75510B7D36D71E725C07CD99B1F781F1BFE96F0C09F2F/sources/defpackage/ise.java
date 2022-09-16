package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
/* compiled from: PG */
/* renamed from: ise  reason: default package */
/* loaded from: classes3.dex */
public final class ise {
    public final Class a;

    public ise() {
        this.a = irq.class;
    }

    public ise(Class cls) {
        this.a = cls;
    }

    public final boolean a(PaneDescriptor paneDescriptor) {
        return this.a.isAssignableFrom(paneDescriptor.a);
    }

    public final boolean b(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }
}
