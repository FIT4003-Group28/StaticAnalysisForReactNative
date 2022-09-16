package defpackage;
/* compiled from: PG */
/* renamed from: aywq  reason: default package */
/* loaded from: classes2.dex */
public final class aywq extends aynx {
    final Object[] b;

    public aywq(Object[] objArr) {
        this.b = objArr;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        if (bameVar instanceof ayre) {
            bameVar.f(new aywn((ayre) bameVar, this.b));
        } else {
            bameVar.f(new aywo(bameVar, this.b));
        }
    }
}
