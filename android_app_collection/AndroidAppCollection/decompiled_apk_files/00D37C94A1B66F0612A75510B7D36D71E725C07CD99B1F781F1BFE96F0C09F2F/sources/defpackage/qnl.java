package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;
/* compiled from: PG */
/* renamed from: qnl  reason: default package */
/* loaded from: classes4.dex */
public final class qnl {
    long b;
    public final qoh c;
    List d;
    final SparseIntArray e;
    final LruCache f;
    final List g;
    final Deque h;
    public qta i;
    public qta j;
    private final Handler l;
    private final TimerTask m;
    public final Set k = new HashSet();
    public final qpu a = new qpu("MediaQueue");

    public qnl(qoh qohVar) {
        this.c = qohVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.l = new rfm(Looper.getMainLooper());
        this.m = new qni(this);
        qnk qnkVar = new qnk(this);
        qnm.g("Must be called from the main thread.");
        qohVar.d.add(qnkVar);
        this.f = new qnj(this);
        this.b = a();
        g();
    }

    private final void j() {
        this.l.removeCallbacks(this.m);
    }

    private final void k() {
        qta qtaVar = this.j;
        if (qtaVar != null) {
            qtaVar.f();
            this.j = null;
        }
    }

    private final void l() {
        qta qtaVar = this.i;
        if (qtaVar != null) {
            qtaVar.f();
            this.i = null;
        }
    }

    public final long a() {
        MediaStatus e = this.c.e();
        if (e != null) {
            MediaInfo mediaInfo = e.a;
            if (!MediaStatus.d(e.e, e.f, e.l, mediaInfo == null ? -1 : mediaInfo.b)) {
                return e.b;
            }
            return 0L;
        }
        return 0L;
    }

    public final void b() {
        e();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        j();
        this.h.clear();
        k();
        l();
        d();
        c();
    }

    public final void c() {
        Iterator it = this.k.iterator();
        if (!it.hasNext()) {
            return;
        }
        qnm qnmVar = (qnm) it.next();
        throw null;
    }

    public final void d() {
        Iterator it = this.k.iterator();
        if (!it.hasNext()) {
            return;
        }
        qnm qnmVar = (qnm) it.next();
        throw null;
    }

    public final void e() {
        Iterator it = this.k.iterator();
        if (!it.hasNext()) {
            return;
        }
        qnm qnmVar = (qnm) it.next();
        throw null;
    }

    public final void f() {
        this.e.clear();
        for (int i = 0; i < this.d.size(); i++) {
            this.e.put(((Integer) this.d.get(i)).intValue(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [qta] */
    public final void g() {
        qnr qnrVar;
        qnm.g("Must be called from the main thread.");
        if (this.b != 0 && this.j == null) {
            k();
            l();
            qoh qohVar = this.c;
            qnm.g("Must be called from the main thread.");
            if (!qohVar.l()) {
                qnrVar = qoh.v();
            } else {
                qnr qnrVar2 = new qnr(qohVar);
                qoh.u(qnrVar2);
                qnrVar = qnrVar2;
            }
            this.j = qnrVar;
            qnrVar.g(new qnh(this, 1));
        }
    }

    public final void h() {
        j();
        this.l.postDelayed(this.m, 500L);
    }

    public final void i() {
        Iterator it = this.k.iterator();
        if (!it.hasNext()) {
            return;
        }
        qnm qnmVar = (qnm) it.next();
        throw null;
    }
}
