package defpackage;
/* compiled from: PG */
/* renamed from: amxp  reason: default package */
/* loaded from: classes.dex */
public final class amxp implements bnuk {
    public final boolean b;
    public final boolean c;
    public final amxn d;
    @dzsi
    public final alhm e;
    @dzsi
    public final btrm f;
    private final Object[] h;
    private static final Object[] g = new Object[0];
    public static final amxp a = new amxp(false, false, new amxo());

    public amxp(boolean z, boolean z2, amxn amxnVar) {
        this.b = z;
        this.c = z2;
        this.d = amxnVar;
        this.e = null;
        this.h = g;
        this.f = null;
    }

    public amxp(boolean z, boolean z2, amxn amxnVar, alhm alhmVar, Object[] objArr, btrm btrmVar) {
        this.b = z;
        this.c = z2;
        this.d = amxnVar;
        this.e = alhmVar;
        this.h = objArr;
        this.f = btrmVar;
    }

    public final void a(akra akraVar) {
        alhn a2 = this.e.a(akraVar);
        a2.b = this.h;
        this.f.b(a2);
    }
}
