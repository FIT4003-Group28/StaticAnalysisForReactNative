package defpackage;
/* compiled from: PG */
/* renamed from: ajnf  reason: default package */
/* loaded from: classes2.dex */
public abstract class ajnf {
    public static dbsg<RuntimeException> c(eaow eaowVar, dcep<dqym> dcepVar) {
        if (eaowVar.q(ajni.a)) {
            bvon bvonVar = new bvon("Attempted to create reporting task with duration=%s with justification=%s. Duration must be > %s", eaowVar.r(), dcepVar, ajni.a.r());
            bvoo.j(bvonVar);
            return dbsg.i(bvonVar);
        }
        return dbpy.a;
    }

    public abstract dcep<btlu> a();

    public abstract dcep<dqym> b();
}
