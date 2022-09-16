package defpackage;
/* compiled from: PG */
/* renamed from: vmu  reason: default package */
/* loaded from: classes4.dex */
public final class vmu {
    public final vne a;

    private vmu(vne vneVar) {
        this.a = vneVar;
    }

    public static amfb b(final vne vneVar) {
        aqxo.q(vneVar.b instanceof vmv, "Variant does not implement WarmableXDataStore");
        final vmu vmuVar = new vmu(vneVar);
        return new amfb(new aniq() { // from class: vmt
            @Override // defpackage.aniq
            public final ankt a() {
                vne vneVar2 = vne.this;
                final vmu vmuVar2 = vmuVar;
                return anii.h(anii.i(anko.q(((vmv) vneVar2.b).d()), new vmx(vneVar2, 1), anjk.a), new ampg() { // from class: vms
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        aoqu aoquVar = (aoqu) obj;
                        return vmu.this;
                    }
                }, anjk.a);
            }
        }, anjk.a);
    }

    public final aoqu a() {
        return (aoqu) ((vmv) this.a.b).e();
    }
}
