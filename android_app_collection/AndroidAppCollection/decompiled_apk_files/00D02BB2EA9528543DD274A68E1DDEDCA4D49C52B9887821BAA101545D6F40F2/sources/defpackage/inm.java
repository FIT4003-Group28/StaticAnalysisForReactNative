package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: inm  reason: default package */
/* loaded from: classes6.dex */
public final class inm implements dbty<aktg> {
    final /* synthetic */ inp a;

    public inm(inp inpVar) {
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
        dmsr bZ2 = dmsu.u.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsu dmsuVar = (dmsu) bZ2.b;
        int i = dmsuVar.a | 4;
        dmsuVar.a = i;
        dmsuVar.d = -1;
        int i2 = i | 8192;
        dmsuVar.a = i2;
        dmsuVar.s = 10.0f;
        dmsuVar.a = i2 | 16384;
        dmsuVar.t = 5.0f;
        dmsu dmsuVar2 = (dmsu) bZ2.b;
        dmsuVar2.o = 2;
        int i3 = dmsuVar2.a | 2048;
        dmsuVar2.a = i3;
        int i4 = i3 | 1024;
        dmsuVar2.a = i4;
        dmsuVar2.n = 70;
        int i5 = i4 | 32;
        dmsuVar2.a = i5;
        dmsuVar2.g = 14;
        int i6 = i5 | 16;
        dmsuVar2.a = i6;
        dmsuVar2.f = 7;
        int i7 = i6 | 64;
        dmsuVar2.a = i7;
        dmsuVar2.j = 2;
        int i8 = i7 | 512;
        dmsuVar2.a = i8;
        dmsuVar2.m = 30;
        dmsuVar2.a = i8 | 256;
        dmsuVar2.l = 805306368;
        bZ2.a(inp.e);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmsu bK = bZ2.bK();
        bK.getClass();
        dmpvVar.f = bK;
        dmpvVar.a |= 8;
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
