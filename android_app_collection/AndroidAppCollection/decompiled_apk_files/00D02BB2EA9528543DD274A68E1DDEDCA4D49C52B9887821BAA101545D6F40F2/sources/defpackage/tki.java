package defpackage;
/* compiled from: PG */
/* renamed from: tki  reason: default package */
/* loaded from: classes7.dex */
public final class tki<T> extends btrh<T> {
    public tki(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        dbsg dbsgVar;
        tkg tkgVar = (tkg) this.a;
        alco alcoVar = (alco) obj;
        tkh tkhVar = tkgVar.a;
        if (!tkhVar.g || !tkhVar.f.a()) {
            return;
        }
        tkj b = tkgVar.a.f.b();
        amuh k = b.k(tkgVar.a.b);
        if (!k.a().contains(alcoVar.a)) {
            return;
        }
        tkgVar.a.d.a(b.a(), alcoVar.a.h);
        int i = alcoVar.a.c;
        tmb tmbVar = tkgVar.a.c;
        btlu a = b.a();
        String e = b.b().e();
        tlv b2 = b.b();
        if (i >= 0 && i < b2.c().size()) {
            dbsgVar = dbsg.i(b2.c().get(i));
        } else {
            dbsgVar = dbpy.a;
        }
        tmbVar.e(a, e, ((Integer) dbsgVar.b()).intValue());
    }
}
