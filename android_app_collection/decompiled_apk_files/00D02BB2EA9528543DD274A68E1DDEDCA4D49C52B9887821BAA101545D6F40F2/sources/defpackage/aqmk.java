package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqmk  reason: default package */
/* loaded from: classes2.dex */
public final class aqmk {
    public final bvjj a;
    public final dxio<aqaa> b;
    private final dxio<acwo> c;
    private final dxio<akfa> d;
    private final Executor e;

    public aqmk(bvjj bvjjVar, dxio<aqaa> dxioVar, dxio<acwo> dxioVar2, dxio<akfa> dxioVar3, Executor executor) {
        this.a = bvjjVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = executor;
    }

    public final void a() {
        btlu j;
        if (this.b.a().b || (j = this.d.a().j()) == null || !j.l() || !this.a.o(bvjk.iy, j, false)) {
            return;
        }
        deha.q(this.c.a().i(dvum.BUSINESS_MESSAGING_INBOX, null), new aqmj(this, j), this.e);
    }
}
