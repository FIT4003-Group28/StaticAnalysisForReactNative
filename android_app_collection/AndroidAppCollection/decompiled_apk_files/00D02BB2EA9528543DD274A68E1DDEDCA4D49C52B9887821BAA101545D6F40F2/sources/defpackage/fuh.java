package defpackage;

import com.google.android.apps.gmm.transit.tracks.LocationBroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fuh  reason: default package */
/* loaded from: classes6.dex */
public final class fuh implements dxir {
    final /* synthetic */ fyu a;

    public fuh(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        LocationBroadcastReceiver locationBroadcastReceiver = (LocationBroadcastReceiver) obj;
        return new fui(this.a);
    }
}
