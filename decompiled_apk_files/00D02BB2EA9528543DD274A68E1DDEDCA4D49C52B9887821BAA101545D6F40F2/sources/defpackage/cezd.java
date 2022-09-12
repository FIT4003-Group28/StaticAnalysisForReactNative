package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cezd  reason: default package */
/* loaded from: classes4.dex */
final class cezd implements Runnable {
    private final List<akta> a;
    private final akzh b;
    private float c = 1.0f;

    public cezd(List<akta> list, akzh akzhVar) {
        this.a = list;
        this.b = akzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float j = ammd.j(this.b.p().k, true) / 2.0f;
        if (j == this.c) {
            return;
        }
        for (akta aktaVar : this.a) {
            aksz d = aktaVar.d();
            d.c(j, aksy.PIXEL);
            aktaVar.c(d);
        }
        this.c = j;
    }
}
