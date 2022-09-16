package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ist  reason: default package */
/* loaded from: classes3.dex */
public final class ist implements abea {
    public final aaru b;
    private final Executor d;
    private final aacz e;
    public final AtomicInteger c = new AtomicInteger(0);
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public ist(Executor executor, aaru aaruVar, aacz aaczVar) {
        this.b = aaruVar;
        this.d = executor;
        this.e = aaczVar;
    }

    @Override // defpackage.abea
    public final void nq(abed abedVar) {
        apyy b = this.e.b();
        if (b != null) {
            asxj asxjVar = b.e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (asxjVar.bP) {
                amuk a = this.b.a();
                int i = ((amxx) a).c;
                for (int i2 = 0; i2 < i; i2++) {
                    abedVar.t(((Integer) a.get(i2)).intValue());
                }
                return;
            }
        }
        if (this.c.get() == 0) {
            this.d.execute(new iss(this));
        }
        if (this.c.get() == 2) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                abedVar.t(((Integer) it.next()).intValue());
            }
            return;
        }
        abedVar.t(0);
    }
}
