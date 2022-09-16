package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayfe  reason: default package */
/* loaded from: classes2.dex */
final class ayfe implements Runnable {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ ayfr b;

    public ayfe(ayfr ayfrVar, StringBuilder sb) {
        this.b = ayfrVar;
        this.a = sb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g(Status.f.withDescription(this.a.toString()), true);
    }
}
