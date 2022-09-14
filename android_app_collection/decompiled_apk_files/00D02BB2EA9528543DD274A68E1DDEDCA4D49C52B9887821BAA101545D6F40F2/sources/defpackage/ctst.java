package defpackage;

import defpackage.dyyv;
/* compiled from: PG */
/* renamed from: ctst  reason: default package */
/* loaded from: classes5.dex */
public final class ctst<StubT extends dyyv<StubT>> implements ctsu<StubT> {
    private final StubT a;

    public ctst(StubT stubt) {
        this.a = stubt;
    }

    @Override // defpackage.ctsu
    public final ctsu<StubT> a(String str) {
        ctsw.a();
        StubT stubt = this.a;
        dblw dblwVar = new dblw(str, null);
        dblx dblxVar = new dblx();
        dblxVar.a = dblwVar;
        return new ctst(stubt.h(dyjp.a(new dbly(dblxVar.a))));
    }

    @Override // defpackage.ctsu
    public final /* bridge */ /* synthetic */ Object b() {
        return this.a;
    }
}
