package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: aorz  reason: default package */
/* loaded from: classes2.dex */
public final class aorz extends bxdu implements bxeq {
    public broq a;
    public dxio<akpm> b;
    private bxeq c;
    private final aorv d = new aorv(this);

    private final bxeq aR() {
        if (this.c == null) {
            this.c = new aory(this.d, this.a, this.b);
        }
        return this.c;
    }

    public static <F extends fd & nxd> aorz g(bwqv bwqvVar, Resources resources, @dzsi F f, @dzsi bxko bxkoVar) {
        bxko bxkoVar2 = new bxko();
        if (bxkoVar == null) {
            bxkoVar2.c(bxla.START_LOCATION);
            bxkoVar2.q(false);
            bxkoVar = bxkoVar2;
        }
        bxkoVar.X();
        bwnj bwnjVar = new bwnj();
        bwnjVar.e(false);
        bwnjVar.c(dtja.SEARCH);
        if (f != null) {
            dtjq bZ = dtjt.e.bZ();
            dtrj bZ2 = dtrk.f.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtrk dtrkVar = (dtrk) bZ2.b;
            dtrkVar.a |= 8;
            dtrkVar.e = true;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtjt dtjtVar = (dtjt) bZ.b;
            dtrk bK = bZ2.bK();
            bK.getClass();
            dtjtVar.c();
            dtjtVar.c.add(bK);
            bwnjVar.W(bwnd.b(resources, bZ.bK(), bwnjVar), null);
        }
        aorz aorzVar = new aorz();
        aorzVar.aU(bwqvVar, bxkoVar, bwnjVar, f);
        return aorzVar;
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.bxel
    protected final bxeq aJ() {
        return this;
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
        aR();
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        aR().h(bxmhVar, bxmhVar2, dnqhVar, bxkvVar, cjqmVar);
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        aR();
    }
}
