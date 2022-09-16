package defpackage;
/* compiled from: PG */
/* renamed from: afuv  reason: default package */
/* loaded from: classes.dex */
public final class afuv<T> extends btrh<T> {
    private final int d;

    public afuv(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            afuu afuuVar = (afuu) this.a;
            gdt gdtVar = (gdt) obj;
            if (!afuuVar.k) {
                return;
            }
            if (afuuVar.o()) {
                afuuVar.q();
            } else {
                afuuVar.p();
            }
        } else if (i == 1) {
            ege egeVar = (ege) obj;
            egu eguVar = egeVar.a;
            ((afuu) this.a).C(egeVar.b);
        } else if (i == 2) {
            btyi btyiVar = (btyi) obj;
            afwg afwgVar = ((afuu) this.a).A;
            if (afwgVar == null) {
                return;
            }
            afwgVar.y();
        } else if (i == 3) {
            afuu afuuVar2 = (afuu) this.a;
            gdw gdwVar = (gdw) obj;
            if (!afuuVar2.o) {
                return;
            }
            cqhn cqhnVar = afuuVar2.x;
            cqkx.p(afuuVar2.A);
        } else if (i != 4) {
            afuu afuuVar3 = (afuu) this.a;
            if (((afws) obj).a == 2) {
                afuuVar3.r.a();
            }
            afuuVar3.d.S(bvjk.ds, true);
        } else {
            afuu afuuVar4 = (afuu) this.a;
            acyv acyvVar = (acyv) obj;
            afuuVar4.s.a().a(afuuVar4.t.a());
        }
    }

    public afuv(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }
}
