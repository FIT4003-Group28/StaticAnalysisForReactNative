package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: asmk  reason: default package */
/* loaded from: classes2.dex */
public final class asmk implements gll {
    private final gll a;
    private final eeu b;
    private final Rect c = new Rect();
    private final Rect d = new Rect();

    public asmk(gll gllVar, eeu eeuVar) {
        this.a = gllVar;
        dbsk.s(eeuVar);
        this.b = eeuVar;
    }

    @Override // defpackage.gll
    public final Rect b() {
        if (!h()) {
            return new Rect(this.c);
        }
        Rect b = this.a.b();
        b.left += this.d.left;
        b.top += this.d.top;
        b.right -= this.d.right;
        b.bottom -= this.d.bottom;
        if (b.isEmpty()) {
            b.set(this.c);
        } else {
            this.c.set(b);
        }
        return b;
    }

    @Override // defpackage.gll
    public final Rect[] c() {
        return new Rect[]{b()};
    }

    @Override // defpackage.gll
    public final Rect d() {
        throw null;
    }

    @Override // defpackage.gll
    public final Rect e() {
        return b();
    }

    @Override // defpackage.gll
    public final Rect f() {
        return b();
    }

    @Override // defpackage.gll
    @dzsi
    public final View g() {
        return ((gle) this.a).a();
    }

    @Override // defpackage.gll
    public final boolean h() {
        return ((efh) this.b).b && this.a.h();
    }

    @Override // defpackage.gll
    public final Point i() {
        return this.a.i();
    }
}
