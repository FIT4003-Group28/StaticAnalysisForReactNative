package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealh  reason: default package */
/* loaded from: classes6.dex */
public final class ealh implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    public ealh(Executor executor, int i, boolean z, int i2) {
        this.a = executor;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new ealb(this, runnable));
    }
}
