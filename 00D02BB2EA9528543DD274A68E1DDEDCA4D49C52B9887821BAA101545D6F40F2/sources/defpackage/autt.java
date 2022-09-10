package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: autt  reason: default package */
/* loaded from: classes2.dex */
public final class autt extends aujb {
    public final dbsg<dkmm> c;
    public final auir d;
    @dzsi
    public final auio e;
    @dzsi
    public final auin f;
    @dzsi
    public final auix g;
    @dzsi
    public final auil h;
    private final List<diye> i;

    public autt(autu autuVar, diyf diyfVar) {
        super(aujd.d(diyfVar.b).a());
        auir d;
        this.i = diyfVar.f;
        btvo btvoVar = autuVar.a;
        final int i = diyfVar.b;
        dkrg notificationsRepositoryParameters = btvoVar.getNotificationsRepositoryParameters();
        this.c = notificationsRepositoryParameters == null ? dbpy.a : dcbg.b(notificationsRepositoryParameters.b).r(new dbsl(i) { // from class: autq
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((dkmm) obj).c == this.a;
            }
        });
        auio f = auip.a(diyfVar.e).f();
        this.e = f;
        auil auilVar = null;
        this.f = f == null ? null : f.H;
        if (f == null) {
            d = auir.a;
        } else {
            auiq c = auir.c();
            c.b(f.K);
            d = c.d();
        }
        this.d = d;
        this.g = f == null ? null : f.J;
        int i2 = diyfVar.d;
        int i3 = diyfVar.c;
        ddda.a();
        ddda dddaVar = ddda.a.get(new ddcz(i2));
        ddcu a = ddcu.a(i3);
        if (dddaVar != null && a != null) {
            auilVar = auil.c(dddaVar, a);
        }
        this.h = auilVar;
    }

    @Override // defpackage.aujb
    public final auir a() {
        return this.d;
    }

    @Override // defpackage.aujb
    @dzsi
    public final auix b() {
        return this.g;
    }

    @Override // defpackage.aujb
    public final boolean f() {
        return autu.e(this.i, 2);
    }

    @Override // defpackage.aujb
    @dzsi
    public final auil j() {
        return this.h;
    }

    @Override // defpackage.aujb
    public final boolean t() {
        return autu.e(this.i, 15);
    }

    @Override // defpackage.aujb
    public final dbsg<dkmm> u(btvo btvoVar) {
        return this.c;
    }

    @Override // defpackage.aujb
    @dzsi
    public final auio v() {
        return this.e;
    }

    @Override // defpackage.aujb
    @dzsi
    public final auin w() {
        return this.f;
    }

    @Override // defpackage.aujb
    public final int x() {
        return autu.e(this.i, 5) ? 3 : 1;
    }
}
