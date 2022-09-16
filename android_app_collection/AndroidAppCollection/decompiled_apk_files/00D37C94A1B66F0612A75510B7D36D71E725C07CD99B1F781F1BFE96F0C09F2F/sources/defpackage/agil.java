package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agil  reason: default package */
/* loaded from: classes.dex */
public final class agil implements agxf {
    private final List a;

    public agil(agio agioVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(((agjz) agioVar.v.get()).q);
        arrayList.add(((agib) agioVar.y.get()).s);
        arrayList.add(((agjh) agioVar.z.get()).k);
    }

    @Override // defpackage.agxf
    public final void a(agqz agqzVar) {
        String.valueOf(agqzVar.a).length();
        for (agxf agxfVar : this.a) {
            agxfVar.a(agqzVar);
        }
    }

    @Override // defpackage.agxf
    public final void b(agqz agqzVar) {
        String.valueOf(agqzVar.a).length();
        for (agxf agxfVar : this.a) {
            agxfVar.b(agqzVar);
        }
    }

    @Override // defpackage.agxf
    public final void c() {
        for (agxf agxfVar : this.a) {
            agxfVar.c();
        }
    }

    @Override // defpackage.agxf
    public final void d(agqz agqzVar) {
        String.valueOf(agqzVar.a).length();
        for (agxf agxfVar : this.a) {
            agxfVar.d(agqzVar);
        }
    }

    @Override // defpackage.agxf
    public final void e(agqz agqzVar) {
        String.valueOf(agqzVar.a).length();
        for (agxf agxfVar : this.a) {
            agxfVar.e(agqzVar);
        }
    }

    @Override // defpackage.agxf
    public final void f(agqz agqzVar) {
        String.valueOf(agqzVar.a).length();
        for (agxf agxfVar : this.a) {
            agxfVar.f(agqzVar);
        }
    }

    @Override // defpackage.agxf
    public final void g() {
        for (agxf agxfVar : this.a) {
            agxfVar.g();
        }
    }

    @Override // defpackage.agxf
    public final void h(agqz agqzVar) {
        String.valueOf(agqzVar.a).length();
        for (agxf agxfVar : this.a) {
            agxfVar.h(agqzVar);
        }
    }

    @Override // defpackage.agxf
    public final void i(agqz agqzVar) {
        for (agxf agxfVar : this.a) {
            agxfVar.i(agqzVar);
        }
    }

    @Override // defpackage.agxf
    public final void j(agqz agqzVar) {
        for (agxf agxfVar : this.a) {
            agxfVar.j(agqzVar);
        }
    }

    @Override // defpackage.agxf
    public final void k(agqz agqzVar, atsg atsgVar, agqe agqeVar) {
        String str = agqzVar.a;
        String valueOf = String.valueOf(agqzVar.b);
        String.valueOf(str).length();
        String.valueOf(valueOf).length();
        for (agxf agxfVar : this.a) {
            agxfVar.k(agqzVar, atsgVar, agqeVar);
        }
    }

    @Override // defpackage.agxf
    public final void l(agqz agqzVar) {
        for (agxf agxfVar : this.a) {
            agxfVar.l(agqzVar);
        }
    }
}
