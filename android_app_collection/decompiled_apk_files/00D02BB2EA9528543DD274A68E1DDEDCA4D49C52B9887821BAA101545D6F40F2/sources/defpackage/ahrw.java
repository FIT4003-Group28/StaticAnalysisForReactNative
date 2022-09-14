package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.SatelliteStatusEvent;
/* compiled from: PG */
/* renamed from: ahrw  reason: default package */
/* loaded from: classes2.dex */
final class ahrw implements ahsu {
    final /* synthetic */ ahrx a;

    public ahrw(ahrx ahrxVar) {
        this.a = ahrxVar;
    }

    @Override // defpackage.ahsu
    public final void a(int i, float f, boolean z) {
        this.a.a.b(new SatelliteStatusEvent(i, z));
    }
}
