package defpackage;

import android.os.RemoteException;
import com.google.android.apps.gmm.locationsharing.interprocess.api.ReportingState;
/* compiled from: PG */
/* renamed from: aiao  reason: default package */
/* loaded from: classes2.dex */
final class aiao implements degu<ReportingState> {
    private final String a;
    private final ckcq b;
    private final ahyx c;

    public aiao(ahyx ahyxVar, String str, ckcq ckcqVar) {
        this.c = ahyxVar;
        this.a = str;
        this.b = ckcqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.degu
    /* renamed from: c */
    public final void b(ReportingState reportingState) {
        try {
            this.c.e(reportingState);
        } catch (RemoteException e) {
            bvoo.i(new IllegalStateException(e));
        }
        this.b.b();
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.f(new IllegalStateException("Unknown exception: ", th));
        b(new ReportingState(this.a, 4, dcdc.f(5)));
    }
}
