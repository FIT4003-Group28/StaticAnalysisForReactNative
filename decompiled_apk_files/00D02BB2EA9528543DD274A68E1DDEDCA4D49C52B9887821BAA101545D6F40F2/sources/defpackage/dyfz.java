package defpackage;
/* compiled from: PG */
/* renamed from: dyfz  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyfz<ReqT, RespT> extends dyiq<ReqT, RespT> {
    @Override // defpackage.dyex
    public void a(dyew<RespT> dyewVar, dyhw dyhwVar) {
        b().a(dyewVar, dyhwVar);
    }

    @Override // defpackage.dyiq
    protected abstract dyex<ReqT, RespT> b();

    @Override // defpackage.dyex
    public void f(ReqT reqt) {
        b().f(reqt);
    }
}
