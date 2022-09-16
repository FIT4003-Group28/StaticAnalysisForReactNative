package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccyw  reason: default package */
/* loaded from: classes4.dex */
public final class ccyw implements ccux<bbtm> {
    final /* synthetic */ ccyy a;

    public ccyw(ccyy ccyyVar) {
        this.a = ccyyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ccyx, gfw] */
    @Override // defpackage.ccux
    public final void a() {
        ccyy ccyyVar = this.a;
        ?? r1 = ccyyVar.a;
        List<bbtm> f = ccyyVar.b.f();
        cclf cclfVar = (cclf) r1;
        bbuz m = bbve.m();
        ilo c = cclfVar.ag.c();
        dbsk.s(c);
        ((bbsu) m).b = c;
        m.e(dwyd.OFFERING);
        m.i(f);
        cclfVar.f.a().k(m.a(), r1);
    }

    @Override // defpackage.ccux
    public final /* bridge */ /* synthetic */ void b(bbtm bbtmVar) {
        ccyy ccyyVar = this.a;
        ccyyVar.n(dcbg.b(ccyyVar.b.f()).s(ccyv.a).z());
    }

    @Override // defpackage.ccux
    public final /* bridge */ /* synthetic */ void c(bbtm bbtmVar) {
        ccyx ccyxVar = this.a.a;
        String a = bbtmVar.a();
        cclf cclfVar = (cclf) ccyxVar;
        dsrj<String> dsrjVar = cclfVar.af.i().d;
        int indexOf = dsrjVar.indexOf(a);
        dbsk.a(indexOf >= 0);
        ckni ckniVar = new ckni(dcbg.b(dsrjVar).s(ccld.a).z(), null);
        bbtv v = bbty.v();
        v.t(true);
        cclfVar.f.a().o(ckniVar, indexOf, v.a(), null);
    }
}
