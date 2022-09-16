package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayiw  reason: default package */
/* loaded from: classes2.dex */
public final class ayiw implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ aybc b;

    public ayiw(aybc aybcVar, Status status) {
        this.b = aybcVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
