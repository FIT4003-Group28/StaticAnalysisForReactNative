package defpackage;

import android.graphics.Point;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: kcy  reason: default package */
/* loaded from: classes7.dex */
public class kcy {
    public final Set<kzh> a = new HashSet();
    public boolean b;
    @dzsi
    public ldt c;
    @dzsi
    private kym d;

    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        for (kzh kzhVar : this.a) {
            kzhVar.a(z);
        }
    }

    public final void b() {
        kym kymVar = this.d;
        if (kymVar != null) {
            akox akoxVar = kymVar.a.c.a;
            Point point = akoxVar.o;
            bnul bnulVar = akoxVar.j().l;
            float f = point.x / 2;
            float f2 = point.y / 2;
            akzh b = bnuq.b() ? ((almp) bnulVar).h : ((almp) bnulVar).h.b();
            almp almpVar = (almp) bnulVar;
            akra s = akyx.s(b, f, f2, almpVar.q);
            if (s == null) {
                return;
            }
            almpVar.b(s);
        }
    }

    public final void c(@dzsi kym kymVar) {
        boolean z = true;
        boolean z2 = this.d == null;
        if (kymVar != null) {
            z = false;
        }
        dbsk.l(z2 ^ z);
        this.d = kymVar;
    }

    public final void d(@dzsi ldt ldtVar) {
        boolean z = true;
        boolean z2 = this.c == null;
        if (ldtVar != null) {
            z = false;
        }
        dbsk.l(z2 ^ z);
        this.c = ldtVar;
    }
}
