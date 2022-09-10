package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: awbw  reason: default package */
/* loaded from: classes.dex */
public final class awbw implements awbt {
    public final avsn a;
    public final avsm b;
    public final bvjj c;
    public awbq d;

    public awbw(avsm avsmVar, avsn avsnVar, bvjj bvjjVar) {
        this.a = avsnVar;
        this.b = avsmVar;
        this.c = bvjjVar;
    }

    @Override // defpackage.akpf
    public final byte[] a(String str) {
        return h().a(str);
    }

    @Override // defpackage.akpf
    public final boolean b(String str) {
        throw null;
    }

    @Override // defpackage.akpg
    public final byte[] c(int i, int i2, int i3) {
        String a = bvom.a(Locale.getDefault());
        dlvf bZ = dlvg.d.bZ();
        drst bZ2 = drsu.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drsu drsuVar = (drsu) bZ2.b;
        int i4 = drsuVar.a | 2;
        drsuVar.a = i4;
        drsuVar.c = i;
        int i5 = i4 | 4;
        drsuVar.a = i5;
        drsuVar.d = i2;
        drsuVar.a = i5 | 1;
        drsuVar.b = i3;
        drsu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlvg dlvgVar = (dlvg) bZ.b;
        bK.getClass();
        dsrj<drsu> dsrjVar = dlvgVar.b;
        if (!dsrjVar.a()) {
            dlvgVar.b = dsqw.cl(dsrjVar);
        }
        dlvgVar.b.add(bK);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlvg dlvgVar2 = (dlvg) bZ.b;
        a.getClass();
        dlvgVar2.a |= 1;
        dlvgVar2.c = a;
        return h().e(bZ.bK().bS());
    }

    @Override // defpackage.akpg
    public final boolean d() {
        return false;
    }

    @Override // defpackage.akpg
    public final boolean e() {
        return true;
    }

    @Override // defpackage.akpg
    public final boolean f() {
        return false;
    }

    public final synchronized void g(avzg avzgVar) {
        this.d = this.a.a(avzgVar.b(), avzgVar.a());
    }

    public final synchronized awbq h() {
        return this.d;
    }
}
