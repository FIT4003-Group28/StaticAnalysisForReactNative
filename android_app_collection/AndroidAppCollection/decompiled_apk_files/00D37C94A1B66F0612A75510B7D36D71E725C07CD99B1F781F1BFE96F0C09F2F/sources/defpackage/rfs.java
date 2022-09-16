package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
/* compiled from: PG */
/* renamed from: rfs  reason: default package */
/* loaded from: classes4.dex */
public final class rfs extends rgl {
    final /* synthetic */ rvh a;

    public rfs(rvh rvhVar) {
        this.a = rvhVar;
    }

    @Override // defpackage.rgm
    public final void a(FusedLocationProviderResult fusedLocationProviderResult) {
        Status status = fusedLocationProviderResult.a;
        if (status == null) {
            this.a.c(new qsp(new Status(8, "Got null status from location service")));
        } else if (status.g == 0) {
            this.a.b(true);
        } else {
            this.a.c(tjk.h(status));
        }
    }

    @Override // defpackage.rgm
    public final void b() {
    }
}
