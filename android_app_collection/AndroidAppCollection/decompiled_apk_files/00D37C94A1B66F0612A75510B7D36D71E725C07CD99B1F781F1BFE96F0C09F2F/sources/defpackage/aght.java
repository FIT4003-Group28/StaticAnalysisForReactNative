package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aght  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aght implements Runnable {
    public final /* synthetic */ agib a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ aght(agib agibVar, String str) {
        this.a = agibVar;
        this.b = str;
    }

    public /* synthetic */ aght(agib agibVar, String str, int i) {
        this.c = i;
        this.a = agibVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            agib agibVar = this.a;
            String str = this.b;
            if (!agibVar.h.z() || agibVar.d(str) == null) {
                return;
            }
            ylr.b();
            for (agqz agqzVar : agibVar.e.b(agibVar.c).values()) {
                if (str.equals(agxg.r(agqzVar.f)) && agxg.aa(agqzVar.f) && agqzVar.c()) {
                    String t = agxg.t(agqzVar.f);
                    ((agkg) agibVar.m.get()).g(t);
                    ((agkg) agibVar.m.get()).e(t);
                    agibVar.t.put(t, agqe.STREAM_DOWNLOAD_PENDING);
                }
            }
        } else if (i == 1) {
            agib agibVar2 = this.a;
            String str2 = this.b;
            ylr.b();
            aglj agljVar = (aglj) agibVar2.j.get();
            attl d = agljVar.d(str2);
            int U = ((agvq) agibVar2.d.get()).U(d);
            agqn f = agibVar2.f(str2);
            agwl b = ((agwk) agibVar2.q.get()).b();
            List<String> q = agljVar.q(str2);
            agqh n = agljVar.n(str2);
            if (n == null) {
                return;
            }
            agwj b2 = ((agwi) agibVar2.r.get()).b(n.a, q);
            b2.f();
            for (String str3 : q) {
                agwj agwjVar = b2;
                agib agibVar3 = agibVar2;
                agwl agwlVar = b;
                ((agkg) agibVar2.m.get()).h(str3, str2, null, d, null, U, f, 0, false, false, true);
                agwjVar.e(str3);
                agwlVar.c(str3);
                b = agwlVar;
                b2 = agwjVar;
                agibVar2 = agibVar3;
            }
        } else {
            agib agibVar4 = this.a;
            String str4 = this.b;
            if (!agibVar4.h.z()) {
                return;
            }
            agibVar4.x(str4);
        }
    }
}
