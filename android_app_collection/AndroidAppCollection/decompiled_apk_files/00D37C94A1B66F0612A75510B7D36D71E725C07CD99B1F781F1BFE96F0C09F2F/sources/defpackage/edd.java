package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: edd  reason: default package */
/* loaded from: classes3.dex */
public final class edd {
    private final Set a = new HashSet();
    private ecy b;
    private eda c;

    public final void a(ecz eczVar) {
        this.a.add(eczVar);
    }

    public final void b(ecy ecyVar) {
        if (akzj.f(ecyVar, this.b)) {
            return;
        }
        this.b = ecyVar;
        if (ecyVar == null) {
            return;
        }
        for (ecz eczVar : this.a) {
            eczVar.n(this.b);
        }
    }

    public final void c(eda edaVar) {
        if (akzj.f(edaVar, this.c)) {
            return;
        }
        if (this.c != null) {
            for (ecz eczVar : this.a) {
                eczVar.s();
            }
        }
        this.c = edaVar;
        if (edaVar == null) {
            return;
        }
        for (ecz eczVar2 : this.a) {
            eczVar2.o(this.c);
        }
    }
}
