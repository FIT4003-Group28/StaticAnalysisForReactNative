package defpackage;
/* compiled from: PG */
/* renamed from: cjzu  reason: default package */
/* loaded from: classes4.dex */
final class cjzu implements dbrn<cqkp, cjzj> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ cjzj a(@dzsi cqkp cqkpVar) {
        cqkp cqkpVar2 = cqkpVar;
        if (!(cqkpVar2 instanceof oxi)) {
            dcqe dcqeVar = cjzv.a;
            Object[] objArr = new Object[1];
            objArr[0] = cqkpVar2 == null ? "null" : cqkpVar2.getClass();
            bvoo.h("Invalid viewmodel with type: %s", objArr);
        } else if (((oxi) cqkpVar2).o().booleanValue()) {
            return cjzj.WITH_MARGIN;
        }
        return cjzj.LEFT_INSET;
    }
}
