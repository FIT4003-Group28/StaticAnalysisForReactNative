package defpackage;
/* compiled from: PG */
/* renamed from: amtb  reason: default package */
/* loaded from: classes2.dex */
public final class amtb {
    public final dpie a;
    public final dvzn b;

    public amtb(dpie dpieVar, dvzn dvznVar) {
        this.a = dpieVar;
        this.b = dvznVar;
    }

    public static amtb a(dvzu dvzuVar, int i) {
        dpie dpieVar = dvzuVar.e.get(i);
        return new amtb(dpieVar, dvzuVar.p.get(dpieVar.i));
    }
}
