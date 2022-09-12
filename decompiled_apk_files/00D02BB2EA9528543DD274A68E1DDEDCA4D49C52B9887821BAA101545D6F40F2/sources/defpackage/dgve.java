package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dgve  reason: default package */
/* loaded from: classes6.dex */
public final class dgve<E> extends dgtl<Object> {
    public static final dgtm a = new dgtm() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter$1
        @Override // defpackage.dgtm
        public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
            Type componentType;
            Type type = dgxdVar.b;
            boolean z = type instanceof GenericArrayType;
            if (z || ((type instanceof Class) && ((Class) type).isArray())) {
                if (z) {
                    componentType = ((GenericArrayType) type).getGenericComponentType();
                } else {
                    componentType = ((Class) type).getComponentType();
                }
                return new dgve(dgsxVar, dgsxVar.b(dgxd.a(componentType)), dgtv.c(componentType));
            }
            return null;
        }
    };
    private final Class<E> b;
    private final dgtl<E> c;

    public dgve(dgsx dgsxVar, dgtl<E> dgtlVar, Class<E> cls) {
        this.c = new dgvu(dgsxVar, dgtlVar, cls);
        this.b = cls;
    }

    @Override // defpackage.dgtl
    public final Object a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        dgxeVar.a();
        while (dgxeVar.e()) {
            arrayList.add(this.c.a(dgxeVar));
        }
        dgxeVar.b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dgtl
    public final void b(dgxg dgxgVar, Object obj) {
        if (obj == null) {
            dgxgVar.f();
            return;
        }
        dgxgVar.a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.b(dgxgVar, Array.get(obj, i));
        }
        dgxgVar.c();
    }
}
