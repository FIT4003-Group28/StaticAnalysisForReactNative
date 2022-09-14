package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyqt  reason: default package */
/* loaded from: classes6.dex */
public final class dyqt implements Executor {
    final /* synthetic */ dyrz a;

    public dyqt(dyrz dyrzVar) {
        this.a = dyrzVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.k.a().execute(runnable);
    }
}
