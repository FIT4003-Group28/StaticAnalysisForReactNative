package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dccg  reason: default package */
/* loaded from: classes.dex */
public final class dccg<K, V> extends dcch<K, V> {
    private static final long serialVersionUID = 0;
    transient int c;

    private dccg() {
        super(dbzn.b(12));
        this.c = 2;
        dbsk.a(true);
        this.c = 2;
    }

    public static <K, V> dccg<K, V> O() {
        return new dccg<>();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int readInt = objectInputStream.readInt();
        j(dbzn.b(12));
        dcmz.d(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        dcmz.c(this, objectOutputStream);
    }

    @Override // defpackage.dbys, defpackage.dbye
    public final /* bridge */ /* synthetic */ Collection h() {
        return dbzp.a(this.c);
    }
}
