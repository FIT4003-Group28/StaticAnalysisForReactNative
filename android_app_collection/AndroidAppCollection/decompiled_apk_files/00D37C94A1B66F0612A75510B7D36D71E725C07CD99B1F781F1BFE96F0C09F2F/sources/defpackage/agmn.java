package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agmn  reason: default package */
/* loaded from: classes.dex */
public final class agmn implements Runnable {
    final /* synthetic */ agmr a;

    public agmn(agmr agmrVar) {
        this.a = agmrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agmr agmrVar = this.a;
        agmrVar.e.close();
        try {
            if (agmrVar.h != null) {
                List g = agmrVar.b.g();
                for (agmx agmxVar : agmrVar.h.b()) {
                    if (agmxVar.b() == agqe.COMPLETE || agmxVar.b() == agqe.REQUIRES_CONTENT_VERIFICATION) {
                        agml a = agmrVar.h.a(agmxVar.c().f());
                        if (a != null) {
                            agql c = a.c();
                            agql a2 = a.a();
                            boolean z = false;
                            if (agmrVar.n(c, g) && agmrVar.n(a2, g)) {
                                z = true;
                            }
                            a.f(z);
                        }
                    }
                }
                for (agin aginVar : agmrVar.f) {
                    aginVar.a.v(new agnj());
                }
            }
        } finally {
            agmrVar.e.open();
        }
    }
}
