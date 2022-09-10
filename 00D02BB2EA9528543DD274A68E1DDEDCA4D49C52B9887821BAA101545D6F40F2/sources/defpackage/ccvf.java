package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ccvf  reason: default package */
/* loaded from: classes4.dex */
public final class ccvf implements ccvc {
    public final Executor a;
    public final buti b;
    public final dcka<String, ccvb> c = dccg.O();
    public final Map<String, cknz> d = new HashMap();
    public final Set<bbup> e = new HashSet();

    public ccvf(Executor executor, buti butiVar) {
        this.a = executor;
        this.b = butiVar;
    }

    public static dcdc<dwfl> b(cknz cknzVar) {
        dccx F = dcdc.F();
        for (int i = 0; i < cknzVar.d(); i++) {
            dwfl e = cknzVar.e(i);
            dbsk.s(e);
            F.g(e);
        }
        return F.f();
    }

    public final Collection<ccvb> a(String str) {
        Set f;
        synchronized (this.c) {
            f = ((dbys) this.c).f(str);
        }
        return f;
    }
}
