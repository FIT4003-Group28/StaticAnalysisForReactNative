package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: dcib  reason: default package */
/* loaded from: classes5.dex */
final class dcib<K, V> extends dcho<K, V> {
    private static final long serialVersionUID = 3;

    public dcib(dcic dcicVar, dcic dcicVar2, dbrl<Object> dbrlVar, int i, ConcurrentMap<K, V> concurrentMap) {
        super(dcicVar, dcicVar2, dbrlVar, i, concurrentMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        dchm dchmVar = new dchm();
        int i = dchmVar.b;
        boolean z = false;
        dbsk.n(i == -1, "initial capacity was already set to %s", i);
        dbsk.a(readInt >= 0);
        dchmVar.b = readInt;
        dchmVar.g(this.a);
        dchmVar.h(this.b);
        dbrl<Object> dbrlVar = this.c;
        dbrl<Object> dbrlVar2 = dchmVar.f;
        if (dbrlVar2 == null) {
            z = true;
        }
        dbsk.p(z, "key equivalence was already set to %s", dbrlVar2);
        dbsk.s(dbrlVar);
        dchmVar.f = dbrlVar;
        dchmVar.a = true;
        dchmVar.f(this.d);
        this.e = dchmVar.e();
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                return;
            }
            this.e.put(readObject, objectInputStream.readObject());
        }
    }

    private Object readResolve() {
        return this.e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e.size());
        for (Map.Entry<K, V> entry : this.e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }
}
