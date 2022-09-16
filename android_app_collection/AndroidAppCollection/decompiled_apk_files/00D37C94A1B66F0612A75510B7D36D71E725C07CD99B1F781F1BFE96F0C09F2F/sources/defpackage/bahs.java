package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bahs  reason: default package */
/* loaded from: classes2.dex */
final class bahs implements Serializable {
    private static final long serialVersionUID = -6471952376487863581L;
    private transient String a;

    public bahs(String str) {
        this.a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = objectInputStream.readUTF();
    }

    private Object readResolve() {
        return baht.i(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeUTF(this.a);
    }
}
