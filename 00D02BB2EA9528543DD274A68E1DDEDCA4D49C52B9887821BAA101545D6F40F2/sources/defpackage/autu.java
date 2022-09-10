package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: autu  reason: default package */
/* loaded from: classes2.dex */
public final class autu {
    public final btvo a;

    public autu(btvo btvoVar) {
        this.a = btvoVar;
    }

    public static dbsg<diyf> b(btvo btvoVar, final int i) {
        return dcbg.b(c(btvoVar)).r(new dbsl(i) { // from class: autp
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((diyf) obj).b == this.a;
            }
        });
    }

    public static dcdc<diyf> c(btvo btvoVar) {
        dkrg notificationsRepositoryParameters = btvoVar.getNotificationsRepositoryParameters();
        if (notificationsRepositoryParameters == null) {
            return dcdc.e();
        }
        return dcbg.b(notificationsRepositoryParameters.a).o(auts.a).z();
    }

    public static boolean d(diyf diyfVar, int i) {
        return e(diyfVar.f, i);
    }

    public static boolean e(List<diye> list, final int i) {
        return dcbg.b(list).p(new dbsl(i) { // from class: autr
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                int a = diyd.a(((diye) obj).a);
                if (a == 0) {
                    a = 1;
                }
                return a == i2;
            }
        });
    }

    @dzsi
    public final aujb a(final int i, @dzsi final aujb aujbVar) {
        return (aujb) b(this.a, i).h(new dbrn(this, i, aujbVar) { // from class: autj
            private final autu a;
            private final int b;
            private final aujb c;

            {
                this.a = this;
                this.b = i;
                this.c = aujbVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                autu autuVar = this.a;
                int i2 = this.b;
                aujb aujbVar2 = this.c;
                autt auttVar = new autt(autuVar, (diyf) obj);
                return aujbVar2 == null ? auttVar : new auth(i2, auttVar, aujbVar2);
            }
        }).f();
    }
}
