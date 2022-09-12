package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;
/* compiled from: PG */
/* renamed from: eamf  reason: default package */
/* loaded from: classes6.dex */
public final class eamf implements Executor {
    private final Executor a;

    public eamf(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        eame eameVar = new eame(runnable, Thread.currentThread());
        this.a.execute(eameVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = eameVar.b;
        if (inlineExecutionProhibitedException == null) {
            eameVar.a = null;
            return;
        }
        throw inlineExecutionProhibitedException;
    }
}
