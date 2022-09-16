package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaos  reason: default package */
/* loaded from: classes.dex */
public final class aaos implements Executor {
    private final Executor c;
    public boolean b = false;
    public List a = new ArrayList();

    public aaos(Executor executor) {
        this.c = executor;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.a.add(runnable);
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.execute(new Runnable() { // from class: aaor
            @Override // java.lang.Runnable
            public final void run() {
                List<Runnable> list;
                aaos aaosVar = aaos.this;
                while (true) {
                    synchronized (aaosVar) {
                        if (aaosVar.a.isEmpty()) {
                            aaosVar.b = false;
                            return;
                        } else {
                            list = aaosVar.a;
                            aaosVar.a = new ArrayList();
                        }
                    }
                    for (Runnable runnable2 : list) {
                        runnable2.run();
                    }
                }
            }
        });
    }
}
