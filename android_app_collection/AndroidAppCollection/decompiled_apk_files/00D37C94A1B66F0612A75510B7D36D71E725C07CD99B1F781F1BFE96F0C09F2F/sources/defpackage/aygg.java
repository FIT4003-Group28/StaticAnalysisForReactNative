package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aygg  reason: default package */
/* loaded from: classes2.dex */
final class aygg implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayep b;
    final /* synthetic */ ayat c;
    final /* synthetic */ aygh d;

    public aygg(aygh ayghVar, Status status, ayep ayepVar, ayat ayatVar) {
        this.d = ayghVar;
        this.a = status;
        this.b = ayepVar;
        this.c = ayatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
