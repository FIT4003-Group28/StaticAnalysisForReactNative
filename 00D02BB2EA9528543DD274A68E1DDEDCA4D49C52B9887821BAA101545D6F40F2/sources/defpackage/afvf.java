package defpackage;
/* compiled from: PG */
/* renamed from: afvf  reason: default package */
/* loaded from: classes2.dex */
class afvf extends afwf {
    final /* synthetic */ afwg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afvf(afwg afwgVar, cqtd cqtdVar, CharSequence charSequence, cjtd cjtdVar) {
        super(afwgVar, cqtdVar, charSequence, cjtdVar, false);
        this.a = afwgVar;
    }

    @Override // defpackage.afwf, defpackage.jbf
    public cjtd h() {
        if (this.a.q.a().L()) {
            return cjtd.a(dtxl.eV);
        }
        return cjtd.a(dtxl.eW);
    }

    @Override // defpackage.afuz
    public cqkl n(cjqm cjqmVar) {
        this.a.i.a().q();
        this.a.p.a().i(null);
        return cqkl.a;
    }

    @Override // defpackage.afwf, defpackage.afuz
    public Boolean v() {
        return Boolean.valueOf(this.a.q.a().L());
    }
}
