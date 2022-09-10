package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ucx  reason: default package */
/* loaded from: classes7.dex */
public final class ucx implements udk {
    private final btvo a;
    private final ufg b;
    private final suy c;
    private final ucv d;

    public ucx(btvo btvoVar, ufg ufgVar, suy suyVar, ucv ucvVar) {
        this.a = btvoVar;
        this.b = ufgVar;
        this.c = suyVar;
        this.d = ucvVar;
    }

    @Override // defpackage.udk
    public final boolean a() {
        return this.a.getDirectionsPageParameters().u;
    }

    @Override // defpackage.udk
    public final crzm<Boolean> b() {
        return new crzy(this.b.a(), new dbrn(this) { // from class: ucw
            private final ucx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ucx ucxVar = this.a;
                boolean z = false;
                if (((uff) obj).b().booleanValue() && ucxVar.a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.udk
    public final void c() {
        Boolean l = b().l();
        dbsk.s(l);
        if (!l.booleanValue()) {
            return;
        }
        uer uerVar = (uer) this.b;
        dbsg<Integer> h = uerVar.f().h();
        if (!uerVar.f().g() && !h.a()) {
            h = dbpy.a;
        } else if (!h.a()) {
            h = dbsg.i(Integer.valueOf(uerVar.f().f() - 1));
            uerVar.f().e(amvh.a, ((Integer) ((dbsu) h).a).intValue(), false);
        }
        if (!h.a()) {
            return;
        }
        this.d.c(true);
        suy suyVar = this.c;
        uff l2 = this.b.a().l();
        dbsk.s(l2);
        suyVar.aJ(l2.a(), h.b().intValue());
    }

    @Override // defpackage.udk
    public final void d(boolean z) {
        if (this.d.b.c) {
            if (!z) {
                uew f = ((uer) this.b).f();
                if (f.h().a()) {
                    f.a = new ArrayList<>(dcbg.b(f.a).o(uet.a).z());
                    f.k(false);
                }
            }
            this.d.c(false);
        }
    }
}
