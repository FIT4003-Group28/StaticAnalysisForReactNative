package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bxee  reason: default package */
/* loaded from: classes4.dex */
public final class bxee {
    public boolean a;
    final /* synthetic */ bxef b;
    @dzsi
    private final bxep<?, ?> c;

    public bxee(@dzsi bxef bxefVar, bxep<?, ?> bxepVar) {
        this.b = bxefVar;
        this.c = bxepVar;
    }

    public final void a(@dzsi dwjp dwjpVar, @dzsi bttq bttqVar, boolean z, List<bxmg> list) {
        bxep<?, ?> bxepVar;
        synchronized (this.b) {
            if (!this.a && (bxepVar = this.c) != null) {
                if (bttqVar == null && dwjpVar != null) {
                    if (z) {
                        dwjh dwjhVar = dwjpVar.b;
                        if (dwjhVar == null) {
                            dwjhVar = dwjh.c;
                        }
                        if (dwjhVar.a.isEmpty()) {
                            return;
                        }
                    }
                    ((bxea) this.c).b(dwjpVar, !z, list);
                    this.b.b(this.c, z);
                    return;
                }
                bxef.d(bxepVar);
            }
        }
    }
}
