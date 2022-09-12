package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cnwt  reason: default package */
/* loaded from: classes5.dex */
final class cnwt extends cnwp {
    private final cnph<Status> a;

    public cnwt(cnph<Status> cnphVar) {
        this.a = cnphVar;
    }

    @Override // defpackage.cnwp, defpackage.cnwz
    public final void b(int i) {
        this.a.c(new Status(i));
    }
}
