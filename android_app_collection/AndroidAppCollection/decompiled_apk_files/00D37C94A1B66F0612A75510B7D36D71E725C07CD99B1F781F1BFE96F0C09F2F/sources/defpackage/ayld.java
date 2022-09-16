package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayld  reason: default package */
/* loaded from: classes2.dex */
public final class ayld implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ aylv b;

    public ayld(aylv aylvVar, Status status) {
        this.b = aylvVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.y = true;
        this.b.u.a(this.a, ayep.PROCESSED, new ayat());
    }
}
