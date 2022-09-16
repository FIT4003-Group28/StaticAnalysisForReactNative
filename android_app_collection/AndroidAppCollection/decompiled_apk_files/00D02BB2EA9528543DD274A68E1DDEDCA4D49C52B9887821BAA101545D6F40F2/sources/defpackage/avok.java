package defpackage;

import com.google.android.apps.gmm.offline.backends.OfflineInfrastructureNativeImpl;
/* renamed from: avok  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class avok implements dbsz {
    public static final dbsz a = new avok();

    private avok() {
    }

    @Override // defpackage.dbsz
    public final void NU(Object obj) {
        int i = OfflineInfrastructureNativeImpl.a;
        ((Runnable) obj).run();
    }
}
