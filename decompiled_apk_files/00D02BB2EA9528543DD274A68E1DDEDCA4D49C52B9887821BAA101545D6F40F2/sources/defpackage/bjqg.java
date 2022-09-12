package defpackage;
/* compiled from: PG */
/* renamed from: bjqg  reason: default package */
/* loaded from: classes3.dex */
public final class bjqg<T> extends btrh<T> {
    private final int d;

    public bjqg(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                bjqe bjqeVar = (bjqe) this.a;
                ccih ccihVar = (ccih) obj;
                if (ccihVar.equals(bjqeVar.e)) {
                    return;
                }
                bjqeVar.e = ccihVar;
                if (ccihVar.c()) {
                    return;
                }
                bjqeVar.f.a();
                return;
            }
            bjqe bjqeVar2 = (bjqe) this.a;
            gds gdsVar = (gds) obj;
            if (gdsVar.equals(bjqeVar2.d)) {
                return;
            }
            bjqeVar2.d = gdsVar;
            bjqeVar2.f.a();
            return;
        }
        bjqe bjqeVar3 = (bjqe) this.a;
        bjfg bjfgVar = (bjfg) obj;
        djba bZ = djbb.d.bZ();
        dqcm a = bizf.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djbb djbbVar = (djbb) bZ.b;
        a.getClass();
        djbbVar.c = a;
        int i2 = djbbVar.a | 2;
        djbbVar.a = i2;
        String str = bjqeVar3.c;
        if (str == null) {
            return;
        }
        str.getClass();
        djbbVar.a = 1 | i2;
        djbbVar.b = str;
        bjqeVar3.a.a(bZ.bK(), bjqeVar3, bvrj.UI_THREAD);
        btrm btrmVar = bjqeVar3.b;
        if (btrmVar == null) {
            return;
        }
        btrmVar.e(bjfgVar);
    }
}
