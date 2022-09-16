package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: shu  reason: default package */
/* loaded from: classes7.dex */
public class shu {
    private final cqat a;

    public shu(cqat cqatVar) {
        this.a = cqatVar;
    }

    public static eaou b(long j) {
        TimeZone timeZone = TimeZone.getDefault();
        try {
            return eaou.l(timeZone);
        } catch (IllegalArgumentException unused) {
            return eaou.k(timeZone.getOffset(j));
        }
    }

    public final eaph a(Collection<Integer> collection, dngu dnguVar) {
        dbsk.a(!collection.isEmpty());
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        long b = this.a.b();
        eaph eaphVar = new eaph(b, b(b));
        boolean j = sht.j(dnguVar);
        dngu i = sht.i(dnguVar);
        if (j) {
            intValue = (intValue % 7) + 1;
        }
        eaph u = eaphVar.t(intValue).u(i.b, i.c, i.d);
        if (u.C(eaphVar)) {
            u = u.d(u.b.F().e(u.a, 1));
        }
        u.t(intValue).u(i.b, i.c, i.d);
        dbsk.l(!u.C(eaphVar));
        return u;
    }
}
