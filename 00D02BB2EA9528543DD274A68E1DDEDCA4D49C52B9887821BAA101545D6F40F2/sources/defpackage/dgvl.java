package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dgvl  reason: default package */
/* loaded from: classes6.dex */
public final class dgvl<K, V> extends dgtl<Map<K, V>> {
    private final dgtl<K> a;
    private final dgtl<V> b;
    private final dguw<? extends Map<K, V>> c;

    public dgvl(dgsx dgsxVar, Type type, dgtl dgtlVar, Type type2, dgtl dgtlVar2, dguw dguwVar) {
        this.a = new dgvu(dgsxVar, dgtlVar, type);
        this.b = new dgvu(dgsxVar, dgtlVar2, type2);
        this.c = dguwVar;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Object a(dgxe dgxeVar) {
        int i;
        int q = dgxeVar.q();
        if (q == 9) {
            dgxeVar.j();
            return null;
        }
        Map<K, V> a = this.c.a();
        if (q == 1) {
            dgxeVar.a();
            while (dgxeVar.e()) {
                dgxeVar.a();
                K a2 = this.a.a(dgxeVar);
                if (a.put(a2, this.b.a(dgxeVar)) != null) {
                    throw new dgtj("duplicate key: " + a2);
                }
                dgxeVar.b();
            }
            dgxeVar.b();
        } else {
            dgxeVar.c();
            while (dgxeVar.e()) {
                if (dgxeVar instanceof dgvi) {
                    dgvi dgviVar = (dgvi) dgxeVar;
                    dgviVar.r(5);
                    Map.Entry entry = (Map.Entry) ((Iterator) dgviVar.f()).next();
                    dgviVar.o(entry.getValue());
                    dgviVar.o(new dgth((String) entry.getKey()));
                } else {
                    int i2 = dgxeVar.b;
                    if (i2 == 0) {
                        i2 = dgxeVar.s();
                    }
                    if (i2 == 13) {
                        dgxeVar.b = 9;
                    } else {
                        if (i2 == 12) {
                            i = 8;
                        } else if (i2 != 14) {
                            throw new IllegalStateException("Expected a name but was " + ((Object) dgxf.a(dgxeVar.q())) + dgxeVar.t());
                        } else {
                            i = 10;
                        }
                        dgxeVar.b = i;
                    }
                }
                K a3 = this.a.a(dgxeVar);
                if (a.put(a3, this.b.a(dgxeVar)) != null) {
                    throw new dgtj("duplicate key: " + a3);
                }
            }
            dgxeVar.d();
        }
        return a;
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            dgxgVar.f();
            return;
        }
        dgxgVar.b();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            dgxgVar.e(String.valueOf(entry.getKey()));
            this.b.b(dgxgVar, entry.getValue());
        }
        dgxgVar.d();
    }
}
