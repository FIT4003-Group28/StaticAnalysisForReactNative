package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: arcq  reason: default package */
/* loaded from: classes.dex */
public class arcq implements arcb {
    public static final Object[] a = new Object[0];
    public static final int b = bntn.CLIENT_INJECTED_AREAS_ABOVE_LABELS_AND_CALLOUTS.c();
    public final dbty<akta> c;
    public arcp e;
    public String f;
    private final aksp g;
    public boolean d = false;
    private boolean h = false;

    public arcq(final akxa akxaVar, String str, final arcp arcpVar, final int i) {
        this.g = akxaVar.a;
        this.f = str;
        this.e = arcpVar;
        this.c = dbud.a(new dbty(this, akxaVar, arcpVar, i) { // from class: arck
            private final arcq a;
            private final akxa b;
            private final arcp c;
            private final int d;

            {
                this.a = this;
                this.b = akxaVar;
                this.c = arcpVar;
                this.d = i;
            }

            @Override // defpackage.dbty
            public final Object a() {
                arcq arcqVar = this.a;
                akxa akxaVar2 = this.b;
                arcp arcpVar2 = this.c;
                int i2 = this.d;
                arcqVar.d = true;
                return akxaVar2.b(dcyn.a, dcyn.a, 4, 2.0f, true, arcpVar2.c.a(), false, false, 3, arca.a(i2));
            }
        });
    }

    @Override // defpackage.arcb
    public final void a(boolean z) {
        if (z == this.h) {
            return;
        }
        this.h = z;
        if (z) {
            this.g.c(this.c.a());
        } else {
            this.g.d(this.c.a());
        }
    }

    @Override // defpackage.arcb
    public final void b() {
        if (this.d) {
            this.g.d(this.c.a());
            this.g.a(this.c.a());
        }
    }

    public final int c() {
        return this.e.a;
    }

    public final void d(alhm alhmVar, btrm btrmVar, Executor executor) {
        this.c.a().Pt(new arcm(this, alhmVar, btrmVar, executor));
    }

    public final void e(@dzsi akra akraVar, @dzsi Float f, @dzsi Float f2, @dzsi Float f3) {
        aksz d = this.c.a().d();
        if (akraVar != null) {
            d.b(akraVar);
            d.d(d.d, akraVar);
        }
        if (f != null) {
            d.c(f.floatValue(), aksy.PIXEL);
        }
        if (f2 != null) {
            d.d(-f2.floatValue(), d.a);
        }
        this.c.a().c(d);
        if (f3 != null) {
            this.c.a().a(f3.floatValue());
        }
    }

    public arcq(final akxa akxaVar, String str, final arcp arcpVar, final int i, final int i2) {
        this.g = akxaVar.a;
        this.f = str;
        this.e = arcpVar;
        this.c = dbud.a(new dbty(this, akxaVar, i2, arcpVar, i) { // from class: arcj
            private final arcq a;
            private final akxa b;
            private final int c;
            private final arcp d;
            private final int e;

            {
                this.a = this;
                this.b = akxaVar;
                this.c = i2;
                this.d = arcpVar;
                this.e = i;
            }

            @Override // defpackage.dbty
            public final Object a() {
                arcq arcqVar = this.a;
                akxa akxaVar2 = this.b;
                int i3 = this.c;
                arcp arcpVar2 = this.d;
                int i4 = this.e;
                arcqVar.d = true;
                akta b2 = akxaVar2.b(dcyn.a, dcyn.a, i3, 2.0f, true, arcpVar2.c.a(), false, false, 3, arca.a(i4));
                aksz d = b2.d();
                d.c(arcpVar2.b, aksy.PIXEL);
                b2.c(d);
                return b2;
            }
        });
    }
}
