package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcgn  reason: default package */
/* loaded from: classes5.dex */
public final class dcgn<K, V> extends dcgo<K, V> {
    private static final long serialVersionUID = 1;
    transient int c;
    public transient dcgj<K, V> d;

    private dcgn() {
        super(dbzr.t(16));
        this.c = 2;
        dbzb.d(2, "expectedValuesPerKey");
        this.c = 2;
        dcgj<K, V> dcgjVar = new dcgj<>(null, null, 0, null);
        this.d = dcgjVar;
        Q(dcgjVar, dcgjVar);
    }

    public static <K, V> dcgn<K, V> O() {
        return new dcgn<>();
    }

    public static <K, V> void P(dcgm<K, V> dcgmVar, dcgm<K, V> dcgmVar2) {
        dcgmVar.d(dcgmVar2);
        dcgmVar2.c(dcgmVar);
    }

    public static <K, V> void Q(dcgj<K, V> dcgjVar, dcgj<K, V> dcgjVar2) {
        dcgjVar.h = dcgjVar2;
        dcgjVar2.g = dcgjVar;
    }

    public static <K, V> void R(dcgj<K, V> dcgjVar) {
        Q(dcgjVar.g, dcgjVar.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        dcgj<K, V> dcgjVar = new dcgj<>(null, null, 0, null);
        this.d = dcgjVar;
        Q(dcgjVar, dcgjVar);
        this.c = 2;
        int readInt = objectInputStream.readInt();
        dbzr t = dbzr.t(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            t.put(readObject, k(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            ((Collection) t.get(readObject2)).add(objectInputStream.readObject());
        }
        j(t);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(J().size());
        for (K k : J()) {
            objectOutputStream.writeObject(k);
        }
        objectOutputStream.writeInt(((dbye) this).b);
        for (Map.Entry<K, V> entry : I()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.dbys, defpackage.dbyn, defpackage.dcka
    public final /* bridge */ /* synthetic */ Collection I() {
        return I();
    }

    @Override // defpackage.dbys, defpackage.dbye
    public final /* bridge */ /* synthetic */ Collection h() {
        return dbzs.n(this.c);
    }

    @Override // defpackage.dbye
    public final Collection<V> k(K k) {
        return new dcgl(this, k, this.c);
    }

    @Override // defpackage.dbye, defpackage.dcka
    public final void p() {
        super.p();
        dcgj<K, V> dcgjVar = this.d;
        Q(dcgjVar, dcgjVar);
    }

    @Override // defpackage.dbye, defpackage.dbyn
    public final Iterator<V> u() {
        return dcjz.b(w());
    }

    @Override // defpackage.dbye, defpackage.dbyn
    public final Iterator<Map.Entry<K, V>> w() {
        return new dcgi(this);
    }
}
