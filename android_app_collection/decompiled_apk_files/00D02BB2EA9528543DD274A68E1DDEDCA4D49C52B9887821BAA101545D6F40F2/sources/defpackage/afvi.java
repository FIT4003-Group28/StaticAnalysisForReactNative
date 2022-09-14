package defpackage;
/* compiled from: PG */
/* renamed from: afvi  reason: default package */
/* loaded from: classes2.dex */
class afvi extends afwf {
    final /* synthetic */ afwg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afvi(afwg afwgVar, cqtd cqtdVar, CharSequence charSequence, cjtd cjtdVar) {
        super(afwgVar, cqtdVar, charSequence, cjtdVar, true);
        this.a = afwgVar;
    }

    @Override // defpackage.afuz
    public cqkl n(cjqm cjqmVar) {
        this.a.i.a().q();
        this.a.t.a().f();
        return cqkl.a;
    }

    @Override // defpackage.afwf, defpackage.afuz
    public Boolean u() {
        return Boolean.valueOf(this.a.t.a().q());
    }
}
