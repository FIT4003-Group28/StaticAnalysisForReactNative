package defpackage;
/* compiled from: PG */
/* renamed from: fnw  reason: default package */
/* loaded from: classes6.dex */
final class fnw<T> implements dzsj<T> {
    final /* synthetic */ fnx a;

    public fnw(fnx fnxVar) {
        this.a = fnxVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, bukc, buka] */
    @Override // defpackage.dzsj
    public final T a() {
        fnx fnxVar = this.a;
        T t = (T) fnxVar.a;
        if (t == null) {
            ?? r2 = (T) new bukc((bukb) fnxVar.b.eW.ia());
            fnxVar.a = r2;
            return r2;
        }
        return t;
    }
}
