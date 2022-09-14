package defpackage;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dgsy  reason: default package */
/* loaded from: classes6.dex */
public final class dgsy {
    public static final void a(Type type, final Object obj, Map map, List list) {
        boolean z = obj instanceof dgti;
        final boolean z2 = false;
        dgtr.a(z || (obj instanceof dgtb) || (obj instanceof dgsz) || (obj instanceof dgtl));
        if (obj instanceof dgsz) {
            map.put(type, (dgsz) obj);
        }
        if (z || (obj instanceof dgtb)) {
            final dgxd<?> a = dgxd.a(type);
            if (a.b == a.a) {
                z2 = true;
            }
            list.add(new dgtm(obj, a, z2) { // from class: com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory
                private final dgxd<?> a;
                private final boolean b;
                private final dgti<?> c;
                private final dgtb<?> d;

                {
                    dgtb<?> dgtbVar = null;
                    dgti<?> dgtiVar = obj instanceof dgti ? (dgti) obj : null;
                    this.c = dgtiVar;
                    dgtbVar = obj instanceof dgtb ? (dgtb) obj : dgtbVar;
                    this.d = dgtbVar;
                    boolean z3 = true;
                    if (dgtiVar == null && dgtbVar == null) {
                        z3 = false;
                    }
                    dgtr.a(z3);
                    this.a = a;
                    this.b = z2;
                }

                @Override // defpackage.dgtm
                public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
                    if (this.a.equals(dgxdVar) || (this.b && this.a.b == dgxdVar.a)) {
                        return new dgvt(this.c, this.d, dgsxVar, dgxdVar, this);
                    }
                    return null;
                }
            });
        }
        if (obj instanceof dgtl) {
            list.add(dgwy.a(dgxd.a(type), (dgtl) obj));
        }
    }
}
