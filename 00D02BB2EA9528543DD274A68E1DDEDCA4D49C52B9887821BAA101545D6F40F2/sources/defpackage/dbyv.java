package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dbyv  reason: default package */
/* loaded from: classes.dex */
public final class dbyv<K, V> extends dbyw<K, V> {
    private static final long serialVersionUID = 0;
    transient int c;

    private dbyv() {
        this(12, 3);
    }

    public static <K, V> dbyv<K, V> N() {
        return new dbyv<>(12, 3);
    }

    public static <K, V> dbyv<K, V> O(int i, int i2) {
        return new dbyv<>(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int readInt = objectInputStream.readInt();
        j(dbzn.a());
        dcmz.d(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        dcmz.c(this, objectOutputStream);
    }

    @Override // defpackage.dbxj, defpackage.dbye
    public final /* bridge */ /* synthetic */ Collection h() {
        return new ArrayList(this.c);
    }

    private dbyv(int i, int i2) {
        super(dbzn.b(i));
        dbzb.d(i2, "expectedValuesPerKey");
        this.c = i2;
    }

    public dbyv(dcka<? extends K, ? extends V> dckaVar) {
        this(dckaVar.J().size(), dckaVar instanceof dbyv ? ((dbyv) dckaVar).c : 3);
        H(dckaVar);
    }
}
