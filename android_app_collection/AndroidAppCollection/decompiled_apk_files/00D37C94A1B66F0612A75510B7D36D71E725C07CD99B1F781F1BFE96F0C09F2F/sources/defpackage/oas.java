package defpackage;

import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: oas  reason: default package */
/* loaded from: classes3.dex */
public final class oas implements fqc, oam {
    public oan a;
    private final fqd c;
    private final fqb d;
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    public int b = 0;

    public oas(fqd fqdVar, final oaq oaqVar) {
        this.c = fqdVar;
        this.d = new fqb() { // from class: oap
            @Override // defpackage.fqb
            public final void g(Configuration configuration) {
                oaq.this.h(configuration);
            }
        };
    }

    public static boolean f(int i) {
        return (i & 2) != 0;
    }

    public static boolean h(int i) {
        return (i & 1) != 0;
    }

    private final void i() {
        boolean z;
        boolean z2;
        oan oanVar = this.a;
        int i = 0;
        if (oanVar != null) {
            z2 = this.c.b;
            z = oanVar.a;
        } else {
            z = false;
            z2 = false;
        }
        int i2 = this.b;
        if (z2) {
            i = z ? 3 : 1;
        } else if (z) {
            i = 2;
        }
        if (i2 == i) {
            return;
        }
        this.b = i;
        for (oar oarVar : this.f) {
            oarVar.e(i2, i);
        }
    }

    @Override // defpackage.fqc
    public final void a() {
        i();
    }

    @Override // defpackage.fqc
    public final void b() {
        i();
    }

    public final void c(oak oakVar) {
        if (this.e.contains(oakVar)) {
            return;
        }
        this.e.add(oakVar);
    }

    public final void d(oar oarVar) {
        if (this.f.contains(oarVar)) {
            return;
        }
        this.f.add(oarVar);
    }

    public final void e(oan oanVar) {
        oan oanVar2 = this.a;
        if (oanVar == oanVar2) {
            return;
        }
        this.a = oanVar;
        boolean z = false;
        boolean z2 = oanVar2 != null;
        if (oanVar != null) {
            z = true;
        }
        if (oanVar2 != null) {
            oanVar2.j(this);
        }
        if (oanVar != null) {
            oanVar.g(this);
        }
        if (z2 != z) {
            if (oanVar == null) {
                this.c.i(this);
                this.c.h(this.d);
            } else {
                this.c.g(this);
                this.c.f(this.d);
            }
        }
        for (oak oakVar : this.e) {
            oakVar.pg(oanVar2, oanVar);
        }
        i();
    }

    @Override // defpackage.oam
    public final void g(oan oanVar, int i) {
        if (this.a != oanVar || (i & 1) == 0) {
            return;
        }
        i();
    }
}
