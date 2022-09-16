package defpackage;

import android.os.ConditionVariable;
/* compiled from: PG */
/* renamed from: zem  reason: default package */
/* loaded from: classes4.dex */
final class zem implements Runnable {
    final /* synthetic */ ConditionVariable a;
    final /* synthetic */ zen b;

    public zem(zen zenVar, ConditionVariable conditionVariable) {
        this.b = zenVar;
        this.a = conditionVariable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.block();
        this.b.d();
    }
}
