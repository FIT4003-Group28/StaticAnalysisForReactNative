package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bajk  reason: default package */
/* loaded from: classes2.dex */
final class bajk implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient baht a;

    public bajk(baht bahtVar) {
        this.a = bahtVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (baht) objectInputStream.readObject();
    }

    private Object readResolve() {
        return bajl.P(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
    }
}
