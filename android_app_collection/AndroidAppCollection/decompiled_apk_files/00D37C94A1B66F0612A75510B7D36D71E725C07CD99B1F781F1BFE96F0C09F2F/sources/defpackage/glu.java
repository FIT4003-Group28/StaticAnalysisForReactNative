package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
/* compiled from: PG */
/* renamed from: glu  reason: default package */
/* loaded from: classes3.dex */
final class glu implements ampt {
    private boolean a = true;
    private final kwa b;

    public glu(kwa kwaVar) {
        this.b = kwaVar;
    }

    @Override // defpackage.ampt
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        boolean z = this.a && this.b.b((PaneDescriptor) obj);
        this.a = false;
        return z;
    }
}
