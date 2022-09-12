package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: vtx  reason: default package */
/* loaded from: classes7.dex */
public final class vtx implements Runnable {
    public volatile boolean a;
    private final bnsn b;
    private final List<akta> c;
    private final boolean d;
    private final akzh e;
    private float f = 1.0f;
    private float g = 0.0f;

    public vtx(bnsn bnsnVar, List<akta> list, akzh akzhVar, boolean z, boolean z2) {
        this.b = bnsnVar;
        this.c = list;
        this.d = z;
        this.e = akzhVar;
        this.a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float j = this.a ? 1.0f : ammd.j(this.e.p().k, this.d) / 2.0f;
        float f = -this.e.p().m;
        if (j == this.f && f == this.g) {
            return;
        }
        if (f != this.g) {
            this.g = f;
            for (int i = 0; i < this.c.size(); i++) {
                aksz d = this.c.get(i).d();
                d.d(-this.g, d.a);
                this.c.get(i).c(d);
            }
        }
        if (j != this.f) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                aksz d2 = this.c.get(i2).d();
                d2.c((d2.b.b - this.f) + j, aksy.PIXEL);
                this.c.get(i2).c(d2);
            }
            this.f = j;
        }
        this.b.q();
    }
}
