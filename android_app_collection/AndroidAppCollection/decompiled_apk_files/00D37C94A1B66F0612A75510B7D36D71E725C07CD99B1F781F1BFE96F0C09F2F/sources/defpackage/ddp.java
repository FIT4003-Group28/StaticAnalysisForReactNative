package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: PG */
/* renamed from: ddp  reason: default package */
/* loaded from: classes3.dex */
public final class ddp implements dby {
    public static ddp a;
    public static final dbu c;
    public final ThreadPoolExecutor b;

    static {
        boolean z = dfz.a;
        c = new dbu(2, 2, 5);
    }

    public ddp(dbu dbuVar) {
        this.b = new dbv(dbuVar.a, dbuVar.b, dbuVar.c);
    }

    public static ddp d(dbu dbuVar) {
        return new ddp(dbuVar);
    }

    @Override // defpackage.dby
    public final void a(Runnable runnable) {
        this.b.remove(runnable);
    }

    @Override // defpackage.dby
    public final void b() {
    }

    @Override // defpackage.dby
    public final void c(Runnable runnable) {
        try {
            this.b.execute(runnable);
        } catch (RejectedExecutionException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Cannot execute layout calculation task; ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
    }
}
