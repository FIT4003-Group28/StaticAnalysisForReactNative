package defpackage;

import com.google.android.apps.gmm.map.prefetch.background.TilePrefetchBroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fyd  reason: default package */
/* loaded from: classes6.dex */
public final class fyd implements dxir {
    final /* synthetic */ fyu a;

    public fyd(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        TilePrefetchBroadcastReceiver tilePrefetchBroadcastReceiver = (TilePrefetchBroadcastReceiver) obj;
        return new fyf(this.a);
    }
}
