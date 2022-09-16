package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ptd  reason: default package */
/* loaded from: classes7.dex */
public final class ptd {
    @dzsi
    vun a;
    private final ckcw b;
    @dzsi
    private qbn c;
    @dzsi
    private ckcv d;

    public ptd(ckcw ckcwVar) {
        this.b = ckcwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(qbn qbnVar, vun vunVar) {
        this.c = qbnVar;
        this.a = vunVar;
        this.d = this.b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(srf srfVar) {
        if (this.c != srfVar.a) {
            return;
        }
        vun vunVar = this.a;
        dbsk.s(vunVar);
        ckcv ckcvVar = this.d;
        dbsk.s(ckcvVar);
        dwbk dwbkVar = vunVar.b.f;
        if (dwbkVar == null) {
            dwbkVar = dwbk.s;
        }
        dwbh dwbhVar = dwbkVar.o;
        if (dwbhVar == null) {
            dwbhVar = dwbh.g;
        }
        dwbg dwbgVar = dwbhVar.b;
        if (dwbgVar == null) {
            dwbgVar = dwbg.g;
        }
        dwbg dwbgVar2 = dwbhVar.c;
        if (dwbgVar2 == null) {
            dwbgVar2 = dwbg.g;
        }
        boolean z = true;
        int i = 0;
        boolean z2 = dwbgVar.b && dwbgVar2.b;
        boolean z3 = dwbgVar.c && dwbgVar2.c;
        boolean z4 = dwbgVar.d && dwbgVar2.d;
        boolean z5 = dwbgVar.e && dwbgVar2.e;
        if (!dwbgVar.f || !dwbgVar2.f) {
            z = false;
        }
        if (!z2 && !z3 && !z4 && !z5 && !z) {
            ckcvVar.a((ckcr) this.b.a(ckkm.f));
            this.c = null;
            this.a = null;
            this.d = null;
        }
        amte n = srfVar.b.n();
        if (n != null) {
            amve[] amveVarArr = n.a.d;
            int length = amveVarArr.length;
            while (true) {
                if (i >= length) {
                    break;
                } else if (new vxg(amveVarArr[i]).a()) {
                    ckcvVar.a((ckcr) this.b.a(ckkm.d));
                    break;
                } else {
                    i++;
                }
            }
        }
        ckcvVar.a((ckcr) this.b.a(ckkm.c));
        this.c = null;
        this.a = null;
        this.d = null;
    }
}
