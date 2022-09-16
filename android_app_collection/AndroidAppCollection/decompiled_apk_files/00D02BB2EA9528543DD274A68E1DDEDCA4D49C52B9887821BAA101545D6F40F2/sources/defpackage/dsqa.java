package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dsqa  reason: default package */
/* loaded from: classes.dex */
public class dsqa {
    static final dsqa a = new dsqa(null);
    private static volatile boolean b = false;
    private static volatile dsqa c;
    private static volatile dsqa d;
    private final Map<dspz, dsqv<?, ?>> e;

    public dsqa() {
        this.e = new HashMap();
    }

    public static dsqa a() {
        return new dsqa();
    }

    public static dsqa b() {
        dsqa dsqaVar = c;
        if (dsqaVar == null) {
            synchronized (dsqa.class) {
                dsqaVar = c;
                if (dsqaVar == null) {
                    dsqaVar = a;
                    c = dsqaVar;
                }
            }
        }
        return dsqaVar;
    }

    public <ContainingType extends dssj> dsqv<ContainingType, ?> d(ContainingType containingtype, int i) {
        return (dsqv<ContainingType, ?>) this.e.get(new dspz(containingtype, i));
    }

    public final void e(dsqv<?, ?> dsqvVar) {
        this.e.put(new dspz(dsqvVar.a, dsqvVar.a()), dsqvVar);
    }

    public final void f(dspy<?, ?> dspyVar) {
        if (dsqv.class.isAssignableFrom(dspyVar.getClass())) {
            e((dsqv) dspyVar);
        }
    }

    public dsqa(byte[] bArr) {
        this.e = Collections.emptyMap();
    }

    public static dsqa c() {
        dsqa dsqaVar = d;
        if (dsqaVar != null) {
            return dsqaVar;
        }
        synchronized (dsqa.class) {
            dsqa dsqaVar2 = d;
            if (dsqaVar2 != null) {
                return dsqaVar2;
            }
            dsqa b2 = dsqn.b(dsqa.class);
            d = b2;
            return b2;
        }
    }
}
