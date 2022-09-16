package defpackage;
/* compiled from: PG */
/* renamed from: fmx  reason: default package */
/* loaded from: classes6.dex */
final class fmx<T> implements dzsj<T> {
    final /* synthetic */ fmy a;
    private final int b;

    public fmx(fmy fmyVar, int i) {
        this.a = fmyVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [bupx, java.lang.Object] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? (T) new rzs() : (T) new rzz(this.a.a.fq());
            }
            fmy fmyVar = this.a;
            return (T) new vyd(fmyVar.a.eW.eR(), fmyVar.a.eW.g(), fmyVar.a.eW.i());
        }
        return (T) new sff();
    }
}
