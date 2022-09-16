package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayik  reason: default package */
/* loaded from: classes2.dex */
public final class ayik implements Executor {
    final /* synthetic */ ayji a;

    public ayik(ayji ayjiVar) {
        this.a = ayjiVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.m.a().execute(runnable);
    }
}
