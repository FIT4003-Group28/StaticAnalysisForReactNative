package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: cstr  reason: default package */
/* loaded from: classes5.dex */
public final class cstr {
    public static <F, T> dcdc<T> a(Collection<F> collection, dbrn<? super F, T> dbrnVar) {
        dccx F = dcdc.F();
        for (F f : collection) {
            F.g(dbrnVar.a(f));
        }
        return F.f();
    }

    public static <F, T> ArrayList<T> b(Collection<F> collection, dbrn<? super F, T> dbrnVar) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (F f : collection) {
            arrayList.add(dbrnVar.a(f));
        }
        return arrayList;
    }

    public static <F, T> dcdc<T> c(Collection<F> collection, dbrn<? super F, dbsg<T>> dbrnVar) {
        dccx F = dcdc.F();
        for (F f : collection) {
            dbsg<T> a = dbrnVar.a(f);
            if (a.a()) {
                F.g(a.b());
            }
        }
        return F.f();
    }
}
