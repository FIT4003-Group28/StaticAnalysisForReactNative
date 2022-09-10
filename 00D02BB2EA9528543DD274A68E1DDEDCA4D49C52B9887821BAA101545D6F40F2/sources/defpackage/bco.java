package defpackage;

import androidx.work.Worker;
/* compiled from: PG */
/* renamed from: bco  reason: default package */
/* loaded from: classes3.dex */
public final class bco implements Runnable {
    final /* synthetic */ Worker a;

    public bco(Worker worker) {
        this.a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.d.f((bid<bbx>) this.a.h());
        } catch (Throwable th) {
            this.a.d.g(th);
        }
    }
}
