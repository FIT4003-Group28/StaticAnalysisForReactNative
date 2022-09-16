package defpackage;

import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: whz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class whz implements Consumer {
    public final /* synthetic */ aopa a;
    private final /* synthetic */ int b;

    public /* synthetic */ whz(aopa aopaVar) {
        this.a = aopaVar;
    }

    public /* synthetic */ whz(aopa aopaVar, int i) {
        this.b = i;
        this.a = aopaVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? consumer.getClass() : consumer.getClass();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b == 0) {
            aopa aopaVar = this.a;
            float floatValue = ((Float) obj).floatValue();
            aopaVar.copyOnWrite();
            aryv aryvVar = (aryv) aopaVar.instance;
            aryv aryvVar2 = aryv.a;
            aryvVar.b |= 2;
            aryvVar.d = floatValue;
            return;
        }
        aopa aopaVar2 = this.a;
        asgj asgjVar = (asgj) obj;
        aopaVar2.copyOnWrite();
        asgl asglVar = (asgl) aopaVar2.instance;
        asgl asglVar2 = asgl.a;
        asgjVar.getClass();
        asglVar.d = asgjVar;
        asglVar.b |= 2;
    }
}
