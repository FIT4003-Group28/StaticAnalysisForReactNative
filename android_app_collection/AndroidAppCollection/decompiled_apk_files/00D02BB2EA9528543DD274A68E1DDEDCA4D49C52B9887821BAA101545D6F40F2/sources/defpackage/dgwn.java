package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dgwn  reason: default package */
/* loaded from: classes6.dex */
public final class dgwn extends dgtl<dgtc> {
    @Override // defpackage.dgtl
    /* renamed from: d */
    public final dgtc a(dgxe dgxeVar) {
        int q = dgxeVar.q();
        int i = q - 1;
        if (q != 0) {
            if (i == 0) {
                dgta dgtaVar = new dgta();
                dgxeVar.a();
                while (dgxeVar.e()) {
                    dgtaVar.a(a(dgxeVar));
                }
                dgxeVar.b();
                return dgtaVar;
            } else if (i == 2) {
                dgtf dgtfVar = new dgtf();
                dgxeVar.c();
                while (dgxeVar.e()) {
                    dgtfVar.a(dgxeVar.g(), a(dgxeVar));
                }
                dgxeVar.d();
                return dgtfVar;
            } else if (i == 5) {
                return new dgth(dgxeVar.h());
            } else {
                if (i == 6) {
                    return new dgth(new dgun(dgxeVar.h()));
                }
                if (i == 7) {
                    return new dgth(Boolean.valueOf(dgxeVar.i()));
                }
                if (i == 8) {
                    dgxeVar.j();
                    return dgte.a;
                }
                throw new IllegalArgumentException();
            }
        }
        throw null;
    }

    @Override // defpackage.dgtl
    /* renamed from: e */
    public final void b(dgxg dgxgVar, dgtc dgtcVar) {
        if (dgtcVar == null || (dgtcVar instanceof dgte)) {
            dgxgVar.f();
        } else if (!(dgtcVar instanceof dgth)) {
            if (!(dgtcVar instanceof dgta)) {
                if (dgtcVar instanceof dgtf) {
                    dgxgVar.b();
                    for (Map.Entry<String, dgtc> entry : ((dgtf) dgtcVar).b()) {
                        dgxgVar.e(entry.getKey());
                        b(dgxgVar, entry.getValue());
                    }
                    dgxgVar.d();
                    return;
                }
                throw new IllegalArgumentException("Couldn't write " + dgtcVar.getClass());
            }
            dgxgVar.a();
            Iterator<dgtc> it = dgtcVar.e().iterator();
            while (it.hasNext()) {
                b(dgxgVar, it.next());
            }
            dgxgVar.c();
        } else {
            dgth f = dgtcVar.f();
            if (f.i()) {
                dgxgVar.i(f.j());
            } else if (f.b()) {
                dgxgVar.k(f.h());
            } else {
                dgxgVar.j(f.c());
            }
        }
    }
}
