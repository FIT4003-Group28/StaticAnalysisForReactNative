package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/* compiled from: PG */
/* renamed from: eapf  reason: default package */
/* loaded from: classes6.dex */
public final class eapf extends easr {
    private static final long serialVersionUID = -3193829732634L;
    public transient eaon a;
    private transient eapg b;

    public eapf(eapg eapgVar, eaon eaonVar) {
        this.b = eapgVar;
        this.a = eaonVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.b = (eapg) objectInputStream.readObject();
        this.a = ((eaop) objectInputStream.readObject()).c(this.b.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.b);
        objectOutputStream.writeObject(this.a.a());
    }

    @Override // defpackage.easr
    public final eaon a() {
        return this.a;
    }

    @Override // defpackage.easr
    public final long b() {
        return this.b.a;
    }

    @Override // defpackage.easr
    protected final eaok c() {
        return this.b.b;
    }

    public final eapg d(int i) {
        eapg eapgVar = this.b;
        return eapgVar.o(this.a.p(eapgVar.a, i));
    }
}
