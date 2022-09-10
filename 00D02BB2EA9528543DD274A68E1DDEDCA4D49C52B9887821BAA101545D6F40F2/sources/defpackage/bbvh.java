package defpackage;
/* compiled from: PG */
/* renamed from: bbvh  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbvh {
    public static bbvh e(ilo iloVar) {
        bbtb bbtbVar = new bbtb();
        if (iloVar != null) {
            bbtbVar.a = iloVar;
            return bbtbVar.a();
        }
        throw new NullPointerException("Null placemark");
    }

    public abstract ilo a();

    public abstract dbsg<dgpu> b();

    public abstract dbsg<crtr> c();

    public abstract bbvg d();

    public final bbvh f(dgpu dgpuVar) {
        bbvg d = d();
        d.c(dgpuVar);
        return d.a();
    }
}
