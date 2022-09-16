package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayfo  reason: default package */
/* loaded from: classes2.dex */
final class ayfo implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayat b;
    final /* synthetic */ ayfq c;

    public ayfo(ayfq ayfqVar, Status status, ayat ayatVar) {
        this.c = ayfqVar;
        this.a = status;
        this.b = ayatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c.a(this.a, this.b);
    }
}
