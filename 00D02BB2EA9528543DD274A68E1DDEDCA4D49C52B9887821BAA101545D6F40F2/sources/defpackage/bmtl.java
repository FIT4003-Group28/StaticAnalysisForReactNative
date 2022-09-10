package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bmtl  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmtl {
    public static bmtl c(dcdc<bmtr> dcdcVar, boolean z) {
        boolean z2;
        dcmw dcmwVar = dcmw.a;
        Iterator it = dchl.k(dcdcVar, bmtk.a).iterator();
        boolean z3 = false;
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (dcmwVar.compare(next, next2) > 0) {
                    z2 = false;
                    break;
                }
                next = next2;
            }
        }
        z2 = true;
        dbsk.a(z2);
        if (dcdcVar.isEmpty() || (dcdcVar.get(0).a() <= 1.0d && dcdcVar.get(dcdcVar.size() - 1).a() >= dcyn.a)) {
            z3 = true;
        }
        dbsk.a(z3);
        return new bmtf(dcdcVar, z);
    }

    public abstract dcdc<bmtr> a();

    public abstract boolean b();

    public final int d() {
        return a().size();
    }
}
