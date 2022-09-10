package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: PG */
/* renamed from: bwil  reason: default package */
/* loaded from: classes4.dex */
final class bwil implements cjqw {
    final ConcurrentLinkedQueue<Long> a = new ConcurrentLinkedQueue<>();
    final /* synthetic */ bwim b;

    public bwil(bwim bwimVar) {
        this.b = bwimVar;
    }

    @Override // defpackage.cjqw
    public final void c(cjte cjteVar, cjtd cjtdVar) {
        Long peek;
        synchronized (this.a) {
            long b = this.b.r.b();
            this.a.add(Long.valueOf(b));
            while (!this.a.isEmpty() && ((peek = this.a.peek()) == null || b - peek.longValue() > bwim.b)) {
                this.a.poll();
            }
            if (this.a.size() >= 200) {
                cjqy cjqyVar = this.b.f;
                cjsx i = cjsy.i();
                i.b(ddda.fM);
                cjqyVar.k(i.a());
                this.a.clear();
            }
        }
    }
}
