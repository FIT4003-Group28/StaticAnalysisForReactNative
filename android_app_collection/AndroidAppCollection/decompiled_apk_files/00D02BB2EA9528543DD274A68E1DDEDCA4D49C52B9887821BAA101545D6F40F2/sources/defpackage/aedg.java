package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aedg  reason: default package */
/* loaded from: classes.dex */
final class aedg implements aecl {
    private static final int a = (int) TimeUnit.DAYS.toSeconds(1);
    private final cqat b;
    private final bvjj c;
    private final aecm d;
    private final List<dkuk> e;
    private final int f;
    private final long g;

    public aedg(cqat cqatVar, btvo btvoVar, bvjj bvjjVar, aecm aecmVar) {
        this.b = cqatVar;
        this.c = bvjjVar;
        this.d = aecmVar;
        this.e = btvoVar.getPassiveAssistParameters().a().ai;
        this.f = (int) TimeUnit.SECONDS.toMillis(btvoVar.getSavedStateExpirationParameters().b);
        this.g = bvjjVar.w(bvjk.N, 0L);
    }

    private final void e(dktk dktkVar, int i) {
        aecm aecmVar = this.d;
        long j = this.g;
        StringBuilder sb = new StringBuilder(31);
        sb.append("promote_tab");
        sb.append(j);
        aecmVar.h(this, i, dktkVar, sb.toString(), a);
    }

    @Override // defpackage.aeck
    public final String a() {
        return "promote_explore";
    }

    @Override // defpackage.aeck
    public final void b() {
    }

    @Override // defpackage.aeck
    public final void c() {
    }

    @Override // defpackage.aecl
    public final void d(dktk dktkVar) {
        List<dkuk> list;
        if (this.e.isEmpty() || this.e.size() == 1) {
            list = this.e;
        } else {
            list = new ArrayList();
            dkuk dkukVar = null;
            for (dkuk dkukVar2 : this.e) {
                int a2 = dkuj.a(dkukVar2.b);
                if (a2 == 0) {
                    a2 = 2;
                }
                int i = a2 - 1;
                if (i == 2 || i == 3) {
                    if (dkukVar == null || dkukVar2.c > dkukVar.c) {
                        dkukVar = dkukVar2;
                    }
                } else if (i == 4) {
                    list.add(dkukVar2);
                }
            }
            if (dkukVar != null) {
                list.add(dkukVar);
            }
        }
        int i2 = 0;
        for (dkuk dkukVar3 : list) {
            dktk b = dktk.b(dkukVar3.a);
            if (b == null) {
                b = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
            }
            int a3 = dkuj.a(dkukVar3.b);
            if (a3 == 0) {
                a3 = 2;
            }
            if (a3 != 2 && a3 != 1 && this.d.g.e(b) && dkukVar3.c > this.c.s(bvjk.gn, 0) && (dktkVar != b || a3 == 5)) {
                if (this.b.b() - this.g >= this.f) {
                    dktk b2 = dktk.b(dkukVar3.a);
                    if (b2 == null) {
                        b2 = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
                    }
                    int a4 = dkuj.a(dkukVar3.b);
                    if (a4 == 0) {
                        a4 = 2;
                    }
                    int i3 = a4 - 1;
                    if (i3 == 2) {
                        e(b2, 3);
                    } else if (i3 == 3) {
                        e(b2, 3);
                    } else if (i3 == 4) {
                        e(b2, 2);
                    }
                    i2 = Math.max(i2, dkukVar3.c);
                }
            }
        }
        if (i2 > this.c.s(bvjk.gn, 0)) {
            this.c.W(bvjk.gn, i2);
        }
    }
}
