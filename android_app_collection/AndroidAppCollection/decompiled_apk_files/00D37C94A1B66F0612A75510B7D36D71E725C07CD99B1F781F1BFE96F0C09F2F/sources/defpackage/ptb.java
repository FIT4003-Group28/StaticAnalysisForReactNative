package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ptb  reason: default package */
/* loaded from: classes4.dex */
public abstract class ptb implements psl {
    private final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public long c;
    private final PriorityQueue d;
    private psz e;
    private long f;

    public ptb() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new psz());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new pta(new pmy() { // from class: psy
                @Override // defpackage.pmy
                public final void a(pmz pmzVar) {
                    ptb ptbVar = ptb.this;
                    pta ptaVar = (pta) pmzVar;
                    ptaVar.clear();
                    ptbVar.b.add(ptaVar);
                }
            }));
        }
        this.d = new PriorityQueue();
    }

    private final void g(psz pszVar) {
        pszVar.clear();
        this.a.add(pszVar);
    }

    protected abstract psk a();

    @Override // defpackage.pmr
    /* renamed from: b */
    public pso i() {
        if (!this.b.isEmpty()) {
            while (!this.d.isEmpty()) {
                int i = pxi.a;
                if (((psz) this.d.peek()).f > this.c) {
                    break;
                }
                psz pszVar = (psz) this.d.poll();
                if (!pszVar.isEndOfStream()) {
                    c(pszVar);
                    if (!d()) {
                        g(pszVar);
                    } else {
                        psk a = a();
                        pso psoVar = (pso) this.b.pollFirst();
                        psoVar.e(pszVar.f, a, Long.MAX_VALUE);
                        g(pszVar);
                        return psoVar;
                    }
                } else {
                    pso psoVar2 = (pso) this.b.pollFirst();
                    psoVar2.addFlag(4);
                    g(pszVar);
                    return psoVar2;
                }
            }
        }
        return null;
    }

    protected abstract void c(psn psnVar);

    protected abstract boolean d();

    @Override // defpackage.pmr
    public void f() {
    }

    @Override // defpackage.pmr
    public final /* bridge */ /* synthetic */ Object h() {
        ptx.e(this.e == null);
        if (this.a.isEmpty()) {
            return null;
        }
        psz pszVar = (psz) this.a.pollFirst();
        this.e = pszVar;
        return pszVar;
    }

    @Override // defpackage.pmr
    public void j() {
        this.f = 0L;
        this.c = 0L;
        while (!this.d.isEmpty()) {
            int i = pxi.a;
            g((psz) this.d.poll());
        }
        psz pszVar = this.e;
        if (pszVar != null) {
            g(pszVar);
            this.e = null;
        }
    }

    @Override // defpackage.pmr
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        psn psnVar = (psn) obj;
        ptx.c(psnVar == this.e);
        psz pszVar = (psz) psnVar;
        if (pszVar.isDecodeOnly()) {
            g(pszVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            pszVar.b = j;
            this.d.add(pszVar);
        }
        this.e = null;
    }

    @Override // defpackage.psl
    public final void r(long j) {
        this.c = j;
    }
}
