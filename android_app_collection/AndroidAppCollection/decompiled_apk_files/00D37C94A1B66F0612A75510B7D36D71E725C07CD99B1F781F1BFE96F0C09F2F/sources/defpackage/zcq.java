package defpackage;
/* compiled from: PG */
/* renamed from: zcq  reason: default package */
/* loaded from: classes4.dex */
public final class zcq implements zbu {
    public final yjc a;
    private final yve b;
    private final ampg c;

    public zcq(yve yveVar, yjc yjcVar, ampg ampgVar) {
        yveVar.getClass();
        this.b = yveVar;
        yjcVar.getClass();
        this.a = yjcVar;
        ampgVar.getClass();
        this.c = ampgVar;
    }

    @Override // defpackage.zbu
    public final ankt a() {
        return anii.h(this.b.a(), new zcp(this.c), anjk.a);
    }

    @Override // defpackage.zbu
    public final ankt b(final Object obj) {
        return this.b.b(new ampg() { // from class: zco
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                zcq zcqVar = zcq.this;
                Object obj3 = obj;
                return (aoqu) zcqVar.a.a((aoqu) obj2, obj3);
            }
        });
    }
}
