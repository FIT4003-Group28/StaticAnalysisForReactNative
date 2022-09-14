package defpackage;

import android.content.Context;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bait  reason: default package */
/* loaded from: classes3.dex */
public final class bait {
    static final dbrl<baal> a = new baiq();
    static final dbrl<azxk> b = new bair();
    static final dbrl<azva> c = new bais();

    public static void a(dcdg<azxb, ilo> dcdgVar, ilo iloVar) {
        if (akqi.d(iloVar.ai())) {
            dcdgVar.f(azxb.f(iloVar.ai(), iloVar.aj()), iloVar);
        }
    }

    public static <T, C extends Comparable<T>> dcbg<baig> b(final Context context, dbrn<baal, C> dbrnVar, dbrn<azxk, C> dbrnVar2, dbrn<azva, C> dbrnVar3, dbrn<baig, C> dbrnVar4, dclu<C> dcluVar, dbrn<baal, baig> dbrnVar5, dbrn<azxk, baig> dbrnVar6, dbrn<azva, baig> dbrnVar7, dcdc<baal> dcdcVar, dcdc<azxk> dcdcVar2, dcdc<azva> dcdcVar3) {
        dbsk.b(dcft.k(dcdcVar, baii.a), "All LocalListItems must be of type ItemType.PLACE and not refer to FeatureId.NONE.");
        azva g = azva.g(dcdcVar3, dndr.HOME);
        azva g2 = azva.g(dcdcVar3, dndr.WORK);
        final azxb azxbVar = null;
        final azxb f = g == null ? null : f(g);
        if (g2 != null) {
            azxbVar = f(g2);
        }
        dcbg<T> s = g(dcdcVar, a, dcluVar, dbrnVar).o(new dbsl(f, azxbVar) { // from class: baij
            private final azxb a;
            private final azxb b;

            {
                this.a = f;
                this.b = azxbVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return bait.c(bait.d((baal) obj), this.a, this.b);
            }
        }).x(25).s(dbrnVar5);
        dcbg<T> s2 = g(dcdcVar2, b, dcluVar, dbrnVar2).o(new dbsl(f, azxbVar) { // from class: baik
            private final azxb a;
            private final azxb b;

            {
                this.a = f;
                this.b = azxbVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return bait.c(bait.e((azxk) obj), this.a, this.b);
            }
        }).x(25).s(dbrnVar6);
        dbrl<azva> dbrlVar = c;
        dcbg<T> s3 = g(dcdcVar3, dbrlVar, dcluVar, dbrnVar3).o(bail.a).x(25).s(dbrnVar7);
        dcdg p = dcdn.p();
        Iterator<E> it = h(dcdcVar3, dbrlVar).iterator();
        while (it.hasNext()) {
            azva azvaVar = (azva) it.next();
            p.f(f(azvaVar), azvaVar);
        }
        final dcdn b2 = p.b();
        return g(dcbg.e(s, s2, s3), baig.a, dcluVar, dbrnVar4).x(25).s(new dbrn(b2, context) { // from class: baim
            private final dcdn a;
            private final Context b;

            {
                this.a = b2;
                this.b = context;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dcdn dcdnVar = this.a;
                Context context2 = this.b;
                baig baigVar = (baig) obj;
                azva azvaVar2 = (azva) dcdnVar.get(baigVar.g);
                if (azvaVar2 != null) {
                    baigVar.h = azvaVar2.e(context2);
                    baigVar.i = true;
                }
                return baigVar;
            }
        });
    }

    public static boolean c(azxb azxbVar, azxb azxbVar2, azxb azxbVar3) {
        return !azxbVar.equals(azxbVar2) && !azxbVar.equals(azxbVar3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static azxb d(baal baalVar) {
        baak z = baalVar.z();
        dbsk.s(z);
        return azxb.f(z.a(), z.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static azxb e(azxk azxkVar) {
        akqi b2 = azxkVar.b();
        dolk r = azxkVar.r();
        dbsk.s(r);
        dnoh dnohVar = r.e;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        return azxb.f(b2, akqq.e(dnohVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static azxb f(azva azvaVar) {
        return azxb.f(azvaVar.c, azvaVar.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <E, T, C extends Comparable<T>> dcbg<E> g(Iterable<E> iterable, dbrl<E> dbrlVar, dclu<C> dcluVar, dbrn<E, C> dbrnVar) {
        return h(dcdc.w(dcluVar.g(dbrnVar), iterable), dbrlVar);
    }

    private static <E> dcbg<E> h(Iterable<E> iterable, final dbrl<E> dbrlVar) {
        dcbg b2 = dcbg.b(iterable);
        dbrlVar.getClass();
        return dcbg.b(b2.s(new dbrn(dbrlVar) { // from class: bain
            private final dbrl a;

            {
                this.a = dbrlVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new dbrk(this.a, obj);
            }
        }).B()).s(baio.a);
    }
}
