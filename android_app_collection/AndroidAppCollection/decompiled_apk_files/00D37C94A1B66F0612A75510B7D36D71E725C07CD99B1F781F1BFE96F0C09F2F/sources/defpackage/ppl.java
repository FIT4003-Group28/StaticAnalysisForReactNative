package defpackage;

import android.os.Handler;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ppl  reason: default package */
/* loaded from: classes4.dex */
public abstract class ppl extends ppa {
    private final HashMap d = new HashMap();
    private Handler e;
    private atk f;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppa
    public void rA() {
        for (ppk ppkVar : this.d.values()) {
            ppkVar.a.rG(ppkVar.b);
            ppkVar.a.rI(ppkVar.c);
            ppkVar.a.rH(ppkVar.c);
        }
        this.d.clear();
    }

    @Override // defpackage.ppa
    protected final void rB() {
        for (ppk ppkVar : this.d.values()) {
            ppkVar.a.c(ppkVar.b);
        }
    }

    @Override // defpackage.ppa
    protected final void rD() {
        for (ppk ppkVar : this.d.values()) {
            ppkVar.a.rC(ppkVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppa
    public void rz(atk atkVar) {
        this.f = atkVar;
        this.e = pxi.s();
    }

    @Override // defpackage.pqb
    public void s() {
        for (ppk ppkVar : this.d.values()) {
            ppkVar.a.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void t(Object obj, pqb pqbVar, pkt pktVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public int w(Object obj, int i) {
        return i;
    }

    public final void x(final Object obj, pqb pqbVar) {
        ptx.c(!this.d.containsKey(obj));
        pqa pqaVar = new pqa() { // from class: ppi
            @Override // defpackage.pqa
            public final void a(pqb pqbVar2, pkt pktVar) {
                ppl.this.t(obj, pqbVar2, pktVar);
            }
        };
        ppj ppjVar = new ppj(this, obj);
        this.d.put(obj, new ppk(pqbVar, pqaVar, ppjVar));
        Handler handler = this.e;
        ptx.a(handler);
        pqbVar.b(handler, ppjVar);
        Handler handler2 = this.e;
        ptx.a(handler2);
        pqbVar.pY(handler2, ppjVar);
        pqbVar.rE(pqaVar, this.f);
        if (!this.a.isEmpty()) {
            return;
        }
        pqbVar.c(pqaVar);
    }

    public final void y(Object obj) {
        ppk ppkVar = (ppk) this.d.remove(obj);
        ptx.a(ppkVar);
        ppkVar.a.rG(ppkVar.b);
        ppkVar.a.rI(ppkVar.c);
        ppkVar.a.rH(ppkVar.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ppz z(Object obj, ppz ppzVar) {
        return ppzVar;
    }
}
