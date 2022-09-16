package defpackage;

import com.google.android.apps.gmm.locationsharing.reporting.ReporterService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fwy  reason: default package */
/* loaded from: classes6.dex */
public final class fwy implements dxir {
    final /* synthetic */ fyu a;

    public fwy(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        ReporterService reporterService = (ReporterService) obj;
        return new fwz(this.a);
    }
}
