package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ppn  reason: default package */
/* loaded from: classes7.dex */
final class ppn implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ ppo a;

    public ppn(ppo ppoVar) {
        this.a = ppoVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(Map<String, Object> map) {
        this.a.a.runOnUiThread(new Runnable(this) { // from class: ppm
            private final ppn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ppo ppoVar = this.a.a;
                ppoVar.b.s();
                ppoVar.c.P(bvjk.jm);
                ppoVar.c.P(bvjk.jn);
                ppoVar.b.u();
                if (!ppoVar.d) {
                    gn g = ppoVar.a.g();
                    if (g != null && !g.J()) {
                        g.f();
                    }
                    ppoVar.d = true;
                }
            }
        });
        return bvwy.a;
    }
}
