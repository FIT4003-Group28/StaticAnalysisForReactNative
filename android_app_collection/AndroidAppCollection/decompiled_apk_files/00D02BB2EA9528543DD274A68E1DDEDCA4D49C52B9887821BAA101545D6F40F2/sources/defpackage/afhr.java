package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: afhr  reason: default package */
/* loaded from: classes2.dex */
final class afhr implements Runnable {
    final /* synthetic */ dehn a;
    final /* synthetic */ afhs b;

    public afhr(afhs afhsVar, dehn dehnVar) {
        this.b = afhsVar;
        this.a = dehnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.d(this.a.get());
        } catch (InterruptedException e) {
            this.b.e(new ExecutionException(e));
        } catch (ExecutionException e2) {
            this.b.e(e2);
        }
    }
}
