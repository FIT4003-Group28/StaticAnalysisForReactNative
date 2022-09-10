package defpackage;
/* compiled from: PG */
/* renamed from: bten  reason: default package */
/* loaded from: classes4.dex */
public final class bten<T> extends btrh<T> {
    private final int d;

    public bten(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            btel btelVar = (btel) this.a;
            btem btemVar = btelVar.a;
            daqq daqqVar = ((brcp) obj).a;
            btemVar.ae = daqqVar.b;
            btemVar.af = ashb.a(daqqVar, btemVar.am, btemVar.ak);
            btelVar.a.aS(false);
            return;
        }
        btel btelVar2 = (btel) this.a;
        crhp crhpVar = (crhp) obj;
        if (!btelVar2.a.ad || crhpVar.b()) {
            return;
        }
        gn gnVar = btelVar2.a.A;
        dbsk.s(gnVar);
        gnVar.e();
    }
}
