package defpackage;
/* compiled from: PG */
/* renamed from: aacr  reason: default package */
/* loaded from: classes2.dex */
final class aacr implements brpu {
    static final aacr a = new aacr(dbpy.a);
    final dbsg<Double> b;

    public aacr(dbsg<Double> dbsgVar) {
        this.b = dbsgVar;
    }

    @Override // defpackage.brpu
    public final boolean a() {
        return this.b.a();
    }

    @Override // defpackage.brpu
    public final boolean b(brpu brpuVar) {
        if (!(brpuVar instanceof aacr)) {
            return false;
        }
        aacr aacrVar = (aacr) brpuVar;
        if (!a()) {
            return false;
        }
        return !aacrVar.a() || this.b.b().doubleValue() > aacrVar.b.b().doubleValue();
    }
}
