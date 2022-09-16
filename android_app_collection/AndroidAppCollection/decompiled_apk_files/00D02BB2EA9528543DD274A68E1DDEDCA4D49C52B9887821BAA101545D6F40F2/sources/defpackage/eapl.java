package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/* compiled from: PG */
/* renamed from: eapl  reason: default package */
/* loaded from: classes6.dex */
public final class eapl extends easr {
    private static final long serialVersionUID = -4481126543819298617L;
    public eapm a;
    public eaon b;

    public eapl(eapm eapmVar, eaon eaonVar) {
        this.a = eapmVar;
        this.b = eaonVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (eapm) objectInputStream.readObject();
        this.b = ((eaop) objectInputStream.readObject()).c(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.a());
    }

    @Override // defpackage.easr
    public final eaon a() {
        return this.b;
    }

    @Override // defpackage.easr
    public final long b() {
        return this.a.a;
    }

    @Override // defpackage.easr
    protected final eaok c() {
        return this.a.b;
    }
}
