package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: debq  reason: default package */
/* loaded from: classes6.dex */
public final class debq {
    private static final dbrb b = dbrb.o(".。．｡");
    private static final dbtm c = dbtm.a('.');
    private static final dbrz d = dbrz.f('.');
    private static final dbrb g;
    private static final dbrb h;
    private static final dbrb i;
    private static final dbrb j;
    public final int a;
    private final String e;
    private final dcdc<String> f;

    static {
        dbrb o = dbrb.o("-_");
        g = o;
        dbrb p = dbrb.p('0', '9');
        h = p;
        dbrb j2 = dbrb.p('a', 'z').j(dbrb.p('A', 'Z'));
        i = j2;
        j = p.j(j2).j(o);
    }

    public debq(String str) {
        String a = dbqa.a(b.i(str, '.'));
        boolean z = false;
        a = a.endsWith(".") ? a.substring(0, a.length() - 1) : a;
        dbsk.g(a.length() <= 253, "Domain name too long: '%s':", a);
        this.e = a;
        dcdc<String> q = dcdc.q(c.g(a));
        this.f = q;
        dbsk.g(q.size() <= 127, "Domain has too many parts: '%s'", a);
        int size = q.size() - 1;
        if (b(q.get(size), true)) {
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = true;
                    break;
                } else if (!b(q.get(i2), false)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        dbsk.g(z, "Not a valid domain name: '%s'", a);
        this.a = a(dbpy.a);
        a(dbsg.i(dugr.REGISTRY));
    }

    private final int a(dbsg<dugr> dbsgVar) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            String g2 = d.g(this.f.subList(i2, size));
            if (c(dbsgVar, dbsg.j(dugq.a.get(g2)))) {
                return i2;
            }
            if (dugq.c.containsKey(g2)) {
                return i2 + 1;
            }
            List<String> i3 = c.j().i(g2);
            if (i3.size() == 2 && c(dbsgVar, dbsg.j(dugq.b.get(i3.get(1))))) {
                return i2;
            }
        }
        return -1;
    }

    private static boolean b(String str, boolean z) {
        if (str.length() > 0 && str.length() <= 63) {
            if (!j.f(dbqk.a.k().h(str))) {
                return false;
            }
            dbrb dbrbVar = g;
            if (!dbrbVar.b(str.charAt(0)) && !dbrbVar.b(str.charAt(str.length() - 1))) {
                return !z || !h.b(str.charAt(0));
            }
        }
        return false;
    }

    private static boolean c(dbsg<dugr> dbsgVar, dbsg<dugr> dbsgVar2) {
        return dbsgVar.a() ? dbsgVar.equals(dbsgVar2) : dbsgVar2.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof debq)) {
            return false;
        }
        return this.e.equals(((debq) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }
}
