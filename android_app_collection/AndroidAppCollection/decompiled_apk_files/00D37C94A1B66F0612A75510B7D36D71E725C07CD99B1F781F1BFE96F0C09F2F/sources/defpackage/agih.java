package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import java.util.List;
/* compiled from: PG */
/* renamed from: agih  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agih implements Runnable {
    public final /* synthetic */ agio a;
    private final /* synthetic */ int b;

    public /* synthetic */ agih(agio agioVar) {
        this.a = agioVar;
    }

    public /* synthetic */ agih(agio agioVar, int i) {
        this.b = i;
        this.a = agioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<agqq> e;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.l.h();
                return;
            } else if (i == 2) {
                agio agioVar = this.a;
                agioVar.t.h();
                agioVar.L.y();
                return;
            } else if (i == 3) {
                agio agioVar2 = this.a;
                agioVar2.l.k(agioVar2.I);
                return;
            } else {
                final agio agioVar3 = this.a;
                ylr.c();
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: agic
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        agio agioVar4 = agio.this;
                        agioVar4.k.execute(new agih(agioVar4, 3));
                        return false;
                    }
                });
                return;
            }
        }
        agio agioVar4 = this.a;
        if (!agioVar4.z()) {
            return;
        }
        for (agqf agqfVar : agioVar4.L.f()) {
            ((agib) agioVar4.y.get()).x(agqfVar.a);
        }
        agjh agjhVar = (agjh) agioVar4.z.get();
        ylr.b();
        if (!agjhVar.b.z()) {
            e = amuk.q();
        } else {
            e = ((agmk) agjhVar.e.get()).e();
        }
        for (agqq agqqVar : e) {
            agjhVar.j(agqqVar.a);
        }
        for (agqv agqvVar : agioVar4.L.s()) {
            ((agjz) agioVar4.v.get()).G(agqvVar.m(), 1);
        }
    }
}
