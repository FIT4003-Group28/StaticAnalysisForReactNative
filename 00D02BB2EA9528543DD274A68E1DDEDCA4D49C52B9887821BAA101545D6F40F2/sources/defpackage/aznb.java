package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aznb  reason: default package */
/* loaded from: classes3.dex */
public final class aznb extends aznj<azxi> {
    final /* synthetic */ aznc a;

    public aznb(aznc azncVar) {
        this.a = azncVar;
    }

    @Override // defpackage.aznj
    public final /* bridge */ /* synthetic */ azxi a(azxi azxiVar) {
        azxi azxiVar2 = azxiVar;
        if (azxiVar2.w() == dpqw.FOLLOWER_ENTITY_LIST) {
            dpot dpotVar = azxiVar2.j().b;
            if (dpotVar == null) {
                dpotVar = dpot.m;
            }
            azxh i = azxiVar2.i();
            dsqp dsqpVar = (dsqp) dpotVar.cu(5);
            dsqpVar.bC(dpotVar);
            dpoq dpoqVar = (dpoq) dsqpVar;
            dpri dpriVar = dpotVar.d;
            if (dpriVar == null) {
                dpriVar = dpri.f;
            }
            dsqp dsqpVar2 = (dsqp) dpriVar.cu(5);
            dsqpVar2.bC(dpriVar);
            dprh dprhVar = (dprh) dsqpVar2;
            if (dprhVar.c) {
                dprhVar.bF();
                dprhVar.c = false;
            }
            dpri dpriVar2 = (dpri) dprhVar.b;
            dpriVar2.a &= -9;
            dpriVar2.e = dpri.f.e;
            if (dpoqVar.c) {
                dpoqVar.bF();
                dpoqVar.c = false;
            }
            dpot dpotVar2 = (dpot) dpoqVar.b;
            dpri bK = dprhVar.bK();
            bK.getClass();
            dpotVar2.d = bK;
            dpotVar2.a |= 4;
            i.c(dpoqVar.bK());
            azxiVar2 = i.b();
        }
        dcdn<String, String> dcdnVar = this.a.f;
        azwl azwlVar = azxiVar2.j;
        dbsk.s(azwlVar);
        if (!dcdnVar.containsKey(azwlVar.b)) {
            this.a.b.f(azxiVar2);
            return azxiVar2;
        }
        dcdn<String, String> dcdnVar2 = this.a.f;
        azwl azwlVar2 = azxiVar2.j;
        dbsk.s(azwlVar2);
        String str = dcdnVar2.get(azwlVar2.b);
        azxh i2 = azxiVar2.i();
        i2.d = str;
        i2.h = str;
        return i2.b();
    }

    @Override // defpackage.aznj
    public final azwj b(azwj azwjVar) {
        return (azwjVar.d() != azxl.SAVES_ITEM || !this.a.f.containsKey(azwjVar.b)) ? azwjVar : azwj.b(azxm.k, this.a.f.get(azwjVar.b));
    }
}
