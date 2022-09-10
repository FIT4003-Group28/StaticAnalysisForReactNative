package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: crn  reason: default package */
/* loaded from: classes5.dex */
final class crn implements DialogInterface.OnClickListener {
    private final bxmh a;
    private final gga b;
    private final begg c;
    private final cjqy d;

    public crn(bxmh bxmhVar, gga ggaVar, begg beggVar, cjqy cjqyVar) {
        this.a = bxmhVar;
        this.b = ggaVar;
        this.c = beggVar;
        this.d = cjqyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.d.i(cjtd.a(dtxj.y));
            dwjj dwjjVar = this.a.b;
            if (dwjjVar == null) {
                dwjjVar = dwjj.k;
            }
            dxbp dxbpVar = dwjjVar.b;
            if (dxbpVar == null) {
                dxbpVar = dxbp.x;
            }
            dwjj dwjjVar2 = this.a.b;
            if (dwjjVar2 == null) {
                dwjjVar2 = dwjj.k;
            }
            dvzj dvzjVar = dwjjVar2.g;
            if (dvzjVar == null) {
                dvzjVar = dvzj.y;
            }
            ily ilyVar = new ily();
            ilyVar.k(dvzjVar.b);
            ilyVar.u = dvzjVar.c;
            cjsb cjsbVar = new cjsb();
            cjsbVar.e(dxbpVar.o);
            cjsbVar.i(dtyi.da);
            dnqh a = cjsbVar.a();
            int a2 = dxbi.a(dxbpVar.f);
            boolean z = a2 != 0 && a2 == 3;
            begj begjVar = new begj();
            begjVar.b(ilyVar.d());
            begjVar.d = a;
            begjVar.J = z;
            begjVar.p = z;
            begjVar.K = true;
            this.b.w();
            this.c.o(begjVar, false, null);
            return;
        }
        this.d.i(cjtd.a(dtxj.x));
    }
}
