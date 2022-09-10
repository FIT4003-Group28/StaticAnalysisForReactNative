package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: dcaz  reason: default package */
/* loaded from: classes5.dex */
public final class dcaz<K extends Enum<K>, V extends Enum<V>> extends dbxg<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> c;
    private transient Class<V> d;

    private dcaz(Class<K> cls, Class<V> cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.c = cls;
        this.d = cls2;
    }

    public static <K extends Enum<K>, V extends Enum<V>> dcaz<K, V> k(Class<K> cls, Class<V> cls2) {
        return new dcaz<>(cls, cls2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (Class) objectInputStream.readObject();
        this.d = (Class) objectInputStream.readObject();
        d(new EnumMap(this.c), new EnumMap(this.d));
        dcmz.b(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(this.d);
        dcmz.a(this, objectOutputStream);
    }

    @Override // defpackage.dbxg
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Enum r1 = (Enum) obj;
        dbsk.s(r1);
        return r1;
    }

    @Override // defpackage.dbxg
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        Enum r1 = (Enum) obj;
        dbsk.s(r1);
        return r1;
    }
}
