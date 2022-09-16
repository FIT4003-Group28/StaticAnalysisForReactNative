package defpackage;
/* compiled from: PG */
/* renamed from: duh  reason: default package */
/* loaded from: classes3.dex */
public final class duh extends dux {
    public duh(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "EWNBd1AufMT/dQlBsHpOEgrj6TGESza4yroVGFWr1PP+cxObKT1XUomQ8m96KKHU", "SiwatXj9om3qBFCNeuxB6US/i18DTOSuvRAlCZmhg1Y=", aopaVar, i, 76);
    }

    @Override // defpackage.dux
    protected final void a() {
        int i = 1;
        boolean booleanValue = ((Boolean) this.d.invoke(null, this.a.a)).booleanValue();
        aopa aopaVar = this.g;
        if (true == booleanValue) {
            i = 2;
        }
        aopaVar.copyOnWrite();
        dnw dnwVar = (dnw) aopaVar.instance;
        dnw dnwVar2 = dnw.a;
        dnwVar.aa = i - 1;
        dnwVar.d |= 16;
    }
}
