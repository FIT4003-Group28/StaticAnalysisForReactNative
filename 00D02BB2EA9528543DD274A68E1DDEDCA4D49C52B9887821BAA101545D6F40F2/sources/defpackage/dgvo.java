package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dgvo  reason: default package */
/* loaded from: classes6.dex */
public final class dgvo<T> extends dgtl<T> {
    private final dguw<T> a;
    private final Map<String, dgvp> b;

    public dgvo(dguw<T> dguwVar, Map<String, dgvp> map) {
        this.a = dguwVar;
        this.b = map;
    }

    @Override // defpackage.dgtl
    public final T a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        T a = this.a.a();
        try {
            dgxeVar.c();
            while (dgxeVar.e()) {
                dgvp dgvpVar = this.b.get(dgxeVar.g());
                if (dgvpVar != null && dgvpVar.i) {
                    dgvpVar.b(dgxeVar, a);
                }
                dgxeVar.n();
            }
            dgxeVar.d();
            return a;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (IllegalStateException e2) {
            throw new dgtj(e2);
        }
    }

    @Override // defpackage.dgtl
    public final void b(dgxg dgxgVar, T t) {
        if (t == null) {
            dgxgVar.f();
            return;
        }
        dgxgVar.b();
        try {
            for (dgvp dgvpVar : this.b.values()) {
                if (dgvpVar.c(t)) {
                    dgxgVar.e(dgvpVar.g);
                    dgvpVar.a(dgxgVar, t);
                }
            }
            dgxgVar.d();
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
