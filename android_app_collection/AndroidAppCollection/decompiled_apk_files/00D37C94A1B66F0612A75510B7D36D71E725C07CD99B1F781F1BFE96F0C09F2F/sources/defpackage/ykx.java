package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ykx  reason: default package */
/* loaded from: classes4.dex */
public final class ykx {
    private final ylg a;
    private final Executor b;
    private final amvn c;
    private final amvn d;

    public ykx(ylg ylgVar, Executor executor, List list, List list2) {
        this.a = ylgVar;
        this.b = executor;
        this.c = amvn.p(list);
        this.d = amvn.p(list2);
    }

    public final void a(apgb apgbVar, Runnable runnable, boolean z) {
        ylg ylgVar;
        ylg ylgVar2;
        if (!this.c.contains(apgbVar) || (ylgVar2 = this.a) == null) {
            if (this.d.contains(apgbVar) && (ylgVar = this.a) != null) {
                ylgVar.a(runnable, false);
                return;
            } else if (z) {
                runnable.run();
                return;
            } else {
                this.b.execute(runnable);
                return;
            }
        }
        ylgVar2.a(runnable, true);
    }

    public final void b(apgb apgbVar, Runnable runnable) {
        a(apgbVar, runnable, true);
    }

    public ykx(Executor executor) {
        this.a = null;
        this.b = executor;
        this.c = amyg.a;
        this.d = amyg.a;
    }
}
