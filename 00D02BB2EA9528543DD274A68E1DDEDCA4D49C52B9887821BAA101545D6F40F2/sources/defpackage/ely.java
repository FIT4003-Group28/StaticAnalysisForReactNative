package defpackage;
/* compiled from: PG */
/* renamed from: ely  reason: default package */
/* loaded from: classes6.dex */
final class ely<T> implements dzsj<T> {
    final /* synthetic */ elz a;
    private final int b;

    public ely(elz elzVar, int i) {
        this.a = elzVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            elz elzVar = this.a;
            return (T) new pyv(elzVar.a.eW.cx(), dxjh.c(elzVar.a.H()), dxjh.c(elzVar.a.m()));
        }
        elz elzVar2 = this.a;
        return (T) new pzh(elzVar2.a.eW.cx(), dxjh.c(elzVar2.a.H()), dxjh.c(elzVar2.a.m()));
    }
}
