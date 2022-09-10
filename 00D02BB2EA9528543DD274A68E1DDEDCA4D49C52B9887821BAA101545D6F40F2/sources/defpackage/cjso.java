package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjso  reason: default package */
/* loaded from: classes4.dex */
public final class cjso extends cjrf {
    static final dbrn<dnow, dpkj> a = new cjsj();
    static final dbrn<dnph, dpkr> b = new cjsp();
    static final dbrn<dndc, deai> c = new cjsi();
    static final dbrn<dnpn, dpkw> d = new cjsr();
    static final dbrn<dnoz, dpkl> e = new cjsk();
    static final dbrn<dnpj, dpkt> f = new cjsq();

    @Override // defpackage.cjrf
    public final void b(dnpo dnpoVar, deam deamVar) {
        int a2 = dnpl.a(dnpoVar.h);
        if (a2 != 0 && a2 == 2) {
            if (deamVar.c) {
                deamVar.bF();
                deamVar.c = false;
            }
            dean deanVar = (dean) deamVar.b;
            dsrg<Integer, dpkj> dsrgVar = dean.c;
            deanVar.f = 2;
            deanVar.a |= 2;
        }
    }

    @Override // defpackage.cjrf
    public final void c(dnpo dnpoVar, deam deamVar) {
        dpyc dpycVar = dnpoVar.q;
        if (dpycVar == null) {
            dpycVar = dpyc.d;
        }
        if (deamVar.c) {
            deamVar.bF();
            deamVar.c = false;
        }
        dean deanVar = (dean) deamVar.b;
        dsrg<Integer, dpkj> dsrgVar = dean.c;
        dpycVar.getClass();
        deanVar.m = dpycVar;
        deanVar.a |= 256;
    }
}
