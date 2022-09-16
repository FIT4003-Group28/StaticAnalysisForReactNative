package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/* compiled from: PG */
/* renamed from: baib  reason: default package */
/* loaded from: classes2.dex */
public final class baib extends bajq {
    private static final long serialVersionUID = -4481126543819298617L;
    public baic a;
    public bahn b;

    public baib(baic baicVar, bahn bahnVar) {
        this.a = baicVar;
        this.b = bahnVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (baic) objectInputStream.readObject();
        this.b = ((bahp) objectInputStream.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.o());
    }

    @Override // defpackage.bajq
    protected final long a() {
        return this.a.a;
    }

    @Override // defpackage.bajq
    protected final bahl b() {
        return this.a.b;
    }

    @Override // defpackage.bajq
    public final bahn c() {
        return this.b;
    }
}
