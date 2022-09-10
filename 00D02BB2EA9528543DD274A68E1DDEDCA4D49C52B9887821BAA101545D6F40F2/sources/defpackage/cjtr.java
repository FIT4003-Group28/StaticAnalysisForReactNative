package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cjtr  reason: default package */
/* loaded from: classes4.dex */
public final class cjtr extends cjtk {
    private final List<ddhk> a;

    public cjtr(cqat cqatVar, List<ddhk> list) {
        super(cqatVar.e());
        this.a = list;
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dvfz bZ = dvga.b.bZ();
        for (ddhk ddhkVar : this.a) {
            ddhh ddhhVar = (ddhh) ddhk.k.ca(ddhkVar);
            if (ddhhVar.c) {
                ddhhVar.bF();
                ddhhVar.c = false;
            }
            ((ddhk) ddhhVar.b).d = ddhk.cf();
            bZ.a(ddhhVar);
        }
        ddhh ddhhVar2 = (ddhh) ddhk.k.bZ();
        int i = ddcu.t.a;
        if (ddhhVar2.c) {
            ddhhVar2.bF();
            ddhhVar2.c = false;
        }
        ddhk ddhkVar2 = (ddhk) ddhhVar2.b;
        ddhkVar2.a |= 1;
        ddhkVar2.b = i;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            ddhhVar2.a(i2);
        }
        bZ.a(ddhhVar2);
        dvfx bZ2 = dvfy.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvfy dvfyVar = (dvfy) bZ2.b;
        dvga bK = bZ.bK();
        bK.getClass();
        dvfyVar.c = bK;
        dvfyVar.b = 4;
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dvfy bK2 = bZ2.bK();
        dwun dwunVar2 = dwun.w;
        bK2.getClass();
        dwunVar.r = bK2;
        dwunVar.a |= 8192;
    }

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }
}
