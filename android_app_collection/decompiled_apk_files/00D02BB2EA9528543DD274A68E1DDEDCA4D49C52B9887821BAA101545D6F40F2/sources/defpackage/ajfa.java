package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: ajfa  reason: default package */
/* loaded from: classes2.dex */
public final class ajfa implements Runnable {
    final /* synthetic */ deig a;
    final /* synthetic */ btzc b;

    public ajfa(deig deigVar, btzc btzcVar) {
        this.a = deigVar;
        this.b = btzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.isDone()) {
            this.b.a();
            this.a.k(new TimeoutException());
        }
    }
}
