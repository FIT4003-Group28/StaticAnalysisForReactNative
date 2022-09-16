package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yte  reason: default package */
/* loaded from: classes4.dex */
public final class yte implements yts {
    public final yss a;
    private final agd c = new agd(10);

    public yte(yss yssVar) {
        this.a = yssVar;
    }

    private final void e(yua yuaVar, ytd ytdVar) {
        String f = f(yuaVar);
        if (TextUtils.isEmpty(f)) {
            return;
        }
        synchronized (this.c) {
            Queue queue = (Queue) this.c.get(f);
            if (queue != null) {
                while (!queue.isEmpty()) {
                    if (ytdVar.a((ytc) queue.poll())) {
                        return;
                    }
                }
            }
            if (queue == null || queue.isEmpty()) {
                this.c.remove(f);
            }
        }
    }

    private static final String f(yua yuaVar) {
        if (!yuaVar.h) {
            return null;
        }
        return yuaVar.l();
    }

    @Override // defpackage.yts
    public final void a(yua yuaVar) {
        e(yuaVar, new ytd() { // from class: ytb
            @Override // defpackage.ytd
            public final boolean a(ytc ytcVar) {
                yte yteVar = yte.this;
                ysq ysqVar = ytcVar.a;
                if (!ysqVar.c()) {
                    yteVar.a.d(ytcVar.b, ysqVar);
                    return true;
                }
                ysqVar.d();
                return false;
            }
        });
    }

    @Override // defpackage.yts
    public final void b(yua yuaVar, final cfb cfbVar) {
        e(yuaVar, new ytd() { // from class: yta
            @Override // defpackage.ytd
            public final boolean a(ytc ytcVar) {
                ytcVar.a.a(ytcVar.b, cfb.this);
                return false;
            }
        });
    }

    @Override // defpackage.yts
    public final boolean c(yua yuaVar) {
        String f = f(yuaVar);
        boolean z = false;
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        synchronized (this.c) {
            Queue queue = (Queue) this.c.get(f);
            if (queue != null && !queue.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.yts
    public final boolean d(yua yuaVar, ysq ysqVar) {
        String f = f(yuaVar);
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        synchronized (this.c) {
            if (this.c.containsKey(f)) {
                Queue queue = (Queue) this.c.get(f);
                if (queue == null) {
                    queue = new ArrayDeque();
                    this.c.put(f, queue);
                }
                return queue.offer(new ytc(ysqVar, yuaVar));
            }
            this.c.put(f, null);
            return false;
        }
    }
}
