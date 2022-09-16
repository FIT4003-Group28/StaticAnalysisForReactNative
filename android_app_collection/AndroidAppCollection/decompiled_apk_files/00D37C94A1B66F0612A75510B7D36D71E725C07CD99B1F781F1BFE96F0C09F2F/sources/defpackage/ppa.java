package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ppa  reason: default package */
/* loaded from: classes4.dex */
public abstract class ppa implements pqb {
    private Looper e;
    private pkt f;
    private final ArrayList d = new ArrayList(1);
    public final HashSet a = new HashSet(1);
    public final pqh b = new pqh();
    public final pnj c = new pnj();

    @Override // defpackage.pqb
    public final void b(Handler handler, pqi pqiVar) {
        ptx.a(pqiVar);
        this.b.a(handler, pqiVar);
    }

    @Override // defpackage.pqb
    public final void c(pqa pqaVar) {
        boolean isEmpty = this.a.isEmpty();
        this.a.remove(pqaVar);
        if (!(!isEmpty) || !this.a.isEmpty()) {
            return;
        }
        rB();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pnj n(ppz ppzVar) {
        return this.c.h(0, ppzVar);
    }

    @Override // defpackage.pqb
    public final void pY(Handler handler, pnk pnkVar) {
        ptx.a(pnkVar);
        this.c.a(handler, pnkVar);
    }

    @Override // defpackage.pqb
    public final /* synthetic */ void q() {
    }

    protected abstract void rA();

    protected void rB() {
    }

    @Override // defpackage.pqb
    public final void rC(pqa pqaVar) {
        ptx.a(this.e);
        boolean isEmpty = this.a.isEmpty();
        this.a.add(pqaVar);
        if (isEmpty) {
            rD();
        }
    }

    protected void rD() {
    }

    @Override // defpackage.pqb
    public final void rE(pqa pqaVar, atk atkVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        ptx.c(z);
        pkt pktVar = this.f;
        this.d.add(pqaVar);
        if (this.e == null) {
            this.e = myLooper;
            this.a.add(pqaVar);
            rz(atkVar);
        } else if (pktVar == null) {
        } else {
            rC(pqaVar);
            pqaVar.a(this, pktVar);
        }
    }

    public final void rF(pkt pktVar) {
        this.f = pktVar;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pqa) arrayList.get(i)).a(this, pktVar);
        }
    }

    @Override // defpackage.pqb
    public final void rG(pqa pqaVar) {
        this.d.remove(pqaVar);
        if (this.d.isEmpty()) {
            this.e = null;
            this.f = null;
            this.a.clear();
            rA();
            return;
        }
        c(pqaVar);
    }

    @Override // defpackage.pqb
    public final void rH(pnk pnkVar) {
        pnj pnjVar = this.c;
        Iterator it = pnjVar.b.iterator();
        while (it.hasNext()) {
            pni pniVar = (pni) it.next();
            if (pniVar.b == pnkVar) {
                pnjVar.b.remove(pniVar);
            }
        }
    }

    @Override // defpackage.pqb
    public final void rI(pqi pqiVar) {
        pqh pqhVar = this.b;
        Iterator it = pqhVar.b.iterator();
        while (it.hasNext()) {
            pqg pqgVar = (pqg) it.next();
            if (pqgVar.b == pqiVar) {
                pqhVar.b.remove(pqgVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pqh rJ(ppz ppzVar) {
        return this.b.i(0, ppzVar);
    }

    @Override // defpackage.pqb
    public final /* synthetic */ void rK() {
    }

    protected abstract void rz(atk atkVar);
}
