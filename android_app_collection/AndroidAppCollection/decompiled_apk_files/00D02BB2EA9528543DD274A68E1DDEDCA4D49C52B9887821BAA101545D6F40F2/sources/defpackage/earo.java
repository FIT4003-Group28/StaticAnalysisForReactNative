package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: earo  reason: default package */
/* loaded from: classes6.dex */
final class earo implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient eaou a;

    public earo(eaou eaouVar) {
        this.a = eaouVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (eaou) objectInputStream.readObject();
    }

    private Object readResolve() {
        return earp.X(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
    }
}
