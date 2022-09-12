package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: cmgs  reason: default package */
/* loaded from: classes5.dex */
abstract class cmgs implements cmgb {
    private final ArrayDeque<cmgq> a = new ArrayDeque<>();
    public final ArrayDeque<cmge> b;
    public long c;
    private final PriorityQueue<cmgq> d;
    private cmgq e;
    private long f;

    public cmgs() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new cmgq());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new cmgr(new clth(this) { // from class: cmgp
                private final cmgs a;

                {
                    this.a = this;
                }

                @Override // defpackage.clth
                public final void a(clti cltiVar) {
                    cmgs cmgsVar = this.a;
                    cmgr cmgrVar = (cmgr) cltiVar;
                    cmgrVar.clear();
                    cmgsVar.b.add(cmgrVar);
                }
            }));
        }
        this.d = new PriorityQueue<>();
    }

    private final void j(cmgq cmgqVar) {
        cmgqVar.clear();
        this.a.add(cmgqVar);
    }

    @Override // defpackage.cltd
    public final /* bridge */ /* synthetic */ cmgd a() {
        cmmn.c(this.e == null);
        if (this.a.isEmpty()) {
            return null;
        }
        cmgq pollFirst = this.a.pollFirst();
        this.e = pollFirst;
        return pollFirst;
    }

    @Override // defpackage.cltd
    public final /* bridge */ /* synthetic */ void b(cmgd cmgdVar) {
        cmmn.a(cmgdVar == this.e);
        cmgq cmgqVar = (cmgq) cmgdVar;
        if (cmgqVar.isDecodeOnly()) {
            j(cmgqVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            cmgqVar.g = j;
            this.d.add(cmgqVar);
        }
        this.e = null;
    }

    @Override // defpackage.cltd
    public void d() {
        this.f = 0L;
        this.c = 0L;
        while (!this.d.isEmpty()) {
            int i = cmny.a;
            j(this.d.poll());
        }
        cmgq cmgqVar = this.e;
        if (cmgqVar != null) {
            j(cmgqVar);
            this.e = null;
        }
    }

    @Override // defpackage.cltd
    public void e() {
    }

    @Override // defpackage.cltd
    /* renamed from: f */
    public cmge c() {
        if (!this.b.isEmpty()) {
            while (!this.d.isEmpty()) {
                int i = cmny.a;
                if (this.d.peek().d > this.c) {
                    break;
                }
                cmgq poll = this.d.poll();
                if (!poll.isEndOfStream()) {
                    i(poll);
                    if (!g()) {
                        j(poll);
                    } else {
                        cmga h = h();
                        cmge pollFirst = this.b.pollFirst();
                        pollFirst.e(poll.d, h, Long.MAX_VALUE);
                        j(poll);
                        return pollFirst;
                    }
                } else {
                    cmge pollFirst2 = this.b.pollFirst();
                    pollFirst2.addFlag(4);
                    j(poll);
                    return pollFirst2;
                }
            }
        }
        return null;
    }

    protected abstract boolean g();

    protected abstract cmga h();

    protected abstract void i(cmgd cmgdVar);

    @Override // defpackage.cmgb
    public final void l(long j) {
        this.c = j;
    }
}
