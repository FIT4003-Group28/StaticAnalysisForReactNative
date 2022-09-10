package defpackage;
/* compiled from: PG */
/* renamed from: qea  reason: default package */
/* loaded from: classes7.dex */
public abstract class qea {
    public static final dvzd a;

    static {
        dvyz bZ = dvzd.o.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvzd dvzdVar = (dvzd) bZ.b;
        dvzdVar.a |= 2;
        dvzdVar.c = true;
        dvzd dvzdVar2 = (dvzd) bZ.b;
        dvzdVar2.b = 1;
        dvzdVar2.a = 1 | dvzdVar2.a;
        a = bZ.bK();
    }

    public static qdz f() {
        qbd qbdVar = new qbd();
        qbdVar.d(a);
        return qbdVar;
    }

    public abstract akqq a();

    public abstract double b();

    public abstract dbsg<djqr> c();

    public abstract dbsg<djqt> d();

    public abstract dvzd e();
}
