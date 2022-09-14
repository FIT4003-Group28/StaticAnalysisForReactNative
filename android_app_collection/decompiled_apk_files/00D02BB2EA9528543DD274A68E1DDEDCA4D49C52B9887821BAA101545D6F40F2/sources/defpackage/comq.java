package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
/* compiled from: PG */
/* renamed from: comq  reason: default package */
/* loaded from: classes5.dex */
final class comq extends comy {
    private final cnph<Status> a;

    public comq(cnph<Status> cnphVar) {
        this.a = cnphVar;
    }

    @Override // defpackage.comz
    public final void b(FusedLocationProviderResult fusedLocationProviderResult) {
        this.a.c(fusedLocationProviderResult.a);
    }

    @Override // defpackage.comz
    public final void c() {
    }
}
