package defpackage;

import android.graphics.Rect;
import java.util.List;
/* compiled from: PG */
/* renamed from: akyy  reason: default package */
/* loaded from: classes.dex */
public final class akyy {
    @dzsi
    private Rect a;
    @dzsi
    private Rect b;
    private final List<amkz> c = dchl.a();
    @dzsi
    private dcdc<amkz> d;
    private final Rect e;
    @dzsi
    private amij f;

    public akyy(int i, int i2) {
        this.e = new Rect(0, 0, i, i2);
    }

    public final synchronized akyy a() {
        akyy akyyVar;
        akyyVar = new akyy(this.e.width(), this.e.height());
        akyyVar.b(this.a, this.b);
        return akyyVar;
    }

    public final void b(@dzsi Rect rect, @dzsi Rect rect2) {
        boolean z;
        amij amijVar;
        synchronized (this) {
            z = true;
            if (dbsd.a(rect, this.a) && dbsd.a(rect2, this.b)) {
                z = false;
            }
            this.a = rect;
            this.b = rect2;
            amijVar = this.f;
        }
        if (!z || amijVar == null) {
            return;
        }
        amijVar.a.e();
    }

    public final synchronized Rect c() {
        if (this.b == null) {
            this.b = this.e;
        }
        return this.b;
    }

    @Deprecated
    public final synchronized Rect d() {
        if (this.a == null) {
            this.a = this.e;
        }
        return this.a;
    }

    public final synchronized dcdc<amkz> e() {
        if (this.d == null) {
            this.d = dcdc.r(this.c);
        }
        return this.d;
    }

    public final synchronized void f() {
        this.d = null;
        this.c.clear();
    }

    public final synchronized void g(amkz amkzVar) {
        this.d = null;
        this.c.add(amkzVar);
    }

    public final synchronized void h(@dzsi amij amijVar) {
        this.f = amijVar;
    }
}
