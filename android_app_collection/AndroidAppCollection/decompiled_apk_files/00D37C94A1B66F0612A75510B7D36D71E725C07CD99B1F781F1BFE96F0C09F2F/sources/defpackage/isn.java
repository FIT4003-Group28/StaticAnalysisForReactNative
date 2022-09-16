package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: isn  reason: default package */
/* loaded from: classes3.dex */
public final class isn implements aimx {
    public final aaru b;
    private final Executor d;
    public final AtomicInteger c = new AtomicInteger(0);
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public isn(Executor executor, aaru aaruVar) {
        this.b = aaruVar;
        this.d = executor;
    }

    @Override // defpackage.aimx
    public final void rj(aina ainaVar) {
        if (this.c.get() == 0) {
            this.d.execute(new ism(this));
        }
        if (this.c.get() != 2) {
            ainaVar.S.add(0);
            return;
        }
        ainaVar.S.addAll(this.a);
    }
}
