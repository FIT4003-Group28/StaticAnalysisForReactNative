package defpackage;
/* compiled from: PG */
/* renamed from: fid  reason: default package */
/* loaded from: classes6.dex */
final class fid<T> implements dzsj<T> {
    final /* synthetic */ fie a;
    private final int b;

    public fid(fie fieVar, int i) {
        this.a = fieVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ftt fttVar = this.a.b;
                return (T) new booa(fttVar.a, fttVar.cp());
            } else if (i == 2) {
                fie fieVar = this.a;
                ftt fttVar2 = fieVar.b;
                return (T) new bnyd(fttVar2.eV, fttVar2.y(), fieVar.b.fO());
            } else if (i != 3) {
                fie fieVar2 = this.a;
                Object obj2 = fieVar2.a;
                if (obj2 instanceof dxjf) {
                    synchronized (obj2) {
                        obj = fieVar2.a;
                        if (obj instanceof dxjf) {
                            obj = new abbm(fieVar2.b.cg(), new abbh(fieVar2.b.cd(), fieVar2.b.as(), fieVar2.b.cy(), fieVar2.b.dF(), dxjh.c(fieVar2.b.av()), fieVar2.b.eW.n(), fieVar2.b.eW.fr(), fieVar2.b.eW.R(), fieVar2.b.cf()));
                            dxjc.d(fieVar2.a, obj);
                            fieVar2.a = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (T) ((abbm) obj2);
            } else {
                fie fieVar3 = this.a;
                boxa cm = fieVar3.b.cm();
                acwo eg = fieVar3.b.eg();
                bvrb tn = fieVar3.b.eW.a.tn();
                dxjg.e(tn);
                return (T) new bptg(cm, eg, tn);
            }
        }
        return (T) new bpdn();
    }
}
