package defpackage;
/* compiled from: PG */
/* renamed from: wux  reason: default package */
/* loaded from: classes4.dex */
public final class wux implements wvb {
    public wlr a;
    private final wwf b;

    public wux(wmi wmiVar, wwf wwfVar) {
        this.b = wwfVar;
        wmiVar.a.add(this);
    }

    @Override // defpackage.wvb
    public final wuw a(wuv wuvVar, xdu xduVar) {
        if (wwf.d(wur.class, xduVar)) {
            return new wur(wuvVar, this, xduVar);
        }
        throw new wva("BelowPlayerSlotAdapterFactory received unsupported metadata");
    }
}
