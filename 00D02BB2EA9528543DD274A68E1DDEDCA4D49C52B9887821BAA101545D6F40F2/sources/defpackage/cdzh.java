package defpackage;
/* compiled from: PG */
/* renamed from: cdzh  reason: default package */
/* loaded from: classes4.dex */
final class cdzh<T> implements aa<ceao> {
    final /* synthetic */ ceae a;

    public cdzh(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(ceao ceaoVar) {
        ceao ceaoVar2 = ceaoVar;
        ceae ceaeVar = this.a;
        if (ceaoVar2 != null) {
            ceaeVar.am = ceaoVar2 == ceao.UNSAVED;
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
