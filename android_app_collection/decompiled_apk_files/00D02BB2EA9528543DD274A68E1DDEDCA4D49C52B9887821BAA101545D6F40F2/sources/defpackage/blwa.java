package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: blwa  reason: default package */
/* loaded from: classes3.dex */
public final class blwa {
    @dzsi
    public List<blvu> a;
    @dzsi
    public blvz b;
    public final blvv d;
    public final blpg e;
    public final akfa f;
    public final bvrb g;
    public Map<String, Integer> c = dcmn.a;
    public boolean h = false;

    public blwa(blvv blvvVar, blpg blpgVar, dzsj<akfa> dzsjVar, bvrb bvrbVar) {
        this.d = blvvVar;
        this.e = blpgVar;
        this.f = dzsjVar.a();
        this.g = bvrbVar;
    }

    public static final boolean i(@dzsi blvu blvuVar, @dzsi blvu blvuVar2) {
        if (blvuVar == null || blvuVar2 == null) {
            return false;
        }
        String str = blvuVar.j;
        String str2 = blvuVar2.j;
        String str3 = blvuVar.k;
        String str4 = blvuVar2.k;
        return (str2 != null && !str2.equals(str)) || (str4 != null && !str4.equals(str3));
    }

    @dzsi
    public final blvu a() {
        return this.d.b;
    }

    @dzsi
    public final blvu b() {
        return this.d.d;
    }

    @dzsi
    public final blvu c() {
        return this.d.c;
    }

    public final int d() {
        int i = this.d.e;
        List<blvu> list = this.a;
        return i + (list == null ? 0 : list.size());
    }

    public final void e(blvu blvuVar) {
        this.d.a(blvuVar);
        h(i(blvuVar, a()));
    }

    public final void f() {
        blvu a = a();
        if (a == null) {
            return;
        }
        this.d.a(a);
        while (true) {
            blvu a2 = a();
            if (a2 == null || i(a, a2)) {
                break;
            }
            this.d.a(a2);
        }
        h(true);
    }

    public final boolean g() {
        List<blvu> list = this.a;
        if (list == null) {
            return false;
        }
        for (blvu blvuVar : list) {
            if (blvuVar.n == blvt.MULTIPLE_CHOICE && blvuVar.e == dgjw.ANY_TIME) {
                return true;
            }
        }
        return false;
    }

    public final void h(boolean z) {
        if (this.b != null) {
            blvu a = a();
            if (a == null) {
                blvz blvzVar = this.b;
                dbsk.s(blvzVar);
                blvzVar.b();
                return;
            }
            blvz blvzVar2 = this.b;
            dbsk.s(blvzVar2);
            blvzVar2.a(a, z);
        }
    }
}
