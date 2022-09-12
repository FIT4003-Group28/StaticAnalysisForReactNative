package defpackage;
/* compiled from: PG */
/* renamed from: bmon  reason: default package */
/* loaded from: classes3.dex */
public class bmon {
    private final apkd a;
    private final dxio<akfa> b;
    private final btvo c;

    public bmon(btvo btvoVar, apkd apkdVar, dxio<akfa> dxioVar) {
        this.c = btvoVar;
        this.a = apkdVar;
        this.b = dxioVar;
    }

    public static final dbsg<dqfw> c(aeui aeuiVar) {
        dwjf e = aeuiVar.e();
        if (e == null || (e.a & 32) == 0) {
            return dbpy.a;
        }
        dqfw dqfwVar = e.f;
        if (dqfwVar == null) {
            dqfwVar = dqfw.a;
        }
        return dbsg.i(dqfwVar);
    }

    public final boolean a() {
        return this.c.getEnableFeatureParameters().aa;
    }

    public final boolean b() {
        return this.c.getEnableFeatureParameters().aa && this.a.a() && this.b.a().j().l();
    }
}
