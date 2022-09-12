package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aoeb  reason: default package */
/* loaded from: classes2.dex */
public abstract class aoeb implements Serializable {
    public static aoeb c(aogy aogyVar) {
        aogf a = aogyVar.a();
        return e(new aofx(aogp.d(a.a()), aogp.d(a.b())), aogyVar.b());
    }

    public static aoeb e(aogq aogqVar, int i) {
        return new aocv(aogqVar, i);
    }

    public abstract aogq a();

    public abstract int b();

    public final dbsg<aogy> d() {
        dbsg<aogf> d = a().d();
        return d.a() ? dbsg.i(aogy.c(d.b(), b())) : dbpy.a;
    }
}
