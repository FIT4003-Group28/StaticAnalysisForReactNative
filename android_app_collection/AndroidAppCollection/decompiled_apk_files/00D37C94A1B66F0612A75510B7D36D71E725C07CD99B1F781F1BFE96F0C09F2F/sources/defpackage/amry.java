package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: amry  reason: default package */
/* loaded from: classes.dex */
public final class amry extends amqy {
    private static final long serialVersionUID = 0;
    transient int c;

    private amry() {
        super(amsq.f(12));
        araa.v(3, "expectedValuesPerKey");
        this.c = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int readInt = objectInputStream.readInt();
        n(amsq.e());
        for (int i = 0; i < readInt; i++) {
            List e = e(objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                e.add(objectInputStream.readObject());
            }
        }
    }

    public static amry u() {
        return new amry();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        amyv.n(this, objectOutputStream);
    }

    @Override // defpackage.amqy, defpackage.amro
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.c);
    }
}
