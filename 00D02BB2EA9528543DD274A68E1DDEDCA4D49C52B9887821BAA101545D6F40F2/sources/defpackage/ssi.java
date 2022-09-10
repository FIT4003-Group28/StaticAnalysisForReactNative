package defpackage;

import android.util.SparseArray;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ssi  reason: default package */
/* loaded from: classes7.dex */
public final class ssi implements qed {
    public final vtn a;
    private final buxo b;
    private final vly c;
    private final srz d;
    private final Executor e;
    private final SparseArray<btzc> f = new SparseArray<>();
    private final AtomicInteger g = new AtomicInteger();

    public ssi(buxo buxoVar, vly vlyVar, vtn vtnVar, srz srzVar, Executor executor) {
        this.b = buxoVar;
        this.c = vlyVar;
        this.a = vtnVar;
        this.d = srzVar;
        this.e = executor;
    }

    @Override // defpackage.qed
    public final void a(qea qeaVar, degu<qec> deguVar) {
        djqn bZ = djqw.h.bZ();
        double b = qeaVar.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djqw djqwVar = (djqw) bZ.b;
        djqwVar.a |= 1;
        djqwVar.b = b;
        djqr c = qeaVar.c().c(djqr.DEFAULT_RANKING_STRATEGY);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djqw djqwVar2 = (djqw) bZ.b;
        djqwVar2.c = c.c;
        djqwVar2.a |= 2;
        dvzd e = qeaVar.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djqw djqwVar3 = (djqw) bZ.b;
        e.getClass();
        djqwVar3.e = e;
        djqwVar3.a |= 8;
        djqo bZ2 = djqp.c.bZ();
        dquf a = this.d.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djqp djqpVar = (djqp) bZ2.b;
        a.getClass();
        djqpVar.b = a;
        djqpVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djqw djqwVar4 = (djqw) bZ.b;
        djqp bK = bZ2.bK();
        bK.getClass();
        djqwVar4.f = bK;
        djqwVar4.a |= 16;
        dnqh dnqhVar = dnqh.p;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djqw djqwVar5 = (djqw) bZ.b;
        dnqhVar.getClass();
        djqwVar5.g = dnqhVar;
        djqwVar5.a |= 32;
        if (qeaVar.d().a()) {
            djqt b2 = qeaVar.d().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djqw djqwVar6 = (djqw) bZ.b;
            b2.getClass();
            djqwVar6.d = b2;
            djqwVar6.a |= 4;
        }
        buac buacVar = ((buxp) this.b).c;
        akqq a2 = qeaVar.a();
        buacVar.f = new srn(a2.a, a2.b);
        int incrementAndGet = this.g.incrementAndGet();
        btzc b3 = this.c.a(((buxp) this.b).b()).b(bZ.bK(), new ssg(this, incrementAndGet, deguVar), this.e);
        synchronized (this) {
            this.f.put(incrementAndGet, b3);
        }
    }

    @Override // defpackage.qed
    public final synchronized void b() {
        for (int i = 0; i < this.f.size(); i++) {
            btzc btzcVar = this.f.get(this.f.keyAt(i));
            if (btzcVar != null) {
                btzcVar.a();
            }
        }
        this.f.clear();
    }

    public final synchronized void c(int i) {
        this.f.delete(i);
    }
}
