package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: rzp  reason: default package */
/* loaded from: classes7.dex */
public abstract class rzp implements Serializable {
    public static rzp j(List<ror> list, ror rorVar, List<ror> list2, @dzsi String str, boolean z, boolean z2, boolean z3) {
        return new rzm(dcdc.r(list), rorVar, dcdc.r(list2), str, z, z2, z3);
    }

    public static rzp k(Bundle bundle) {
        List<ror> l = l(bundle, "PREVIOUS_SCREEN");
        ror a = ror.a(bundle.getInt("CURRENT_SCREEN"));
        if (a == null) {
            int i = bundle.getInt("CURRENT_SCREEN");
            StringBuilder sb = new StringBuilder(27);
            sb.append("Invalid screen: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return j(l, a, l(bundle, "REMAINING_SCREENS"), bundle.getString("EXIT"), bundle.getBoolean("HAS_SAVED_CHANGES"), bundle.getBoolean("EXIT_NO_CHANGES"), bundle.getBoolean("SHOW_SKIP_BUTTON"));
    }

    private static List<ror> l(Bundle bundle, String str) {
        dccx F = dcdc.F();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        int size = integerArrayList.size();
        for (int i = 0; i < size; i++) {
            Integer num = integerArrayList.get(i);
            ror a = ror.a(num.intValue());
            if (a != null) {
                F.g(a);
            } else {
                String valueOf = String.valueOf(num);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                sb.append("Invalid screen: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return F.f();
    }

    private static void m(Bundle bundle, String str, List<ror> list) {
        ArrayList<Integer> arrayList = new ArrayList<>(list.size());
        for (ror rorVar : list) {
            arrayList.add(Integer.valueOf(rorVar.n));
        }
        bundle.putIntegerArrayList(str, arrayList);
    }

    public abstract dcdc<ror> a();

    public abstract ror b();

    public abstract dcdc<ror> c();

    @dzsi
    public abstract String d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    @dzsi
    public final rzp h(dbsl<ror> dbslVar) {
        dcdc q = dcdc.q(dcft.i(c(), dbslVar));
        if (q.isEmpty()) {
            return null;
        }
        dccx F = dcdc.F();
        F.i(a());
        F.g(b());
        return j(F.f(), (ror) q.get(0), q.subList(1, q.size()), d(), true, f(), g());
    }

    public final Bundle i() {
        Bundle bundle = new Bundle();
        m(bundle, "PREVIOUS_SCREEN", a());
        bundle.putInt("CURRENT_SCREEN", b().n);
        m(bundle, "REMAINING_SCREENS", c());
        bundle.putString("EXIT", d());
        bundle.putBoolean("EXIT_NO_CHANGES", f());
        bundle.putBoolean("HAS_SAVED_CHANGES", e());
        bundle.putBoolean("SHOW_SKIP_BUTTON", g());
        return bundle;
    }
}
