package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: csid  reason: default package */
/* loaded from: classes5.dex */
final class csid {
    public final List<cshb> c;
    public final SparseIntArray d;
    private final int g;
    public final ddxz a = csfr.a();
    public final List<csip> b = new ArrayList();
    public final List<cshb> e = new ArrayList();
    public final SparseIntArray f = new SparseIntArray();

    public csid(int i, int i2) {
        this.g = i;
        this.c = new ArrayList(i2);
        this.d = new SparseIntArray(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(csip csipVar) {
        boolean z = true;
        if (csipVar.b == 1) {
            if (this.d.valueAt(csipVar.c()) != -1) {
                z = false;
            }
            dbsk.a(z);
        }
        this.b.add(csipVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cshb b(csgt csgtVar, int i) {
        csgtVar.d = this.g;
        if (i == -1) {
            i = -1;
        }
        int size = this.c.size();
        csha cshaVar = csgtVar.a;
        ddxx ddxxVar = ((cshb) cshaVar.b).c;
        if (ddxxVar == null) {
            ddxxVar = ddxx.j;
        }
        dsqp dsqpVar = (dsqp) ddxxVar.cu(5);
        dsqpVar.bC(ddxxVar);
        ddxw ddxwVar = (ddxw) dsqpVar;
        ddxz ddxzVar = this.a;
        if (ddxwVar.c) {
            ddxwVar.bF();
            ddxwVar.c = false;
        }
        ddxx ddxxVar2 = (ddxx) ddxwVar.b;
        ddxzVar.getClass();
        ddxxVar2.i = ddxzVar;
        int i2 = ddxxVar2.a | 2048;
        ddxxVar2.a = i2;
        ddxxVar2.a = i2 | 1;
        ddxxVar2.b = size;
        if (cshaVar.c) {
            cshaVar.bF();
            cshaVar.c = false;
        }
        cshb cshbVar = (cshb) cshaVar.b;
        ddxx bK = ddxwVar.bK();
        bK.getClass();
        cshbVar.c = bK;
        cshbVar.a |= 1;
        ddhj a = csgtVar.a();
        if (cshaVar.c) {
            cshaVar.bF();
            cshaVar.c = false;
        }
        cshb cshbVar2 = (cshb) cshaVar.b;
        cshbVar2.d = a.g;
        cshbVar2.a |= 2;
        cshb b = csgtVar.b();
        this.c.add(b);
        this.d.append(size, i);
        return b;
    }
}
