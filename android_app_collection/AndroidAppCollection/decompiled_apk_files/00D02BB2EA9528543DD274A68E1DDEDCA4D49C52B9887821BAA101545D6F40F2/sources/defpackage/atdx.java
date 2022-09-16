package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: atdx  reason: default package */
/* loaded from: classes2.dex */
public final class atdx extends atcy {
    private final Set<akqi> a;
    private final Set<akqq> c;
    private final cqat d;
    private final btrm e;
    private final boolean f;

    public atdx(atcu atcuVar, atcw atcwVar, cqat cqatVar, btrm btrmVar, boolean z) {
        super(atcuVar, atcwVar);
        this.a = new HashSet();
        this.c = new HashSet();
        this.d = cqatVar;
        this.e = btrmVar;
        if (z) {
            dbsk.m(false, "Battery alert suppression should only be used when Pre nav route planning is enabled.");
        }
        this.f = z;
    }

    private final void h(@dzsi akqi akqiVar, @dzsi akqq akqqVar) {
        if (akqiVar != null) {
            this.a.add(akqiVar);
        } else if (akqqVar == null) {
        } else {
            this.c.add(akqqVar);
        }
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        boolean contains;
        int a;
        int a2;
        crqf crqfVar = atlqVar.m;
        if (crqfVar != null) {
            boolean z = atlqVar2 == null || !atlqVar2.b();
            amub amubVar = crqfVar.g().a;
            long b = this.d.b() / 1000;
            if (amubVar.ai() > 2) {
                if (!z) {
                    return;
                }
                z = true;
            }
            dpjl E = amubVar.l().E();
            if (E == null) {
                return;
            }
            amvh l = amubVar.l();
            akqi akqiVar = l.d;
            akqq akqqVar = l.e;
            if (akqiVar != null) {
                contains = this.a.contains(akqiVar);
            } else if (akqqVar == null) {
                return;
            } else {
                contains = this.c.contains(akqqVar);
            }
            if (contains) {
                return;
            }
            if (!this.f || !z || (((a = dpjk.a(E.d)) == 0 || a != 6) && ((a2 = dpjk.a(E.d)) == 0 || a2 != 7))) {
                if ((E.a & 1024) != 0) {
                    dpji dpjiVar = E.h;
                    if (dpjiVar == null) {
                        dpjiVar = dpji.c;
                    }
                    if ((1 & dpjiVar.a) != 0 && dpjiVar.b < b) {
                        return;
                    }
                }
                h(akqiVar, akqqVar);
                this.e.b(new aswg(E, b + amubVar.E()));
                return;
            }
            h(akqiVar, akqqVar);
        }
    }

    @Override // defpackage.atcy, defpackage.asmo
    public final void Qp() {
        this.a.clear();
    }
}
