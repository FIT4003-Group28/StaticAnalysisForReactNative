package defpackage;
/* compiled from: PG */
/* renamed from: acei  reason: default package */
/* loaded from: classes2.dex */
public abstract class acei {
    public static acei f(dcdc<acej> dcdcVar) {
        return new aceb(true, dcdcVar.size(), dcdcVar, false, null);
    }

    public static acei g() {
        return new aceb(false, 0, dcdc.e(), false, null);
    }

    public static acei h(btzy btzyVar) {
        return new aceb(true, 0, dcdc.e(), false, btzyVar);
    }

    public static dcdc<acej> i(dcdc<acef> dcdcVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            acef acefVar = dcdcVar.get(i);
            dccx F2 = dcdc.F();
            if (acefVar.b().a()) {
                F2.g(acefVar.b().b());
            }
            F2.i(i(acefVar.a()));
            F.i(F2.f());
        }
        return F.f();
    }

    public abstract boolean a();

    public abstract int b();

    public abstract dcdc<acej> c();

    public abstract boolean d();

    @dzsi
    public abstract btzy e();
}
