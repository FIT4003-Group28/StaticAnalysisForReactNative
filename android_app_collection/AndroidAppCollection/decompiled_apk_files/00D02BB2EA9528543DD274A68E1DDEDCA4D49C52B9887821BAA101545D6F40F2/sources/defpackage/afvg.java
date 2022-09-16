package defpackage;
/* compiled from: PG */
/* renamed from: afvg  reason: default package */
/* loaded from: classes2.dex */
class afvg extends afwf {
    final /* synthetic */ boolean a;
    final /* synthetic */ afwg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afvg(afwg afwgVar, cqtd cqtdVar, CharSequence charSequence, cjtd cjtdVar, boolean z) {
        super(afwgVar, cqtdVar, charSequence, cjtdVar, false);
        this.b = afwgVar;
        this.a = z;
    }

    @Override // defpackage.afwf, defpackage.jbf
    public cjtd h() {
        if (!this.a) {
            return cjtd.a(dtxv.v);
        }
        if (this.b.q.a().L()) {
            return cjtd.a(dtxl.eV);
        }
        return cjtd.a(dtxl.eW);
    }

    @Override // defpackage.afuz
    public cqkl n(cjqm cjqmVar) {
        this.b.i.a().q();
        this.b.o.a().k(null, null);
        return cqkl.a;
    }

    @Override // defpackage.afwf, defpackage.afuz
    public Boolean v() {
        return Boolean.valueOf(this.b.q.a().L());
    }
}
