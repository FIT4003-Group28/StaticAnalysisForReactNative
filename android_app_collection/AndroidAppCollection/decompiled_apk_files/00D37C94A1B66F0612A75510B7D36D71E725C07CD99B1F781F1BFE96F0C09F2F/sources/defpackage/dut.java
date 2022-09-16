package defpackage;
/* compiled from: PG */
/* renamed from: dut  reason: default package */
/* loaded from: classes3.dex */
public final class dut extends dux {
    public dut(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "LTEc3HkkulP/VaRQsN6PrN1HOrAV6zGjmctLiFjI1HhIVlgJ9grYmd4BvP076r5S", "SogxclqUojanctnDxEiZun9qHyjV295x/AfH4vay8f0=", aopaVar, i, 48);
    }

    @Override // defpackage.dux
    protected final void a() {
        aopa aopaVar = this.g;
        aopaVar.copyOnWrite();
        dnw dnwVar = (dnw) aopaVar.instance;
        dnw dnwVar2 = dnw.a;
        dnwVar.f179J = 2;
        dnwVar.c |= 1024;
        boolean booleanValue = ((Boolean) this.d.invoke(null, this.a.a)).booleanValue();
        synchronized (this.g) {
            if (booleanValue) {
                aopa aopaVar2 = this.g;
                aopaVar2.copyOnWrite();
                dnw dnwVar3 = (dnw) aopaVar2.instance;
                dnwVar3.f179J = 1;
                dnwVar3.c |= 1024;
            } else {
                aopa aopaVar3 = this.g;
                aopaVar3.copyOnWrite();
                dnw dnwVar4 = (dnw) aopaVar3.instance;
                dnwVar4.f179J = 0;
                dnwVar4.c |= 1024;
            }
        }
    }
}
