package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aydo  reason: default package */
/* loaded from: classes2.dex */
public final class aydo implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayep b;
    final /* synthetic */ ayat c;
    final /* synthetic */ aydt d;

    public aydo(aydt aydtVar, Status status, ayep ayepVar, ayat ayatVar) {
        this.d = aydtVar;
        this.a = status;
        this.b = ayepVar;
        this.c = ayatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d(this.a, this.b, this.c);
    }
}
