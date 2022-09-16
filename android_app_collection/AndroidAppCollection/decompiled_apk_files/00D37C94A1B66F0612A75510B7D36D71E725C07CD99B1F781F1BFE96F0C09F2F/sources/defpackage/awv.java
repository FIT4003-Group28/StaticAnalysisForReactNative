package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: awv  reason: default package */
/* loaded from: classes2.dex */
public final class awv {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Handler handler, aww awwVar) {
        ptx.a(handler);
        ptx.a(awwVar);
        c(awwVar);
        this.a.add(new awu(handler, awwVar));
    }

    public final void b(final int i, final long j, final long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final awu awuVar = (awu) it.next();
            if (!awuVar.c) {
                awuVar.a.post(new Runnable() { // from class: awt
                    @Override // java.lang.Runnable
                    public final void run() {
                        awu awuVar2 = awu.this;
                        awuVar2.b.l(i, j, j2);
                    }
                });
            }
        }
    }

    public final void c(aww awwVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            awu awuVar = (awu) it.next();
            if (awuVar.b == awwVar) {
                awuVar.c = true;
                this.a.remove(awuVar);
            }
        }
    }
}
