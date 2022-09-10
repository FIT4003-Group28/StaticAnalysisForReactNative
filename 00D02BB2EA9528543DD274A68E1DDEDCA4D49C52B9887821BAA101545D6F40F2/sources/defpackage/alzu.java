package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alzu  reason: default package */
/* loaded from: classes2.dex */
public final class alzu implements alzp {
    private boolean a;
    private final int b;

    public alzu(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        if (this.a) {
            dmyj dmyjVar = ((dmxh) dmxgVar.b).g;
            if (dmyjVar == null) {
                dmyjVar = dmyj.c;
            }
            dsqp dsqpVar = (dsqp) dmyjVar.cu(5);
            dsqpVar.bC(dmyjVar);
            dmyi dmyiVar = (dmyi) dsqpVar;
            if (dmyiVar.c) {
                dmyiVar.bF();
                dmyiVar.c = false;
            }
            dmyj dmyjVar2 = (dmyj) dmyiVar.b;
            dmyjVar2.a |= 1;
            dmyjVar2.b = true;
            if (dmxgVar.c) {
                dmxgVar.bF();
                dmxgVar.c = false;
            }
            dmxh dmxhVar = (dmxh) dmxgVar.b;
            dmyj bK = dmyiVar.bK();
            bK.getClass();
            dmxhVar.g = bK;
            dmxhVar.a |= 4096;
        }
        int i = 0;
        while (true) {
            if (i >= ((dmxh) dmxgVar.b).c.size()) {
                i = -1;
                break;
            }
            int a = dmww.a(dmxgVar.a(i).b);
            if (a != 0 && a == 8) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        dmwx a2 = dmxgVar.a(i);
        dsqp dsqpVar2 = (dsqp) a2.cu(5);
        dsqpVar2.bC(a2);
        dmwu dmwuVar = (dmwu) dsqpVar2;
        int i2 = this.b;
        if (dmwuVar.c) {
            dmwuVar.bF();
            dmwuVar.c = false;
        }
        dmwx dmwxVar = (dmwx) dmwuVar.b;
        dmwx dmwxVar2 = dmwx.g;
        dmwxVar.a |= 4;
        dmwxVar.d = i2;
        dmxgVar.e(i, (dmwx) dmwuVar.bK());
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        return true;
    }

    public final synchronized void c(boolean z) {
        this.a = z;
    }
}
