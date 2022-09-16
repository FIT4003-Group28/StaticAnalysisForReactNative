package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayfg  reason: default package */
/* loaded from: classes2.dex */
public final class ayfg implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayfr b;

    public ayfg(ayfr ayfrVar, Status status) {
        this.b = ayfrVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.b(this.a.getDescription(), this.a.r);
    }
}
