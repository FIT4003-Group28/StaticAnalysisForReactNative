package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amvq  reason: default package */
/* loaded from: classes2.dex */
public final class amvq implements Serializable, ahnc {
    private GmmLocation a;

    public amvq(double d, double d2) {
        amvs amvsVar = new amvs();
        amvsVar.v(d, d2);
        this.a = amvsVar.d();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        double readDouble = objectInputStream.readDouble();
        double readDouble2 = objectInputStream.readDouble();
        amvs amvsVar = new amvs();
        amvsVar.v(readDouble, readDouble2);
        this.a = amvsVar.d();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeDouble(this.a.getLatitude());
        objectOutputStream.writeDouble(this.a.getLongitude());
    }

    @Override // defpackage.ahnc
    public final dtaq a() {
        dtaq a = this.a.a();
        dsqp dsqpVar = (dsqp) a.cu(5);
        dsqpVar.bC(a);
        dtap dtapVar = (dtap) dsqpVar;
        if (dtapVar.c) {
            dtapVar.bF();
            dtapVar.c = false;
        }
        dtaq dtaqVar = (dtaq) dtapVar.b;
        dtaq dtaqVar2 = dtaq.m;
        dtaqVar.b = 4;
        dtaqVar.a |= 1;
        dtaq dtaqVar3 = (dtaq) dtapVar.b;
        dtaqVar3.c = 56;
        dtaqVar3.a |= 2;
        return dtapVar.bK();
    }

    @Override // defpackage.ahnc
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ahnc
    public final boolean c() {
        return this.a.c;
    }

    @Override // defpackage.ahnc
    public final boolean d() {
        return false;
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof amvq) && dbsd.a(this.a, ((amvq) obj).a);
    }

    @Override // defpackage.ahnc
    public final float getAccuracy() {
        return this.a.getAccuracy();
    }

    @Override // defpackage.ahnc
    public final double getLatitude() {
        return this.a.getLatitude();
    }

    @Override // defpackage.ahnc
    public final double getLongitude() {
        return this.a.getLongitude();
    }

    @Override // defpackage.ahnc
    public final long getTime() {
        return this.a.getTime();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
