package defpackage;
/* compiled from: PG */
/* renamed from: azpl  reason: default package */
/* loaded from: classes.dex */
public final class azpl implements axxg {
    public final azof a;
    public final dxio<azhi> b;
    public final batm c;
    public final btrm d;
    public final azpp f;
    public final cqat g;
    public boolean h = false;
    public final azpk e = new azpk(this);

    public azpl(azof azofVar, dxio<azhi> dxioVar, batm batmVar, btrm btrmVar, azpp azppVar, cqat cqatVar) {
        this.a = azofVar;
        this.b = dxioVar;
        this.c = batmVar;
        this.d = btrmVar;
        this.f = azppVar;
        this.g = cqatVar;
    }

    @Override // defpackage.axxg
    public final void a(int i) {
        azpp azppVar = this.f;
        synchronized (azppVar) {
            bzok b = azppVar.b();
            dsqp dsqpVar = (dsqp) b.cu(5);
            dsqpVar.bC(b);
            bzoh bzohVar = (bzoh) dsqpVar;
            if (bzohVar.c) {
                bzohVar.bF();
                bzohVar.c = false;
            }
            bzok bzokVar = (bzok) bzohVar.b;
            bzok bzokVar2 = bzok.e;
            bzokVar.c = i - 1;
            bzokVar.a |= 1;
            azppVar.c(bzohVar.bK());
        }
    }
}
