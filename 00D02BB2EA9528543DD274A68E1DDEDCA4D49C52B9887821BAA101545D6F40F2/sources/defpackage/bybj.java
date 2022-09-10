package defpackage;

import java.util.List;
import java.util.Random;
/* compiled from: PG */
/* renamed from: bybj  reason: default package */
/* loaded from: classes4.dex */
final class bybj {
    public final bvrb a;
    private final Random c;
    private final bybp d;
    private final akra e = new akra();
    public boolean b = false;

    public bybj(bybp bybpVar, bvrb bvrbVar, Random random) {
        this.d = bybpVar;
        this.a = bvrbVar;
        this.c = random;
    }

    public final void a() {
        if (!this.d.e()) {
            this.b = false;
            return;
        }
        for (byay byayVar : ((byax) this.d).b) {
            bqyh bqyhVar = byayVar.b;
            if (bqyhVar != null) {
                double d = byayVar.c + 10.0d;
                if (d < bqyhVar.c()) {
                    byayVar.c = d;
                    bqyhVar.a(d, this.e);
                    byayVar.a = this.e.S();
                } else {
                    byayVar.a = bqyhVar.c.S();
                    List<? extends bqyh> e = bqyhVar.e();
                    if (e.isEmpty()) {
                        bybp bybpVar = this.d;
                        byax byaxVar = (byax) bybpVar;
                        dbsk.a(byaxVar.b.contains(byayVar));
                        byayVar.b = null;
                        byaxVar.b(byayVar);
                        bybpVar.f();
                    } else {
                        bqyh bqyhVar2 = e.get(this.c.nextInt(e.size()));
                        byayVar.b = bqyhVar2;
                        byayVar.c = dcyn.a;
                        byayVar.a = bqyhVar2.b.S();
                    }
                }
            }
        }
        this.d.f();
        this.a.a(new Runnable(this) { // from class: bybi
            private final bybj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, bvrj.UI_THREAD, 1000L);
    }
}
