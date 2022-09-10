package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: axxw  reason: default package */
/* loaded from: classes3.dex */
public final class axxw implements dbrn<azwv, azwv> {
    public final axwk a;
    private final axwb b;
    private final axwi c;
    private final dbty<Boolean> d;
    private final dbty<Boolean> e;
    private final dbty<dcep<String>> f;

    public axxw(axwq axwqVar, axwi axwiVar, final axwk axwkVar) {
        final axwb x = axwqVar.x();
        this.b = x;
        this.c = axwiVar;
        this.a = axwkVar;
        x.getClass();
        this.d = dbud.a(new dbty(x) { // from class: axxr
            private final axwb a;

            {
                this.a = x;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.g());
            }
        });
        axwkVar.getClass();
        this.e = dbud.a(new dbty(axwkVar) { // from class: axxs
            private final axwk a;

            {
                this.a = axwkVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.c());
            }
        });
        this.f = dbud.a(new dbty(this) { // from class: axxt
            private final axxw a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                try {
                    return this.a.a.b().get();
                } catch (InterruptedException | ExecutionException unused) {
                    return dcmr.a;
                }
            }
        });
    }

    @Override // defpackage.dbrn
    @dzsi
    /* renamed from: b */
    public final azwv a(azwv azwvVar) {
        Set<azwu> f;
        azwq o = azwvVar.o();
        if (!this.c.q() && !this.e.a().booleanValue()) {
            o.h(false);
        }
        if (this.c.p() != null) {
            o.h(false);
        }
        if (!this.d.a().booleanValue()) {
            o.f(null);
        }
        if (this.c.q()) {
            f = dcmr.a;
        } else {
            final dcep<String> a = this.f.a();
            dcen N = dcep.N();
            baad p = this.c.p();
            final azwl azwlVar = p instanceof azzp ? ((azzp) p).ao().j : null;
            baad p2 = this.c.p();
            if (azwlVar != null) {
                dbsk.s(p2);
                if (!p2.ac()) {
                    dbsg m = dcft.m(azwvVar.n(), new dbsl(azwlVar) { // from class: axxu
                        private final azwl a;

                        {
                            this.a = azwlVar;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            azwl azwlVar2 = this.a;
                            azwu azwuVar = (azwu) obj;
                            return azwuVar.a().equals(azwlVar2.a) || azwuVar.a().equals(azwlVar2.b);
                        }
                    });
                    if (m.a()) {
                        N.b((azwu) m.b());
                    }
                    f = N.f();
                }
            }
            N.i(dcft.i(azwvVar.n(), new dbsl(a) { // from class: axxv
                private final dcep a;

                {
                    this.a = a;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.contains(((azwu) obj).a());
                }
            }));
            f = N.f();
        }
        o.g(f);
        azwv i = o.i();
        if (i.p() || i.f() || i.g() != null || i.q()) {
            return i;
        }
        return null;
    }
}
