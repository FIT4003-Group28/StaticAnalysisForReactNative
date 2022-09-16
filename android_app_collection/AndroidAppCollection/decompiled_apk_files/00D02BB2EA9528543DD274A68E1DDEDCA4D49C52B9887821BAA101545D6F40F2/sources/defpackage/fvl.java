package defpackage;

import com.google.android.apps.gmm.offline.appindex.OfflineAppIndexingReceiver;
/* compiled from: PG */
/* renamed from: fvl  reason: default package */
/* loaded from: classes6.dex */
final class fvl implements dxis {
    final /* synthetic */ fyu a;

    public fvl(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((OfflineAppIndexingReceiver) obj).a = new avlq(this.a.M(), this.a.ts());
    }
}
