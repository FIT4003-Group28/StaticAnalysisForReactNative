package defpackage;
/* compiled from: PG */
/* renamed from: afma  reason: default package */
/* loaded from: classes2.dex */
public final class afma implements afnu {
    public final dxio<buqp> a;
    public final dxio<begg> b;
    public final cklq c;

    public afma(dxio<buqp> dxioVar, dxio<begg> dxioVar2, cklq cklqVar) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = cklqVar;
    }

    @Override // defpackage.afnu
    public final Runnable a(dvzj dvzjVar) {
        return new aflz(this, dvzjVar);
    }

    @Override // defpackage.afnu
    public final Runnable b(ilo iloVar, boolean z) {
        return new aflx(this, iloVar, z);
    }
}
