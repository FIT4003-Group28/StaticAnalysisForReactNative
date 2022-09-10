package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aldx  reason: default package */
/* loaded from: classes2.dex */
public final class aldx implements dbty<akuh> {
    final /* synthetic */ dxio a;

    public aldx(dxio dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ akuh a() {
        akvz akvzVar = (akvz) this.a.a();
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmmx bZ = dmne.l.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmne dmneVar = (dmne) bZ.b;
        int i = dmneVar.a | 4;
        dmneVar.a = i;
        dmneVar.d = 0;
        dmneVar.a = i | 32;
        dmneVar.g = "";
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmne bK = bZ.bK();
        bK.getClass();
        dmopVar2.c = bK;
        dmopVar2.a |= 2;
        dmqtVar.a(dmooVar);
        return akvzVar.c((dmqx) dmqtVar.bK());
    }
}
