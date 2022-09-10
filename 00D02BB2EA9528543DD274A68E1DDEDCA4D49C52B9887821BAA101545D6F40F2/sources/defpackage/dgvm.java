package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dgvm  reason: default package */
/* loaded from: classes6.dex */
public final class dgvm extends dgtl<Object> {
    public static final dgtm a = new dgtm() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter$1
        @Override // defpackage.dgtm
        public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
            if (dgxdVar.a == Object.class) {
                return new dgvm(dgsxVar);
            }
            return null;
        }
    };
    private final dgsx b;

    public dgvm(dgsx dgsxVar) {
        this.b = dgsxVar;
    }

    @Override // defpackage.dgtl
    public final Object a(dgxe dgxeVar) {
        int q = dgxeVar.q();
        int i = q - 1;
        if (q != 0) {
            if (i == 0) {
                ArrayList arrayList = new ArrayList();
                dgxeVar.a();
                while (dgxeVar.e()) {
                    arrayList.add(a(dgxeVar));
                }
                dgxeVar.b();
                return arrayList;
            } else if (i == 2) {
                dguv dguvVar = new dguv();
                dgxeVar.c();
                while (dgxeVar.e()) {
                    dguvVar.put(dgxeVar.g(), a(dgxeVar));
                }
                dgxeVar.d();
                return dguvVar;
            } else if (i == 5) {
                return dgxeVar.h();
            } else {
                if (i == 6) {
                    return Double.valueOf(dgxeVar.k());
                }
                if (i == 7) {
                    return Boolean.valueOf(dgxeVar.i());
                }
                if (i == 8) {
                    dgxeVar.j();
                    return null;
                }
                throw new IllegalStateException();
            }
        }
        throw null;
    }

    @Override // defpackage.dgtl
    public final void b(dgxg dgxgVar, Object obj) {
        if (obj == null) {
            dgxgVar.f();
            return;
        }
        dgtl d = this.b.d(obj.getClass());
        if (d instanceof dgvm) {
            dgxgVar.b();
            dgxgVar.d();
            return;
        }
        d.b(dgxgVar, obj);
    }
}
