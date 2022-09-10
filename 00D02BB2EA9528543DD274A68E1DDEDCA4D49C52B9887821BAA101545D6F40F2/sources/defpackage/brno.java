package defpackage;
/* renamed from: brno  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class brno implements dbrn {
    static final dbrn a = new brno();

    private brno() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dmpn dmpnVar = (dmpn) obj;
        dmng h = akxf.h(dmpnVar);
        if (h != null) {
            akqi c = akxf.c(dmpnVar);
            brnt brntVar = new brnt();
            brntVar.a = c;
            brntVar.d = Boolean.valueOf(h.c);
            if ((h.a & 4) != 0) {
                dgrn dgrnVar = h.d;
                if (dgrnVar == null) {
                    dgrnVar = dgrn.d;
                }
                brntVar.c = akqq.m(dgrnVar);
            }
            if ((h.a & 1) != 0) {
                brntVar.b = Float.valueOf(h.b);
            }
            return dbsg.i(brntVar.a());
        }
        return dbpy.a;
    }
}
