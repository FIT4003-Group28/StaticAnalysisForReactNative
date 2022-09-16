package defpackage;

import com.google.android.apps.youtube.app.offline.OfflineModeChangedRefreshController;
/* compiled from: PG */
/* renamed from: jak  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jak implements ayqb {
    public final /* synthetic */ OfflineModeChangedRefreshController a;
    private final /* synthetic */ int b;

    public /* synthetic */ jak(OfflineModeChangedRefreshController offlineModeChangedRefreshController, int i) {
        this.b = i;
        this.a = offlineModeChangedRefreshController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.h((ahia) obj);
            return;
        }
        this.a.a = ((ahhm) obj).c();
    }
}
