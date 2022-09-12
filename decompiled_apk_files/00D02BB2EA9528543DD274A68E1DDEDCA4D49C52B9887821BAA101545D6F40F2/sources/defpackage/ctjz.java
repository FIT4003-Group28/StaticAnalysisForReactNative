package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ctjz  reason: default package */
/* loaded from: classes5.dex */
public abstract class ctjz<T> {
    public static <T> dcdc<ctxn> d(List<ctjz<T>> list) {
        dccx F = dcdc.F();
        for (ctjz<T> ctjzVar : list) {
            if (ctjzVar.b() == 1) {
                F.g(ctjzVar.a());
            }
        }
        return F.f();
    }

    public static <T> dcdc<T> e(List<ctjz<T>> list) {
        dccx F = dcdc.F();
        for (ctjz<T> ctjzVar : list) {
            if (ctjzVar.b() == 2) {
                F.g(ctjzVar.c());
            }
        }
        return F.f();
    }

    public abstract ctxn a();

    public abstract int b();

    public abstract T c();
}
