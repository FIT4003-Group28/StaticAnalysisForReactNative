package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: agcc  reason: default package */
/* loaded from: classes.dex */
public final class agcc {
    final /* synthetic */ agce a;

    public agcc(agce agceVar) {
        this.a = agceVar;
    }

    public final void a(asky askyVar, asla aslaVar) {
        synchronized (this.a.b) {
            this.a.a.X(agce.a(askyVar));
            if (aslaVar == null) {
                agce agceVar = this.a;
                agcb agcbVar = new agcb(agceVar, agce.a(askyVar));
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    agceVar.d.post(agcbVar);
                } else {
                    agcbVar.run();
                }
            }
            agce agceVar2 = this.a;
            agceVar2.c.h((ajfz) agceVar2.b.get(agce.a(askyVar)));
        }
    }

    public final void b(asky askyVar) {
        a(askyVar, null);
    }
}
