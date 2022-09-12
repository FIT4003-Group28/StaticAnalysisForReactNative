package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaot  reason: default package */
/* loaded from: classes6.dex */
final class eaot implements Serializable {
    private static final long serialVersionUID = -6471952376487863581L;
    private transient String a;

    public eaot(String str) {
        this.a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = objectInputStream.readUTF();
    }

    private Object readResolve() {
        return eaou.j(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeUTF(this.a);
    }
}
