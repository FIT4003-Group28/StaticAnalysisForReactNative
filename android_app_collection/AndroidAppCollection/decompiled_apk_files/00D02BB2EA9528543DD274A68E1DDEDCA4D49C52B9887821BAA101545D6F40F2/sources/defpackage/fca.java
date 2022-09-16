package defpackage;
/* compiled from: PG */
/* renamed from: fca  reason: default package */
/* loaded from: classes6.dex */
final class fca<T> implements dzsj<T> {
    final /* synthetic */ fcb a;

    public fca(fcb fcbVar) {
        this.a = fcbVar;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [T, avuk] */
    @Override // defpackage.dzsj
    public final T a() {
        fcb fcbVar = this.a;
        T t = (T) fcbVar.a;
        if (t == null) {
            dxjg.e(fcbVar.b.eW.a.a());
            cjqy tr = fcbVar.b.eW.a.tr();
            dxjg.e(tr);
            ?? r1 = (T) avul.b(tr, fcbVar.b.eW.de(), fcbVar.b.eW.qO(), fcbVar.b.aS(), fcbVar.b.eD());
            fcbVar.a = r1;
            return r1;
        }
        return t;
    }
}
