package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aogq  reason: default package */
/* loaded from: classes2.dex */
public abstract class aogq implements Serializable {
    public static aogq c(aogp aogpVar, aogp aogpVar2) {
        return new aofx(aogpVar, aogpVar2);
    }

    public abstract aogp a();

    public abstract aogp b();

    public final dbsg<aogf> d() {
        dbsg<eaph> e = a().e();
        dbsg<eaph> e2 = b().e();
        return (!e.a() || !e2.a() || !e.b().C(e2.b())) ? dbpy.a : dbsg.i(aogf.c(e.b(), e2.b()));
    }
}
