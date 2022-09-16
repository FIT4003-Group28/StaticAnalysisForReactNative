package defpackage;
/* compiled from: PG */
/* renamed from: fag  reason: default package */
/* loaded from: classes6.dex */
final class fag<T> implements dzsj<T> {
    final /* synthetic */ fah a;
    private final int b;

    public fag(fah fahVar, int i) {
        this.a = fahVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [asja, T] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, asjc] */
    @Override // defpackage.dzsj
    public final T a() {
        if (this.b == 0) {
            fah fahVar = this.a;
            T t = (T) fahVar.a;
            if (t != null) {
                return t;
            }
            dxjg.e(fahVar.c.eW.a.rz());
            fahVar.c.eW.ry();
            dxjg.e(fahVar.c.eW.a.rB());
            fahVar.c.eW.wf();
            dxjg.e(fahVar.c.eW.a.tg());
            fahVar.c.eW.dH();
            fahVar.c.eW.qw();
            fahVar.c.bP();
            ?? r1 = (T) new asja();
            fahVar.a = r1;
            return r1;
        }
        fah fahVar2 = this.a;
        T t2 = (T) fahVar2.b;
        if (t2 != null) {
            return t2;
        }
        ftt fttVar = fahVar2.c;
        rb rbVar = fttVar.a;
        btrm rz = fttVar.eW.a.rz();
        dxjg.e(rz);
        dzsj<srv> ry = fahVar2.c.eW.ry();
        bvjj rB = fahVar2.c.eW.a.rB();
        dxjg.e(rB);
        ahjq wf = fahVar2.c.eW.wf();
        bvrb tn = fahVar2.c.eW.a.tn();
        dxjg.e(tn);
        ?? r12 = (T) new asjc(rbVar, rz, ry, rB, wf, tn, fahVar2.c.eW.cd(), fahVar2.c.eW.dH(), fahVar2.c.eW.qw(), fahVar2.c.bP());
        fahVar2.b = r12;
        return r12;
    }
}
