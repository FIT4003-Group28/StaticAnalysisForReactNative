package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcmz  reason: default package */
/* loaded from: classes5.dex */
final class dcmz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void a(Map<K, V> map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void b(Map<K, V> map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void c(dcka<K, V> dckaVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(dckaVar.L().size());
        for (Map.Entry<K, Collection<V>> entry : dckaVar.L().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void d(dcka<K, V> dckaVar, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection f = dckaVar.f(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                f.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> dcmy<T> e(Class<T> cls, String str) {
        try {
            return new dcmy<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }
}
