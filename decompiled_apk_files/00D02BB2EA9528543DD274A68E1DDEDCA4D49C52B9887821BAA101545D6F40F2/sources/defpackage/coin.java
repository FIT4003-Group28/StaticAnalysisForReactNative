package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: coin  reason: default package */
/* loaded from: classes5.dex */
final class coin extends cnrs {
    final /* synthetic */ cpct a;
    final /* synthetic */ coig b;

    public coin(cpct cpctVar, coig coigVar) {
        this.a = cpctVar;
        this.b = coigVar;
    }

    @Override // defpackage.cnrt
    public final void b(Status status) {
        if (status.g == 0) {
            this.a.a(new coip(this.b));
        } else {
            this.a.c(new cnob(status));
        }
    }
}
