package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;
/* compiled from: PG */
/* renamed from: bagg  reason: default package */
/* loaded from: classes2.dex */
public final class bagg implements Executor {
    private final Executor a;

    public bagg(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        bagf bagfVar = new bagf(runnable, Thread.currentThread());
        this.a.execute(bagfVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = bagfVar.b;
        if (inlineExecutionProhibitedException == null) {
            bagfVar.a = null;
            return;
        }
        throw inlineExecutionProhibitedException;
    }
}
