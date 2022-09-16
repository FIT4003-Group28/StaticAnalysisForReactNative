package defpackage;

import com.google.android.apps.gmm.locationsharing.reporting.LocationCollectedBroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fuj  reason: default package */
/* loaded from: classes6.dex */
public final class fuj implements dxir {
    final /* synthetic */ fyu a;

    public fuj(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        LocationCollectedBroadcastReceiver locationCollectedBroadcastReceiver = (LocationCollectedBroadcastReceiver) obj;
        return new fuk(this.a);
    }
}
