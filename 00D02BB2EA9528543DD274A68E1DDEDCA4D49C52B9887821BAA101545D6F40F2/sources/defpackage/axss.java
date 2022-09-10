package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axss  reason: default package */
/* loaded from: classes3.dex */
public final class axss implements Runnable {
    final /* synthetic */ bwrs a;
    final /* synthetic */ boolean b;
    final /* synthetic */ axtp c;

    public axss(axtp axtpVar, bwrs bwrsVar, boolean z) {
        this.c = axtpVar;
        this.a = bwrsVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ilo iloVar = (ilo) this.a.c();
        axtp axtpVar = this.c;
        boolean z = this.b;
        dbsk.s(iloVar);
        cjte cjteVar = new cjte(deaf.GENERIC_CLICK);
        cjta c = cjtd.c(iloVar.a());
        c.d = dtxy.ma;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = z ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
        boolean z2 = false;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        c.a = bZ.bK();
        String bK = iloVar.bK();
        if (bK != null) {
            ddji bZ2 = ddjj.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddjj ddjjVar = (ddjj) bZ2.b;
            bK.getClass();
            ddjjVar.a |= 1;
            ddjjVar.b = bK;
            c.k(bZ2.bK());
        }
        axtpVar.i.O(cjteVar, c.a());
        if (iloVar.bN()) {
            z2 = this.c.d.d(iloVar);
        } else {
            try {
                this.c.d.c(iloVar);
                z2 = true;
            } catch (axxc | IllegalArgumentException unused) {
            }
        }
        this.c.h.b(new axsr(this, z2), bvrj.UI_THREAD);
    }
}
