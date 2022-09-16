package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: inl  reason: default package */
/* loaded from: classes6.dex */
public final class inl implements dbty<aktg> {
    final /* synthetic */ inp a;

    public inl(inp inpVar) {
        this.a = inpVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ aktg a() {
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        int i = dmpvVar.a | 1;
        dmpvVar.a = i;
        dmpvVar.b = -16777216;
        dmpvVar.a = i | 2;
        dmpvVar.c = -1;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i2 = dmobVar.a | 1;
        dmobVar.a = i2;
        dmobVar.b = 13;
        dmobVar.a = i2 | 32;
        dmobVar.f = 24;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ.b;
        dmob bK = bZ2.bK();
        bK.getClass();
        dmpvVar2.e = bK;
        dmpvVar2.a |= 4;
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK2 = bZ.bK();
        bK2.getClass();
        dmopVar2.d = bK2;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        return this.a.a.aj().aE().c((dmqx) dmqtVar.bK());
    }
}
