package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: brrq  reason: default package */
/* loaded from: classes4.dex */
public final class brrq {
    public final bwqv a;
    @dzsi
    public cqkf<bruz> b;
    @dzsi
    public bwrs<ilo> c;
    @dzsi
    public bruz d;
    public boolean e = false;
    public final bwrr<ilo> f = new brro(this);
    final View.OnAttachStateChangeListener g = new brrp(this);
    private final cqkj h;
    private final Runnable i;
    private final bnhz j;
    private final brvv k;

    public brrq(brvv brvvVar, cqkj cqkjVar, bwqv bwqvVar, Runnable runnable, bnhz bnhzVar) {
        this.k = brvvVar;
        this.h = cqkjVar;
        this.a = bwqvVar;
        this.i = runnable;
        this.j = bnhzVar;
    }

    public final cqkf<bruz> a() {
        bwrs<ilo> bwrsVar;
        if (this.b == null) {
            cqkf<bruz> e = this.h.e(new brsx());
            this.b = e;
            e.e(b(this.g));
        }
        bruz d = this.b.d();
        this.d = d;
        if (d != null && (bwrsVar = this.c) != null) {
            d.QR(bwrsVar);
        }
        cqkf<bruz> cqkfVar = this.b;
        dbsk.s(cqkfVar);
        return cqkfVar;
    }

    public final bruz b(@dzsi View.OnAttachStateChangeListener onAttachStateChangeListener) {
        brvv brvvVar = this.k;
        bwrs<ilo> bwrsVar = this.c;
        dbsk.s(bwrsVar);
        return brvvVar.a(bwrsVar, onAttachStateChangeListener, this.i, this.j);
    }
}
