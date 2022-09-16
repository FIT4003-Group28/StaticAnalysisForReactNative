package defpackage;
/* compiled from: PG */
/* renamed from: zch  reason: default package */
/* loaded from: classes4.dex */
public final class zch implements zbu {
    public final yjc a;
    private final ampg b;
    private final vne c;

    public zch(vne vneVar, yjc yjcVar, ampg ampgVar) {
        vneVar.getClass();
        this.c = vneVar;
        yjcVar.getClass();
        this.a = yjcVar;
        ampgVar.getClass();
        this.b = ampgVar;
    }

    @Override // defpackage.zbu
    public final ankt a() {
        return anii.h(this.c.a(), new zcp(this.b, 1), anjk.a);
    }

    @Override // defpackage.zbu
    public final ankt b(final Object obj) {
        return this.c.b(new ampg() { // from class: zcg
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                zch zchVar = zch.this;
                Object obj3 = obj;
                return (aoqu) zchVar.a.a((aoqu) obj2, obj3);
            }
        }, anjk.a);
    }
}
