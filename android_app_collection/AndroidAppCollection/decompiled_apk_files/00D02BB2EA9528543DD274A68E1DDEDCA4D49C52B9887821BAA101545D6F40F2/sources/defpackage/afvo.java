package defpackage;
/* compiled from: PG */
/* renamed from: afvo  reason: default package */
/* loaded from: classes2.dex */
class afvo extends afwf {
    final /* synthetic */ afwg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afvo(afwg afwgVar, CharSequence charSequence, cjtd cjtdVar) {
        super(afwgVar, null, charSequence, cjtdVar, false);
        this.a = afwgVar;
    }

    @Override // defpackage.afwf, defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (!((efh) this.a.b).b) {
            return cqkl.a;
        }
        if (k().booleanValue()) {
            this.a.i.a().q();
            this.a.r();
            return cqkl.a;
        }
        return n(cjqmVar);
    }

    @Override // defpackage.afuz
    public cqkl n(cjqm cjqmVar) {
        this.a.i.a().q();
        if (this.a.e.b()) {
            this.a.A.a(new afvn(this));
        } else {
            this.a.w.a().f();
        }
        return cqkl.a;
    }
}
