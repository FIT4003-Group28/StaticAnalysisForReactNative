package defpackage;

import android.util.Pair;
import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: cttm  reason: default package */
/* loaded from: classes5.dex */
public final class cttm<ResultT> {
    private final ArrayDeque<Pair<deig<ResultT>, deff<ResultT>>> b = new ArrayDeque<>();
    public dehn<ResultT> a = null;

    public final synchronized dehn<ResultT> a(deff<ResultT> deffVar) {
        deig d;
        d = deig.d();
        this.b.add(new Pair<>(d, deffVar));
        if (this.a == null) {
            c();
        }
        return d;
    }

    public final synchronized void b(Throwable th) {
        while (true) {
            Pair<deig<ResultT>, deff<ResultT>> poll = this.b.poll();
            if (poll != null) {
                ((deig) poll.first).k(new cttl(th));
            }
        }
    }

    public final synchronized void c() {
        final Pair<deig<ResultT>, deff<ResultT>> poll = this.b.poll();
        if (poll == null) {
            return;
        }
        dehn<ResultT> a = ((deff) poll.second).a();
        this.a = a;
        a.Pk(new Runnable(this, poll) { // from class: cttk
            private final cttm a;
            private final Pair b;

            {
                this.a = this;
                this.b = poll;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cttm cttmVar = this.a;
                Pair pair = this.b;
                synchronized (cttmVar) {
                    try {
                        ((deig) pair.first).j(cttmVar.a.get());
                        cttmVar.a = null;
                        cttmVar.c();
                    }
                }
            }
        }, dege.a);
    }
}
