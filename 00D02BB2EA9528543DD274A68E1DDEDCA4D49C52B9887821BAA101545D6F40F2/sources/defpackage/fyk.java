package defpackage;

import com.google.android.apps.gmm.transit.TransitStationService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fyk  reason: default package */
/* loaded from: classes6.dex */
public final class fyk implements dxir {
    final /* synthetic */ fyu a;

    public fyk(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        TransitStationService transitStationService = (TransitStationService) obj;
        return new fyl(this.a);
    }
}
