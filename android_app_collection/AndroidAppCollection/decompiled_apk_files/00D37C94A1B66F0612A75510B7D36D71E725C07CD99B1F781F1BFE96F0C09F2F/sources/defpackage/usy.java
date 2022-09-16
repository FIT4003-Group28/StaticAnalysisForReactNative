package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: usy  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class usy implements Callable {
    public final /* synthetic */ usz a;
    private final /* synthetic */ int b;

    public /* synthetic */ usy(usz uszVar, int i) {
        this.b = i;
        this.a = uszVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            usz uszVar = this.a;
            ((amzw) ((amzw) usz.a.c()).i("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterResume", 85, "DeferrableExecutor.java")).q("DeferrableExecutor unblocked after onResume");
            uszVar.a();
            return null;
        }
        usz uszVar2 = this.a;
        ((amzw) ((amzw) usz.a.c()).i("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterMaxDelay", 79, "DeferrableExecutor.java")).q("DeferrableExecutor unblocked after max task delay");
        uszVar2.a();
        return null;
    }
}
