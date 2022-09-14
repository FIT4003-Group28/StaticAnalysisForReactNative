package defpackage;
/* compiled from: PG */
/* renamed from: eaoh  reason: default package */
/* loaded from: classes6.dex */
public final class eaoh {
    protected final eanb a = new eaof();
    protected final eanb b = new eaog();
    protected int c = 0;

    public static final void h(eams eamsVar) {
        eamsVar.h(' ');
    }

    public static final void i(eams eamsVar) {
        eamsVar.h('[');
    }

    public static final void j(eams eamsVar) {
        eamsVar.g(" : ");
    }

    public final void a(eams eamsVar) {
        eamsVar.h('{');
        this.c++;
    }

    public final void b(eams eamsVar) {
        this.b.a(eamsVar, this.c);
    }

    public final void c(eams eamsVar) {
        eamsVar.h(',');
        this.b.a(eamsVar, this.c);
    }

    public final void d(eams eamsVar, int i) {
        int i2 = this.c - 1;
        this.c = i2;
        if (i > 0) {
            this.b.a(eamsVar, i2);
        } else {
            eamsVar.h(' ');
        }
        eamsVar.h('}');
    }

    public final void e(eams eamsVar) {
        this.a.a(eamsVar, this.c);
    }

    public final void f(eams eamsVar) {
        eamsVar.h(',');
        this.a.a(eamsVar, this.c);
    }

    public final void g(eams eamsVar, int i) {
        if (i > 0) {
            this.a.a(eamsVar, this.c);
        } else {
            eamsVar.h(' ');
        }
        eamsVar.h(']');
    }
}
