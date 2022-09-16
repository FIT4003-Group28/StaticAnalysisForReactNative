package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tgw  reason: default package */
/* loaded from: classes4.dex */
public final class tgw implements tcy {
    public final int b;
    public final thu c;
    public final ths d;
    public final String e;
    private final Executor f;

    public tgw(String str, int i, thu thuVar, Executor executor) {
        thm thmVar = thm.b;
        this.b = i;
        this.c = thuVar;
        this.f = executor;
        this.d = new ths();
        this.e = str;
    }

    @Override // defpackage.tcy
    public final void a(boolean z) {
        if (z) {
            this.d.b();
            return;
        }
        this.d.c();
        this.f.execute(new Runnable() { // from class: tgv
            @Override // java.lang.Runnable
            public final void run() {
                tgw tgwVar = tgw.this;
                ths thsVar = tgwVar.d;
                String str = thq.COMMAND_EXECUTION.m;
                tho a = thp.a();
                a.b = Integer.valueOf(tgwVar.b);
                a.c(amyg.a);
                for (thn thnVar : thsVar.a(str, a)) {
                    tgwVar.c.f(tgwVar.e, thnVar.a());
                }
            }
        });
    }

    @Override // defpackage.tcy
    public final void b() {
        this.d.d();
    }
}
