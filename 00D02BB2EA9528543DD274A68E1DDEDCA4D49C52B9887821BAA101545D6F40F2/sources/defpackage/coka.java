package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
/* compiled from: PG */
/* renamed from: coka  reason: default package */
/* loaded from: classes5.dex */
final class coka extends comy {
    final /* synthetic */ cpct a;

    public coka(cpct cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.comz
    public final void b(FusedLocationProviderResult fusedLocationProviderResult) {
        Status status = fusedLocationProviderResult.a;
        if (status == null) {
            this.a.d(new cnob(new Status(8, "Got null status from location service")));
        } else if (status.g == 0) {
            this.a.a(true);
        } else {
            this.a.d(cntx.a(status));
        }
    }

    @Override // defpackage.comz
    public final void c() {
    }
}
