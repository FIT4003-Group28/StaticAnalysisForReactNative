package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ankr  reason: default package */
/* loaded from: classes2.dex */
final class ankr implements btzi {
    final /* synthetic */ dssj a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ anku c;

    public ankr(anku ankuVar, dssj dssjVar, dbsg dbsgVar) {
        this.c = ankuVar;
        this.a = dssjVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr btzrVar, btzy btzyVar) {
        bvrj.BACKGROUND_THREADPOOL.c();
        synchronized (this.c) {
            if (!this.c.d.a()) {
                bvoo.h("Failed request without in-flight request.", new Object[0]);
            } else {
                Iterator it = this.c.b.iterator();
                while (it.hasNext()) {
                    ((anks) it.next()).b(this.c.d.b().a);
                }
                ((anks) ((dbsu) this.b).a).b(this.c.d.b().a);
                this.c.d = dbpy.a;
            }
            dbsg j = dbsg.j(this.c.c.poll());
            while (j.a()) {
                Iterator it2 = this.c.b.iterator();
                while (it2.hasNext()) {
                    ((anks) it2.next()).b(((ankt) j.b()).a);
                }
                j = dbsg.j(this.c.c.poll());
            }
        }
        this.c.c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        dssj dssjVar = (dssj) obj;
        bvrj.BACKGROUND_THREADPOOL.c();
        synchronized (this.c) {
            Iterator it = this.c.b.iterator();
            while (it.hasNext()) {
                ((anks) it.next()).c(this.a, dssjVar);
            }
            ((anks) ((dbsu) this.b).a).c(this.a, dssjVar);
        }
        this.c.c();
    }
}
