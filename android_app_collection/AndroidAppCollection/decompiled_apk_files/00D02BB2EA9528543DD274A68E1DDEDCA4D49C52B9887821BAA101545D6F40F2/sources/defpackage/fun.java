package defpackage;

import com.google.android.apps.gmm.locationsharing.interprocess.impl.LocationSharingReportingService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fun  reason: default package */
/* loaded from: classes6.dex */
public final class fun implements dxir {
    final /* synthetic */ fyu a;

    public fun(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        LocationSharingReportingService locationSharingReportingService = (LocationSharingReportingService) obj;
        return new fup(this.a);
    }
}
