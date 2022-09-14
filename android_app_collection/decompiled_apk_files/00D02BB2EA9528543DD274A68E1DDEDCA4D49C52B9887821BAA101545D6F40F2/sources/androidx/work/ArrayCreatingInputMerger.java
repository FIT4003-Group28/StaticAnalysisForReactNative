package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ArrayCreatingInputMerger extends bbr {
    private static final Object c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    @Override // defpackage.bbr
    public final bbp a(List<bbp> list) {
        Object newInstance;
        bbo bboVar = new bbo();
        HashMap hashMap = new HashMap();
        for (bbp bbpVar : list) {
            for (Map.Entry<String, Object> entry : bbpVar.d().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(key);
                if (obj == null) {
                    if (!cls.isArray()) {
                        newInstance = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance, 0, value);
                        value = newInstance;
                        hashMap.put(key, value);
                    } else {
                        hashMap.put(key, value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (!cls2.isArray()) {
                            newInstance = Array.newInstance(obj.getClass(), 2);
                            Array.set(newInstance, 0, obj);
                            Array.set(newInstance, 1, value);
                            value = newInstance;
                        } else {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance2, 0, length);
                            System.arraycopy(value, 0, newInstance2, length, length2);
                            value = newInstance2;
                        }
                    } else if (!cls2.isArray() || !cls2.getComponentType().equals(cls)) {
                        if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = c(value, obj);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        value = c(obj, value);
                    }
                    hashMap.put(key, value);
                }
            }
        }
        bboVar.b(hashMap);
        return bboVar.a();
    }
}
